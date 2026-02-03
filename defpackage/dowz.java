package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowz {
    public final int a;
    public final dowy b;

    public dowz(int i, dowy dowyVar) {
        this.a = i;
        this.b = dowyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dowz)) {
            return false;
        }
        dowz dowzVar = (dowz) obj;
        return this.a == dowzVar.a && fdbq.f(this.b, dowzVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        String string = Integer.toString(this.a, 16);
        string.getClass();
        return "Icon(icon=0x" + string + ", tints=" + this.b + ")";
    }
}
