package com.example.ticketmall.data;

import com.example.ticketmall.R;
import com.example.ticketmall.entity.Stuff;
import com.example.ticketmall.entity.Ticket;

import java.util.ArrayList;
import java.util.List;

public class AppData {

    private static final List<Ticket> movieList = new ArrayList<>();
    private static final List<Ticket> concertList = new ArrayList<>();
    private static final List<Ticket> musicFestivalList = new ArrayList<>();
    private static final List<Ticket> comedyShowList = new ArrayList<>();
    private static final List<Stuff> stuffList = new ArrayList<>();

    public static List<Ticket> getMovieList() {
        if (movieList.isEmpty()) {
            Ticket ticket1 = new Ticket();
            ticket1.setType(TicketTypeEnum.MOVIE.getCode());
            ticket1.setTitle("水饺皇后");
            ticket1.setImageResId(R.drawable.ic_movie_1);
            ticket1.setScore("评分：9.6");
            ticket1.setContent1("导演：刘伟强   主演：马丽/惠英红/朱亚文");
            ticket1.setContent2("简介：根据真人真事改编。马丽领衔演绎真实女性成长史，逆风翻盘，闯出自己的沸腾人生！他们都不看好你，偏你最争气！\n" +
                    "开局\"地狱\"？臧健和（马丽 饰）带着两个女儿在异乡漂泊无依。既然一无所有，不如靠自己拼搏出另一番天地，大女主人生马上开启！\n" +
                    "困难重重？虽然被老板欺骗、被病痛折磨、被生活压榨，但永不服输的志气早晚会让所有不看好臧健和的人大声鼓掌！还有红姐（惠英红 饰）、华哥（朱亚文饰）、糖水伯（袁富华 饰）等善良邻里，做她最坚实的后盾！\n" +
                    "白手起家？靠自己双手改写命运走向，凭借一碗水饺登上人生巅峰！水饺皇后的故事就此拉开帷幕……");

            ticket1.setPrice(45.00d);

            Ticket ticket2 = new Ticket();
            ticket2.setType(TicketTypeEnum.MOVIE.getCode());
            ticket2.setTitle("人生开门红");
            ticket2.setImageResId(R.drawable.ic_movie_2);
            ticket2.setScore("9.1");
            ticket2.setContent1("导演：易小星   主演：常远/邓家佳/王耀庆");
            ticket2.setContent2("简介：爆笑燃爽！五一接好运，笑迎开门红！\n" +
                    "一场意外的危机公关，让\"烤肠哥\"周大江（常远 饰）阴差阳错与顶流网红小海茉（邓家佳 饰）组成了\"预制情侣\"，被迫为霸道总裁秦天龙（王耀庆 饰）\"顶包\"的周大江，误打误撞成为了直播新宠。手忙脚乱地应对着流量规则，在成为新晋网红的路上笑料百出。");
            ticket2.setPrice(35.99d);

            Ticket ticket3 = new Ticket();
            ticket3.setType(TicketTypeEnum.MOVIE.getCode());
            ticket3.setTitle("苍茫的天涯是我的爱");
            ticket3.setImageResId(R.drawable.ic_movie_3);
            ticket3.setScore("评分：8.9");
            ticket3.setContent1("导演：陈孝良   主演：曾义/周奇/孙艺洲");
            ticket3.setContent2("简介：手持定制剧本，就能走上顶流之路？模范司机赵天涯（曾毅 饰）与一心想要爆火的Rapper于虹（周奇饰）阴差阳错成为\"师徒搭档\"。于虹误以为赵天涯是MCN老板乌力吉（孙艺洲 饰）安排的真人秀NPC，误打误撞坐上老赵的大货车，由此踏上从内蒙古到湖南横跨5000公里的\"送羊\"闯关之旅。这一路，大开眼界。他们偶遇曼玉山庄董事长（柳岩 饰）慷慨解围，围观蒙古女孩Momo（王玉雯 饰）的绝美家族婚礼。在于虹以为自己即将走上人生巅峰之际，剧本走向却发生了天翻地覆的转变……");
            ticket3.setPrice(25d);

            Ticket ticket4 = new Ticket();
            ticket4.setType(TicketTypeEnum.MOVIE.getCode());
            ticket4.setTitle("哪吒之魔童闹海");
            ticket4.setImageResId(R.drawable.ic_movie_4);
            ticket4.setScore("评分：9.8");
            ticket4.setContent1("导演：饺子");
            ticket4.setContent2("简介：天劫之后，哪吒、敖丙的灵魂虽保住了，但肉身很快会魂飞魄散。太乙真人打算用七色宝莲给二人重塑肉身。但是在重塑肉身的过程中却遇到重重困难，哪吒、敖丙的命运将走向何方？");
            ticket4.setPrice(31d);

            Ticket ticket5 = new Ticket();
            ticket5.setType(TicketTypeEnum.MOVIE.getCode());
            ticket5.setTitle("唐探1900");
            ticket5.setImageResId(R.drawable.ic_movie_5);
            ticket5.setScore("评分：9.2");
            ticket5.setContent1("导演：陈思诚/戴墨   主演：王宝强/刘昊然");
            ticket5.setContent2("简介：十年情怀真诚打造，唐探宇宙口碑佳作！王宝强刘昊然唐人街神探逗笑登场，周润发名场面巅峰演绎神乎其技！欢乐包裹家国情，以\"笑\"见大有底蕴！1900年，在美国旧金山唐人街，美洲原始部落猎人阿鬼（王宝强 饰）与留美青年秦福（刘昊然 饰）因一场凶杀案偶然结识，误打误撞组成\"唐人街神探\"组合。开启了一场笑闹探案之旅……");
            ticket5.setPrice(27d);

            Ticket ticket6 = new Ticket();
            ticket6.setType(TicketTypeEnum.MOVIE.getCode());
            ticket6.setTitle("星际宝贝史迪奇");
            ticket6.setImageResId(R.drawable.ic_movie_6);
            ticket6.setScore("评分：9.2");
            ticket6.setContent1("导演：迪恩·弗雷彻-坎普");
            ticket6.setContent2("简介：讲述孤儿莉萝在夏威夷考艾岛上和一只叫 史迪奇的蓝色外星动物相处并成为形影不离的好伙伴的故事 。");
            ticket6.setPrice(35d);

            Ticket ticket7 = new Ticket();
            ticket7.setType(TicketTypeEnum.MOVIE.getCode());
            ticket7.setTitle("碟中谍8：最终清算");
            ticket7.setImageResId(R.drawable.ic_movie_7);
            ticket7.setScore("评分：暂无");
            ticket7.setContent1("导演：克里斯托夫·迈考利");
            ticket7.setContent2("简介：“我需要你相信我，最后一次……”超级人工智能“智体”即将引爆全球核弹危机，把世界推向毁灭边缘。而伊森·亨特（汤姆·克鲁斯 饰）和他的IMF小队在上次行动中遭遇重创，团队濒临分崩离析。虽然伊森已获得关闭“智体”的钥匙，但要彻底消灭“智体”，完成这一拯救全人类的终极任务，仍需要IMF小队齐心协力突破重重困难。他们不仅要面对全知全能又无影无形的“智体”与其手下盖布瑞尔（埃塞·莫拉雷斯 饰）的百般阻拦，还要解决来自过去的种种恩怨。每个抉择都关乎信念与命运，等待伊森和IMF小队的，究竟是怎样的结局？");
            ticket7.setPrice(45d);

            Ticket ticket8 = new Ticket();
            ticket8.setType(TicketTypeEnum.MOVIE.getCode());
            ticket8.setTitle("时间之子");
            ticket8.setImageResId(R.drawable.ic_movie_8);
            ticket8.setScore("评分：9.6");
            ticket8.setContent1("导演：于奥/周铁男");
            ticket8.setContent2("简介：原创国产动画电影诚意之作！王俊凯、刘校妤、周深等全明星配音阵容助力！六一假期，和ta看一场不散场的电影！ 冷面杀手十七与渔村少女千晓因神秘时轮结缘，一个想“离职”找自由，一个想“离岛”寻精彩，他们决定暂时合作成为“一日时轮搭子”，在繁华的大都会开启了一场有惊有喜的浪漫奇遇。在这个过程中，十七和千晓的关系悄悄发生着变化，从最初的冤家对头逐渐变成了默契搭档，两颗心在不经意间靠近的同时，殊不知时轮背后的秘密，也在悄然影响着两人的命运……");
            ticket8.setPrice(45d);

            Ticket ticket9 = new Ticket();
            ticket9.setType(TicketTypeEnum.MOVIE.getCode());
            ticket9.setTitle("名侦探柯南：迷宫的十字路口");
            ticket9.setImageResId(R.drawable.ic_movie_9);
            ticket9.setScore("评分：9.1");
            ticket9.setContent1("导演：儿玉兼嗣");
            ticket9.setContent2("简介：东京、大阪、京都发生了5名男子相继被杀的事件。5人是盯上古美术品的盗窃团“源氏萤”的成员，相互以义经和他的随从的名字称呼。剩下的是义经、弁庆、伊势三郎三人。柯南和被委托解决其他佛像盗窃案的毛利小五郎一起来到京都，遇到了追踪源氏萤事件的服部平次，并开始了行动。但是，服部平次被弓狙击了。为了寻找犯人，两个名侦探在京都的小镇上疾驰。");
            ticket9.setPrice(39.9d);

            Ticket ticket10 = new Ticket();
            ticket10.setType(TicketTypeEnum.MOVIE.getCode());
            ticket10.setTitle("帕丁顿熊3：秘鲁大冒险");
            ticket10.setImageResId(R.drawable.ic_movie_10);
            ticket10.setScore("评分：8.6");
            ticket10.setContent1("导演：道格尔·威尔森");
            ticket10.setContent2("简介：生活在伦敦的帕丁顿（本·威士肖 配音）从退休熊之家修女院长（奥利维娅·科尔曼 饰演）的信件中得知，住在这里的露西婶婶非常思念他。于是帕丁顿与布朗一家决定动身秘鲁，一起回乡探望他心爱的露西婶婶。然而，露西婶婶的神秘失踪将帕丁顿与布朗一家带入意想不到的惊险旅程，他们将和船长（安东尼奥·班德拉斯 饰演）与船长女儿（卡拉·杜斯 饰演）共同闯入亚马逊的迷雾丛林和陡峭的秘鲁山巅，开启寻找“黄金国”的冒险。");
            ticket10.setPrice(39.9d);

            movieList.add(ticket1);
            movieList.add(ticket2);
            movieList.add(ticket3);
            movieList.add(ticket4);
            movieList.add(ticket5);
            movieList.add(ticket6);
            movieList.add(ticket7);
            movieList.add(ticket8);
            movieList.add(ticket9);
            movieList.add(ticket10);
        }
        return movieList;
    }

    public static List<Ticket> getConcertList() {
        if (concertList.isEmpty()) {
            Ticket ticket1 = new Ticket();
            ticket1.setType(TicketTypeEnum.CONCERT.getCode());
            ticket1.setTitle("Stray Kids World Tour <dominATE PARIS>");
            ticket1.setImageResId(R.drawable.ic_concert_1);
            ticket1.setScore("热度：1546418");
            ticket1.setContent1("时间: 2025.07.26 周六 19:30");
            ticket1.setContent2("地点: 法兰西体育场(Stade de France)");
            ticket1.setPrice(780d);

            Ticket ticket2 = new Ticket();
            ticket2.setType(TicketTypeEnum.CONCERT.getCode());
            ticket2.setTitle("2025陈慧娴40周年巡回演唱会");
            ticket2.setImageResId(R.drawable.ic_concert_2);
            ticket2.setScore("热度：295028");
            ticket2.setContent1("时间: 2025.06.01 周日 19:00");
            ticket2.setContent2("地点: 宝能广州国际体育演艺中心");
            ticket2.setPrice(380d);

            Ticket ticket3 = new Ticket();
            ticket3.setType(TicketTypeEnum.CONCERT.getCode());
            ticket3.setTitle("2025郑润泽「漩涡人生」巡回演唱会");
            ticket3.setImageResId(R.drawable.ic_concert_3);
            ticket3.setScore("热度：186027");
            ticket3.setContent1("时间:2025.05.31  周六 19:00");
            ticket3.setContent2("地点: 光谷国际网球中心");
            ticket3.setPrice(398d);

            Ticket ticket4 = new Ticket();
            ticket4.setType(TicketTypeEnum.CONCERT.getCode());
            ticket4.setTitle("潘玮柏\"狂爱2.0\"巡回演唱会");
            ticket4.setImageResId(R.drawable.ic_concert_4);
            ticket4.setScore("热度：182109");
            ticket4.setContent1("时间: 2025.06.28  周六 19:00");
            ticket4.setContent2("地点: 梦之蓝青奥体育公园体育馆");
            ticket4.setPrice(480d);

            Ticket ticket5 = new Ticket();
            ticket5.setType(TicketTypeEnum.CONCERT.getCode());
            ticket5.setTitle("2025喻言「榆野岛」巡回演唱会");
            ticket5.setImageResId(R.drawable.ic_concert_5);
            ticket5.setScore("热度：115678");
            ticket5.setContent1("时间: 2025.05.24  周六  19:00 周六");
            ticket5.setContent2("地点: 广州亚运城综合体育馆");
            ticket5.setPrice(380d);

            concertList.add(ticket1);
            concertList.add(ticket2);
            concertList.add(ticket3);
            concertList.add(ticket4);
            concertList.add(ticket5);
        }
        return concertList;
    }

    public static List<Ticket> getMusicFestivalList() {
        if (musicFestivalList.isEmpty()) {
            Ticket ticket1 = new Ticket();
            ticket1.setType(TicketTypeEnum.MUSIC.getCode());
            ticket1.setTitle("2025潍坊风筝音乐节");
            ticket1.setImageResId(R.drawable.ic_music_1);
            ticket1.setScore("热度：8.9");
            ticket1.setContent1("时间: 2025.04.12-04.13");
            ticket1.setContent2("地点: 世界风筝公园");
            ticket1.setPrice(199d);

            Ticket ticket2 = new Ticket();
            ticket2.setType(TicketTypeEnum.MUSIC.getCode());
            ticket2.setTitle("邑兴坊·青潮永乐音乐节");
            ticket2.setImageResId(R.drawable.ic_music_2);
            ticket2.setScore("热度：8.7");
            ticket2.setContent1("时间: 2025.04.12-04.13");
            ticket2.setContent2("地点: 邑兴坊沉浸式唐风小镇音乐广场");
            ticket2.setPrice(198d);

            Ticket ticket3 = new Ticket();
            ticket3.setType(TicketTypeEnum.MUSIC.getCode());
            ticket3.setTitle("4.4【春心躁动电音节】·青岛站｜小长假心跳开燥！超火SOCIAL CLUB｜酒水畅饮！脱单狂欢");
            ticket3.setImageResId(R.drawable.ic_music_3);
            ticket3.setScore("热度：8.5");
            ticket3.setContent1("时间: 2025.04.04 周五 14:00");
            ticket3.setContent2("地点: SOCIAL");
            ticket3.setPrice(49.9d);

            Ticket ticket4 = new Ticket();
            ticket4.setType(TicketTypeEnum.MUSIC.getCode());
            ticket4.setTitle("徐州潘安湖奇遇海音乐节");
            ticket4.setImageResId(R.drawable.ic_music_4);
            ticket4.setScore("热度：8.8");
            ticket4.setContent1("时间: 2025.03.15-03.16");
            ticket4.setContent2("地点: 潘安湖国家湿地公园");
            ticket4.setPrice(99d);

            Ticket ticket5 = new Ticket();
            ticket5.setType(TicketTypeEnum.MUSIC.getCode());
            ticket5.setTitle("2025巅峰·斑马音乐节");
            ticket5.setImageResId(R.drawable.ic_music_5);
            ticket5.setScore("热度：8.6");
            ticket5.setContent1("时间: 2025.04.12-04.13");
            ticket5.setContent2("地点: 斑马音乐节草坪");
            ticket5.setPrice(298d);

            musicFestivalList.add(ticket1);
            musicFestivalList.add(ticket2);
            musicFestivalList.add(ticket3);
            musicFestivalList.add(ticket4);
            musicFestivalList.add(ticket5);
        }
        return musicFestivalList;
    }

    public static List<Ticket> getComedyShowList() {
        if (comedyShowList.isEmpty()) {
            Ticket ticket1 = new Ticket();
            ticket1.setType(TicketTypeEnum.COMEDY.getCode());
            ticket1.setTitle("三里屯太古里脱口秀SOHO店 |【魔脱喜剧】每周一至周日 | 双人特惠爆笑脱口秀喜剧大会");
            ticket1.setImageResId(R.drawable.ic_comedy_1);
            ticket1.setScore("热度：9.2");
            ticket1.setContent1("时间: 2025.02.26-03.31");
            ticket1.setContent2("地点: 魔脱喜剧-三里屯SOHO店");
            ticket1.setPrice(39d);

            Ticket ticket2 = new Ticket();
            ticket2.setType(TicketTypeEnum.COMEDY.getCode());
            ticket2.setTitle("喜剧部落【三里屯喜剧联欢会】解压脱口秀|知名脱口秀演员|漫才即兴｜场场爆满");
            ticket2.setImageResId(R.drawable.ic_comedy_2);
            ticket2.setScore("热度：9.0");
            ticket2.setContent1("时间: 2025.02.26-03.15");
            ticket2.setContent2("地点: 工体脱口秀-喜剧部落店");
            ticket2.setPrice(61d);

            Ticket ticket3 = new Ticket();
            ticket3.setType(TicketTypeEnum.COMEDY.getCode());
            ticket3.setTitle("Standby小鹿脱口秀专场《我的中女时代》@上海");
            ticket3.setImageResId(R.drawable.ic_comedy_3);
            ticket3.setScore("热度：8.8");
            ticket3.setContent1("时间: 2025.04.24-04.27");
            ticket3.setContent2("地点: 交通银行前滩31演艺中心 · 大剧场");
            ticket3.setPrice(220d);

            Ticket ticket4 = new Ticket();
            ticket4.setType(TicketTypeEnum.COMEDY.getCode());
            ticket4.setTitle("【普通话/上海话】大咖脱口秀@要玩喜剧 | 精品剧场&个人专场");
            ticket4.setImageResId(R.drawable.ic_comedy_4);
            ticket4.setScore("热度：8.9");
            ticket4.setContent1("时间: 2025.02.26-03.31");
            ticket4.setContent2("地点: 要玩喜剧脱口秀-外滩店");
            ticket4.setPrice(29d);

            Ticket ticket5 = new Ticket();
            ticket5.setType(TicketTypeEnum.COMEDY.getCode());
            ticket5.setTitle("天河正佳广场丨每周一至周日爆笑精品秀丨轻松解压丨顽笑猴脱口秀");
            ticket5.setImageResId(R.drawable.ic_comedy_5);
            ticket5.setScore("热度：9.1");
            ticket5.setContent1("时间: 2025.02.26-02.28");
            ticket5.setContent2("地点: 飞扬影城(正佳广场店)");
            ticket5.setPrice(32d);

            comedyShowList.add(ticket1);
            comedyShowList.add(ticket2);
            comedyShowList.add(ticket3);
            comedyShowList.add(ticket4);
            comedyShowList.add(ticket5);
        }
        return comedyShowList;
    }

    public static List<Stuff> getStuffList() {
        if (stuffList.isEmpty()) {
            Stuff ticket1 = new Stuff();
            ticket1.setName("爆米花（小）");
            ticket1.setImageResId(R.drawable.ic_stuff_2);
            ticket1.setPoints(50);

            Stuff ticket2 = new Stuff();
            ticket2.setName("爆米花（大）");
            ticket2.setImageResId(R.drawable.ic_stuff_1);
            ticket2.setPoints(80);

            Stuff ticket3 = new Stuff();
            ticket3.setName("可乐");
            ticket3.setImageResId(R.drawable.ic_stuff_3);
            ticket3.setPoints(20);

            Stuff ticket4 = new Stuff();
            ticket4.setName("雪碧");
            ticket4.setImageResId(R.drawable.ic_stuff_4);
            ticket4.setPoints(20);

            Stuff ticket5 = new Stuff();
            ticket5.setName("橙汁");
            ticket5.setImageResId(R.drawable.ic_stuff_5);
            ticket5.setPoints(20);

            Stuff ticket6 = new Stuff();
            ticket6.setName("咖啡");
            ticket6.setImageResId(R.drawable.ic_stuff_9);
            ticket6.setPoints(40);

            Stuff ticket7 = new Stuff();
            ticket7.setName("矿泉水");
            ticket7.setImageResId(R.drawable.ic_stuff_10);
            ticket7.setPoints(40);

            Stuff ticket8 = new Stuff();
            ticket8.setName("StrayKids官方手灯2.0");
            ticket8.setImageResId(R.drawable.ic_stuff_6);
            ticket8.setPoints(3250);

            Stuff ticket9 = new Stuff();
            ticket9.setName("SKZOO应援棒套");
            ticket9.setImageResId(R.drawable.ic_stuff_7);
            ticket9.setPoints(810);

            Stuff ticket10 = new Stuff();
            ticket10.setName("EVIL SKZOO T恤");
            ticket10.setImageResId(R.drawable.ic_stuff_8);
            ticket10.setPoints(3250);



            stuffList.add(ticket1);
            stuffList.add(ticket2);
            stuffList.add(ticket3);
            stuffList.add(ticket4);
            stuffList.add(ticket5);
            stuffList.add(ticket6);
            stuffList.add(ticket7);
            stuffList.add(ticket8);
            stuffList.add(ticket9);
            stuffList.add(ticket10);

        }
        return stuffList;
    }

}
