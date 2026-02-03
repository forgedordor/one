package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaw extends qaz {
    private final Throwable a;

    public qaw(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
