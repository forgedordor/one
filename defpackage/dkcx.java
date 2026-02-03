package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcx {
    public final String a;
    public final String b;
    public final String c;
    public final fdae d;
    public final dlcr e;

    public dkcx(String str, dlcr dlcrVar, String str2, String str3, fdae fdaeVar) {
        this.a = str;
        this.e = dlcrVar;
        this.b = str2;
        this.c = str3;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkcx)) {
            return false;
        }
        dkcx dkcxVar = (dkcx) obj;
        return fdbq.f(this.a, dkcxVar.a) && fdbq.f(this.e, dkcxVar.e) && fdbq.f(this.b, dkcxVar.b) && fdbq.f(this.c, dkcxVar.c) && fdbq.f(this.d, dkcxVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SimUiData(id=" + this.a + ", simIcon=" + this.e + ", title=" + this.b + ", subtitle=" + this.c + ", onClick=" + this.d + ")";
    }
}
