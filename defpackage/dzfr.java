package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzfr {
    public abstract dzfs a();

    public abstract void b();

    public final dzfs c() {
        dzfs dzfsVarA = a();
        ejwl.n(((dzei) dzfsVarA).a > 0, "Thread pool size must be less than or equal to %s", 2);
        return dzfsVarA;
    }
}
