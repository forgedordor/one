package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghl implements eggx {
    public final eggg a;
    public final eosc b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final eosc h;

    public eghl(eggg egggVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = egggVar;
        this.h = eoscVar;
        this.b = eoscVar2;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.g = fcsuVar5;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    public static egbe a(eghw eghwVar) {
        efwo efwoVarB = efwo.b(eghwVar.c);
        egbs egbsVar = eghwVar.d;
        if (egbsVar == null) {
            egbsVar = egbs.a;
        }
        int iA = egcv.a(eghwVar.e);
        if (iA == 0) {
            iA = 1;
        }
        return new egdb(efwoVarB, egbsVar, iA);
    }

    public static ekgp b(Collection collection, eghq eghqVar) {
        int iA;
        int i;
        egbs egbsVar;
        eghr eghrVar = (eghr) eghqVar.build();
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            egbs egbsVar2 = (egbs) it.next();
            Iterator it2 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eghr) eghqVar.instance).d)).values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    eghv eghvVar = (eghv) eghw.a.createBuilder();
                    eghvVar.copyOnWrite();
                    eghw eghwVar = (eghw) eghvVar.instance;
                    egbsVar2.getClass();
                    eghwVar.d = egbsVar2;
                    eghwVar.b = 2 | eghwVar.b;
                    eghvVar.copyOnWrite();
                    eghw eghwVar2 = (eghw) eghvVar.instance;
                    eghwVar2.e = 0;
                    eghwVar2.b |= 4;
                    i = ((eghr) eghqVar.instance).c;
                    eghqVar.copyOnWrite();
                    eghr eghrVar2 = (eghr) eghqVar.instance;
                    eghrVar2.b |= 1;
                    eghrVar2.c = i + 1;
                    eghvVar.copyOnWrite();
                    eghw eghwVar3 = (eghw) eghvVar.instance;
                    eghwVar3.b = 1 | eghwVar3.b;
                    eghwVar3.c = i;
                    eghqVar.a(i, (eghw) eghvVar.build());
                    break;
                }
                eghw eghwVar4 = (eghw) it2.next();
                egbs egbsVar3 = eghwVar4.d;
                if (egbsVar3 == null) {
                    egbsVar3 = egbs.a;
                }
                if (egbsVar3.k.equals(egbsVar2.k) && egbsVar3.c.equals(egbsVar2.c)) {
                    eghv eghvVar2 = (eghv) eghwVar4.toBuilder();
                    eghvVar2.copyOnWrite();
                    eghw eghwVar5 = (eghw) eghvVar2.instance;
                    egbsVar2.getClass();
                    egbs egbsVar4 = eghwVar5.d;
                    if (egbsVar4 == null || egbsVar4 == (egbsVar = egbs.a)) {
                        eghwVar5.d = egbsVar2;
                    } else {
                        egbr egbrVar = (egbr) egbsVar.createBuilder(egbsVar4);
                        egbrVar.mergeFrom((egbr) egbsVar2);
                        eghwVar5.d = (egbs) egbrVar.buildPartial();
                    }
                    eghwVar5.b = 2 | eghwVar5.b;
                    eghqVar.a(eghwVar4.c, (eghw) eghvVar2.build());
                    i = eghwVar4.c;
                }
            }
            map.put(efwo.b(i), egbsVar2);
        }
        ekgp ekgpVarJ = ekgp.j(map);
        ejwl.m(ekgpVarJ.size() == collection.size(), "Provider had duplicate accounts.");
        ekhv ekhvVar = new ekhv();
        Iterator it3 = DesugarCollections.unmodifiableMap(eghrVar.d).values().iterator();
        while (it3.hasNext()) {
            ekhvVar.c(efwo.b(((eghw) it3.next()).c));
        }
        ekhx<efwo> ekhxVarF = ekpg.b(ekhvVar.g(), ekgpVarJ.keySet()).f();
        ekgi ekgiVar = new ekgi();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eghr) eghqVar.instance).d));
        for (efwo efwoVar : ekhxVarF) {
            Integer numValueOf = Integer.valueOf(efwoVar.a());
            if (mapUnmodifiableMap.containsKey(numValueOf) && (iA = egcv.a(((eghw) mapUnmodifiableMap.get(numValueOf)).e)) != 0 && iA == 2) {
                ekgiVar.i(efwoVar, (eghw) mapUnmodifiableMap.get(numValueOf));
            }
        }
        ekgp ekgpVarC = ekgiVar.c();
        Iterator<E> it4 = ekhxVarF.iterator();
        while (it4.hasNext()) {
            int iA2 = ((efwo) it4.next()).a();
            eghqVar.copyOnWrite();
            ((eghr) eghqVar.instance).a().remove(Integer.valueOf(iA2));
        }
        return ekgpVarC;
    }

    public static eorg c(egbv egbvVar, Set set) {
        ListenableFuture listenableFutureH;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                listenableFutureH = ((egbx) it.next()).b(egbvVar);
                arrayList.add(listenableFutureH);
            } catch (Exception e) {
                listenableFutureH = eork.h(e);
            }
            egoc.d("com/google/apps/tiktok/account/data/manager/AccountDataWriterImpl", "invokeInterceptors", 336, listenableFutureH, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return eork.a(arrayList);
    }

    final ListenableFuture d(eggg egggVar, final ejvr ejvrVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return eooq.f(egggVar.b(eiid.a(new ejvr() { // from class: eghh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eghk eghkVar = (eghk) ejvrVar.apply((eghr) obj);
                atomicReference.set(eghkVar.b());
                return eghkVar.a();
            }
        }), this.h), eiid.a(new ejvr() { // from class: eghi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return atomicReference.get();
            }
        }), eoqg.a);
    }
}
