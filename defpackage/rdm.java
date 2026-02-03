package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdm implements rti {
    private final kog a;

    public rdm(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        Throwable runtimeException = rhsVar;
        if (rhsVar == null) {
            runtimeException = new RuntimeException("Unknown error");
        }
        this.a.c(runtimeException);
        return true;
    }

    @Override // defpackage.rti
    public final boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        try {
            this.a.b(new rdn(ruaVar, obj));
            return true;
        } catch (Throwable th) {
            this.a.c(th);
            return true;
        }
    }
}
