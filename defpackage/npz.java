package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class npz {
    protected final nox d;

    protected npz(nox noxVar) {
        this.d = noxVar;
    }

    protected abstract boolean a(mfr mfrVar);

    protected abstract boolean b(mfr mfrVar, long j);

    public final boolean c(mfr mfrVar, long j) {
        return a(mfrVar) && b(mfrVar, j);
    }
}
