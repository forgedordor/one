package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehey {
    public final ejwi a;
    public final Map b;
    public final ehff c;

    public ehey(final Context context, ehhw ehhwVar, Map map, ehff ehffVar, eosc eoscVar, final ecev ecevVar, ejwi ejwiVar, Map map2, ehde ehdeVar, final fdap fdapVar, Executor executor, Map map3, fdat fdatVar, final fdap fdapVar2, final eooz eoozVar, fdae fdaeVar) {
        context.getClass();
        ehhwVar.getClass();
        map.getClass();
        ehffVar.getClass();
        eoscVar.getClass();
        ecevVar.getClass();
        ejwiVar.getClass();
        map2.getClass();
        ehdeVar.getClass();
        this.c = ehffVar;
        this.a = ejwiVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ehde) entry.getValue()) == ehdeVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setKeySet, 10)), 16));
        for (Object obj : setKeySet) {
            final String str = (String) obj;
            final dqme dqmeVar = new dqme(eoscVar);
            fcsu fcsuVar = (fcsu) map3.get(dzyc.b(str));
            if (fcsuVar == null) {
                fcsuVar = new fcsu() { // from class: eheu
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return ehdt.a;
                    }
                };
            }
            fcsu fcsuVar2 = fcsuVar;
            ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: ehev
                @Override // defpackage.ejxr
                public final Object get() {
                    return ehey.e(str, dqmeVar, ecevVar, fdapVar, ehex.a);
                }
            });
            ejxrVarA.getClass();
            linkedHashMap2.put(obj, ehhwVar.a(str, dqmeVar, fdatVar, fcsuVar2, executor, ejxrVarA, e(str, dqmeVar, ecevVar, fdapVar, new fdap() { // from class: ehek
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    return str2;
                }
            }), new fcsu() { // from class: ehel
                @Override // defpackage.fcsu
                public final Object b() {
                    return (ehea) fdapVar2.invoke(str);
                }
            }, new eooy() { // from class: ehem
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eoozVar.a(str);
                }
            }, fdaeVar));
        }
        this.b = linkedHashMap2;
    }

    public static final ecjh e(final String str, final dqme dqmeVar, ecev ecevVar, final fdap fdapVar, final fdap fdapVar2) {
        eosa eosaVar = new eosa(new Callable() { // from class: ehes
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Uri) fdapVar.invoke(fdapVar2.invoke(str));
            }
        });
        dqmeVar.a.add(eosaVar);
        ehdh ehdhVar = ehdh.a;
        ehdg ehdgVar = (ehdg) ehdhVar.createBuilder();
        ehdgVar.getClass();
        ehdh ehdhVarA = ehdi.a(ehdgVar);
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return ecla.a(str, eosaVar, ehdhVarA, evrr.a, new Executor() { // from class: ehet
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                dqmeVar.d(runnable);
            }
        }, ejwi.i(new eclu(ehdhVar)), ecevVar);
    }

    public final ListenableFuture a() {
        Map map = this.b;
        final ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            final String str = (String) entry.getKey();
            ListenableFuture listenableFutureD = ((ehhv) entry.getValue()).d();
            final fdap fdapVar = new fdap() { // from class: ehhf
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ehgf ehgfVar = (ehgf) obj;
                    ehgfVar.getClass();
                    return ehgfVar.b().a;
                }
            };
            ejvr ejvrVar = new ejvr() { // from class: ehhg
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return fdapVar.invoke(obj);
                }
            };
            eoqg eoqgVar = eoqg.a;
            ListenableFuture listenableFutureJ = eika.j(listenableFutureD, ejvrVar, eoqgVar);
            final fdap fdapVar2 = new fdap() { // from class: ehen
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    return new fcti(str, str2);
                }
            };
            arrayList.add(eika.j(listenableFutureJ, new ejvr() { // from class: eheo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return fdapVar2.invoke(obj);
                }
            }, eoqgVar));
        }
        return eika.c(arrayList).a(new Callable() { // from class: ehep
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fcti fctiVar = (fcti) eork.q((Future) it.next());
                    linkedHashMap.put(fctiVar.a, fctiVar.b);
                }
                return linkedHashMap;
            }
        }, eoqg.a);
    }

    public final ListenableFuture b(String str, dzzu dzzuVar) {
        Object obj = this.b.get(str);
        obj.getClass();
        final ehhv ehhvVar = (ehhv) obj;
        Object objB = ehhvVar.o.b();
        objB.getClass();
        ehdt ehdtVar = (ehdt) objB;
        ehdg ehdgVar = (ehdg) ehdh.a.createBuilder();
        ehdgVar.getClass();
        int i = ehhvVar.a;
        ehdgVar.copyOnWrite();
        ehdh ehdhVar = (ehdh) ehdgVar.instance;
        ehdhVar.b |= 8;
        ehdhVar.h = i;
        if ((dzzuVar.b & 2) != 0) {
            evqs evqsVar = dzzuVar.d;
            evqsVar.getClass();
            ehdgVar.copyOnWrite();
            ehdh ehdhVar2 = (ehdh) ehdgVar.instance;
            ehdhVar2.b |= 4;
            ehdhVar2.e = evqsVar;
        }
        String str2 = dzzuVar.c;
        str2.getClass();
        ehdgVar.copyOnWrite();
        ehdh ehdhVar3 = (ehdh) ehdgVar.instance;
        ehdhVar3.b |= 2;
        ehdhVar3.d = str2;
        String str3 = dzzuVar.e;
        str3.getClass();
        ehdgVar.copyOnWrite();
        ehdh ehdhVar4 = (ehdh) ehdgVar.instance;
        ehdhVar4.b |= 1;
        ehdhVar4.c = str3;
        long epochMilli = ehhvVar.c.f().toEpochMilli();
        ehdgVar.copyOnWrite();
        ehdh ehdhVar5 = (ehdh) ehdgVar.instance;
        ehdhVar5.b |= 16;
        ehdhVar5.i = epochMilli;
        evtg<dzzz> evtgVar = dzzuVar.f;
        evtgVar.getClass();
        for (dzzz dzzzVar : evtgVar) {
            ehds ehdsVarA = ehdtVar.a(dzzzVar.e);
            if (ehdsVarA != null) {
                DesugarCollections.unmodifiableList(((ehdh) ehdgVar.instance).f).getClass();
                dzzzVar.getClass();
                ehdj ehdjVar = (ehdj) ehdl.a.createBuilder();
                ehdjVar.getClass();
                String str4 = dzzzVar.e;
                str4.getClass();
                ehdjVar.copyOnWrite();
                ehdl ehdlVar = (ehdl) ehdjVar.instance;
                ehdlVar.b |= 1;
                ehdlVar.e = str4;
                int i2 = ehdsVarA.b - 1;
                if (i2 == 0) {
                    long jLongValue = dzzzVar.c == 1 ? ((Long) dzzzVar.d).longValue() : 0L;
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar2 = (ehdl) ehdjVar.instance;
                    ehdlVar2.c = 1;
                    ehdlVar2.d = Long.valueOf(jLongValue);
                } else if (i2 == 1) {
                    boolean zBooleanValue = dzzzVar.c == 2 ? ((Boolean) dzzzVar.d).booleanValue() : false;
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar3 = (ehdl) ehdjVar.instance;
                    ehdlVar3.c = 2;
                    ehdlVar3.d = Boolean.valueOf(zBooleanValue);
                } else if (i2 == 2) {
                    double dDoubleValue = dzzzVar.c == 3 ? ((Double) dzzzVar.d).doubleValue() : 0.0d;
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar4 = (ehdl) ehdjVar.instance;
                    ehdlVar4.c = 3;
                    ehdlVar4.d = Double.valueOf(dDoubleValue);
                } else if (i2 == 3) {
                    String str5 = dzzzVar.c == 4 ? (String) dzzzVar.d : "";
                    str5.getClass();
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar5 = (ehdl) ehdjVar.instance;
                    ehdlVar5.c = 4;
                    ehdlVar5.d = str5;
                } else if (i2 != 4) {
                    evqs evqsVar2 = dzzzVar.c == 5 ? (evqs) dzzzVar.d : evqs.b;
                    evqsVar2.getClass();
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar6 = (ehdl) ehdjVar.instance;
                    ehdlVar6.c = 6;
                    ehdlVar6.d = evqsVar2;
                } else {
                    evqs evqsVar3 = dzzzVar.c == 5 ? (evqs) dzzzVar.d : evqs.b;
                    evqsVar3.getClass();
                    ehdjVar.copyOnWrite();
                    ehdl ehdlVar7 = (ehdl) ehdjVar.instance;
                    ehdlVar7.c = 5;
                    ehdlVar7.d = evqsVar3;
                }
                evsn evsnVarBuild = ehdjVar.build();
                evsnVarBuild.getClass();
                ehdl ehdlVar8 = (ehdl) evsnVarBuild;
                ehdgVar.copyOnWrite();
                ehdh ehdhVar6 = (ehdh) ehdgVar.instance;
                evtg evtgVar2 = ehdhVar6.f;
                if (!evtgVar2.c()) {
                    ehdhVar6.f = evsn.mutableCopy(evtgVar2);
                }
                ehdhVar6.f.add(ehdlVar8);
            }
        }
        DesugarCollections.unmodifiableList(((ehdh) ehdgVar.instance).g).getClass();
        evtg evtgVar3 = dzzuVar.g;
        evtgVar3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : evtgVar3) {
            if (ehdtVar.b.containsKey((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ehdgVar.copyOnWrite();
        ehdh ehdhVar7 = (ehdh) ehdgVar.instance;
        evtg evtgVar4 = ehdhVar7.g;
        if (!evtgVar4.c()) {
            ehdhVar7.g = evsn.mutableCopy(evtgVar4);
        }
        evpz.addAll(arrayList, ehdhVar7.g);
        final ehdh ehdhVarA = ehdi.a(ehdgVar);
        try {
            final ekgp ekgpVarC = ehhvVar.c(ehdhVarA);
            return eooq.g(ehhvVar.m.a(ehhvVar.b, new eooy() { // from class: ehgv
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final ehhv ehhvVar2 = ehhvVar;
                    final ehdh ehdhVar8 = ehdhVarA;
                    return eooq.g(ehhvVar2.v.c(), eiid.d(new eooz() { // from class: ehgm
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj3) {
                            final ehgf ehgfVar = (ehgf) obj3;
                            final ehdh ehdhVar9 = ehdhVar8;
                            ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ehgs
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj4) {
                                    return ehdhVar9;
                                }
                            });
                            ecjh ecjhVar = ehhvVar2.r;
                            eoqg eoqgVar = eoqg.a;
                            return eika.j(ecjhVar.b(ejvrVarA, eoqgVar), eiid.a(new ejvr() { // from class: ehgt
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj4) {
                                    return ehgfVar;
                                }
                            }), eoqgVar);
                        }
                    }), eoqg.a);
                }
            }), eiid.d(new eooz() { // from class: ehhe
                /* JADX WARN: Type inference failed for: r6v10, types: [ehea, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    dzzn dzznVar = (dzzn) dzzs.a.createBuilder();
                    dzzo dzzoVar = (dzzo) dzzr.a.createBuilder();
                    dzzoVar.copyOnWrite();
                    dzzr dzzrVar = (dzzr) dzzoVar.instance;
                    dzzrVar.c = dzzq.a(4);
                    dzzrVar.b |= 1;
                    dzznVar.copyOnWrite();
                    dzzs dzzsVar = (dzzs) dzznVar.instance;
                    dzzr dzzrVar2 = (dzzr) dzzoVar.build();
                    dzzrVar2.getClass();
                    dzzsVar.d = dzzrVar2;
                    dzzsVar.b |= 2;
                    ehhv ehhvVar2 = ehhvVar;
                    ehhvVar2.e(dzznVar);
                    ehdh ehdhVar8 = ehdhVarA;
                    ehhr ehhrVarA = ehhq.a(ehdhVar8, dzznVar, ehhvVar2.a());
                    return ((ehgf) obj3).e(ekgpVarC, ehhrVarA) ? ((Boolean) ehhvVar2.x.a()).booleanValue() ? eork.i(new ehef(true)) : eika.j(ehhvVar2.s.b().b(ehdhVar8.e, ehhrVarA.d), eiid.a(new ejvr() { // from class: ehgr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj4) {
                            return new ehef(true);
                        }
                    }), eoqg.a) : eork.i(new ehef(false));
                }
            }), ehhvVar.p);
        } catch (evtj e) {
            return eork.h(e);
        }
    }

    public final List c() {
        Map map = this.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ListenableFuture listenableFutureD = ((ehhv) entry.getValue()).d();
            final fdap fdapVar = new fdap() { // from class: ehgo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ehgf ehgfVar = (ehgf) obj;
                    ehgfVar.getClass();
                    return ehgfVar.b().d;
                }
            };
            ListenableFuture listenableFutureJ = eika.j(listenableFutureD, new ejvr() { // from class: ehgp
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return fdapVar.invoke(obj);
                }
            }, eoqg.a);
            egpe egpeVar = ((ehhv) entry.getValue()).v;
            evqs evqsVar = null;
            if (egpeVar.e()) {
                try {
                    evqsVar = ((ehgf) eork.q(egpeVar.c())).b().b;
                } catch (ExecutionException unused) {
                }
            }
            arrayList.add(new ehew(str, listenableFutureJ, evqsVar));
        }
        return arrayList;
    }

    public final boolean d() {
        Collection collectionValues = this.b.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((ehhv) it.next()).f()) {
                return true;
            }
        }
        return false;
    }
}
