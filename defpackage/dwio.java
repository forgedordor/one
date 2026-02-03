package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dwio extends dwjh {
    public final ejwi a;
    public final Set b;
    public final ejwi c;
    public final String d;

    public dwio(ejwi ejwiVar, Set set, ejwi ejwiVar2, String str) {
        if (ejwiVar == null) {
            throw new NullPointerException("Null gaiaEmail");
        }
        this.a = ejwiVar;
        this.b = set;
        if (ejwiVar2 == null) {
            throw new NullPointerException("Null deviceId");
        }
        this.c = ejwiVar2;
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.d = str;
    }

    @Override // defpackage.dwjh
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.dwjh
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.dwjh
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dwjh
    public final Set d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwjh) {
            dwjh dwjhVar = (dwjh) obj;
            if (this.a.equals(dwjhVar.b()) && this.b.equals(dwjhVar.d()) && this.c.equals(dwjhVar.a()) && this.d.equals(dwjhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        Set set = this.b;
        return "AccountUsers{gaiaEmail=" + this.a.toString() + ", phoneNumbers=" + set.toString() + ", deviceId=" + ejwiVar.toString() + ", tachyonAppName=" + this.d + "}";
    }
}
