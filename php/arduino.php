<?php
// Conecta na porta
$port = fopen("COM5", "w+");

// Em alguns casos a Arduino pode reiniciar, por isso
// é bom esperar para enviar informação depois de conectar
sleep(2);

fwrite($port, $_POST['estado']);

// Espera para que o dado enviado pelo PHP chegue até a Arduino
sleep(1);

// Fecha a conexão com a porta
fclose($port);
?>