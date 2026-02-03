package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdkt implements fdiq {
    private final fdks a;

    public fdkt(fdks fdksVar) {
        this.a = fdksVar;
    }

    @Override // defpackage.fdiq
    public final void b(Throwable th) {
        this.a.hz();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + "]";
    }
}
