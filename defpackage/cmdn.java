package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdn implements ehaw {
    final /* synthetic */ cmdo a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public cmdn(cmdo cmdoVar) {
        this.a = cmdoVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cmdo.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() throws IOException {
        if (!((Boolean) ((cczi) cmdd.a.get()).e()).booleanValue()) {
            eiju eijuVarE = eijx.e(Optional.of(new cmdb()));
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (!this.b.getAndSet(true)) {
            cmdo cmdoVar = this.a;
            eieu eieuVarH = eiiy.h("ScreenDetectionListener.loadData.initialRegistration");
            try {
                auvw.k(cmdoVar.d, null, null, new cmdm(cmdoVar, null), 3);
                fczl.a(eieuVarH, null);
            } finally {
            }
        }
        eiju eijuVarE2 = eijx.e(Optional.ofNullable(this.a.e.get()));
        eijuVarE2.getClass();
        return eijuVarE2;
    }
}
