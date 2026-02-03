package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehds {
    public final evuh a;
    public final int b;
    private final fdae c;

    public ehds(fdae fdaeVar, int i, evuh evuhVar) {
        this.c = fdaeVar;
        this.b = i;
        this.a = evuhVar;
    }

    public final double a() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return ((Double) objInvoke).doubleValue();
    }

    public final long b() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return ((Long) objInvoke).longValue();
    }

    public final evuh c() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return (evuh) objInvoke;
    }

    public final String d() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return (String) objInvoke;
    }

    public final boolean e() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return ((Boolean) objInvoke).booleanValue();
    }

    public /* synthetic */ ehds(fdae fdaeVar, int i) {
        this(fdaeVar, i, null);
    }
}
