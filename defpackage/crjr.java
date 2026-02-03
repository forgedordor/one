package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crjr extends crjy {
    public final String a;
    public final String b;

    public crjr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.crjy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crjy
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crjy) {
            crjy crjyVar = (crjy) obj;
            if (this.a.equals(crjyVar.a()) && this.b.equals(crjyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ReactionMatchResult{reactedMessage=" + this.a + ", reaction=" + this.b + "}";
    }
}
