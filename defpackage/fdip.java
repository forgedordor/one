package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdip implements fdiq {
    private final fdap a;

    public fdip(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdiq
    public final void b(Throwable th) {
        this.a.invoke(th);
    }

    public final String toString() {
        return "CancelHandler.UserSupplied[" + fdkc.a(this.a) + "@" + fdkc.b(this) + "]";
    }
}
