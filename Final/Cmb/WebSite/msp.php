<?php include 'header.php'; ?>

<h3> Mais simples possível (MSP)</h3>

<?php
//$output = shell_exec('./Gramatica/sl/msp ./Gramatica/output/msp2.txt < ./Gramatica/testes/tc1_maiorDedois > r1.txt');
//echo $output;
?>
<textarea rows="15">
    <?php
    echo file_get_contents("./Gramatica/output/msp2.txt");
    ?>
</textarea>

<?php
//echo file_get_contents("r1.txt");
?>

<textarea rows="15">
    <?php
    echo file_get_contents("Gramatica/input.c");
    ?>
</textarea>

<hr/>
<form name="form" action="msptestes.php" method="post">

    <div class="textwrapper">
        Ficheiros de input para testes (separados por ";")
        <textarea name="ficheiro_teste" rows="3">
tc1_maiorDedois;tc2_maiorDedois;tc3_maiorDedois;
        </textarea>
        Ficheiros com o resultado que se deve obter (separados por ";").
        <br/>Nota que para cada ficheiro de input tem de haver
        um ficheiro com o resultado que deve ser obtido.
        <textarea name="ficheiro_resultado" rows="3">
rtc1_maiorDedois;rtc2_maiorDedois;rtc3_maiorDedois;
        </textarea>
        <input type="submit" value="submeter" />
    </div>


</form>


<?php include 'footer.php'; ?>