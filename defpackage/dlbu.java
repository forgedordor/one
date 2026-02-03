package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbu {
    public final String a;
    public final String b;
    public final String c;
    public final dlcr d;

    public dlbu(String str, dlcr dlcrVar, String str2, String str3) {
        this.a = str;
        this.d = dlcrVar;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlbu)) {
            return false;
        }
        dlbu dlbuVar = (dlbu) obj;
        return fdbq.f(this.a, dlbuVar.a) && fdbq.f(this.d, dlbuVar.d) && fdbq.f(this.b, dlbuVar.b) && fdbq.f(this.c, dlbuVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SimBarChipUiData(id=" + this.a + ", icon=" + this.d + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
