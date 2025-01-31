{

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
            

}