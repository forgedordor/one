package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxn {
    public final String a;
    public final fdae b;

    public daxn(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daxn)) {
            return false;
        }
        daxn daxnVar = (daxn) obj;
        return fdbq.f(this.a, daxnVar.a) && fdbq.f(this.b, daxnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DropdownMenuItemUiData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
