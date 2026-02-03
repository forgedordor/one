package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eanz extends eapo {
    public final String a;
    public final String b;
    public final List c;

    public eanz(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = str2;
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.c = list;
    }

    @Override // defpackage.eapo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eapo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eapo
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eapo) {
            eapo eapoVar = (eapo) obj;
            if (this.a.equals(eapoVar.a()) && ((str = this.b) != null ? str.equals(eapoVar.b()) : eapoVar.b() == null) && this.c.equals(eapoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AddressComponent{name=" + this.a + ", shortName=" + this.b + ", types=" + this.c.toString() + "}";
    }
}
