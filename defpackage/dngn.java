package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngn {
    private final fdae a;
    private final fdap b;
    private Object c;
    private Object d;

    public dngn(fdae fdaeVar, fdap fdapVar) {
        this.a = fdaeVar;
        this.b = fdapVar;
    }

    public final Object a() {
        Object objInvoke = this.a.invoke();
        if (!fdbq.f(this.c, objInvoke)) {
            this.c = objInvoke;
            this.d = null;
        }
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        Object objInvoke2 = this.b.invoke(objInvoke);
        this.d = objInvoke2;
        return objInvoke2;
    }
}
