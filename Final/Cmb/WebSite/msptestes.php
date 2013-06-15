<?php include 'header.php'; ?>

<h3> Mais simples possível (MSP) - Testes</h3>

<?php
$ficheiros_input = $_POST['ficheiro_teste'];
$ficheiros_output = $_POST['ficheiro_resultado'];

$arr_input = explode(";", $ficheiros_input);
$arr_output = explode(";", $ficheiros_output);
?>

<?php
for ($index = 0; $index < count($arr_input) - 1; $index++) {
    echo'<hr/>';
    echo "Teste $index<br/>";
    ?>
    <table style="width: 100%;">
        <thead>
        <th>Input teste</th>
        <th>Output teste</th>
        <th>Output da execucao</th>
        <th>Estado</th>
    </thead>
    <tr style="width: 100%;">
        <?php
        $cmd = './Gramatica/sl/msp ./Gramatica/output/msp2.txt < ./Gramatica/testes/' . $arr_input[$index] . ' > r' . $index . '.txt';
        //echo "Comando: $cmd";
        sleep(1);
        $output = shell_exec($cmd);
        echo $output;
        ?>
        <td>
            <textarea rows="5">
                <?php echo file_get_contents('./Gramatica/testes/' . $arr_input[$index]); ?>
            </textarea>
        </td>
        <td>
            <textarea rows="5">
                <?php
                $fr = file_get_contents('./Gramatica/testes/' . $arr_output[$index]);
                echo $fr;
                ?>
            </textarea>
        </td>
        <td>
            <textarea rows="5">
                <?php
                $fo = file_get_contents("r$index.txt");
                echo $fo;
                ?>
            </textarea>
        </td>
        <td>
            <textarea rows="5">
                <?php
                if ($fr == $fo) {
                    echo "OK";
                } else {
                    echo "ERRO";
                }
                ?>
            </textarea>
        </td>
    </tr>
    </table>
    <?php
}
//$output = shell_exec('./Gramatica/sl/msp ./Gramatica/output/msp2.txt < ./Gramatica/testes/tc1_maiorDedois > r1.txt');
//echo $output;
?>

<?php include 'footer.php'; ?>