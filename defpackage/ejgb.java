package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgb extends RuntimeException {
    public final ejga a;
    private final String b;
    private final Throwable c;

    public /* synthetic */ ejgb(ejga ejgaVar, Throwable th) {
        String string = ejgaVar.toString();
        ejgaVar.getClass();
        this.a = ejgaVar;
        this.b = string;
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
