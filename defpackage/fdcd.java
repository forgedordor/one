package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdcd extends fdbg implements fdeh {
    public fdcd() {
        super(fdbg.f, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdcd) {
            fdcd fdcdVar = (fdcd) obj;
            return e().equals(fdcdVar.e()) && this.h.equals(fdcdVar.h) && this.i.equals(fdcdVar.i) && fdbq.f(this.g, fdcdVar.g);
        }
        if (obj instanceof fdeh) {
            return obj.equals(c());
        }
        return false;
    }

    protected final fdeh h() {
        fddx fddxVarC = c();
        if (fddxVarC != this) {
            return (fdeh) fddxVarC;
        }
        throw new fdad();
    }

    public final int hashCode() {
        return (((e().hashCode() * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        fddx fddxVarC = c();
        if (fddxVarC != this) {
            return fddxVarC.toString();
        }
        return "property " + this.h + " (Kotlin reflection is not available)";
    }

    public fdcd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
