package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder");
    public final Context b;
    public final ezli c;
    public final eosc d;
    public ListenableFuture h;
    public eiju i;
    public eiju j;
    public String m;
    public evqs n;
    private final cogw p;
    private final cdbq q;
    private final Optional r;
    private final Set s;
    private final Set t;
    private final Set u;
    private final eosc v;
    private long w;
    private boolean x;
    private final Object y = new Object();
    public Map l = new HashMap();
    public Optional k = Optional.empty();
    public ListenableFuture e = eork.i("");
    public eiju f = eijx.e(Optional.empty());
    public eiju g = eijx.e(Optional.empty());
    public final eiju o = eijx.e(Optional.empty());

    public cfgr(Context context, cogw cogwVar, cdbq cdbqVar, Optional optional, Set set, Set set2, Set set3, eosc eoscVar, eosc eoscVar2) {
        this.b = context;
        this.p = cogwVar;
        this.q = cdbqVar;
        this.r = optional;
        this.s = set;
        this.t = set2;
        this.v = eoscVar;
        this.d = eoscVar2;
        this.u = set3;
        ezli ezliVar = (ezli) ezlj.a.createBuilder();
        this.c = ezliVar;
        this.h = eork.i(ezliVar);
        this.j = eijx.e((ezob) ezoc.b.createBuilder());
        this.i = eijx.e((ezny) eznz.a.createBuilder());
    }

    public static boolean d(List list, final List list2, String str) {
        Stream streamFilter = Collection.EL.stream(list).filter(new Predicate() { // from class: cfgq
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
            public final boolean test(Object obj) {
                return !list2.contains(obj);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
        if (ekgbVar.isEmpty()) {
            return false;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "hasValueRemoved", 247, "TachyonRegisterDataBuilder.java")).D("Decorator removed %s: %s", str, ekgbVar);
        return true;
    }

    final long a() {
        long j;
        synchronized (this.y) {
            if (this.x && this.w <= 0) {
                this.w = TimeUnit.MILLISECONDS.toMicros(this.p.f().toEpochMilli());
            }
            j = this.w;
        }
        return j;
    }

    final ListenableFuture b() {
        return eika.d(this.h, this.e, this.f, this.g, this.o, this.j, this.i).a(new Callable() { // from class: cfgn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strC;
                cfgr cfgrVar = this.a;
                ezli ezliVar = (ezli) eork.q(cfgrVar.h);
                String str = (String) eork.q(cfgrVar.e);
                Optional optional = (Optional) eork.q(cfgrVar.f);
                Optional optional2 = (Optional) eork.q(cfgrVar.g);
                ezob ezobVar = (ezob) eork.q(cfgrVar.j);
                ezny eznyVar = (ezny) eork.q(cfgrVar.i);
                String languageTag = craf.c(cfgrVar.b).toLanguageTag();
                ezliVar.copyOnWrite();
                ezlj ezljVar = (ezlj) ezliVar.instance;
                ezlj ezljVar2 = ezlj.a;
                languageTag.getClass();
                ezljVar.j = languageTag;
                if (TextUtils.isEmpty(str)) {
                    ekrw ekrwVarE = cfgr.a.e();
                    ekrwVarE.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 425, "TachyonRegisterDataBuilder.java")).q("GCM token is empty");
                } else {
                    ezof ezofVar = (ezof) ezog.a.createBuilder();
                    ezofVar.copyOnWrite();
                    ((ezog) ezofVar.instance).b = 1;
                    ezofVar.copyOnWrite();
                    ezog ezogVar = (ezog) ezofVar.instance;
                    str.getClass();
                    ezogVar.c = str;
                    ezliVar.copyOnWrite();
                    ezlj ezljVar3 = (ezlj) ezliVar.instance;
                    ezog ezogVar2 = (ezog) ezofVar.build();
                    ezogVar2.getClass();
                    ezljVar3.e = ezogVar2;
                    ezljVar3.b |= 1;
                    ezliVar.copyOnWrite();
                    ezlj ezljVar4 = (ezlj) ezliVar.instance;
                    str.getClass();
                    ezljVar4.f = str;
                }
                if (optional.isPresent()) {
                    String str2 = (String) optional.get();
                    ezliVar.copyOnWrite();
                    ((ezlj) ezliVar.instance).r = str2;
                } else {
                    ekrw ekrwVarE2 = cfgr.a.e();
                    ekrwVarE2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 431, "TachyonRegisterDataBuilder.java")).q("Constellation IID token is not available.");
                }
                ekrg ekrgVar = cfgr.a;
                ekrw ekrwVarE3 = ekrgVar.e();
                ekrz ekrzVar = eksq.a;
                ekrwVarE3.X(ekrzVar, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 437, "TachyonRegisterDataBuilder.java")).q("Public client app data is not set.");
                if (optional2.isPresent()) {
                    fgwc fgwcVar = (fgwc) optional2.get();
                    ezpa ezpaVar = (ezpa) ezpb.a.createBuilder();
                    ezpaVar.copyOnWrite();
                    ((ezpb) ezpaVar.instance).b = felq.a(3);
                    evqs evqsVarX = evqs.x(fgwcVar.a.a());
                    ezpaVar.copyOnWrite();
                    ((ezpb) ezpaVar.instance).c = evqsVarX;
                    ezliVar.copyOnWrite();
                    ezlj ezljVar5 = (ezlj) ezliVar.instance;
                    ezpb ezpbVar = (ezpb) ezpaVar.build();
                    ezpbVar.getClass();
                    ezljVar5.i = ezpbVar;
                    ezljVar5.b |= 4;
                } else {
                    ekrw ekrwVarE4 = ekrgVar.e();
                    ekrwVarE4.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 443, "TachyonRegisterDataBuilder.java")).q("Key pair is not available.");
                }
                if (cfgrVar.l.isEmpty()) {
                    long jA = cfgrVar.a();
                    Optional optional3 = cfgrVar.k;
                    if (cfgrVar.m == null) {
                        cfgrVar.m = "Bugle";
                    }
                    String str3 = cfgrVar.m;
                    String str4 = true != ejwk.c(str3) ? str3 : "Bugle";
                    final ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("APP_NAME", str4);
                    if (jA > 0) {
                        arrayMap.put("ISSUED_AT", String.valueOf(jA));
                    }
                    optional3.ifPresent(new Consumer() { // from class: cfgp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            arrayMap.put("ID", (String) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    strC = cfgrVar.c(arrayMap);
                } else {
                    strC = cfgrVar.c(cfgrVar.l);
                }
                ezliVar.copyOnWrite();
                ezlj ezljVar6 = (ezlj) ezliVar.instance;
                strC.getClass();
                ezljVar6.c = 7;
                ezljVar6.d = strC;
                ezliVar.copyOnWrite();
                ezlj ezljVar7 = (ezlj) ezliVar.instance;
                eznz eznzVar = (eznz) eznyVar.build();
                eznzVar.getClass();
                ezljVar7.m = eznzVar;
                ezljVar7.b |= 16;
                ezliVar.copyOnWrite();
                ezlj ezljVar8 = (ezlj) ezliVar.instance;
                ezoc ezocVar = (ezoc) ezobVar.build();
                ezocVar.getClass();
                ezljVar8.o = ezocVar;
                ezljVar8.b |= 128;
                evqs evqsVar = cfgrVar.n;
                if (evqsVar != null) {
                    ezliVar.copyOnWrite();
                    ezlj ezljVar9 = (ezlj) ezliVar.instance;
                    ezljVar9.b |= 32;
                    ezljVar9.n = evqsVar;
                }
                return ezliVar;
            }
        }, this.v);
    }

    public final String c(Map map) {
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 484, "TachyonRegisterDataBuilder.java")).q("Starting droidguard registration");
        String strA = dcpn.a(this.b, "tachyon_registration", map);
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 487, "TachyonRegisterDataBuilder.java")).q("Finished droidguard registration");
        if (strA == null) {
            ekrw ekrwVarI = ekrgVar.i();
            ekrwVarI.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 489, "TachyonRegisterDataBuilder.java")).q("droidGuardResult is null. Registration without droidGuardResult will fail");
        }
        return strA;
    }

    final void e(alqm alqmVar) {
        eiju eijuVarE = eijx.e((ezob) ezoc.b.createBuilder());
        for (final cfiu cfiuVar : this.t) {
            eijuVarE = eijuVarE.i(new eooz() { // from class: cfgm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return cfiuVar.a((ezob) obj);
                }
            }, this.d);
        }
        this.j = eijuVarE;
    }

    final void f(final alqm alqmVar) {
        eiju eijuVarE = eijx.e((ezny) eznz.a.createBuilder());
        for (final cfit cfitVar : this.u) {
            eijuVarE = eijuVarE.i(new eooz() { // from class: cfgl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return cfitVar.a((ezny) obj, alqmVar);
                }
            }, this.d);
        }
        this.i = eijuVarE;
    }

    final void g(final alqm alqmVar, final int i) {
        ezli ezliVar = this.c;
        ezuu ezuuVar = ezuu.a;
        ezliVar.copyOnWrite();
        ezlj ezljVar = (ezlj) ezliVar.instance;
        ezlj ezljVar2 = ezlj.a;
        ezuuVar.getClass();
        ezljVar.l = ezuuVar;
        ezljVar.b |= 8;
        eiju eijuVarE = eijx.e(ezliVar);
        for (final cfjb cfjbVar : this.s) {
            eijuVarE = eijuVarE.i(new eooz() { // from class: cfgk
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final ezli ezliVar2 = (ezli) ((ezli) obj).mo442clone();
                    cfjb cfjbVar2 = cfjbVar;
                    cfgr cfgrVar = this.a;
                    return cfjbVar2.a(cfgrVar.c, alqmVar, i).h(new ejvr() { // from class: cfgo
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ezli ezliVar3 = ezliVar2;
                            ezli ezliVar4 = (ezli) obj2;
                            ezuu ezuuVar2 = ((ezlj) ezliVar3.instance).l;
                            if (ezuuVar2 == null) {
                                ezuuVar2 = ezuu.a;
                            }
                            evsx evsxVar = ezuuVar2.b;
                            ezuu ezuuVar3 = ((ezlj) ezliVar4.instance).l;
                            if (ezuuVar3 == null) {
                                ezuuVar3 = ezuu.a;
                            }
                            boolean zD = cfgr.d(evsxVar, ezuuVar3.b, ezuu.class.getName());
                            eznz eznzVar = ((ezlj) ezliVar3.instance).m;
                            if (eznzVar == null) {
                                eznzVar = eznz.a;
                            }
                            evtg evtgVar = eznzVar.b;
                            eznz eznzVar2 = ((ezlj) ezliVar4.instance).m;
                            if (eznzVar2 == null) {
                                eznzVar2 = eznz.a;
                            }
                            boolean zD2 = zD | cfgr.d(evtgVar, eznzVar2.b, eznz.class.getName());
                            ezoc ezocVar = ((ezlj) ezliVar3.instance).o;
                            if (ezocVar == null) {
                                ezocVar = ezoc.b;
                            }
                            evsx evsxVar2 = ezocVar.c;
                            ezoc ezocVar2 = ((ezlj) ezliVar4.instance).o;
                            if (ezocVar2 == null) {
                                ezocVar2 = ezoc.b;
                            }
                            if (!cfgr.d(evsxVar2, ezocVar2.c, ezoc.class.getName()) && !zD2) {
                                return ezliVar4;
                            }
                            throw new IllegalStateException("Decorator removed metadata.");
                        }
                    }, cfgrVar.d);
                }
            }, this.d);
        }
        this.h = eijuVarE;
    }

    final void h() {
        this.m = "RCS";
    }

    final void i() {
        Optional optional = this.r;
        this.f = optional.isPresent() ? ((cerz) optional.get()).a() : eijx.e(Optional.empty());
    }

    final void j() {
        cdbq cdbqVar = this.q;
        if (cdbqVar == null) {
            this.e = eork.h(new NullPointerException("firebaseInstanceIDManager is null"));
        } else {
            this.e = cdbqVar.a();
        }
    }

    final void k(long j) {
        synchronized (this.y) {
            this.w = j;
        }
    }

    final void l() {
        synchronized (this.y) {
            this.x = true;
        }
    }

    final void m(Callable callable) {
        try {
            this.g = (eiju) callable.call();
        } catch (Exception e) {
            throw new IllegalStateException("failed to get key pair", e);
        }
    }
}
