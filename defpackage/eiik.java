package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiik {
    public final eifn a;

    private eiik(eifn eifnVar) {
        this.a = eifnVar;
    }

    public static eiik b() {
        return new eiik(eidc.e());
    }

    public static eiik c() {
        return new eiik(eidc.j);
    }

    public static Runnable d(eiik eiikVar, Runnable runnable) {
        eifn eifnVar = eiikVar.a;
        eifnVar.getClass();
        long j = eiid.a;
        eifnVar.getClass();
        return new eihs(eifnVar, runnable);
    }

    public static void e(eiik eiikVar) {
        eidc.g(eiikVar.a);
    }

    public static eiik g() {
        return new eiik(eidc.c());
    }

    public final eifp a() {
        eifn eifnVar = this.a;
        final eifn eifnVarC = eidc.c();
        eidc.g(eifnVar);
        return new eifp() { // from class: eiij
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eidc.g(eifnVarC);
            }
        };
    }

    public final boolean f() {
        return this.a == null;
    }

    public final String toString() {
        eifn eifnVar = this.a;
        return eifnVar == null ? "null ref" : eifnVar.toString();
    }
}
