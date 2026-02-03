package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtcb {
    private static final ThreadLocal a = new dtbx();

    public static dtcb c() {
        return (dtcb) a.get();
    }

    public abstract void a(dtbz dtbzVar);

    public abstract void b(dtbz dtbzVar);
}
