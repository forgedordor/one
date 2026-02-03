package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbq extends CompletableFuture {
    private final fhbk a;

    public fhbq(fhbk fhbkVar) {
        this.a = fhbkVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.c();
        }
        return super.cancel(z);
    }
}
