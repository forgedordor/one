package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezr extends eezo {
    final /* synthetic */ defr a;
    final /* synthetic */ eezo b;
    final /* synthetic */ eezy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eezr(eezy eezyVar, defr defrVar, defr defrVar2, eezo eezoVar) {
        super(defrVar);
        this.a = defrVar2;
        this.b = eezoVar;
        this.c = eezyVar;
    }

    @Override // defpackage.eezo
    public final void a() {
        final eezy eezyVar = this.c;
        synchronized (eezyVar.f) {
            final defr defrVar = this.a;
            eezyVar.e.add(defrVar);
            defrVar.a.s(new defb() { // from class: eezq
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    defr defrVar2 = defrVar;
                    eezy eezyVar2 = eezyVar;
                    synchronized (eezyVar2.f) {
                        eezyVar2.e.remove(defrVar2);
                    }
                }
            });
            if (eezyVar.l.getAndIncrement() > 0) {
                eezyVar.b.d("Already connected to the service.", new Object[0]);
            }
            eezo eezoVar = this.b;
            if (eezyVar.n == null && !eezyVar.g) {
                eeza eezaVar = eezyVar.b;
                eezaVar.d("Initiate binding to the service.", new Object[0]);
                List list = eezyVar.d;
                list.add(eezoVar);
                eezyVar.m = new eezx(eezyVar);
                eezyVar.g = true;
                if (!eezyVar.a.bindService(eezyVar.h, eezyVar.m, 1)) {
                    eezaVar.d("Failed to bind to the service.", new Object[0]);
                    eezyVar.g = false;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((eezo) it.next()).b(new eezz());
                    }
                    list.clear();
                }
            } else if (eezyVar.g) {
                eezyVar.b.d("Waiting to bind to the service.", new Object[0]);
                eezyVar.d.add(eezoVar);
            } else {
                eezoVar.run();
            }
        }
    }
}
