package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdkl extends Exception {
    public final Throwable a;

    public fdkl(Throwable th, fdjq fdjqVar, fcyh fcyhVar) {
        super(a.i(fcyhVar, fdjqVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
