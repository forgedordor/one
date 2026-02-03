package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfy implements djcw {
    public final String a;
    public final boolean b;
    public final fdap c;
    public final fdap d;
    public final fdae e;
    public final fdae f;

    public djfy(String str, boolean z, fdap fdapVar, fdap fdapVar2, fdae fdaeVar, fdae fdaeVar2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = fdapVar;
        this.d = fdapVar2;
        this.e = fdaeVar;
        this.f = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djfy)) {
            return false;
        }
        djfy djfyVar = (djfy) obj;
        return fdbq.f(this.a, djfyVar.a) && this.b == djfyVar.b && fdbq.f(this.c, djfyVar.c) && fdbq.f(this.d, djfyVar.d) && fdbq.f(this.e, djfyVar.e) && fdbq.f(this.f, djfyVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ComposeRowSubjectUrgentUiData(subject=" + this.a + ", isUrgent=" + this.b + ", onSubjectChange=" + this.c + ", onUrgentChange=" + this.d + ", onClick=" + this.e + ", onDismiss=" + this.f + ")";
    }
}
