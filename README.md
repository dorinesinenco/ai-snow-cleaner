# update
создать robotics\Camera interface;

interface Camera {

 public void look();
 
 }
 
 вставить алго "просмотра по радиусу" каждый в свой класс
 
 class [Authorname]Camera implements Camera{
 
 
 }
 
 привязать класс к Drone
 
 class Drone {
   + private Camera camera;
   
   + setter/getter
   
   
 протестировать каждую камеру подставляя необходимые изменения так
 чтобы она отмечала как-то ( напр "o" ) все те ячейки куда она смотрела
 
 т е м main()
 
   drone.setCamera(new IvanCamera());
   drone.look();
   
   
   drone.setCamera(new MaxCamera());
   drone.look();


# ai-snow-cleaner

## CLASSES 

- SnowCleaner
  * id
  * max_snow_volume
  * snow_volume
  * x (km)
  * y (km)
  * !!! sector
  * !!! battery 
  * !!! technical check
  
  + move()
  + turnOnClean()
  + turnOffClean()
  + discardSnow()
  + !!! charge()
  
- Sector
  * id
  * x
  * y
  * Precipitation 
  * type (int - road, building, ...) real API map
  
- Precipitation (Polymorph)
  * volume
  * !!! density
- Map
  * width
  * height
  * longitude
  * latitude
  * grid -> ArrayList -> ArrayList
  
  
  
