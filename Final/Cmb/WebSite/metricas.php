<?php include 'header.php'; ?>

<h3> Métricas (ME)</h3>

<textarea rows="15">
    <?php
    echo file_get_contents("./Gramatica/output/metricas.txt");
    ?>
</textarea>

<?php include 'footer.php'; ?>