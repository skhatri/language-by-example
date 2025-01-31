{
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


}