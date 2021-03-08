explosiveBig = new BasicBulletType(7f, 60, "bullet"){{
            hitEffect = Fx.blastExplosion;
            knockback = 1f;
            width = 16f;
            height = 21f;
            pierceCap = 2;
            pierceBuilding = true;
            ammoMultiplier = 4f;
            splashDamageRadius = 150f * 0.3f;
            splashDamage = 150f;
            backColor = Pal.missileYellowBack;
            frontColor = Pal.missileYellow;

            status = StatusEffects.blasted;
            statusDuration = 60f;
}}
