
const fetchPokemon = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      reject(new Error("Danger, danger!"));
    }, 2000);
  });
};

console.log("Program starting...");

const usePokemon = async () => {
  try {
    const data = await fetchPokemon();
    console.log(data);
    console.log("Done fetching...");
  } catch (error) {
    console.error(error);
  }
  console.log("There was an error with our code but we're ok!");
};

usePokemon();
console.log("Program complete!");