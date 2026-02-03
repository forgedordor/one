package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egia {
    public final egcd a;
    public final egcq b;
    private final eosc c;

    public egia(egcd egcdVar, egcq egcqVar, eosc eoscVar) {
        this.a = egcdVar;
        this.b = egcqVar;
        this.c = eoscVar;
    }

    public final ListenableFuture a() {
        final egcq egcqVar = this.b;
        eoqt eoqtVarT = eoqt.t(eooq.f(egcqVar.c.a(), eiid.a(new ejvr() { // from class: egci
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egcx egcxVar = (egcx) obj;
                boolean z = false;
                if ((egcxVar.b & 4) != 0) {
                    if (egcxVar.e == egcqVar.f) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }), eoqg.a));
        eooz eoozVarD = eiid.d(new eooz() { // from class: eghy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eork.i(null);
                }
                egia egiaVar = this.a;
                ekph ekphVar = new ekph("pseudonymous");
                ejwl.a(!ekphVar.isEmpty());
                ekqg ekqgVarListIterator = ekphVar.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    ((String) ekqgVarListIterator.next()).getClass();
                    ejwl.a(!r2.isEmpty());
                }
                egcq egcqVar2 = egiaVar.b;
                ListenableFuture listenableFutureB = egcqVar2.b(ekphVar);
                egcqVar2.d(listenableFutureB);
                return listenableFutureB;
            }
        });
        eosc eoscVar = this.c;
        return eooq.g(eooq.g(eoqtVarT, eoozVarD, eoscVar), eiid.d(new eooz() { // from class: eghz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a.b("pseudonymous", "pseudonymous");
            }
        }), eoscVar);
    }
}
