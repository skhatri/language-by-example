{
    const planetData = new Map<string, { type: string; moons: number; orbitDuration: number; nickname: string; tilt: number; distanceFromSun: number }>();


planetData.set("Earth", { type: "terrestrial", moons: 1, orbitDuration: 365, nickname: "The Blue Planet", tilt: 23.5, distanceFromSun: 149.6 });
planetData.set("Mars", { type: "terrestrial", moons: 2, orbitDuration: 687, nickname: "The Red Planet", tilt: 25.2, distanceFromSun: 227.9 });

const earth = planetData.get("Earth");
console.log(`Earth's nickname is ${earth?.nickname} and it has ${earth?.moons} moon(s).`);

planetData.forEach((data, planet) => {
  console.log(`${planet}: ${JSON.stringify(data)}`);
});

console.log(`Is Mars in the list? ${planetData.has("Mars")}`);

planetData.delete("Mars");

}