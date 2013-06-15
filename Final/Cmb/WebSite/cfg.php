<?php include 'header.php'; ?>

<h3>Control Flow Graph (CFG)</h3>

<?php
exec('dot -Tpng -o cfg.png ./Gramatica/output/cfg.gv');
?>
<div class="grafo">
    <IMG SRC="cfg.png" width="600"/>
</div>
<textarea rows="50">
    <?php
    echo file_get_contents("Gramatica/input.c");
    ?>
</textarea>

<?php include 'footer.php'; ?>
