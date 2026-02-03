package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyy implements AutoCloseable, fdjx {
    private final fcyh a;

    public lyy(fcyh fcyhVar) {
        fcyhVar.getClass();
        this.a = fcyhVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        fdlw.d(this.a, null);
    }

    @Override // defpackage.fdjx
    public final fcyh hE() {
        return this.a;
    }
}
