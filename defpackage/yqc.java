package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqc {
    public final dlps a;
    public final dlpo b;
    public final fdvc c;
    public final fdpl d;
    public final fdae e;

    public yqc(dlps dlpsVar, dlpo dlpoVar, fdvc fdvcVar, fdpl fdplVar, fdae fdaeVar) {
        this.a = dlpsVar;
        this.b = dlpoVar;
        this.c = fdvcVar;
        this.d = fdplVar;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc)) {
            return false;
        }
        yqc yqcVar = (yqc) obj;
        return fdbq.f(this.a, yqcVar.a) && fdbq.f(this.b, yqcVar.b) && fdbq.f(this.c, yqcVar.c) && fdbq.f(this.d, yqcVar.d) && fdbq.f(this.e, yqcVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Transcript(uiData=" + this.a + ", uiAction=" + this.b + ", expandStateFlow=" + this.c + ", progressFlow=" + this.d + ", onPrepare=" + this.e + ")";
    }
}
