package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyw {
    public final diep a;
    public final ehyp b;
    private final ehxh c;
    private final eosc d;

    public ehyw(diep diepVar, ehxh ehxhVar, ehyp ehypVar, eosc eoscVar) {
        this.a = diepVar;
        this.c = ehxhVar;
        this.b = ehypVar;
        this.d = eoscVar;
        Boolean bool = false;
        bool.getClass();
    }

    public final ListenableFuture a(final Set set, final long j, final Map map) {
        return eooq.f(this.c.b(), eiid.a(new ejvr() { // from class: ehyv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [ejwi] */
            /* JADX WARN: Type inference failed for: r0v19, types: [ejwi] */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                long jLongValue;
                Map map2;
                Iterator it;
                ejud ejudVarJ;
                ehyv ehyvVar = this;
                Map map3 = (Map) obj;
                ArrayList<ehyt> arrayList = new ArrayList();
                ehyw ehywVar = ehyvVar.a;
                long epochMilli = ehywVar.a.f().toEpochMilli();
                for (Map.Entry entry : map.entrySet()) {
                    Set set2 = set;
                    ehyr ehyrVar = (ehyr) entry.getKey();
                    ehwb ehwbVarD = ((ehwk) entry.getValue()).d();
                    Long l = (Long) map3.get(ehyrVar);
                    if (set2.contains(ehyrVar)) {
                        jLongValue = epochMilli;
                    } else {
                        jLongValue = j;
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                    }
                    ekhv ekhvVar = new ekhv();
                    ejud ejudVar = ejud.a;
                    ehvx ehvxVar = (ehvx) ehwbVarD;
                    long j2 = ehvxVar.a;
                    Iterator it2 = ((ekgp) ehvxVar.c).values().iterator();
                    while (it2.hasNext()) {
                        ehwd ehwdVar = (ehwd) it2.next();
                        long jA = ehwdVar.a();
                        if (jA != -1) {
                            map2 = map3;
                            long j3 = jA + jLongValue + j2;
                            if (epochMilli <= j3) {
                                if (ejudVar.g()) {
                                    it = it2;
                                    ejudVarJ = ejwi.j(Long.valueOf(Math.min(((Long) ejudVar.c()).longValue(), j3)));
                                } else {
                                    it = it2;
                                    ejudVarJ = ejwi.j(Long.valueOf(j3));
                                }
                                ejudVar = ejudVarJ;
                                ekhvVar.c(ehwdVar.b());
                            } else {
                                it = it2;
                            }
                        } else {
                            map2 = map3;
                            it = it2;
                            ekhvVar.c(ehwdVar.b());
                        }
                        map3 = map2;
                        it2 = it;
                    }
                    HashSet hashSet = new HashSet();
                    ehys.a(ekhvVar.g(), hashSet);
                    arrayList.add(new ehwp(hashSet, j2 + jLongValue, ejudVar));
                    ehyvVar = this;
                    map3 = map3;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ehyt ehytVar = (ehyt) arrayList.get(i);
                    long jConvert = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                    long j4 = jConvert + epochMilli;
                    if (ehytVar.a() < j4) {
                        long jMax = Math.max(epochMilli, ehytVar.a());
                        HashSet hashSet2 = new HashSet();
                        ejwi ejwiVarJ = ejud.a;
                        ehys.a(ehytVar.c(), hashSet2);
                        if (ehytVar.b().g()) {
                            long j5 = j4 - jMax;
                            ejwl.l(j5 > 0);
                            ejwl.l(j5 <= jConvert);
                            ejwiVarJ = ejwi.j(Long.valueOf(((Long) ehytVar.b().c()).longValue() + j5));
                        }
                        arrayList.set(i, new ehwp(hashSet2, j4, ejwiVarJ));
                    }
                }
                long jAbs = Math.abs(((SecureRandom) ehywVar.b.a.b()).nextLong());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jConvert2 = jAbs % (ecat.b(ehyy.a) ? timeUnit.convert(5L, TimeUnit.SECONDS) : timeUnit.convert(15L, TimeUnit.MINUTES));
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ehyt ehytVar2 = (ehyt) arrayList.get(i2);
                    HashSet hashSet3 = new HashSet();
                    ejwi ejwiVarJ2 = ejud.a;
                    ehys.a(ehytVar2.c(), hashSet3);
                    long jA2 = ehytVar2.a() + jConvert2;
                    if (ehytVar2.b().g()) {
                        ejwiVarJ2 = ejwi.j(Long.valueOf(((Long) ehytVar2.b().c()).longValue() + jConvert2));
                    }
                    arrayList.set(i2, new ehwp(hashSet3, jA2, ejwiVarJ2));
                }
                csq csqVar = new csq();
                for (ehyt ehytVar3 : arrayList) {
                    Set setC = ehytVar3.c();
                    ehyt ehytVar4 = (ehyt) csqVar.get(setC);
                    if (ehytVar4 == null) {
                        csqVar.put(setC, ehytVar3);
                    } else {
                        csqVar.put(setC, ehyt.d(ehytVar4, ehytVar3));
                    }
                }
                ejwi ejwiVarJ3 = ejud.a;
                for (ehyt ehytVar5 : csqVar.values()) {
                    if (ehytVar5.b().g()) {
                        ejwiVarJ3 = ejwiVarJ3.g() ? ejwi.j(Long.valueOf(Math.min(((Long) ejwiVarJ3.c()).longValue(), ((Long) ehytVar5.b().c()).longValue()))) : ehytVar5.b();
                    }
                }
                if (!ejwiVarJ3.g()) {
                    return csqVar;
                }
                HashMap map4 = new HashMap(csqVar);
                ekon ekonVar = ekon.a;
                HashSet hashSet4 = new HashSet();
                long jLongValue2 = ((Long) ejwiVarJ3.c()).longValue();
                ehys.a(ekonVar, hashSet4);
                ehwp ehwpVar = new ehwp(hashSet4, jLongValue2, ejwiVarJ3);
                ehyt ehytVar6 = (ehyt) map4.get(ekonVar);
                if (ehytVar6 == null) {
                    map4.put(ekonVar, ehwpVar);
                } else {
                    map4.put(ekonVar, ehyt.d(ehytVar6, ehwpVar));
                }
                return DesugarCollections.unmodifiableMap(map4);
            }
        }), this.d);
    }
}
