int xposition=400;
void setup(){
size(800,800);

}
void draw(){
  background(#FC5603);
  fill(#19BAC1);
  
  if(mousePressed&&mouseButton==RIGHT){
    fill(#19C12B);
   xposition=xposition+50;
  }
   
   if(mousePressed&&mouseButton==LEFT){
    fill(#19C12B);
   xposition=xposition-50;
   
  }
   ellipse(xposition,250,500,400);
}