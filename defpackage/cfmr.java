package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmr implements cfmz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/ListMessagesDelegate");
    public static final dzfh b = new dzfh("Bugle.Ditto.ListMessages.ExecutionTime");
    public final cehg c;
    public final ayqp d;
    public final fcsu e;
    public final baeb f;
    public final ains g;
    public final fcsu h;
    public final fcsu i;
    private final bael j;
    private final fcsu k;
    private final Optional l;
    private final fcsu m;
    private final eosc n;
    private final eosc o;
    private final fcsu p;
    private final aqad q;
    private final fcsu r;

    public cfmr(cehg cehgVar, ayqp ayqpVar, fcsu fcsuVar, baeb baebVar, ains ainsVar, bael baelVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, aqad aqadVar) {
        this.c = cehgVar;
        this.d = ayqpVar;
        this.e = fcsuVar;
        this.f = baebVar;
        this.g = ainsVar;
        this.j = baelVar;
        this.h = fcsuVar2;
        this.k = fcsuVar3;
        this.l = optional;
        this.m = fcsuVar4;
        this.n = eoscVar;
        this.o = eoscVar2;
        this.p = fcsuVar5;
        this.q = aqadVar;
        this.i = fcsuVar6;
        this.r = fcsuVar7;
    }

    private final eiju i() {
        Optional optional = this.l;
        return optional.isEmpty() ? eijx.e("") : eiju.g(((egej) this.k.b()).b((efwo) optional.get())).f(egdj.class, new eooz() { // from class: cfml
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrw ekrwVarJ = cfmr.a.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((egdj) obj)).h("com/google/android/apps/messaging/shared/net/handler/ditto/ListMessagesDelegate", "getAccountScopedEmailAddress", 186, "ListMessagesDelegate.java")).q("Injected account is invalid.");
                return eijx.e("");
            }
        }, this.n);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(final cfmy cfmyVar, evuh evuhVar) {
        final epas epasVar = (epas) evuhVar;
        if (!((apsi) this.r.b()).a()) {
            return i().i(new eooz() { // from class: cfmg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.f(epasVar, (String) obj, ((cfjg) cfmyVar).d);
                }
            }, this.n);
        }
        final dzub dzubVarD = ((dzuc) this.i.b()).d();
        eiju eijuVarI = i();
        eooz eoozVar = new eooz() { // from class: cfme
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.f(epasVar, (String) obj, ((cfjg) cfmyVar).d);
            }
        };
        eosc eoscVar = this.n;
        return eijuVarI.i(eoozVar, eoscVar).h(new ejvr() { // from class: cfmf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                epau epauVar = (epau) obj;
                dzuc dzucVar = (dzuc) this.a.i.b();
                dzub dzubVar = dzubVarD;
                dzubVar.getClass();
                dzucVar.f(dzubVar, cfmr.b, null, dzua.SUCCESS);
                return epauVar;
            }
        }, eoscVar);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ evuh c(evqs evqsVar) {
        return (epas) evsn.parseFrom(epas.a, evqsVar);
    }

    public final baea d(bgvb bgvbVar, cfmq cfmqVar) {
        baeb baebVar = this.f;
        baea baeaVarA = baebVar.a();
        bgvbVar.moveToFirst();
        while (!bgvbVar.isAfterLast()) {
            baeaVarA = baebVar.e(bgvbVar);
            cfjf cfjfVar = (cfjf) cfmqVar;
            if (!cfjfVar.a.equals(baeaVarA.r())) {
                long jH = baeaVarA.h();
                long j = cfjfVar.b;
                if (jH < j) {
                    while (baeaVarA.h() <= j && bgvbVar.moveToPrevious()) {
                        baeaVarA = baebVar.e(bgvbVar);
                    }
                    return baeaVarA;
                }
            } else if (baeaVarA.h() <= cfjfVar.b) {
                return baeaVarA;
            }
            bgvbVar.moveToNext();
        }
        return baeaVarA;
    }

    public final eiju e(final String str, final ConversationIdType conversationIdType, final cfmq cfmqVar, final int i) {
        return eiju.g(((cexq) this.p.b()).b(conversationIdType)).h(new ejvr() { // from class: cfmm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                epat epatVar = (epat) epau.a.createBuilder();
                cfmr cfmrVar = this.a;
                bgvb bgvbVarH = cfmrVar.h(conversationIdType);
                cfmq cfmqVar2 = cfmqVar;
                String str2 = str;
                try {
                    int count = bgvbVarH.getCount();
                    epatVar.copyOnWrite();
                    ((epau) epatVar.instance).e = count;
                    baea baeaVarD = cfmrVar.d(bgvbVarH, cfmqVar2);
                    int iA = cfkq.a();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    int serializedSize = 0;
                    while (true) {
                        if (i2 < i && bgvbVarH.moveToNext()) {
                            final baea baeaVarE = cfmrVar.f.e(bgvbVarH);
                            Iterator it = baeaVarE.g.iterator();
                            while (it.hasNext()) {
                                ((bbae) cfmrVar.h.b()).d((MessagePartCoreData) it.next(), str2);
                            }
                            epbl epblVarP = cfmrVar.c.p(baeaVarE, Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: cfmn
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    epcm epcmVar = ((epcj) obj2).c;
                                    if (epcmVar == null) {
                                        epcmVar = epcm.a;
                                    }
                                    return epcmVar.d.equals(baeaVarE.x());
                                }
                            }).findFirst());
                            serializedSize += epblVarP.getSerializedSize();
                            if (serializedSize >= iA) {
                                cfmrVar.g.c("Bugle.Ditto.ListMessages.TooBigResponse.Counts");
                                bgvbVarH.moveToPrevious();
                                break;
                            }
                            epatVar.a(epblVarP);
                            arrayList.add(baeaVarE);
                            arrayList2.add(baeaVarE.r());
                            i2++;
                            baeaVarD = baeaVarE;
                        } else {
                            break;
                        }
                    }
                    if (bgvbVarH.moveToNext() && ((epau) epatVar.instance).c.size() > 0) {
                        epap epapVar = (epap) epaq.a.createBuilder();
                        String strB = baeaVarD.r().b();
                        epapVar.copyOnWrite();
                        epaq epaqVar = (epaq) epapVar.instance;
                        strB.getClass();
                        epaqVar.b = strB;
                        long jH = baeaVarD.h();
                        epapVar.copyOnWrite();
                        ((epaq) epapVar.instance).c = jH;
                        epatVar.copyOnWrite();
                        epau epauVar = (epau) epatVar.instance;
                        epaq epaqVar2 = (epaq) epapVar.build();
                        epaqVar2.getClass();
                        epauVar.f = epaqVar2;
                        epauVar.b |= 1;
                        String str3 = String.valueOf(baeaVarD.r()) + "\u2063" + baeaVarD.h();
                        epatVar.copyOnWrite();
                        ((epau) epatVar.instance).d = str3;
                    }
                    if (((Boolean) bvtw.a.e()).booleanValue()) {
                        bvtz bvtzVar = (bvtz) cfmrVar.e.b();
                        bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
                        bvtxVar.a((Iterable) Collection.EL.stream(arrayList2).map(new Function() { // from class: cfmo
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((MessageIdType) obj2).b();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new cfmp())));
                        bvtzVar.a((bvty) bvtxVar.build());
                    } else {
                        cfmrVar.d.e(arrayList, false).r();
                    }
                    bgvbVarH.close();
                    return epatVar;
                } catch (Throwable th) {
                    try {
                        bgvbVarH.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }, this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju f(defpackage.epas r12, final java.lang.String r13, final defpackage.eosc r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfmr.f(epas, java.lang.String, eosc):eiju");
    }

    public final epat g(String str, ConversationIdType conversationIdType, cfmq cfmqVar, int i) {
        epat epatVar = (epat) epau.a.createBuilder();
        bgvb bgvbVarH = h(conversationIdType);
        try {
            int count = bgvbVarH.getCount();
            epatVar.copyOnWrite();
            ((epau) epatVar.instance).e = count;
            baea baeaVarD = d(bgvbVarH, cfmqVar);
            int iA = cfkq.a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            int serializedSize = 0;
            while (true) {
                if (i2 < i && bgvbVarH.moveToNext()) {
                    baea baeaVarE = this.f.e(bgvbVarH);
                    Iterator it = baeaVarE.g.iterator();
                    while (it.hasNext()) {
                        ((bbae) this.h.b()).d((MessagePartCoreData) it.next(), str);
                    }
                    epbl epblVarO = this.c.o(baeaVarE);
                    serializedSize += epblVarO.getSerializedSize();
                    if (serializedSize >= iA) {
                        this.g.c("Bugle.Ditto.ListMessages.TooBigResponse.Counts");
                        bgvbVarH.moveToPrevious();
                        break;
                    }
                    epatVar.a(epblVarO);
                    arrayList.add(baeaVarE);
                    arrayList2.add(baeaVarE.r());
                    i2++;
                    baeaVarD = baeaVarE;
                } else {
                    break;
                }
            }
            if (bgvbVarH.moveToNext() && ((epau) epatVar.instance).c.size() > 0) {
                epap epapVar = (epap) epaq.a.createBuilder();
                String strB = baeaVarD.r().b();
                epapVar.copyOnWrite();
                epaq epaqVar = (epaq) epapVar.instance;
                strB.getClass();
                epaqVar.b = strB;
                long jH = baeaVarD.h();
                epapVar.copyOnWrite();
                ((epaq) epapVar.instance).c = jH;
                epatVar.copyOnWrite();
                epau epauVar = (epau) epatVar.instance;
                epaq epaqVar2 = (epaq) epapVar.build();
                epaqVar2.getClass();
                epauVar.f = epaqVar2;
                epauVar.b |= 1;
                String str2 = String.valueOf(baeaVarD.r()) + "\u2063" + baeaVarD.h();
                epatVar.copyOnWrite();
                ((epau) epatVar.instance).d = str2;
            }
            if (((Boolean) bvtw.a.e()).booleanValue()) {
                bvtz bvtzVar = (bvtz) this.e.b();
                bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
                bvtxVar.a((Iterable) Collection.EL.stream(arrayList2).map(new Function() { // from class: cfmd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageIdType) obj).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new cfmp())));
                bvtzVar.a((bvty) bvtxVar.build());
            } else {
                this.d.e(arrayList, false).r();
            }
            bgvbVarH.close();
            return epatVar;
        } catch (Throwable th) {
            try {
                bgvbVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bgvb h(ConversationIdType conversationIdType) {
        return (bgvb) this.j.a(conversationIdType, -1).p();
    }
}
