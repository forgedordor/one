package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcty implements Serializable, fctc {
    private fdae a;
    private Object b = fctu.a;

    public fcty(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    private final Object writeReplace() {
        return new fcsz(a());
    }

    @Override // defpackage.fctc
    public final Object a() {
        if (this.b == fctu.a) {
            fdae fdaeVar = this.a;
            fdaeVar.getClass();
            this.b = fdaeVar.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.fctc
    public final boolean b() {
        return this.b != fctu.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
