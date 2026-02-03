package defpackage;

import j$.time.Instant;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehae extends lxd {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final egpn c = new egpn("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final egpl e;
    public final diep f;
    public final egzj g;
    public final Executor h;

    public ehae(diep diepVar, egzj egzjVar, Executor executor) {
        this.f = diepVar;
        this.g = egzjVar;
        this.h = executor;
        egpl egplVar = new egpl(executor, true, false, false);
        this.e = egplVar;
        egplVar.d();
    }

    final void a(final egyi egyiVar, ehar eharVar, egzv egzvVar) {
        int iIntValue;
        ecem.c();
        egyiVar.getClass();
        ehaq ehaqVar = (ehaq) Map.EL.computeIfAbsent(this.a, egzvVar.getClass(), new Function() { // from class: ehad
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                egyi egyiVar2 = egyiVar;
                ehae ehaeVar = this.a;
                return new ehaq(egyiVar2, ehaeVar.f, ehaeVar.g, ehaeVar.e, ehaeVar.h);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ecem.c();
        egpn egpnVar = this.c;
        csq csqVar = egpnVar.c;
        Class<?> cls = egzvVar.getClass();
        if (csqVar.containsKey(cls)) {
            iIntValue = ((Integer) csqVar.get(cls)).intValue();
        } else {
            int andIncrement = egpn.a.getAndIncrement();
            csqVar.put(cls, Integer.valueOf(andIncrement));
            iIntValue = andIncrement;
        }
        Object objPut = egpnVar.b.put(Integer.valueOf(iIntValue), egzvVar);
        egyiVar.c().getClass();
        ejwl.a(((egzvVar instanceof egzu) && (egzvVar instanceof egyf)) ? false : true);
        egyc egycVar = (egyc) ehaqVar.h;
        Object obj = egycVar.b;
        Instant instantF = ehaqVar.a.f();
        long j = egycVar.d;
        ejwl.m(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        egzvVar.getClass();
        ehaqVar.h = new egyc(egyiVar, egyiVar.c(), eharVar, j + 1, 3, egycVar.e.g(egyiVar, instantF));
        egye egyeVar = (egye) ehaqVar.i;
        ehaqVar.i = new egye(egyeVar.a + 1, egzvVar, egyeVar.c, egyeVar.d, ejud.a);
        if (ehaqVar.e == null) {
            ehaqVar.e = new ehap(ehaqVar);
            ehaqVar.b.d(((egyc) ehaqVar.h).b, ehaqVar.e);
        } else if (!((egyc) ehaqVar.h).b.equals(obj)) {
            egzo egzoVar = ehaqVar.b;
            egzoVar.e(obj, ehaqVar.e);
            egzoVar.d(((egyc) ehaqVar.h).b, ehaqVar.e);
        }
        if (objPut == null) {
            if (((egye) ehaqVar.i).d.g()) {
                ejwl.m(!r1.e.g(), "Cannot be the case that subscription has data.");
                egzw egzwVar = ehaqVar.i;
                ehaqVar.i = ehaq.j(egzwVar, (egyy) ((egye) egzwVar).d.c());
                ejwl.m(((egye) ehaqVar.i).e.g(), "Callbacks did not accept pinned data after rotation.");
                if (!(((egye) ehaqVar.i).b instanceof egyf) || ehaqVar.j.b()) {
                    return;
                }
                ehaqVar.i = ehaqVar.i.g(true);
                ehaq.f((egyf) ((egye) ehaqVar.i).b);
                return;
            }
        }
        ehaqVar.e(((egyc) ehaqVar.h).e);
    }

    @Override // defpackage.lxd
    protected final void fC() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((ehaq) it.next()).a();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((ehaq) it2.next()).a();
        }
        this.e.a().clear();
    }
}
