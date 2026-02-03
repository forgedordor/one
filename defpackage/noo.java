package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noo {
    public final nor a;
    public final nor b;

    public noo(nor norVar, nor norVar2) {
        this.a = norVar;
        this.b = norVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            noo nooVar = (noo) obj;
            if (this.a.equals(nooVar.a) && this.b.equals(nooVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nor norVar = this.a;
        nor norVar2 = this.b;
        return "[" + norVar.toString() + (norVar.equals(norVar2) ? "" : ", ".concat(norVar2.toString())) + "]";
    }
}
