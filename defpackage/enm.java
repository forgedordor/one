package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class enm {
    public abstract eqp b();

    public final int c() {
        return b().b;
    }

    public final Object d(int i) {
        emx emxVarA = b().a(i);
        return ((enl) emxVarA.c).b().invoke(Integer.valueOf(i - emxVarA.a));
    }

    public final Object e(int i) {
        Object objInvoke;
        emx emxVarA = b().a(i);
        int i2 = i - emxVarA.a;
        fdap fdapVarA = ((enl) emxVarA.c).a();
        return (fdapVarA == null || (objInvoke = fdapVarA.invoke(Integer.valueOf(i2))) == null) ? new emv(i) : objInvoke;
    }
}
