package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfxy extends cayl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final eygg i;
    private final fcsu j;
    private final eygg k;
    private final eygg l;
    private final eosc m;
    private final eosc n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final cogw r;
    private final aqmq s;
    private final aqad t;
    private final cfeh u;

    public cfxy(cfeh cfehVar, eygg eyggVar, fcsu fcsuVar, eygg eyggVar2, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eygg eyggVar3, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, cogw cogwVar, fcsu fcsuVar10, fcsu fcsuVar11, aqmq aqmqVar, aqad aqadVar) {
        this.u = cfehVar;
        this.i = eyggVar;
        this.j = fcsuVar;
        this.k = eyggVar2;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.l = eyggVar3;
        this.f = fcsuVar6;
        this.m = eoscVar;
        this.n = eoscVar2;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
        this.o = fcsuVar10;
        this.p = fcsuVar11;
        this.q = fcsuVar9;
        this.r = cogwVar;
        this.s = aqmqVar;
        this.t = aqadVar;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(5);
        caxzVarL.f(pza.a);
        caxzVarL.g(TimeUnit.SECONDS.toMillis(((Integer) bvfd.f.e()).intValue()));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DittoMessageRetryHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cfyv.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayl
    public final eiju j(final cayy cayyVar, final ekgb ekgbVar) {
        epca epcaVar;
        int i;
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        int i3;
        Iterator it;
        epbl epblVarN;
        eiju eijuVarK;
        int i4;
        HashSet hashSet3;
        Iterator it2;
        HashSet hashSet4;
        epbl epblVarN2;
        eiju eijuVarH;
        ekgb ekgbVar2 = ((caxm) cayyVar.a()).d;
        int size = ekgbVar2.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (((Integer) ekgbVar2.get(i6)).intValue() == 0) {
                ((ains) this.f.b()).c("Bugle.Ditto.MessageRetryHandler.Execution.Count");
            }
        }
        if (((bvit) this.k.b()).p()) {
            ezol ezolVar = ((cfyv) ekgbVar.get(0)).c;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            final ezol ezolVar2 = ezolVar;
            final String str = ((cfyv) ekgbVar.get(0)).o;
            if (!((bvkr) this.l.b()).v(ezolVar2)) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleJobs");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResult", 243, "DittoMessageRetryHandler.java")).q("Skipping retry because desktop is not active.");
                eijuVarK = eijx.e(cbcw.k());
            } else if (((Optional) this.j.b()).isEmpty()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleJobs");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResult", 248, "DittoMessageRetryHandler.java")).q("DittoForegroundService is not supported on this device.");
                eijuVarK = eijx.d(new UnsupportedOperationException("DittoForegroundService is not supported on this device."));
            } else if (this.t.a()) {
                if (this.s.a()) {
                    final epbz epbzVar = (epbz) epca.a.createBuilder();
                    final HashSet hashSet5 = new HashSet();
                    eijuVarH = ((cexq) this.o.b()).d().h(new ejvr() { // from class: cfxw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            epbl epblVarN3;
                            ekgb ekgbVar3 = (ekgb) obj;
                            int i7 = 0;
                            while (true) {
                                ekgb ekgbVar4 = ekgbVar;
                                epbz epbzVar2 = epbzVar;
                                if (i7 >= ((ekoe) ekgbVar4).c) {
                                    return (epca) epbzVar2.build();
                                }
                                cfyv cfyvVar = (cfyv) ekgbVar4.get(i7);
                                try {
                                    eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, cfyvVar.f, evrr.a());
                                    int i8 = eozeVar.b;
                                    if (eozd.a(i8) == 4) {
                                        epca epcaVar2 = i8 == 3 ? (epca) eozeVar.c : epca.a;
                                        final cfxy cfxyVar = this.a;
                                        evtg<epbl> evtgVar = epcaVar2.b;
                                        Stream map = Collection.EL.stream(evtgVar).map(new Function() { // from class: cfxq
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return bary.b(((epbl) obj2).c);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        Collector collector = ekcv.a;
                                        ekgb ekgbVar5 = (ekgb) ((baes) cfxyVar.h.b()).e((MessageIdType[]) ((ekgb) map.collect(collector)).toArray(new MessageIdType[0])).E().map(new Function() { // from class: cfxr
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((baeb) cfxyVar.b.b()).b((bdxm) obj2);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(collector);
                                        for (epbl epblVar : evtgVar) {
                                            Set set = hashSet5;
                                            final String str2 = epblVar.c;
                                            if (set.add(str2)) {
                                                Optional optionalFindFirst = Collection.EL.stream(ekgbVar5).filter(new Predicate() { // from class: cfxs
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
                                                        return ((baea) obj2).r().b().equals(str2);
                                                    }
                                                }).findFirst();
                                                if (optionalFindFirst.isPresent()) {
                                                    final baea baeaVar = (baea) optionalFindFirst.get();
                                                    if (!avbn.d.contains(Integer.valueOf(baeaVar.e()))) {
                                                        if (cfxyVar.n(epblVar, cfyvVar.p)) {
                                                            if (((Boolean) bvtw.a.e()).booleanValue()) {
                                                                bvtz bvtzVar = (bvtz) cfxyVar.d.b();
                                                                bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
                                                                bvtxVar.b(str2);
                                                                bvty bvtyVar = (bvty) bvtxVar.build();
                                                                caxr caxrVar = new caxr();
                                                                caxrVar.b = "blobstore-".concat(String.valueOf(str2));
                                                                bvtzVar.b(bvtyVar, caxrVar.a());
                                                            } else {
                                                                ((ayqp) cfxyVar.c.b()).b(baeaVar).s();
                                                            }
                                                        }
                                                        epblVarN3 = ((cehg) cfxyVar.e.b()).p(baeaVar, Collection.EL.stream(ekgbVar3).filter(new Predicate() { // from class: cfxt
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
                                                                return epcmVar.d.equals(baeaVar.x());
                                                            }
                                                        }).findFirst());
                                                    }
                                                } else {
                                                    epblVarN3 = ((cehg) cfxyVar.e.b()).n(barn.b(epblVar.j), bary.b(str2));
                                                }
                                                epbzVar2.a(epblVarN3);
                                            }
                                        }
                                    }
                                } catch (evtj e) {
                                    ekrw ekrwVarI = cfxy.a.i();
                                    ekrwVarI.X(eksq.a, "BugleJobs");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getMessageUpdatesResponseAsync", (char) 376, "DittoMessageRetryHandler.java")).q("Failed to parse GetUpdatesResponse while retrying message update.");
                                }
                                i7++;
                            }
                        }
                    }, this.n);
                } else {
                    final epbz epbzVar2 = (epbz) epca.a.createBuilder();
                    final HashSet hashSet6 = new HashSet();
                    eijuVarH = ((cexq) this.o.b()).d().h(new ejvr() { // from class: cfxp
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            epbl epblVarN3;
                            ekgb ekgbVar3 = (ekgb) obj;
                            int i7 = 0;
                            while (true) {
                                ekgb ekgbVar4 = ekgbVar;
                                epbz epbzVar3 = epbzVar2;
                                if (i7 >= ((ekoe) ekgbVar4).c) {
                                    return (epca) epbzVar3.build();
                                }
                                cfyv cfyvVar = (cfyv) ekgbVar4.get(i7);
                                try {
                                    eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, cfyvVar.f, evrr.a());
                                    int i8 = eozeVar.b;
                                    if (eozd.a(i8) == 4) {
                                        for (epbl epblVar : (i8 == 3 ? (epca) eozeVar.c : epca.a).b) {
                                            Set set = hashSet6;
                                            String str2 = epblVar.c;
                                            if (set.add(str2)) {
                                                cfxy cfxyVar = this.a;
                                                bgvb bgvbVar = (bgvb) ((bael) cfxyVar.g.b()).b(bary.b(str2)).p();
                                                try {
                                                    if (bgvbVar.moveToNext()) {
                                                        final baea baeaVarE = ((baeb) cfxyVar.b.b()).e(bgvbVar);
                                                        if (avbn.d.contains(Integer.valueOf(baeaVarE.e()))) {
                                                            bgvbVar.close();
                                                        } else {
                                                            if (cfxyVar.n(epblVar, cfyvVar.p)) {
                                                                if (((Boolean) bvtw.a.e()).booleanValue()) {
                                                                    bvtz bvtzVar = (bvtz) cfxyVar.d.b();
                                                                    bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
                                                                    bvtxVar.b(str2);
                                                                    bvty bvtyVar = (bvty) bvtxVar.build();
                                                                    caxr caxrVar = new caxr();
                                                                    caxrVar.b = a.v(str2, "blobstore-");
                                                                    bvtzVar.b(bvtyVar, caxrVar.a());
                                                                } else {
                                                                    ((ayqp) cfxyVar.c.b()).b(baeaVarE).s();
                                                                }
                                                            }
                                                            epblVarN3 = ((cehg) cfxyVar.e.b()).p(baeaVarE, Collection.EL.stream(ekgbVar3).filter(new Predicate() { // from class: cfxm
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
                                                        }
                                                    } else {
                                                        epblVarN3 = ((cehg) cfxyVar.e.b()).n(barn.b(epblVar.j), bary.b(str2));
                                                    }
                                                    epbzVar3.a(epblVarN3);
                                                    bgvbVar.close();
                                                } finally {
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } catch (evtj e) {
                                    ekrw ekrwVarI = cfxy.a.i();
                                    ekrwVarI.X(eksq.a, "BugleJobs");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getMessageUpdatesResponseLegacyAsync", (char) 569, "DittoMessageRetryHandler.java")).q("Failed to parse GetUpdatesResponse while retrying message update.");
                                }
                                i7++;
                            }
                        }
                    }, this.n);
                }
                eijuVarK = eijuVarH.i(new eooz() { // from class: cfxo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.k(ekgbVar, (epca) obj, str, ezolVar2);
                    }
                }, this.n);
            } else {
                int i7 = 4;
                if (this.s.a()) {
                    epbz epbzVar3 = (epbz) epca.a.createBuilder();
                    HashSet hashSet7 = new HashSet();
                    int i8 = ((ekoe) ekgbVar).c;
                    while (i5 < i8) {
                        cfyv cfyvVar = (cfyv) ekgbVar.get(i5);
                        try {
                            eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, cfyvVar.f, evrr.a());
                            int i9 = eozeVar.b;
                            if (eozd.a(i9) == 4) {
                                Iterator it3 = (i9 == 3 ? (epca) eozeVar.c : epca.a).b.iterator();
                                while (it3.hasNext()) {
                                    epbl epblVar = (epbl) it3.next();
                                    String str2 = epblVar.c;
                                    if (hashSet7.add(str2)) {
                                        int i10 = i5;
                                        bfrj bfrjVar = (bfrj) ((baes) this.h.b()).a(bary.b(str2)).p();
                                        try {
                                            if (bfrjVar.moveToNext()) {
                                                fcsu fcsuVar = this.b;
                                                hashSet2 = hashSet7;
                                                baea baeaVarC = ((baeb) fcsuVar.b()).c(bfrjVar);
                                                i3 = i8;
                                                it = it3;
                                                if (avbn.d.contains(Integer.valueOf(baeaVarC.e()))) {
                                                    bfrjVar.close();
                                                    i5 = i10;
                                                    i8 = i3;
                                                    hashSet7 = hashSet2;
                                                    it3 = it;
                                                } else {
                                                    if (n(epblVar, cfyvVar.p)) {
                                                        if (((Boolean) bvtw.a.e()).booleanValue()) {
                                                            bvtz bvtzVar = (bvtz) this.d.b();
                                                            bvtx bvtxVar = (bvtx) bvty.a.createBuilder();
                                                            bvtxVar.b(str2);
                                                            bvty bvtyVar = (bvty) bvtxVar.build();
                                                            caxr caxrVar = new caxr();
                                                            caxrVar.b = a.v(str2, "blobstore-");
                                                            bvtzVar.b(bvtyVar, caxrVar.a());
                                                        } else {
                                                            ((ayqp) this.c.b()).b(baeaVarC).s();
                                                        }
                                                    }
                                                    epblVarN = ((cehg) this.e.b()).o(((baeb) fcsuVar.b()).c(bfrjVar));
                                                }
                                            } else {
                                                hashSet2 = hashSet7;
                                                i3 = i8;
                                                it = it3;
                                                epblVarN = ((cehg) this.e.b()).n(barn.b(epblVar.j), bary.b(str2));
                                            }
                                            epbzVar3.a(epblVarN);
                                            bfrjVar.close();
                                            i5 = i10;
                                            i8 = i3;
                                            hashSet7 = hashSet2;
                                            it3 = it;
                                        } finally {
                                        }
                                    }
                                }
                            }
                            i = i5;
                            hashSet = hashSet7;
                            i2 = i8;
                        } catch (evtj e) {
                            i = i5;
                            hashSet = hashSet7;
                            i2 = i8;
                            ekrw ekrwVarI = a.i();
                            ekrwVarI.X(eksq.a, "BugleJobs");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getMessageUpdatesResponse", (char) 485, "DittoMessageRetryHandler.java")).q("Failed to parse GetUpdatesResponse while retrying message update.");
                        }
                        i5 = i + 1;
                        i8 = i2;
                        hashSet7 = hashSet;
                    }
                    epcaVar = (epca) epbzVar3.build();
                } else {
                    epbz epbzVar4 = (epbz) epca.a.createBuilder();
                    HashSet hashSet8 = new HashSet();
                    int i11 = ((ekoe) ekgbVar).c;
                    while (i5 < i11) {
                        cfyv cfyvVar2 = (cfyv) ekgbVar.get(i5);
                        try {
                            eoze eozeVar2 = (eoze) evsn.parseFrom(eoze.a, cfyvVar2.f, evrr.a());
                            int i12 = eozeVar2.b;
                            if (eozd.a(i12) == i7) {
                                Iterator it4 = (i12 == 3 ? (epca) eozeVar2.c : epca.a).b.iterator();
                                while (it4.hasNext()) {
                                    epbl epblVar2 = (epbl) it4.next();
                                    String str3 = epblVar2.c;
                                    if (hashSet8.add(str3)) {
                                        int i13 = i5;
                                        bgvb bgvbVar = (bgvb) ((bael) this.g.b()).b(bary.b(str3)).p();
                                        try {
                                            if (bgvbVar.moveToNext()) {
                                                fcsu fcsuVar2 = this.b;
                                                it2 = it4;
                                                baea baeaVarE = ((baeb) fcsuVar2.b()).e(bgvbVar);
                                                hashSet4 = hashSet8;
                                                if (avbn.d.contains(Integer.valueOf(baeaVarE.e()))) {
                                                    bgvbVar.close();
                                                    i5 = i13;
                                                    it4 = it2;
                                                    hashSet8 = hashSet4;
                                                } else {
                                                    if (n(epblVar2, cfyvVar2.p)) {
                                                        if (((Boolean) bvtw.a.e()).booleanValue()) {
                                                            bvtz bvtzVar2 = (bvtz) this.d.b();
                                                            bvtx bvtxVar2 = (bvtx) bvty.a.createBuilder();
                                                            bvtxVar2.b(str3);
                                                            bvty bvtyVar2 = (bvty) bvtxVar2.build();
                                                            caxr caxrVar2 = new caxr();
                                                            caxrVar2.b = a.v(str3, "blobstore-");
                                                            bvtzVar2.b(bvtyVar2, caxrVar2.a());
                                                        } else {
                                                            ((ayqp) this.c.b()).b(baeaVarE).s();
                                                        }
                                                    }
                                                    epblVarN2 = ((cehg) this.e.b()).o(((baeb) fcsuVar2.b()).e(bgvbVar));
                                                }
                                            } else {
                                                it2 = it4;
                                                hashSet4 = hashSet8;
                                                epblVarN2 = ((cehg) this.e.b()).n(barn.b(epblVar2.j), bary.b(str3));
                                            }
                                            epbzVar4.a(epblVarN2);
                                            bgvbVar.close();
                                            i5 = i13;
                                            it4 = it2;
                                            hashSet8 = hashSet4;
                                        } finally {
                                        }
                                    }
                                }
                            }
                            i4 = i5;
                            hashSet3 = hashSet8;
                        } catch (evtj e2) {
                            i4 = i5;
                            hashSet3 = hashSet8;
                            ekrw ekrwVarI2 = a.i();
                            ekrwVarI2.X(eksq.a, "BugleJobs");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getMessageUpdatesResponseLegacy", (char) 661, "DittoMessageRetryHandler.java")).q("Failed to parse GetUpdatesResponse while retrying message update.");
                        }
                        i5 = i4 + 1;
                        hashSet8 = hashSet3;
                        i7 = 4;
                    }
                    epcaVar = (epca) epbzVar4.build();
                }
                eijuVarK = k(ekgbVar, epcaVar, str, ezolVar2);
            }
        } else {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleJobs");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResult", 235, "DittoMessageRetryHandler.java")).q("Skipping retry because not registered.");
            eijuVarK = eijx.e(cbcw.k());
        }
        ejvr ejvrVar = new ejvr() { // from class: cfxu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                boolean zEquals = cbcwVar.equals(cbcw.i());
                cfxy cfxyVar = this.a;
                cayy cayyVar2 = cayyVar;
                int i14 = 0;
                if (zEquals) {
                    ekgb ekgbVar3 = ((caxm) cayyVar2.a()).d;
                    int size2 = ekgbVar3.size();
                    while (i14 < size2) {
                        ((ains) cfxyVar.f.b()).e("Bugle.Ditto.MessageRetryHandler.Success.Count", ((Integer) ekgbVar3.get(i14)).intValue());
                        i14++;
                    }
                } else {
                    if (cbcwVar.equals(cbcw.k())) {
                        cfxyVar.l(cayyVar2);
                        return cbcwVar;
                    }
                    if (cbcwVar.equals(cbcw.m())) {
                        while (i14 < ((ekoe) ekgbVar).c) {
                            if (!cayyVar2.d(i14)) {
                                cfxyVar.m(5);
                            }
                            i14++;
                        }
                    }
                }
                return cbcwVar;
            }
        };
        eosc eoscVar = this.m;
        return eijuVarK.h(ejvrVar, eoscVar).f(Exception.class, new eooz() { // from class: cfxv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.l(cayyVar);
                return eijx.d((Exception) obj);
            }
        }, eoscVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eiju k(ekgb ekgbVar, epca epcaVar, String str, final ezol ezolVar) {
        cfeg cfegVarA;
        if (epcaVar.b.size() == 0) {
            return eijx.e(cbcw.i());
        }
        final String str2 = ((cfyv) ekgbVar.get(0)).e;
        if (((cdio) this.p.b()).a()) {
            cfef cfefVarB = this.u.b((cfyv) ekgbVar.get(0), epby.GET_UPDATES);
            cfefVarB.c = str2;
            eozc eozcVar = (eozc) eoze.a.createBuilder();
            eozcVar.copyOnWrite();
            eoze eozeVar = (eoze) eozcVar.instance;
            epcaVar.getClass();
            eozeVar.c = epcaVar;
            eozeVar.b = 3;
            cfefVarB.b(eozcVar.build());
            cfefVarB.d = str;
            cfefVarB.i = ezjh.STATUS;
            cfegVarA = cfefVarB.a();
        } else {
            cfef cfefVarC = this.u.c(ezolVar, Optional.empty(), epby.GET_UPDATES);
            cfefVarC.c = str2;
            eozc eozcVar2 = (eozc) eoze.a.createBuilder();
            eozcVar2.copyOnWrite();
            eoze eozeVar2 = (eoze) eozcVar2.instance;
            epcaVar.getClass();
            eozeVar2.c = epcaVar;
            eozeVar2.b = 3;
            cfefVarC.b(eozcVar2.build());
            cfefVarC.d = str;
            cfefVarC.i = ezjh.STATUS;
            cfegVarA = cfefVarC.a();
        }
        eiju eijuVarB = ((cfya) this.i.b()).b(cfegVarA);
        cfegVarA.q(eijuVarB);
        ejvr ejvrVar = new ejvr() { // from class: cfxx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarE = cfxy.a.e();
                ekrwVarE.X(eksq.a, "BugleJobs");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResultFromMessageUpdates", 308, "DittoMessageRetryHandler.java")).D("Ditto Message Update RPC retry succeeded. desktopId: %s, requestId: %s", ezolVar.c, str2);
                return cbcw.i();
            }
        };
        eosc eoscVar = this.m;
        return eijuVarB.h(ejvrVar, eoscVar).e(fbtf.class, new ejvr() { // from class: cfxn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                boolean zD = cems.d(fbtfVar);
                ezol ezolVar2 = ezolVar;
                String str3 = str2;
                if (zD) {
                    ekrw ekrwVarJ = cfxy.a.j();
                    ekrwVarJ.X(eksq.a, "BugleJobs");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(fbtfVar)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResultFromMessageUpdates", 318, "DittoMessageRetryHandler.java")).D("Ditto Message Update RPC retry failed with retryable gRPC error. desktopId: %s, requestId: %s", ezolVar2.c, str3);
                    return cbcw.m();
                }
                ekrw ekrwVarJ2 = cfxy.a.j();
                ekrwVarJ2.X(eksq.a, "BugleJobs");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(fbtfVar)).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoMessageRetryHandler", "getResultFromMessageUpdates", 324, "DittoMessageRetryHandler.java")).D("Ditto Message Update RPC retry failed with non-retryable gRPC error. desktopId: %s, requestId: %s", ezolVar2.c, str3);
                return cbcw.k();
            }
        }, eoscVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(cayy cayyVar) {
        ekgb ekgbVar = ((caxm) cayyVar.a()).d;
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            m(((Integer) ekgbVar.get(i)).intValue());
        }
    }

    public final void m(int i) {
        ((ains) this.f.b()).e("Bugle.Ditto.MessageRetryHandler.Failure.Count", i);
    }

    public final boolean n(epbl epblVar, boolean z) {
        if (!z) {
            return true;
        }
        return Instant.ofEpochMilli(TimeUnit.MICROSECONDS.toMillis(epblVar.h)).isAfter(this.r.f().minus(Duration.ofDays(((Long) this.q.b()).longValue())));
    }
}
