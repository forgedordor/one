package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eapi extends eatt {
    public final String a;
    public final String b;

    public eapi(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str2;
    }

    @Override // defpackage.eatt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eatt
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatt) {
            eatt eattVar = (eatt) obj;
            if (this.a.equals(eattVar.a()) && this.b.equals(eattVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SubDestination{id=" + this.a + ", name=" + this.b + "}";
    }
}
