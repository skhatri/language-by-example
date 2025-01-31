{
    let planet = "Mars";
    
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
