<?php include 'header.php'; ?>

<h3>Program Dependecy Graph (PDG)</h3>

<?php
exec('dot -Tpng -o pdg.png ./Gramatica/output/pdg.gv');
?>
<div class="grafo">
    <IMG SRC="pdg.png" width="100%"/>
</div>
<textarea rows="50">
    <?php
    echo file_get_contents("Gramatica/input.c");
    ?>
</textarea>

<?php include 'footer.php'; ?>
