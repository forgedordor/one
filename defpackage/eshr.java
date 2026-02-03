package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eshr {
    static {
        i().a();
    }

    public static eshq i() {
        eshm eshmVar = new eshm();
        eshmVar.d(0L);
        eshmVar.c(1);
        eshmVar.b(0L);
        return eshmVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract eshq c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final boolean j() {
        return h() == 5;
    }

    public final boolean k() {
        return h() == 2 || h() == 1;
    }

    public final boolean l() {
        return h() == 4;
    }

    public final boolean m() {
        return h() == 3;
    }

    public final eshr n() {
        eshq eshqVarC = c();
        ((eshm) eshqVarC).d = "BAD CONFIG";
        eshqVarC.c(5);
        return eshqVarC.a();
    }
}
