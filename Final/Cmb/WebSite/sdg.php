<?php include 'header.php'; ?>

<h3>System Dependecy Graph (SDG)</h3>

<?php
exec('dot -Tpng -o sdg.png ./Gramatica/output/sdg.gv');
?>
<div class="grafo">
    <IMG SRC="sdg.png" width="100%"/>
</div>
<textarea rows="50">
    <?php
    echo file_get_contents("Gramatica/input.c");
    ?>
</textarea>

<?php include 'footer.php'; ?>
