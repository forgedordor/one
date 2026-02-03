package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwab {
    public final String a;
    public final String b;

    public bwab(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwab)) {
            return false;
        }
        bwab bwabVar = (bwab) obj;
        return fdbq.f(this.a, bwabVar.a) && fdbq.f(this.b, bwabVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SelfIdentityKeyMetadata(phoneNumber=" + this.a + ", deviceId=" + this.b + ")";
    }
}
