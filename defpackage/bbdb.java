package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdb {
    private final crnc a;
    private final crnc b;
    private final crnc c;
    private final crnc d;
    private final List e;
    private final List f;

    public bbdb(crnc crncVar, crnc crncVar2, crnc crncVar3, crnc crncVar4, List list, List list2) {
        this.a = crncVar;
        this.b = crncVar2;
        this.c = crncVar3;
        this.d = crncVar4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbdb)) {
            return false;
        }
        bbdb bbdbVar = (bbdb) obj;
        return fdbq.f(this.a, bbdbVar.a) && fdbq.f(this.b, bbdbVar.b) && fdbq.f(this.c, bbdbVar.c) && fdbq.f(this.d, bbdbVar.d) && fdbq.f(this.e, bbdbVar.e) && fdbq.f(this.f, bbdbVar.f);
    }

    public final int hashCode() {
        int i = this.a.a;
        List list = this.e;
        crnc crncVar = this.d;
        return (((((((((i * 31) + this.b.a) * 31) + this.c.a) * 31) + crncVar.a) * 31) + list.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CountryCodes(deviceCountry=" + this.a + ", deviceCountryDeprecated=" + this.b + ", localeCountry=" + this.c + ", settingsCountry=" + this.d + ", simCountryCodes=" + this.e + ", networkCountryCodes=" + this.f + ")";
    }
}
