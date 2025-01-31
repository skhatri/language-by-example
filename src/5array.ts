{
    let planets = ["Mercury", "Venus", "Earth", "Mars"];

planets.push("Jupiter");

planets.splice(planets.indexOf("Venus"), 1);

console.log(`Planets: ${planets.join(", ")}`);

}