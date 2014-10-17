package com.company;


/**
 * Created by romitas on 16/09/14.
 */
public class Script {

    // Act I

    public String[] wokeUp = {
            "...Я открыл глаза.",
            "Где-то вверху шумел ветер, раскачивая в затейливом танце тяжелые кроны деревьев.",
            "Время от времени слышался отчетливый, но далекий скрип: очередной лесной исполин,\n" +
                    "не дав мне еще времени толком проснуться, уже жаловался на свою горькую судьбу.",
            "Конечно мне, кому же еще. Его можно понять: на многие десятки или тысячи километров\n" +
                    "вокруг нет больше ни единой живой души, способной ему посочувствовать.",
            "И я не стану. И да простит меня мой невольный собеседник: я просто слишком устал, чтобы беспокоиться о чьих-то чужих заботах.",
            "Видит Бог, мне хватает своих."
    };
    public String[] timeofDay = {
            "Занималось серое, тусклое утро. Это не так-то просто определить, учитывая, что здесь постоянно\n" +
                    "царит полумрак, но я уже слишком много времени провел в этом месте, чтобы ошибаться в таких вещах.",
            "Уже рассвело, и холодное, невидимое солнце, должно быть, приближалось к зениту. Выражалось же\n" +
                    "это лишь в том, что вокруг стало едва заметно светлее обычного и серое небо чуть сменило оттенок.",
            "Смеркалось. Слабые, последние лучи заходящего солнца, геройски пробившиеся сквозь плотную завесу облаков и листвы\n" +
                    "в изнеможении падали на землю редкими пятнами, окрашивая ее причудливым узором красноватого света и тонких теней.",
            "Ночь. Темное безлунное небо над головой. Вокруг, вероятно, было темно, хоть глаз выколи, но в силу\n" +
                    "то ли привычки, то ли сжалившегося провидения я неплохо видел в темноте, без труда различая кривые,\n" +
                    "черные силуэты деревьев, редкую темно-серую траву под ногами и неестественно бледные пальцы собственных рук."
    };
    public String[] weather = {
            "На небе не было ни облака, как принято говорить, но на самом же деле оно просто было не более пасмурным, чем обычно.\n" +
                    "Что ж, это по крайней мере обещало относительное тепло и сухость, так что этому можно было лишь порадоваться.",
            "Небо сегодня было особенно мрачным даже по меркам этого места. Тяжелые свинцовые тучи нависали низко над головой, навязчиво грозя\n" +
                    "разразиться особенно мощным ливнем или опасной грозой. Впрочем, пока все было чисто, лишь вокруг стало чуть темнее обычного.",
            "Моросил мелкий, серый дождь, незримыми каплями играя свой монотонный, скучный, но должно быть, какой-то очень печальный\n" +
                    "романс на мокрых листьях и сырой траве, стекая тонкими холодными струями по веткам, стволам и шее, заливаясь за шиворот.",
            "Все вокруг окутал плотный, густой туман. Было холодно и сыро. К тому же на расстоянии в десять-пятнадцать шагов\n" +
                    "разглядеть в мутной белесой пелене не удавалось ровным счетом ничего. Прогулка обещала выдаться не из приятных.",
    };
    public String[] checkEquip = {
            "Я бегло осмотрел снаряжение, благо было его немного:",
            "Старый компас, остановившиеся часы, тупой перочинный нож да револьвер -\n" +
                    "если не считать нескольких худо зажаренных кусков мяса, оставшихся с последней добычи, вот и все мои пожитки.",
            "Не слишком-то много для человека, которому еще неведомо сколько недель скитаться по безлюдному лесу."
    };
    public String checkAmmo = "Вынув револьвер, я пересчитал патроны. Их оставалось ровно %d.";
    public String readyToGo = "Я поднялся на ноги, отряхнулся и раскрыл компас. Пора идти.";
    public String onAHalt = "Спустя некоторое время - может, час, может, больше - я остановился перевести дух.\n" +
            "Вокруг по-прежнему простирался бескрайний лес. Передохнув пару минут, я вновь взглянул на компас.";
    public String establishDirection = "Дорога открыта во все стороны: на СЕВЕР, на ЮГ, на ЗАПАД и на ВОСТОК. Поразмыслив, я решил отправиться на... >> ";
    public String madeAMistake = "Я покачал головой и постучал пальцем по крышке компаса. Не было никаких оснований\n" +
            "ему доверять, но и полагаться оставалось только на него. Да и, в сущности, не было никакой разницы,\n" +
            "действительно ли он указывал верное направление. Важно было лишь не ошибаться самому.";
    public String[] WALKING = {
            "Лес вокруг был густой, заросший и дикий. Я продирался сквозь вязкую, цепкую паутину мелких сухих веток,\n" +
                    "больно хлеставших по лицу и царапающих руки, перешагивал через упавшие деревья, пригибаясь,\n" +
                    "уворачиваясь и чертыхаясь, медленно, с трудом преодолевал частокол темных стволов и колючих кустарников.",
            "Путь мне преградил огромный ствол упавшего дерева - тяжелый, полусгнивший и мокрый,\n" +
                    "покрытый лоскутами грязного мха и россыпями бледных грибов. Обойти его не представлялось возможным,\n" +
                    "поэтому пришлось перелезать. Я дважды поскользнулся, измазавшись в грязи и обломав несколько гнилых\n" +
                    "сучьев, прежде чем мне удалось перебраться на ту сторону.",
            "Дорогу пересекла неглубокая канава, по дну которой неторопливо и устало тащил свои мутные воды мелкий ручей.\n" +
                    "Я остановился, хотя и не испытывал жажды, и несколько минут бездумно смотрел на него. В воздухе витал\n" +
                    "какой-то едва заметный затхлый запах - чуть выше по течению к берегу прибило мертвую мышь. Не было причин\n" +
                    "оставаться здесь дольше, поэтому я перешагнул канаву и продолжил путь.",
            "Стало светлее - лес рассеялся, услужливо уступая место небольшой поляне, заросшей высокой травой и редкими кустами,\n" +
                    "усыпанными какими-то мелкими белыми ягодами. Наверняка ядовитыми - здесь другие и не растут. Пробираясь по пояс\n" +
                    "в зарослях травы, я постарался побыстрее пересечь поляну и вновь углубился в лес.",
            "Дорога круто пошла вверх, взбираясь по невысокому, но практически отвесному и скользкому склону. Цепляясь за\n" +
                    "торчащие из земли кривые мощные корни и тонкие, тщедушные деревца, пытаясь удержать шаткое равновесие,\n" +
                    "я осторожно начал взбираться. Пару раз нога соскальзывала на мягкой, предательски мокрой\n" +
                    "и зеркально гладкой глине, но в конце концов я все же сумел добраться до верха.",
            "Впереди был обрыв. Вероятно, забытый след какой-нибудь давно пересохшей или просто умершей с скуки мелкой безвестной реки,\n" +
                    "что когда-то протекала здесь. Незавидная судьба. Обрыв был довольно пологий, поросший низким кустарником,\n" +
                    "поэтому я медленно, но без особенного труда спустился с него, придерживаясь за ветки и пучки травы, казавшиеся достаточно надежными."
    };
    public String[] sawTheFire = {
            "...Неожиданно мне показалось, что вдалеке, меж темных деревьев, в затхлом лесном полумраке промелькнул непривычно яркий, чужой свет.",
            "Поначалу я было решил, что прихотливый узор веток и листвы играет со мной злую шутку,\n" +
                    "но по мере того, как я подходил ближе, сомнения рассеивались: впереди отчетливо виднелся костер.",
            "Подавив мгновенное желание броситься к нему со всех ног, я замедлил шаг и начал осторожно подкрадываться, стараясь не выдать своего присутствия.",
            "Хотя бы до тех пор, пока не узнаю, чем это может обернуться.",
            "У костра спиной ко мне сидел человек. Он был один, и, казалось, дремал или думал о чем-то, все еще не заметив моего появления.",
            "Из осторожности я не стал подходить ближе и остановился чуть поодаль, укрывшись за деревом и разглядывая незнакомца."
    };

    public String[] strangerAges = {
            "Это был молодой человек - на вид ему можно было дать лет не более двадцати пяти - со строгими,\n" +
                    "правильными, почти аристократическими чертами бледного лица.",
            "Он оказался кряжистым мужчиной средних лет с окладистой черной бородой и гривой спутанных,\n" +
                    "неровно подрезанных волос, спадающих на широкие плечи.",
            "Он выглядел немолодым: на смуглом суровом лице его явно проступали морщины, а волосы, стянутые на затылке\n" +
                    "в короткий конский хвост, были сплошь седыми."
    };
    public String[] strangerMoods = {
            "Он сидел, как будто о чем-то задумавшись, спокойно и невозмутимо устремив взгляд в огонь.",
            "Казалось, он был чем-то удручен. На лице его ясно читались сомнение и скорбь.",
            "Было похоже, будто он сильно рассержен: он то и дело крепко стискивал руки и напряженно качал головой."
    };

    public String[] branchCracked = {
            "Я увлеченно наблюдал за незнакомцем и размышлял, как мне поступить, когда моя природная грациозность все решила за меня:\n" +
                    "выглядывая из своего укрытия, я ненароком наступил на крупную сухую ветку, которая не замедлила переломиться с громким, уверенным хрустом.",
            "Я тут же укрылся за деревом, но человек, разумеется, услышал. Он резко обернулся, обводя лес тревожным взглядом в поисках виновника внезапного шума."
    };

    public String[] strangerDidNotNotice = {
            "Безлунная ночь сыграла мне на руку. Судя по всему, незнакомец не мог видеть в темноте так же хорошо, как я, поэтому\n" +
                    "довольно скоро он оставил тщетные попытки различить хоть что-то в кромешной тьме, и, успокоившись, вновь повернулся к костру.",
            "Сумерки сгущались, и к этому времени было уже достаточно темно. Впорчем, вряд ли это помогло бы мне, если бы он стал искать,\n" +
                    "но по счастью именно в этот момент в двух шагах от меня пробежал большой заяц. Человек тоже увидел его и, по-видимому, решив,\n" +
                    "что он-то и был виновником всей суеты, раздраженно махнул рукой и отвернулся.",
            "Впрочем, плотный туман сильно ограничивал видимость, поэтому я был практически уверен, что он не заметит меня за деревом - я сам с трудом\n" +
                    "различал его черты, хотя он сидел у костра. Так и случилось - не обнаружив ничего подозрительного, он вскоре вернулся к своим размышлениям.",
            "Укрытие мое было смехотворным, и если бы незнакомец стал тщательно вглядываться, он бы несомненно обнаружил меня. Но спас дождь, который\n" +
                    "до сих пор и не думал прекращаться. Капли непрерывно стучали по листьям, постоянно создавая шумный фон и приглушив тем самым треск сломанной ветки.\n" +
                    "Так что не заметив с первого взгляда ничего подозрительного, человек, видимо, решил, что ему послышалось и отвернулся."
    };
    public String[] strangerDidNotice = {
            "Надежно спрятаться мне не удалось, да и, как назло, было светло и ясно.",
            "Я стоял за деревом, быстро перебирая в уме варианты дальнейших действий, когда вдруг услышал:",
            "- Эй, кто там? Зачем ты прячешься? Я видел тебя. Подходи и присаживайся. Вероятно нам найдется о чем поговорить.",
            "Я понятия не имел, кто он и что у него на уме. Но, похоже, он по крайней мере не собирался нападать сразу.",
            "Да и выбора у меня, в общем-то, не было. Что-то мне подсказывало, что не стоит пробовать сбежать от него.",
            "Поэтому я вышел из-за дерева, поднял руку в знак приветствия и добрых намерений и подошел к костру."
    };

    public String stealthApproach = "Когда угроза миновала, я облегченно вздохнул, отер пот со лба и стал прикидывать, что делать дальше.";
    public String[] stealthWays = {
            "Что ж, вариантов-то, в сущности, было немного.",
            "Я мог выйти из-за дерева и в открытую пойти к костру, чтобы ЗАГОВОРИТЬ с незнакомцем.",
            "Скорее всего он был опасен. Я мог вынуть револьвер и ВЫСТРЕЛИТЬ в него.",
            "В конце концов я мог бы просто развернуться и незаметно УЙТИ восвояси, избежав таинственной встречи."
    };
    public String chooseStealthWay = "Итак, ЗАГОВОРИТЬ, ВЫСТРЕЛИТЬ или УЙТИ. После недолгих размышлений я решил >> ";
    public String stealthHesitated = "Я колебался, не решаясь сделать окончательный выбор. Мысли в голове мешались и путались. Нужно было взять себя в руки.";


    public String[] stealthTalk = {
            "Я спрятал оружие, вышел из-за дерева и окликнул незнакомца. Он резко обернулся.",
            "Я поднял обе руки в знак добрых намерений и медленно подошел к костру."
    };
    public String[] stealthShoot = {
            "Я глубоко вздохнул, взвел курок и, бесшумно выглянув из-за дерева, прицелился в незнакомца. Далеко, но я знал, что не промахнусь.",
            "Он ничего не заметил и по-прежнему сидел ко мне спиной. Я унял дрожь в руках, выждал полторы секунды и спустил курок.",
            "Грянул выстрел. Человек у костра неловко пошатнулся, замер на полсекунды в нелепом положении, а затем повалился лицом в костер.",
            "Я подбежал к нему и с трудом вытащил из огня. Он был уже мертв - пуля попала в голову.",
            "Беглый обыск ни к чему не привел - при нем было ничего, что могло бы как-то помочь мне выбраться. При нем не было даже оружия."
    };
    public String[] stealthLeave = {
            "Держа на всякий случай револьвер наготове, я медленно и осторожно стал отходить назад, не спуская глаз с незнакомца. Он не двигался.",
            "Скоро он пропал из виду, а еще через некоторое время я перестал видеть и костер. Тогда я развернулся и зашагал в обратном направлении. В глубь леса.",
    };

    public String[] noHope = {
            "Теперь все, что мне оставалось - это все так же бесцельно и слепо продолжать бродить по этому лесу, пока не закончатся припасы.",
            "Я не знал, кем был этот человек. Возможно, я только что спасся от гибели.",
            "Возможно, отнял у себя последнюю надежду на спасение.",
            "Хотя... Нет, еще не последнюю. Пока я оставался жив, надежда все еще была.",
    };

    public String noHopeDecide = "Все же у меня все еще был выбор. Я мог продолжать ИДТИ вперед ИЛИ... >> ";
    public String noHopeHesitation = "Решение было непростое, но я с удивлением отметил, что отношусь к нему как-то очень легко. Как будто оно уже не имело значения.";

    public String[] noHopeMoveOn = {
            "Нет. Я не сдался. Пока я еще мог идти, я должен был идти.",
            "Я провел в этом лесу уже несчетное количество дней. Мне уже казалось, что я был здесь всегда.",
            "Но никакая сила не заставит меня отступить, хоть бы мне пришлось бродить по нему еще целую вечность. Или даже две.",
            "А этот случай - случай, который мог бы оказаться спасительным, поведи я себя иначе - я изо всех, из последних сил пытался забыть.",
            "Потому что иначе я бы просто сошел с ума. В очередной раз."
    };

    public String[] noHopeShoot = {
            "Действительно. Почему бы и нет.",
            "Поигрывая револьвером в руке, я думал. Что-то однозначно переломилось во мне после этого случая.",
            "Сколько я уже бродил по этому лесу, а подобная мысль раньше ни разу не приходила ко мне в голову. Почему-то я знал, что она не могла прийти.",
            "Я задумчиво взвел курок и поднес револьвер к виску. Как все-таки интересно. И как просто. Сколько же времени я потерял впустую?..",
            "Ну да ладно. Буду умнее в следующий раз."
    };

    // Act II

    public String[] byTheFireAcquaintance = {
            "...Мы сидели у костра, протянув ноги к огню, и молча наслаждались теплом и тишиной.",
            "К этому моменту мы уже успели о многом друг друга порасспрашивать. Как оказалось, нам действительно было о чем поговорить.",
            "Его звали %s, и он оказался, в сущности, неплохим парнем. Как он очутился в этом лесу? Он сказал, что не помнит.",
            "Это было неудивительно. Откровенно говоря, я свою историю уже тоже помнил слишком смутно, чтобы попытаться внятно рассказать.",
            "Должно быть, в этом месте это в порядке вещей."
    };

    public String[] byTheFireMoodCalm = {
            "Мне чем-то нравился этот человек. Несмотря ни на что, он сохранял потрясающее самообладание.",
            "Так и сейчас, невозмутимый и бесстрастный, он, казалось, даже не был особенно удивлен нашей встречей."
    };
    public String[] byTheFireMoodSad = {
            "Разумеется, он был рад меня видеть. Как и я, он был уверен, что совершенно одинок в этом чудовищном лесу.",
            "Но все же он явно не верил в то, что это что-то серьезно изменит. Он был настроен довольно пессимистично."
    };
    public String[] byTheFireMoodAngry = {
            "Он невероятно обрадовался, когда увидел меня. Он явно был вообще склонен воспринимать все близко к сердцу.",
            "Как он сам признался, он уже был на грани, готовый от яростного бессилия наложить на себя руки, когда появился я."
    };

    public String[] byTheFireConfession = {
            "Мы с интересом поболтали о том, кто из нас уже сколько блуждает по этому лесу и что где видел.",
            "Впрочем, ни часов, ни календаря, ни карты ни у одного из нас не было, поэтому разговор вышел занятным, но не слишком содержательным.",
            "%s рассказал немного о себе. Он где-то жил, кем-то работал, кого-то любил... Наверное. Меня клонило в сон, и я не особо его слушал.",
            "А еще он был людоедом.",
            "Это он рассказал мне уже после того, как повалил на землю и намертво стянул руки за спиной тонкой бечевкой.",
            "Хотя на самом деле это было даже излишне: к тому моменту я уже и сам догадался о чем-то подобном.",
            "Теперь же мы оба сидели у костра и молча грелись: я, связанный по рукам и ногам, и %s, меланхолично затачивающий свой нож."
    };

    public String[] byTheFireOptions = {
            "Была одна приятная мелочь - я по-прежнему ощущал тяжесть револьвера во внутреннем кармане куртки.",
            "Это значило, что он не выпал во время схватки. Но пока руки мои были связаны, пользы от него не было никакой.",
            "Очевидно, в такой ситуации я мог сделать очень немного. Времени тоже было мало, и становилось все меньше.",
            "Можно было разве что попробовать завязать РАЗГОВОР, чтобы усыпить его бдительность и выиграть время.",
            "Или попытаться выяснить, как можно развязать УЗЕЛ, поискав поблизости что-нибудь подходящее.",
            "Или можно было, например, издать ВОПЛЬ отчаяния. Почему бы и нет.",
    };

    public String byTheFireOptionsChoose = "Стало быть, РАЗГОВОР, УЗЕЛ или ВОПЛЬ. Я решил, что в данный момент важнее всего будет >> ";
    public String byTheFireHesitation = "Обстановка не располагала к взвешенным решениям, но паниковать было нельзя. Необходимо было собраться с мыслями.";

    public String[] byTheFireStrangerActions = {
            "Тем временем %s усердно продолжал точить нож.",
            "%s закончил точить нож. Потрогав лезвие пальцем, он явно остался удовлетворен результатом.\n" +
                    "После этого он встал, вежливо попросил меня не делать глупостей и ушел в лес.",
            "%s все еще не вернулся.",
            "Из леса послышались шаги, и через пару минут появился %s, несущий охапку хвороста и длинную прямую палку.\n" +
                    "Он вновь присел у костра, отложил хворост в сторону и начал затачивать жердь с одной стороны.",
            "%s по-прежнему увлеченно затачивал свой вертел.",
            "Судя по всему, вертел был готов. По мне, зрелище было жуткое, но %s казался довольным.",
            "%s швырнул в огонь охапку хвороста, отчего языки пламени жадно взвились, полыхнув жаром.",
            "Все приготовления были окончены. %s подошел, наклонился, виновато улыбнулся и легким движением руки перерезал мне горло."
    };

    public String[] byTheFireTalkingTopics = {
            "Важно было правильно выбрать тему для разговора. Навскидку мне в голову приходили несколько вариантов.",
            "ХЛАДНОКРОВИЕ. \"В любой ситуации важно держать себя в руках...\"",
            "БЕЗЫСХОДНОСТЬ. \"Этот лес - на удивление мерзкое и злое место...\"",
            "ЗЛОСТЬ. \"Меня вот этот бесконечный лес уже выводит из себя...\""
    };
    public String byTheFireTopicChoose = "Что могло заинтересовать его настолько, чтобы он отвлекся хоть на минуту? >> ";
    public String byTheFireWrongTopic = "Не стоило сейчас импровизировать - слишком велика была вероятность сказать какую-нибудь ерунду.";

    public String byTheFireTalkingWorked = "Я заговорил, пытаясь привлечь его внимание, и мне это удалось: он с явным интересом прислушивался к моим словам, а потом отложил\n" +
            "в сторону инструменты и поддержал диалог, начав что-то рассказывать. Я уже не слушал его, ведь у меня появилось несколько лишних минут.";
    public String byTheFireTalkingDidntWork = "Я заговорил, пытаясь привлечь его внимание, но, казалось, он не проявлял особого интереса к теме разговора.\n" +
            "Впрочем, он все же ненадолго приостановил работу и о чем-то задумался, что все-таки дало мне немного времени.";

    public String byTheFireKnotCutting = "Узел был прочный, но бечевка казалась ненадежной. Я незаметно потер ее о дерево, на которое опирался. Она немного подалась.";

    public String[] byTheFireShoot = {
            "Узел наконец подался, и я почувствовал, как ослабли путы.",
            "В ту же секунду я выхватил револьвер из кармана и в упор выстрелил в него.",
            "Он пошатнулся, удивленно уставившись на меня, после чего медленно, неуклюже завалился на спину.",
            "Я стоял над ним, тяжело дыша. Потом отвернулся. Мне больше нечего было здесь делать."
    };


    public String byTheFireScream = "Я завопил что есть духу, заставив лес откликнуться глухим эхом. %s взглянул на меня озадаченно, но ничего не сказал.";

    public String GameOver = "* * *";
}