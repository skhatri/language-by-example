{

    const planet = { name: "Jupiter", category: "gas giant" };

    if (planet.category === "terrestrial") {
        console.log(`${planet.name} is a terrestrial planet.`);
    } else if (planet.category === "gas giant") {
        console.log(`${planet.name} is a gas giant.`);
    } else {
        console.log(`${planet.name} is another type of planet.`);
    }

}
