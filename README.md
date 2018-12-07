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
  
  
  
