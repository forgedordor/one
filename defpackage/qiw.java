package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiw {
    public final String a;
    public final int b;

    public qiw(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiw)) {
            return false;
        }
        qiw qiwVar = (qiw) obj;
        return fdbq.f(this.a, qiwVar.a) && this.b == qiwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
