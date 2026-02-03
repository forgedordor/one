package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ipk {
    private fdap a;

    public fdap a() {
        return this.a;
    }

    public abstract void b(imz imzVar);

    public void e(fdap fdapVar) {
        this.a = fdapVar;
    }

    public final void f() {
        fdap fdapVarA = a();
        if (fdapVarA != null) {
            fdapVarA.invoke(this);
        }
    }
}
