package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eorh extends eooi {
    private eori a;

    public eorh(eori eoriVar) {
        this.a = eoriVar;
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        eori eoriVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        eoriVar.getClass();
        eoriVar.a = true;
        if (!z) {
            eoriVar.b = false;
        }
        eoriVar.a();
        return true;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        eori eoriVar = this.a;
        if (eoriVar == null) {
            return null;
        }
        ListenableFuture[] listenableFutureArr = eoriVar.d;
        AtomicInteger atomicInteger = eoriVar.c;
        return "inputCount=[" + listenableFutureArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }

    @Override // defpackage.eooi
    protected final void gv() {
        this.a = null;
    }
}
