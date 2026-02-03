package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgmf {
    public static final eksp a = eksp.c("BugleNotifications");
    public final Context b;
    public final eosc c;
    public final cgpw d;
    public final cgph e;
    public final cgpd f;
    public final arpr g;
    public final cgmj h;
    private final eosc i;
    private final cgoh j;
    private final cgqd k;
    private final boolean l;

    public cgmf(Context context, eosc eoscVar, eosc eoscVar2, cgpw cgpwVar, cgph cgphVar, cgoh cgohVar, cgqd cgqdVar, arpr arprVar, cgmj cgmjVar, cgpd cgpdVar, boolean z) {
        this.b = context;
        this.i = eoscVar;
        this.c = eoscVar2;
        this.d = cgpwVar;
        this.e = cgphVar;
        this.j = cgohVar;
        this.k = cgqdVar;
        this.f = cgpdVar;
        this.l = z;
        this.g = arprVar;
        this.h = cgmjVar;
    }

    public static String b(cgpd cgpdVar) {
        return cgpdVar == null ? "" : c(DesugarCollections.unmodifiableMap(cgpdVar.c));
    }

    public static String c(Map map) {
        return map.isEmpty() ? "" : TextUtils.join(",", (Iterable) Collection.EL.stream(map.entrySet()).map(new Function() { // from class: cgma
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                eksp ekspVar = cgmf.a;
                return ((String) entry.getKey()) + ":" + ((cgov) entry.getValue()).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cgmb())));
    }

    public static Map d(ekgp ekgpVar, ekgp ekgpVar2) {
        HashMap map = new HashMap(ekgpVar);
        ekqg ekqgVarListIterator = ekgpVar2.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            String str = (String) entry.getKey();
            if (map.containsKey(str)) {
                long j = ((cgov) entry.getValue()).c;
                cgov cgovVar = (cgov) map.get(str);
                cgovVar.getClass();
                long j2 = cgovVar.c;
                cgov cgovVar2 = (cgov) map.get(str);
                cgovVar2.getClass();
                cgos cgosVar = (cgos) cgovVar2.toBuilder();
                long jMin = Math.min(j2, j);
                cgosVar.copyOnWrite();
                cgov cgovVar3 = (cgov) cgosVar.instance;
                cgovVar3.b |= 1;
                cgovVar3.c = jMin;
                map.put(str, (cgov) cgosVar.build());
            } else {
                map.put(str, (cgov) entry.getValue());
            }
        }
        return map;
    }

    public final eiju a(List list) {
        final eiju eijuVarH;
        final eiju eijuVarA = this.j.a(list).a();
        if (this.l) {
            cgqd cgqdVar = this.k;
            eiju eijuVarH2 = cgqdVar.c.h();
            ejvr ejvrVar = new ejvr() { // from class: cgpz
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekrw ekrwVarJ = cgqd.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNotifications");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((evtj) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "getDataAsync", 96, "IncomingMessageSettingsStore.java")).q("Error getting data from incoming message settings store");
                    return cgqg.a;
                }
            };
            eosc eoscVar = cgqdVar.b;
            eijuVarH = eijuVarH2.e(evtj.class, ejvrVar, eoscVar).h(new ejvr() { // from class: cgpy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cgqg cgqgVar = (cgqg) obj;
                    if (cgqgVar == null) {
                        return cgpd.a;
                    }
                    cgpd cgpdVar = cgqgVar.c;
                    return cgpdVar == null ? cgpd.a : cgpdVar;
                }
            }, eoscVar);
        } else {
            eijuVarH = eijx.e(cgpd.a);
        }
        return eijx.m(eijuVarA, eijuVarH).a(new Callable() { // from class: cgme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = new HashMap();
                cgpd cgpdVar = (cgpd) eork.q(eijuVarH);
                if (!DesugarCollections.unmodifiableMap(cgpdVar.c).isEmpty()) {
                    map = cgmf.d(ekgp.j(map), ekgp.j(DesugarCollections.unmodifiableMap(cgpdVar.c)));
                }
                eiju eijuVar = eijuVarA;
                cgmf cgmfVar = this.a;
                cgpd cgpdVar2 = (cgpd) eork.q(eijuVar);
                ekgp ekgpVarJ = ekgp.j(cgmf.d(ekgp.j(map), ekgp.j(DesugarCollections.unmodifiableMap(cgpdVar2.c))));
                cgpd cgpdVar3 = cgmfVar.f;
                Map mapD = cgmf.d(ekgpVarJ, ekgp.j(DesugarCollections.unmodifiableMap(cgpdVar3.c)));
                eksl ekslVar = (eksl) cgmf.a.h();
                ekslVar.X(cgpl.a, cgmf.b(cgpdVar3));
                ekslVar.X(cgpl.b, cgmf.b(cgpdVar2));
                ekslVar.X(cgpl.c, cgmf.b(cgpdVar));
                ekslVar.X(cgpl.d, cgmf.c(mapD));
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createInputIds", 244, "ConversationAndMessagesDataCreator.java")).q("Creating notification input ids");
                return mapD;
            }
        }, this.i);
    }
}
