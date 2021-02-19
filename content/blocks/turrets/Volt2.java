{{        
        volt2 = new PowerTurret("volt2"){{
            requirements(Category.turret, with(Items.copper, 50, Items.lead, 50));
            shootType = new LightningBulletType(){{
                damage = 35;
                lightningLength = 28;
                collidesAir = true;
            }};
            reloadTime = 10f;
            shootCone = 40f;
            rotateSpeed = 100f;
            powerUse = 3.3f;
            targetAir = true;
            range = 110f;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoilAmount = 1f;
            size = 3;
            health = 260;
            shootSound = Sounds.spark;
}};
