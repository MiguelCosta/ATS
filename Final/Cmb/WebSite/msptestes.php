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
        <th>Linhas executadas</th>
        <th>Estado</th>
    </thead>
    <tr style="width: 100%;">
        <?php
        // execucao normal
        $cmd = './Gramatica/sl/msp ./Gramatica/output/msp2.txt < ./Gramatica/testes/' . $arr_input[$index] . ' > r' . $index . '.txt';
        $output = shell_exec($cmd);
        sleep(1);
        echo $output;

        // execucao para saber as linhas
        $cmd = './Gramatica/sl/msp ./Gramatica/output/msp2L.txt < ./Gramatica/testes/' . $arr_input[$index] . ' > rl' . $index . '.txt';
        //echo "$cmd";
        $outputl = shell_exec($cmd);
        sleep(1);
        echo $outputl;
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
                linhasExecutadas("rl$index.txt");
                //$fl = file_get_contents("rl$index.txt");
                //echo $fl;
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


<?php

function linhasExecutadas($ficheiro) {

    $resultado = "";
    $lines = file($ficheiro);

    foreach ($lines as $line) {
        if (strpos($line, 'l:') !== false) {
            $resultado .= substr($line, 2);
        }
    }

    echo $resultado;
}
?>