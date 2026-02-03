package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fctn implements Serializable, fctc {
    private fdae a;
    private volatile Object b = fctu.a;
    private final Object c = this;

    public /* synthetic */ fctn(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    private final Object writeReplace() {
        return new fcsz(a());
    }

    @Override // defpackage.fctc
    public final Object a() {
        Object objInvoke;
        Object obj = this.b;
        fctu fctuVar = fctu.a;
        if (obj != fctuVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == fctuVar) {
                fdae fdaeVar = this.a;
                fdaeVar.getClass();
                objInvoke = fdaeVar.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.fctc
    public final boolean b() {
        return this.b != fctu.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
