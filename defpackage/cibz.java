package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cibz implements cicm {
    private static final cqce c = cqce.g("BugleDataModel", "DefaultRcsConversationAndThreadIdGetterImpl");
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/rcs/conversation/DefaultRcsConversationAndThreadIdGetterImpl");
    public final fcsu a;
    public final aqnw b;
    private final eosc e;
    private final cicl f;
    private final ciux g;
    private final ains h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final cidd m;
    private final eygg n;

    public cibz(eosc eoscVar, cicl ciclVar, ciux ciuxVar, ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cidd ciddVar, eygg eyggVar, aqnw aqnwVar) {
        this.e = eoscVar;
        this.f = ciclVar;
        this.g = ciuxVar;
        this.h = ainsVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.a = fcsuVar4;
        this.l = fcsuVar5;
        this.m = ciddVar;
        this.n = eyggVar;
        this.b = aqnwVar;
    }

    private static ekgb e(botl botlVar) {
        botb botbVarE = botm.e();
        botbVarE.A("+queryConversationsTableWithIdAndThreadIdProjection");
        botbVarE.f(new Function() { // from class: ciba
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                return new bopq[]{boppVar.a, boppVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.h(botlVar);
        return botbVarE.b().z();
    }

    private static ekgb f(cibv cibvVar, Optional optional) {
        ciad ciadVar = (ciad) cibvVar;
        ekgb ekgbVar = ciadVar.a;
        if (ekgbVar.size() == 1) {
            cqbd cqbdVarA = c.a();
            cqbdVarA.I("Single conversation matched by all parameters query.");
            cqbdVarA.r();
            optional.ifPresent(new Consumer() { // from class: ciak
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: cibm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 1;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return ekgbVar;
        }
        Optional optional2 = ciadVar.b;
        if (optional2.isPresent() && ((ekgb) optional2.get()).size() == 1) {
            cqbd cqbdVarA2 = c.a();
            cqbdVarA2.I("Single conversation matched by global identifiers fallback query.");
            cqbdVarA2.r();
            optional.ifPresent(new Consumer() { // from class: cibn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: cibo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 2;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (ekgb) optional2.get();
        }
        Optional optional3 = ciadVar.c;
        if (optional3.isPresent() && ((ekgb) optional3.get()).size() == 1) {
            cqbd cqbdVarA3 = c.a();
            cqbdVarA3.I("Single conversation matched by session ID fallback query.");
            cqbdVarA3.r();
            optional.ifPresent(new Consumer() { // from class: cibp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: cibq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 3;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (ekgb) optional3.get();
        }
        Optional optional4 = ciadVar.d;
        if (optional4.isPresent()) {
            final int size = ((ekgb) optional4.get()).size();
            cqbd cqbdVarA4 = c.a();
            cqbdVarA4.y("NumberOfConversationsMatched", size);
            cqbdVarA4.I("Multiple conversations matched by Telephony fallback query.");
            cqbdVarA4.r();
            optional.ifPresent(new Consumer() { // from class: cial
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = size;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ciam
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 5;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (ekgb) optional4.get();
        }
        if (optional2.isPresent() && !((ekgb) optional2.get()).isEmpty()) {
            final int size2 = ((ekgb) optional2.get()).size();
            cqbd cqbdVarA5 = c.a();
            cqbdVarA5.y("NumberOfConversationsMatched", size2);
            cqbdVarA5.I("Multiple conversations matched by global identifiers fallback query.");
            cqbdVarA5.r();
            optional.ifPresent(new Consumer() { // from class: cian
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = size2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ciao
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 2;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (ekgb) optional2.get();
        }
        if (optional3.isPresent() && !((ekgb) optional3.get()).isEmpty()) {
            final int size3 = ((ekgb) optional3.get()).size();
            cqbd cqbdVarA6 = c.a();
            cqbdVarA6.y("NumberOfConversationsMatched", size3);
            cqbdVarA6.I("Multiple conversations matched by session ID fallback query.");
            cqbdVarA6.r();
            optional.ifPresent(new Consumer() { // from class: ciav
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.b |= 256;
                    emagVar.k = size3;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: cibg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 3;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (ekgb) optional3.get();
        }
        final int size4 = ekgbVar.size();
        cqbd cqbdVarA7 = c.a();
        cqbdVarA7.y("NumberOfConversationsMatched", size4);
        cqbdVarA7.I("Multiple conversations matched by all parameters query.");
        cqbdVarA7.r();
        optional.ifPresent(new Consumer() { // from class: cibk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                emac emacVar = (emac) obj;
                emacVar.copyOnWrite();
                emag emagVar = (emag) emacVar.instance;
                emag emagVar2 = emag.a;
                emagVar.b |= 256;
                emagVar.k = size4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (size4 > 0) {
            optional.ifPresent(new Consumer() { // from class: cibl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    emac emacVar = (emac) obj;
                    emacVar.copyOnWrite();
                    emag emagVar = (emag) emacVar.instance;
                    emag emagVar2 = emag.a;
                    emagVar.h = 1;
                    emagVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return ekgbVar;
    }

    private final void g(final boolean z, boolean z2, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        Object obj = optional.get();
        ((evsf) obj).copyOnWrite();
        emag emagVar = (emag) ((emac) obj).instance;
        emag emagVar2 = emag.a;
        emagVar.b |= 128;
        emagVar.j = z2;
        final cidd ciddVar = this.m;
        final emag emagVar3 = (emag) ((evsf) optional.get()).build();
        ((eksl) cidd.a.n().h("com/google/android/apps/messaging/shared/rcs/conversation/analytics/RcsGroupResolutionAnalytics", "logRcsGroupResolution", 45, "RcsGroupResolutionAnalytics.java")).q("Sending GroupResolution event to Clearcut");
        ciddVar.b.k(new Supplier() { // from class: cidc
            @Override // java.util.function.Supplier
            public final Object get() {
                ellv ellvVar = (ellv) elmc.b.createBuilder();
                ellvVar.copyOnWrite();
                elmc elmcVar = (elmc) ellvVar.instance;
                elmcVar.d = 10;
                elmcVar.c |= 1;
                ellvVar.copyOnWrite();
                elmc elmcVar2 = (elmc) ellvVar.instance;
                elmcVar2.e = (true != z ? 3 : 2) - 1;
                elmcVar2.c |= 2;
                cidd ciddVar2 = ciddVar;
                elpy elpyVarA = ciddVar2.d.a(ciddVar2.c.a(chvn.r));
                ellvVar.copyOnWrite();
                elmc elmcVar3 = (elmc) ellvVar.instance;
                elmcVar3.g = elpyVarA;
                elmcVar3.c |= 8;
                enwr enwrVarA = ((chzn) ciddVar2.e.b()).a();
                ellvVar.copyOnWrite();
                elmc elmcVar4 = (elmc) ellvVar.instance;
                elmcVar4.h = enwrVarA.N;
                elmcVar4.c |= 16;
                ellvVar.copyOnWrite();
                elmc elmcVar5 = (elmc) ellvVar.instance;
                emag emagVar4 = emagVar3;
                emagVar4.getClass();
                elmcVar5.l = emagVar4;
                elmcVar5.c |= 1024;
                return (elmc) ellvVar.build();
            }
        });
    }

    @Override // defpackage.cicm
    public final ConversationIdType a(cicr cicrVar) throws Throwable {
        cpeb cpebVarC = c(cicrVar);
        return cpebVarC == null ? barn.a : cpebVarC.a();
    }

    public final cnqj b(ConversationIdType conversationIdType) {
        if (((Boolean) avos.d.e()).booleanValue()) {
            return ((avmr) this.l.b()).a(conversationIdType);
        }
        bojh bojhVarB = botm.b(conversationIdType);
        return bojhVarB != null ? bojhVarB.N() : new cnqj();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:22|(2:302|23)|(9:25|(0)(1:28)|295|30|(1:32)(1:33)|34|(22:36|(20:42|(1:44)|46|(1:79)(9:50|288|51|(1:53)(5:(1:55)(1:56)|57|(3:60|(4:305|68|312|311)(4:310|67|313|311)|58)|306|69)|70|(2:73|71)|304|74|75)|80|(2:82|(1:84))(2:85|(3:87|(1:89)|(1:91))(2:92|(1:94)))|95|(2:97|(1:99))|100|(1:102)|103|(1:105)|106|107|298|(1:109)(6:111|112|(2:114|(1:116))(1:117)|(1:119)(2:120|(1:122))|123|124)|110|(0)(0)|123|124)|45|46|(1:48)|79|80|(0)(0)|95|(0)|100|(0)|103|(0)|106|107|298|(0)(0)|110|(0)(0)|123|124)(4:127|292|128|129)|136|137)|29|295|30|(0)(0)|34|(0)(0)|136|137) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x067c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x067d, code lost:
    
        r3 = "Bugle.Rcs.Groups.Conversation.Resolution.Latency";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c1 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04f7 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x051c A[Catch: all -> 0x067c, TRY_ENTER, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0544 A[Catch: all -> 0x067c, TRY_LEAVE, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c5 A[Catch: all -> 0x066d, TryCatch #6 {all -> 0x066d, blocks: (B:120:0x05c5, B:122:0x05ff, B:114:0x054d, B:116:0x058a, B:117:0x05b0), top: B:298:0x051a }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: all -> 0x0bfc, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0bfc, blocks: (B:3:0x0010, B:20:0x009f, B:22:0x00a8, B:6:0x0039, B:9:0x0041, B:16:0x0064), top: B:296:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0415 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x042b A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0486 A[Catch: all -> 0x067c, TryCatch #4 {all -> 0x067c, blocks: (B:30:0x0146, B:34:0x0160, B:36:0x0194, B:38:0x01b6, B:40:0x01bc, B:42:0x01c2, B:44:0x0206, B:46:0x0249, B:48:0x024f, B:50:0x0262, B:75:0x03b7, B:80:0x0406, B:82:0x0415, B:84:0x0423, B:95:0x047b, B:97:0x0486, B:99:0x04a7, B:100:0x04b6, B:102:0x04c1, B:103:0x04c8, B:105:0x04f7, B:106:0x0505, B:109:0x051c, B:111:0x0544, B:85:0x042b, B:87:0x0432, B:89:0x0455, B:91:0x045e, B:92:0x0466, B:94:0x0474, B:77:0x03f4, B:78:0x03ff, B:33:0x0152, B:51:0x026f, B:53:0x028f, B:70:0x035f, B:71:0x0367, B:73:0x036d, B:74:0x03af, B:55:0x029d, B:57:0x02ad, B:58:0x02b5, B:60:0x02bb, B:62:0x02ee, B:65:0x02fb, B:67:0x0306, B:69:0x0357), top: B:295:0x0146, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v15, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.cicm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cpeb c(final defpackage.cicr r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cibz.c(cicr):cpeb");
    }

    @Override // defpackage.cicm
    public final eiju d(final cicr cicrVar) {
        return eijx.g(new Callable() { // from class: ciar
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a(cicrVar);
            }
        }, this.e);
    }
}
