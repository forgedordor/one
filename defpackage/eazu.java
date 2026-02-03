package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eazu implements eooz {
    public final /* synthetic */ ebac a;

    public /* synthetic */ eazu(ebac ebacVar) {
        this.a = ebacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        final ebac ebacVar;
        List list = (List) obj;
        ((ekrd) ((ekrd) ebac.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "uploadObservations", 320, "MobaltPeriodicJobImpl.java")).r("Mobalt: uploading logs to the Cobalt Server, got %s observations", list.size());
        if (list.isEmpty()) {
            return eijx.e(null);
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (true) {
            ebacVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            ebba ebbaVarB = ((eayw) it.next()).b();
            ejrs ejrsVar = (ejrs) ejrt.a.createBuilder();
            ejrv ejrvVar = ebbaVarB.c;
            if (ejrvVar == null) {
                ejrvVar = ejrv.a;
            }
            ejrsVar.copyOnWrite();
            ejrt ejrtVar = (ejrt) ejrsVar.instance;
            ejrvVar.getClass();
            ejrtVar.c = ejrvVar;
            ejrtVar.b |= 1;
            for (ebay ebayVar : ebbaVarB.d) {
                eaxe eaxeVar = ebacVar.o;
                ejrr ejrrVar = ebayVar.d;
                if (ejrrVar == null) {
                    ejrrVar = ejrr.a;
                }
                int i2 = eaxeVar.b;
                ejqy ejqyVarA = eaxe.a(ejrrVar, 12, eaxeVar.d, eaxf.d, ebayVar.c);
                ejrsVar.copyOnWrite();
                ejrt ejrtVar2 = (ejrt) ejrsVar.instance;
                ejqyVarA.getClass();
                ejrtVar2.a();
                ejrtVar2.d.add(ejqyVarA);
            }
            ekfwVar.h((ejrt) ejrsVar.build());
        }
        eazp eazpVar = ebacVar.i;
        ekgb ekgbVarG = ekfwVar.g();
        ekfw ekfwVar2 = new ekfw();
        HashMap map = new HashMap();
        ekqh it2 = ekgbVarG.iterator();
        while (it2.hasNext()) {
            ejrt ejrtVar3 = (ejrt) it2.next();
            ejrv ejrvVar2 = ejrtVar3.c;
            if (ejrvVar2 == null) {
                ejrvVar2 = ejrv.a;
            }
            evqs byteString = ejrvVar2.toByteString();
            ejrs ejrsVar2 = (ejrs) map.get(byteString);
            if (ejrsVar2 == null) {
                ejrsVar2 = (ejrs) ejrt.a.createBuilder();
                ejrsVar2.copyOnWrite();
                ejrt ejrtVar4 = (ejrt) ejrsVar2.instance;
                ejrvVar2.getClass();
                ejrtVar4.c = ejrvVar2;
                ejrtVar4.b |= 1;
                map.put(byteString, ejrsVar2);
                ekfwVar2.h(ejrsVar2);
            }
            evtg evtgVar = ejrtVar3.d;
            ejrsVar2.copyOnWrite();
            ejrt ejrtVar5 = (ejrt) ejrsVar2.instance;
            ejrtVar5.a();
            evpz.addAll(evtgVar, ejrtVar5.d);
        }
        Stream map2 = Collection.EL.stream(ekfwVar2.g()).map(new Function() { // from class: eazo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (ejrt) ((ejrs) obj2).build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Collector collector = ekcv.a;
        ekgb ekgbVar = (ekgb) map2.collect(collector);
        ejqz ejqzVar = (ejqz) ejra.a.createBuilder();
        evqs evqsVar = eazpVar.a;
        ejqzVar.copyOnWrite();
        ((ejra) ejqzVar.instance).c = evqsVar;
        ejqzVar.copyOnWrite();
        ejra ejraVar = (ejra) ejqzVar.instance;
        evtg evtgVar2 = ejraVar.b;
        if (!evtgVar2.c()) {
            ejraVar.b = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(ekgbVar, ejraVar.b);
        ejra ejraVar2 = (ejra) ejqzVar.build();
        eaxe eaxeVar2 = eazpVar.b;
        int i3 = eaxeVar2.a;
        ejqy ejqyVarA2 = eaxe.a(ejraVar2, 11, eaxeVar2.c, eaxf.b, evqs.b);
        final eaxd eaxdVar = ebacVar.h;
        ekrd ekrdVar = (ekrd) ((ekrd) eaxd.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 64, "ClearcutUploader.java");
        dbyl dbylVar = eaxdVar.c;
        ekrdVar.t("Mobalt: start uploading logs to Clearcut log_source = %s", dbylVar.i);
        dbylVar.j(ejqyVarA2).c().s(new defb() { // from class: eaxb
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                eaxd eaxdVar2 = eaxdVar;
                if (defnVar.m()) {
                    ((ekrd) ((ekrd) eaxd.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 71, "ClearcutUploader.java")).t("Mobalt: successfully finished uploading logs to Clearcut log_source = %s", eaxdVar2.c.i);
                    return;
                }
                ekrd ekrdVar2 = (ekrd) ((ekrd) eaxd.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 75, "ClearcutUploader.java");
                dbyl dbylVar2 = eaxdVar2.c;
                ekrdVar2.D("Mobalt: finished uploading logs to Clearcut log_source = %s with status: %s", dbylVar2.i, defnVar.h());
            }
        });
        final ekgb ekgbVar2 = (ekgb) Collection.EL.stream(list).map(new Function() { // from class: ebaa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Long.valueOf(((eayw) obj2).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
        eiju eijuVarE = ekgbVar2.isEmpty() ? eijx.e(null) : eiju.g(ebacVar.g.c.d(new ecnz() { // from class: eaye
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws InterruptedException {
                ekrg ekrgVar = eayh.a;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("observation_store_id IN(?");
                List list2 = ekgbVar2;
                arrayList.add(String.valueOf(list2.get(0)));
                for (int i4 = 1; i4 < list2.size(); i4++) {
                    sb.append(", ?");
                    arrayList.add(String.valueOf(list2.get(i4)));
                }
                sb.append(")");
                ecoaVar.a(ecnu.a("ObservationStore", sb, arrayList));
            }
        }));
        eooz eoozVar = new eooz() { // from class: eazs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ebacVar.g.c();
            }
        };
        ExecutorService executorService = ebacVar.j;
        return eijuVarE.i(eoozVar, executorService).i(new eazu(ebacVar), executorService);
    }
}
