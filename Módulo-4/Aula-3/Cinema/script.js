const botoes = document.querySelectorAll(".assentos button");
const assentosSelecionados = [];
const lista = document.getElementById("lista-assentos");

function atualizarLista() {
    lista.innerHTML = "";

    assentosSelecionados.forEach((assento) => {
        const li = document.createElement("li");
        li.textContent = assento;
        lista.appendChild(li);
    });
}

botoes.forEach(botao => {
    botao.addEventListener("click", () => {
        const assento = botao.textContent.trim();

        if (assentosSelecionados.includes(assento)) {
            assentosSelecionados.splice(assentosSelecionados.indexOf(assento), 1);
            botao.classList.remove("selecionado");
        } else {
            assentosSelecionados.push(assento);
            botao.classList.add("selecionado");
        }

        atualizarLista();
    });
});
