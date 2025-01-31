{
    function lightTravelTime(distanceFromSun: number): number {
        const speedOfLight = 299792;
        return distanceFromSun * 1_000_000 / speedOfLight;
      }
      
      console.log(`Light takes about ${lightTravelTime(149.6).toFixed(2)} seconds to reach Earth.`);
            
}