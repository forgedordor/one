package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohy {
    private final String a;
    private final String b;

    public dohy(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dohy)) {
            return false;
        }
        dohy dohyVar = (dohy) obj;
        return fdbq.f(this.a, dohyVar.a) && fdbq.f(this.b, dohyVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return this.a;
        }
        return this.a + "=" + str;
    }
}
