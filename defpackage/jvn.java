package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvn implements jui {
    public final int a;
    public final int b;
    public final long c;
    public final khu d;
    public final jvr e;
    public final khi f;
    public final int g;
    public final int h;
    public final khw i;

    public jvn(int i, int i2, long j, khu khuVar, jvr jvrVar, khi khiVar, int i3, int i4, khw khwVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = khuVar;
        this.e = jvrVar;
        this.f = khiVar;
        this.g = i3;
        this.h = i4;
        this.i = khwVar;
        if (kjl.e(j, kjl.a) || kjl.a(j) >= 0.0f) {
            return;
        }
        kfq.c("lineHeight can't be negative (" + kjl.a(j) + ')');
    }

    public final jvn a(jvn jvnVar) {
        return jvnVar == null ? this : jvo.a(this, jvnVar.a, jvnVar.b, jvnVar.c, jvnVar.d, jvnVar.e, jvnVar.f, jvnVar.g, jvnVar.h, jvnVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvn)) {
            return false;
        }
        jvn jvnVar = (jvn) obj;
        return khk.b(this.a, jvnVar.a) && khm.b(this.b, jvnVar.b) && kjl.e(this.c, jvnVar.c) && fdbq.f(this.d, jvnVar.d) && fdbq.f(this.e, jvnVar.e) && fdbq.f(this.f, jvnVar.f) && khd.b(this.g, jvnVar.g) && kgz.b(this.h, jvnVar.h) && fdbq.f(this.i, jvnVar.i);
    }

    public final int hashCode() {
        long j = kjl.a;
        khu khuVar = this.d;
        int iHashCode = khuVar != null ? khuVar.hashCode() : 0;
        int i = this.a;
        long j2 = this.c;
        int i2 = this.b;
        jvr jvrVar = this.e;
        int iHashCode2 = jvrVar != null ? jvrVar.hashCode() : 0;
        int iA = (((((i * 31) + i2) * 31) + kjk.a(j2)) * 31) + iHashCode;
        khi khiVar = this.f;
        int iHashCode3 = ((((((((iA * 31) + iHashCode2) * 31) + (khiVar != null ? khiVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        khw khwVar = this.i;
        return iHashCode3 + (khwVar != null ? khwVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) khk.a(this.a)) + ", textDirection=" + ((Object) khm.a(this.b)) + ", lineHeight=" + ((Object) kjl.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) khd.a(this.g)) + ", hyphens=" + ((Object) kgz.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
