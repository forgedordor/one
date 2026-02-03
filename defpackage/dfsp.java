package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsp extends eyix {
    private final eyir b;

    public dfsp(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsp.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        eyga eygaVar;
        TraceId traceIdD;
        Optional optional = (Optional) obj;
        dfny dfnyVar = dfsd.a;
        if (optional.isEmpty() || (eygaVar = ((dgyx) optional.get()).i) == null) {
            traceIdD = TraceId.b().d();
        } else {
            efla eflaVarB = TraceId.b();
            eyge eygeVar = eyge.a;
            evub evubVar = eygaVar.b;
            if (evubVar.containsKey("urn:goog:am")) {
                eygeVar = (eyge) evubVar.get("urn:goog:am");
            }
            evub evubVar2 = eygeVar.b;
            eflaVarB.c(evubVar2.containsKey("Trace-Id") ? (String) evubVar2.get("Trace-Id") : "");
            traceIdD = eflaVarB.d();
        }
        return eork.i(traceIdD);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
