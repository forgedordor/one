package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdbn extends fdbg implements fdbm, fdea {
    private final int a;
    private final int b;

    public fdbn(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.b = 0;
    }

    @Override // defpackage.fdbm
    public final int dS() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fdbn)) {
            if (obj instanceof fdea) {
                return obj.equals(c());
            }
            return false;
        }
        fdbn fdbnVar = (fdbn) obj;
        if (this.h.equals(fdbnVar.h) && this.i.equals(fdbnVar.i)) {
            int i = fdbnVar.b;
            if (this.a == fdbnVar.a && fdbq.f(this.g, fdbnVar.g) && fdbq.f(e(), fdbnVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fdbg
    protected final void g() {
        int i = fdcj.a;
    }

    public final int hashCode() {
        return (((e() == null ? 0 : e().hashCode() * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        fddx fddxVarC = c();
        if (fddxVarC != this) {
            return fddxVarC.toString();
        }
        String str = this.h;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.a(str, "function ", " (Kotlin reflection is not available)");
    }
}
