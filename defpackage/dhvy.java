package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvy extends dhvz {
    public final dhzt a;
    public final evqs b;
    public final evqs c;
    public final List d;
    public final boolean e;
    public final String f;
    public final evqs g;
    public final dhnv h;

    public dhvy(dhzt dhztVar, evqs evqsVar, evqs evqsVar2, List list, boolean z, String str, evqs evqsVar3, dhnv dhnvVar) {
        dhztVar.getClass();
        evqsVar2.getClass();
        list.getClass();
        dhnvVar.getClass();
        this.a = dhztVar;
        this.b = evqsVar;
        this.c = evqsVar2;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = evqsVar3;
        this.h = dhnvVar;
    }

    @Override // defpackage.dhvz
    public final evqs a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhvy)) {
            return false;
        }
        dhvy dhvyVar = (dhvy) obj;
        return fdbq.f(this.a, dhvyVar.a) && fdbq.f(this.b, dhvyVar.b) && fdbq.f(this.c, dhvyVar.c) && fdbq.f(this.d, dhvyVar.d) && this.e == dhvyVar.e && fdbq.f(this.f, dhvyVar.f) && fdbq.f(this.g, dhvyVar.g) && fdbq.f(this.h, dhvyVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        evqs evqsVar = this.b;
        int iHashCode2 = (((((((iHashCode + (evqsVar == null ? 0 : evqsVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31;
        String str = this.f;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }
}
