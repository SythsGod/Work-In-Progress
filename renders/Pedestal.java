// Date: 1/06/2015 22:24:38
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelPedestal extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer pillar;
    ModelRenderer Shape1;
  
  public ModelPedestal()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base = new ModelRenderer(this, 0, 0);
      base.addBox(-8F, 0F, -8F, 16, 3, 16);
      base.setRotationPoint(0F, 21F, 0F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      pillar = new ModelRenderer(this, 0, 19);
      pillar.addBox(-4F, -5F, -4F, 8, 9, 8);
      pillar.setRotationPoint(0F, 17F, 0F);
      pillar.setTextureSize(64, 32);
      pillar.mirror = true;
      setRotation(pillar, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 36);
      Shape1.addBox(-6F, 0F, -6F, 12, 3, 12);
      Shape1.setRotationPoint(0F, 9F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    base.render(f5);
    pillar.render(f5);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
