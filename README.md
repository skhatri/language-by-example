### Language Primer by example
This is a series of exercises to learn the syntax and basic structures in a given language.

We will use planet and our solar system as the domain.

#### If Statement
Check if a planet has moons. If it has no moons, print "<Planet> has no moons."
Mercury has no moons.

```
{
  const planet = {name: "Mercury", moons: 0}
  if (planet.moons === 0) {
      console.log(`${planet.name} has no moons.`)
  }
}
```

#### If, Else If, Else
Categorise a planet by its type. 
```
{
  const planet = { name: "Jupiter", type: "gas giant" };
  if (planet.type === "terrestrial") {
    console.log(`${planet.name} is a terrestrial planet.`);
  } else if (planet.type === "gas giant") {
    console.log(`${planet.name} is a gas giant.`);
  } else {
    console.log(`${planet.name} is another type of planet.`);
  }
}
```

#### Switch statement
Find a planet's nickname

```
{
  const planet = "Mars";
  let nickname: string;

  switch (planet) {
    case "Earth":
      nickname = "The Blue Planet";
      break;
    case "Mars":
      nickname = "The Red Planet";
      break;
    case "Jupiter":
      nickname = "The Gas Giant";
      break;
    default:
      nickname = "No nickname available";
  }
  console.log(`${planet} is known as ${nickname}.`);
}
```
Try removing break after Mars. Also keep removing break in Jupiter as well.

#### For Loop
Print all planet names in the solar system.

```
const planets = ["Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"];

for (let i = 0; i < planets.length; i++) {
  console.log(planets[i]);
}
```

#### Arrays
Add, remove and list planets.
```
let planets = ["Mercury", "Venus", "Earth", "Mars"];

planets.push("Jupiter");

planets.splice(planets.indexOf("Venus"), 1);

console.log(`Planets: ${planets.join(", ")}`);

```


#### Map Structure
Use Map structure to store planet information and perform lookup and checks to see if an element exists.

```
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

```

#### Transforming Data
Transform Planet Data into just a list of nicknames

```
const planets = [
  { name: "Mercury", nickname: "The Swift Planet" },
  { name: "Venus", nickname: "The Evening Star" },
  { name: "Earth", nickname: "The Blue Planet" },
  { name: "Mars", nickname: "The Red Planet" },
];

const nicknames = planets.map(planet => planet.nickname);
console.log(`Planet nicknames: ${nicknames.join(", ")}`);
```

#### Functions
Write a function to calculate the time it takes light to reach a planet from the Sun.

```
function lightTravelTime(distanceFromSun: number): number {
  const speedOfLight = 299792;
  return distanceFromSun * 1_000_000 / speedOfLight;
}

console.log(`Light takes about ${lightTravelTime(149.6).toFixed(2)} seconds to reach Earth.`);

```

#### Lambda Functions (Arrow Functions)
Use a lambda function to filter planets with more than one but less than 30 moons.

```
const planets = [
  { name: "Earth", moons: 1 },
  { name: "Mars", moons: 2 },
  { name: "Jupiter", moons: 79 },
  { name: "Saturn", moons: 146},
  {name: "Neptune", moons: 16},
  {name: "Uranus", moons: 28}
];

const multiMoonPlanets = planets.filter(planet => planet.moons > 1 && planet.moons < 30);
console.log(`Planets with more than one moon: ${multiMoonPlanets.map(p => p.name).join(", ")}`);

```

#### Class, Constructor and Methods
Create a Planet class with methods

```
class Planet {
  name: string;
  type: string;
  moons: number;
  orbitDuration: number;
  nickname: string;
  tilt: number;
  distanceFromSun: number;

  constructor(name: string, type: string, moons: number, orbitDuration: number, nickname: string, tilt: number, distanceFromSun: number) {
    this.name = name;
    this.type = type;
    this.moons = moons;
    this.orbitDuration = orbitDuration;
    this.nickname = nickname;
    this.tilt = tilt;
    this.distanceFromSun = distanceFromSun;
  }

  describe(): string {
    return `${this.name} is a ${this.type} planet, known as "${this.nickname}". It has ${this.moons} moon(s) and orbits the Sun in ${this.orbitDuration} days.`;
  }

  lightTravelTime(): string {
    const speedOfLight = 299792;
    const time = this.distanceFromSun * 1_000_000 / speedOfLight;
    return `Light takes about ${time.toFixed(2)} seconds to reach ${this.name}.`;
  }
}


const earth = new Planet("Earth", "terrestrial", 1, 365, "The Blue Planet", 23.5, 149.6);
console.log(earth.describe());
console.log(earth.lightTravelTime());

```

#### Creating a functioning Application

Create yet another class SolarSystem which takes in all planets.
```
class Planet {
  name: string;
  type: string;
  moons: number;
  orbitDuration: number;
  nickname: string;
  tilt: number;
  distanceFromSun: number; // in million km
  diameter: number; // in km

  constructor(
    name: string,
    type: string,
    moons: number,
    orbitDuration: number,
    nickname: string,
    tilt: number,
    distanceFromSun: number,
    diameter: number
  ) {
    this.name = name;
    this.type = type;
    this.moons = moons;
    this.orbitDuration = orbitDuration;
    this.nickname = nickname;
    this.tilt = tilt;
    this.distanceFromSun = distanceFromSun;
    this.diameter = diameter;
  }

  describe(): string {
    return `${this.name} is a ${this.type} planet, known as "${this.nickname}". It has ${this.moons} moon(s) and orbits the Sun in ${this.orbitDuration} days.`;
  }

  lightTravelTime(): string {
    const speedOfLight = 299792; // km/s
    const time = this.distanceFromSun * 1_000_000 / speedOfLight;
    return `Light takes about ${time.toFixed(2)} seconds to reach ${this.name}.`;
  }
}

class SolarSystem {
  private planets: Planet[] = [];

  addPlanet(planet: Planet): void {
    this.planets.push(planet);
  }

  listPlanets(): void {
    this.planets.forEach(planet => console.log(planet.describe()));
  }

  findPlanetByName(name: string): Planet | undefined {
    return this.planets.find(planet => planet.name === name);
  }

  sortPlanets(by: "name" | "distance"): Planet[] {
    return [...this.planets].sort((a, b) => {
      if (by === "name") {
        return a.name.localeCompare(b.name);
      } else {
        return a.distanceFromSun - b.distanceFromSun;
      }
    });
  }

  comparePlanetsByVolume(planet1Name: string, planet2Name: string): string {
    const planet1 = this.findPlanetByName(planet1Name);
    const planet2 = this.findPlanetByName(planet2Name);

    if (!planet1 || !planet2) {
      return "One or both planets not found.";
    }

    const volume1 = (4 / 3) * Math.PI * Math.pow(planet1.diameter / 2, 3);
    const volume2 = (4 / 3) * Math.PI * Math.pow(planet2.diameter / 2, 3);

    const fits = volume1 > volume2 ? (volume1 / volume2).toFixed(2) : (volume2 / volume1).toFixed(2);

    if (volume1 > volume2) {
      return `${planet2.name} can fit approximately ${fits} times inside ${planet1.name}.`;
    } else {
      return `${planet1.name} can fit approximately ${fits} times inside ${planet2.name}.`;
    }
  }

  findNearestNeighbor(planetName: string): string {
  const planet = this.findPlanetByName(planetName);

  if (!planet) {
    return "Planet not found.";
  }

  const nearest = this.planets
    .filter(p => p.name !== planetName)
    .reduce((closest, current) => {
      const currentDistance = Math.abs(current.distanceFromSun - planet.distanceFromSun);
      const closestDistance = Math.abs(closest.distanceFromSun - planet.distanceFromSun);
      return currentDistance < closestDistance ? current : closest;
    });

  return `The nearest neighbor to ${planet.name} is ${nearest.name}, located ${Math.abs(nearest.distanceFromSun - planet.distanceFromSun).toFixed(1)} million km away.`;
  }

}


```

Initialise Solar System with all Planets

```
// Initialize Solar System
const solarSystem = new SolarSystem();

// Add all Planets
solarSystem.addPlanet(new Planet("Mercury", "terrestrial", 0, 88, "Swift Planet", 0.03, 57.91, 4879));
solarSystem.addPlanet(new Planet("Venus", "terrestrial", 0, 225, "Morning Star", 177.4, 108.2, 12104));
solarSystem.addPlanet(new Planet("Earth", "terrestrial", 1, 365, "The Blue Planet", 23.5, 149.6, 12742));
solarSystem.addPlanet(new Planet("Mars", "terrestrial", 2, 687, "The Red Planet", 25.2, 227.9, 6779));
solarSystem.addPlanet(new Planet("Jupiter", "gas giant", 79, 4333, "The Gas Giant", 3.1, 778.5, 139820));
solarSystem.addPlanet(new Planet("Saturn", "gas giant", 83, 10759, "The Ringed Planet", 26.7, 1434, 116460));
solarSystem.addPlanet(new Planet("Uranus", "ice giant", 27, 30687, "The Sideways Planet", 97.8, 2871, 50724));
solarSystem.addPlanet(new Planet("Neptune", "ice giant", 14, 60190, "The Windy Planet", 28.3, 4495, 49244));
solarSystem.addPlanet(new Planet("Pluto", "dwarf planet", 5, 90560, "The Icy Dwarf", 122.5, 5906.4, 2376));

// List all Planets
console.log("\nAll Planets:");
solarSystem.listPlanets();

// Sort Planets by Name
console.log("\nPlanets Sorted by Name:");
solarSystem.sortPlanets("name").forEach(planet => console.log(planet.name));

// Sort Planets by Distance from the Sun
console.log("\nPlanets Sorted by Distance from Sun:");
solarSystem.sortPlanets("distance").forEach(planet => console.log(`${planet.name}: ${planet.distanceFromSun} million km`));

// Compare Planets by Volume
console.log("\nVolume Comparison:");
console.log(solarSystem.comparePlanetsByVolume("Earth", "Mars")); // How many Mars can fit in Earth
console.log(solarSystem.comparePlanetsByVolume("Jupiter", "Earth")); // How many Earths can fit in Jupiter
console.log(solarSystem.comparePlanetsByVolume("Saturn", "Mercury")); // How many Mercurys can fit in Saturn

console.log("\nNearest Neighbor:");
console.log(solarSystem.findNearestNeighbor("Earth")); // Closest planet to Earth
console.log(solarSystem.findNearestNeighbor("Mars")); // Closest planet to Mars

```
