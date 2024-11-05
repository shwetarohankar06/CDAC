const goGetCandies = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ candy: "sour keys", quantity: 10 });
    }, 2000);
  });
};

const sellCandies = (candy) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(25 * candy.quantity);
    }, 3000);
  });
};

const useCandies = async () => {
  const candy = await goGetCandies();
  const result = await sellCandies(candy);
  console.log(result);
  const time2 = new Date();
  console.log(`${time2 - time1}ms passed`);
};

console.log("Program starting");
const time1 = new Date();
const candy = goGetCandies();
candy.then((result) => {
  const sellValue = sellCandies(result);
  console.log(sellValue);
  sellValue.then((value) => {
    console.log(value);
    const time2 = new Date();
    console.log(`${time2 - time1}ms passed`);
  });
});
console.log("Program complete");
