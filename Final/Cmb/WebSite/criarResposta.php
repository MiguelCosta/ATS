<?php include 'header.php'; ?>
<h2>Texto de entrada:</h2>

<?php
$JAVA_HOME = "/usr/lib/jvm/jdk1.7.0_01/";
$PATH = "$JAVA_HOME/bin:/usr/local/bin:/usr/bin:/bin";
$CLASSPATH = '.:/opt/antlr-3.4-complete.jar:$CLASSPATH';
putenv("JAVA_HOME=$JAVA_HOME");
putenv("PATH=$PATH");
putenv("CLASSPATH=$CLASSPATH");

$texto_entrada = $_POST['texto'];

$myFile = "Gramatica/input.c";
$fh = fopen($myFile, 'w');
fwrite($fh, $texto_entrada);
fclose($fh);

//echo file_get_contents($myFile);

$output = shell_exec('cd Gramatica/output && java Run ../input.c');
echo $output;
?>

<?php include 'footer.php'; ?>