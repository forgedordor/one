package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxr {
    public final String a;
    public final ecq b;
    public final diio c;
    public final boolean d;

    public daxr(String str, ecq ecqVar, diio diioVar, boolean z) {
        this.a = str;
        this.b = ecqVar;
        this.c = diioVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daxr)) {
            return false;
        }
        daxr daxrVar = (daxr) obj;
        return fdbq.f(this.a, daxrVar.a) && fdbq.f(this.b, daxrVar.b) && fdbq.f(this.c, daxrVar.c) && this.d == daxrVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        diio diioVar = this.c;
        return (((iHashCode * 31) + (diioVar == null ? 0 : diioVar.hashCode())) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "NoticeAnnotation(text=" + this.a + ", arrangement=" + this.b + ", urlAnnotation=" + this.c + ", useLargeFontSize=" + this.d + ")";
    }

    public /* synthetic */ daxr(String str, ecq ecqVar, diio diioVar, int i) {
        this(str, ecqVar, (i & 4) != 0 ? null : diioVar, false);
    }
}
