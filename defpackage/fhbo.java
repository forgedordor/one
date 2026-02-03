package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbo implements fhbn {
    private final CompletableFuture a;

    public fhbo(CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, fhdv fhdvVar) {
        if (fhdvVar.c()) {
            this.a.complete(fhdvVar.b);
        } else {
            this.a.completeExceptionally(new fhcc(fhdvVar));
        }
    }
}
