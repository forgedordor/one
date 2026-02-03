package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwaa {
    public final String a;
    public final String b;
    public final String c;

    public bwaa(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwaa)) {
            return false;
        }
        bwaa bwaaVar = (bwaa) obj;
        return fdbq.f(this.a, bwaaVar.a) && fdbq.f(this.b, bwaaVar.b) && fdbq.f(this.c, bwaaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "KeyMetadata(phoneNumber=" + this.a + ", lookupKey=" + this.b + ", deviceId=" + this.c + ")";
    }
}
