package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fcbf implements Runnable {
    private final fbog a;

    protected fcbf(fbog fbogVar) {
        this.a = fbogVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        fbog fbogVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(fbogVarA);
        }
    }
}
