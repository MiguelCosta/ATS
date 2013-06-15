<?php include 'header.php'; ?>

<h3> Single Static Assignment (SSA)</h3>

<?php
exec('dot -Tpng -o ssa.png ./Gramatica/output/ssa.gv');
?>
<div class="grafo">
    <IMG SRC="ssa.png" width="600"/>
</div>
<textarea rows="50">
    <?php
    echo file_get_contents("Gramatica/input.c");
    ?>
</textarea>						


<?php include 'footer.php'; ?>