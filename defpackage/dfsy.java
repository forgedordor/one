package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsy extends eyix {
    private final eyir b;

    public dfsy(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsy.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        TraceId traceIdD;
        dftb dftbVar = (dftb) obj;
        dhip dhipVar = dfsq.a;
        eyga eygaVar = dftbVar.a().isPresent() ? ((dgyx) dftbVar.a().get()).i : (!dftbVar.b().isPresent() || ((dgzn) dftbVar.b().get()).N == null) ? null : ((dgzn) dftbVar.b().get()).N.i;
        if (eygaVar != null) {
            efla eflaVarB = TraceId.b();
            eyge eygeVar = eyge.a;
            evub evubVar = eygaVar.b;
            if (evubVar.containsKey("urn:goog:am")) {
                eygeVar = (eyge) evubVar.get("urn:goog:am");
            }
            evub evubVar2 = eygeVar.b;
            eflaVarB.c(evubVar2.containsKey("Trace-Id") ? (String) evubVar2.get("Trace-Id") : "");
            traceIdD = eflaVarB.d();
        } else {
            traceIdD = TraceId.b().d();
        }
        return eork.i(traceIdD);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
