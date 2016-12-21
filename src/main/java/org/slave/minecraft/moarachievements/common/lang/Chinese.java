package org.slave.minecraft.moarachievements.common.lang;

public class Chinese {

    public static void initializeLang() {
        /*
        MoarAchievements.addAchievementLocalizations(Achievements.buildShovel, "挖掘時間！", "做一把鏟子！", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildSteelPickaxe, "鑽石！我可以！", "做一把鐵製十字鎬", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildGoldPickaxe, "做好玩的", "做一把黃金十字鎬......頗浪費", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildDiamondPickaxe, "受死吧黑曜石", "製作一把鑽石十字鎬", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildAxe, "伐木時間", "做一把木製斧頭", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildChest, "東西堆積如山", "做一個箱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineCoal, "來烤肉吧", "挖一些煤炭", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineRedstone, "這是？", "挖一些紅石", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildCompass, "指向一切開始的地方", "用紅石做一個指南針", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.smeltCobbleStone, "所以卵石到底是？", "用卵石燒出一些石頭", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildFlintAndSteel, "爛掃把火鳥！！爛掃把！！", "做一個打火石", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildShears, "綿羊裸奔季", "做一把剪刀", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.collectWool, "噢！可愛的小羊兒", "親手剪些羊毛", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildBed, "休息時間", "做一張床", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killSpider, "蝦？蜘蛛絲？蜘蛛眼？", "殺一隻蜘蛛", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killSlime, "噁.....有點黏手......", "殺一隻史萊姆", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildBow, "Fire in the Hole!", "做一把弓", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killCreeper, "我只是想抱抱！", "殺一隻苦力帕", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.getSkeletonToKillCreeper, "神走位", "讓一隻骷髏射死一隻苦力帕", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildJukebox, "Yo! 來首歌吧", "做一個唱片機", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildTNT, "噢耶砰砰砰砰", "做一些TNT", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killEnderman, "傳來傳去很煩吶", "殺死一隻終界使者", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killZombie, "所以這塊臭掉的東西能幹嘛？", "殺死一隻殭屍", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killSkeleton, "射你一臉！", "殺死一隻骷髏", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.killPassiveMobForMeat, "晚餐GET!", "殺死一隻被動生物", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.collectEgg, "蛋蛋的哀傷", "收集一些蛋", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.collectRedApple, "金粒總算有用了", "收集一顆蘋果", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildGoldenApple, "這是.......金蘋果！？", "做一顆金蘋果", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineDirt, "Welcome To Minecraft...", "挖一些土", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildClock, "幾點了啊？", "做個時鐘", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildRedstoneTorch, "沒那麼亮", "做一個紅石火把", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildRedstoneRepeater, "延——遲——", "做個紅石中繼器", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildPiston, "伸出來、收回去", "做個活塞", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildStickyPiston, "拉拉扯扯", "做個黏性活塞", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineSoulSand, "慢慢來，比較快", "挖一些靈魂沙", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineNetherrack, "又硬又脆", "挖一些地獄岩", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildBrewingStand, "當個製藥師", "擺個釀造架", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineSugarCane, "我想吃糖啊", "砍一些甘蔗", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildPaper, "靈感來了", "做一些紙張", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildMap, "欸？這裡是哪？", "做一張地圖", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildCookie, "小餅乾乾", "取得一些餅乾", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildNoteblock, "只是做點筆記", "做個告示牌", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.buildDispenser, "填彈、預備、發射！", "擺個發射器", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineNetherWart, "這小東西幹麻不發光！？", "挖一些地獄疣", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineDragonEgg, "......想跑？", "用活塞取得龍蛋", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineCactus, "刺刺的......", "取得一塊仙人掌", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineCobblestone, "卵石？", "挖一些卵石", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.mineWheat, "安定的田園生活", "收穫一些小麥", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.enterCave, "誰來打個光？", "走進洞窟或峽谷", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.liveFalling, "太驚險了！", "吼吼差點摔死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.eatBacon, "烤豬肉！！！", "感謝豬，我開動了", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level1, "升級！", "獲得 1 個等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level2, "歡迎啊小菜鳥", "獲得 2 等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level3, "第三個", "獲得 3 個等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level4, "又來一個......？", "獲得 4 個等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level5, "還是菜鳥啦", "獲得 5 個等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.level10, "小有經驗", "獲得 10 個等級", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian1, "開始搭建傳送門吧！", "擺放你的第一顆黑曜石", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian2, "傳送門的基礎", "在第一顆旁邊再來一顆", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian3, "旁邊那排", "用黑曜石擺一條3格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian4, "旁邊那排", "用黑曜石擺一條3格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian5, "旁邊那排", "用黑曜石擺一條3格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian6, "另一邊那排", "再擺一條三格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian7, "另一邊那排", "再擺一條三格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian8, "另一邊那排", "再擺一條三格的柱子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian9, "傳送門的頂部", "在上面擺些黑曜石來完成它", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.obsidian10, "傳送門的頂部", "在上面擺些黑曜石來完成它", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal1, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal2, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal3, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal4, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal5, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(Achievements.portal6, "地獄傳送門！", "點亮你的傳送門", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByAny, "所以當時到底發生了什麼事？", "死掉一次，怎樣都行", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByCreeper, "蝦？尛——砰砰砰", "被一隻苦力帕奪去清白", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByEnderman, "注意周遭——每個角落！", "被一隻終界使者殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByAnvil, "這個聲音好像不太對", "被一個鐵砧啪吱一聲壓扁", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByWall, "怎麼辦到的啊！？", "被牆壁殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByFlame, "外焦內嫩香酥脆", "在烈火中死亡", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByFire, "要訣：停、躺、打滾打滾打滾", "居然沒被燒死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByBlaze, "地獄人都很友善", "被烈焰使者殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByGhast, "我以為要打回去很簡單耶", "被幽靈水母的火球殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByFall, "珍惜生命你我有責", "從某個高處掉下來", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByFireDispenser, "友軍誤傷", "被發射器的火焰彈射中", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByArrowDispenser, "小心那些絆線", "被發射器的箭矢射中", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByWater, "唔......唔唔......咕嚕咕嚕嚕......", "在水下窒息", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByIron, "那還真諷刺 (IRONic)", "在鐵塊 (Iron)上被殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedBySpace, "無重力萬歲歲歲歲歲歲——", "摔進無盡虛空", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByZombie, "我會不會死不了啊？", "你的臉被殭屍吃", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByZombieVillager, "我以為我們是朋友的......", "被村民殭屍背叛", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByZombieVillagerChild, "那小魔頭剛吃了你", "被小村民殭屍殺掉", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByZombieSword, "不是吧？抄傢伙？", "被一隻殭屍拿劍捅死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByZombieDiamond, "還我鑽石啊啊啊啊啊啊", "被一隻殭屍手持鑽石敲死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedBySkeleton, "呵呵臉沒事就好", "被骷髏射死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedBySpider, "爬上來了爬上來了", "被蜘蛛殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByDragon, "OMG! 龍耶！", "被終界龍撕碎", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByWither, "像花朵一樣......漸漸......凋零......", "被凋零怪抽空生命", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByThrownPotion, "化學汙染", "被飛濺型藥水害死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByPotion, "啊！不是這瓶！", "喝藥水致死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedBySmallSlime, "你這陰險的小傢伙", "被無害的小史萊姆殺死 (動動腦吧？)", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByMediumSlime, "被黏住了！", "被中型史萊姆殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByLargeSlime, "好個黏呼呼的大傢伙", "被大史萊姆殺死", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedByHugeSlime, "史萊姆姆姆姆——這樣犯規啦！", "被超級霹靂無敵大史萊姆殺死(人為生成)", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageDeath.killedBySelf, "俄羅斯弓箭輪盤", "......用弓箭射死自己", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineSand, "讓沙漠消失吧！", "挖一些沙子", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.buildSandstone, "我以為蜘蛛不能爬這個", "做一些砂岩", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineSnow, "雪球大戰？", "挖一些雪！", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineGlowStoneDust, "千萬別掉進岩漿裡啊", "挖一些螢光石", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.buildGlowStone, "來自地獄的光芒", "做一塊螢光石塊", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.smeltGlass, "隔牆有眼", "用沙子燒出一些玻璃", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.buildGlassPane, "你以為我看不見你嗎！", "做一些玻璃窗", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.buildSnow, "白銀世界！", "做一個雪方塊", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineMushroomBrown, "這有毒嗎？", "取得一個棕色蘑菇", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineMushroomRed, "真鮮豔啊", "取得一個紅蘑菇", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.makeMushroomStew, "Stew In A Box", "Brew some delicious mushroom stew", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.eatMushroomStew, "Fulfilling", "Drink your physics-defying stew", "zh_TW");
        MoarAchievements.addAchievementLocalizations(AchievementPageTiered.mineClay, "陶藝的樂趣", "挖一些黏土", "zh_TW");
        */
    }

}
