package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcs implements afzv {
    public final String a;
    public final boolean b;

    public agcs() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcs)) {
            return false;
        }
        agcs agcsVar = (agcs) obj;
        return fdbq.f(this.a, agcsVar.a) && this.b == agcsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ExitRenameGroup(newName=" + this.a + ", groupRenamed=" + this.b + ")";
    }

    public agcs(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ agcs(int i) {
        this(1 != (i & 1) ? null : "", false);
    }
}
