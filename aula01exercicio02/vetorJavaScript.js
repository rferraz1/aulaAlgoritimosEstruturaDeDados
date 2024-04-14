const valoresNumericos = [10,20,30,40,50]

const titulosMusicais = ["I Smile - Kirk Franklin", "Superstition - Stivie Wonder", "Hotel California", "Item hipotetico: Superstition California"]

console.log("Valores Numericos", valoresNumericos);
console.log("Titulos de musicas", titulosMusicais);

const somaValores = valoresNumericos.reduce((total,valor) => total + valor, 0)
console.log("Soma dos valores numéricos:", somaValores);

const musicasComSupertition = titulosMusicais.filter (titulo => titulo.includes("Superstition") || titulo.includes("California"));
console.log("Musicas com a palavra 'Superstition' no titulo:", musicasComSupertition);
