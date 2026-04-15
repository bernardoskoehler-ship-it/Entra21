<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Exercio</h1>
    <div id="texto"></div>
</body>
<script>
    var texto = document.getElementById("texto")
    function exe1() {
    var nome = prompt("Digite seu nome:");
    var media = 0;
    var nota = [];
    var i = 0;
    while(nota.length < 3) {
        nota[i] = Number(prompt("Digite sua nota:"));
        media += nota[i];
        i++;
    }
    console.log(nome +" ficou com uma media de " +(media / nota.length));
    texto.innerHTML = `${nome} ficou com uma media de ${(media / nota.length)}`
}
exe1()
</script>
</html>
