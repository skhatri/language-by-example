{
    const planets = [
        { name: "Mercury", nickname: "The Swift Planet" },
        { name: "Venus", nickname: "The Evening Star" },
        { name: "Earth", nickname: "The Blue Planet" },
        { name: "Mars", nickname: "The Red Planet" },
      ];
      
      const nicknames = planets.map(planet => planet.nickname);
      console.log(`Planet nicknames: ${nicknames.join(", ")}`);

}