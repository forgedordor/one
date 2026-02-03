package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvwe {
    public final List a;
    public final List b;
    public final String c;

    public bvwe(List list, List list2, String str) {
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvwe)) {
            return false;
        }
        bvwe bvweVar = (bvwe) obj;
        return fdbq.f(this.a, bvweVar.a) && fdbq.f(this.b, bvweVar.b) && fdbq.f(this.c, bvweVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RemoteUserInfo(lookupKeyList=" + this.a + ", identityKeyList=" + this.b + ", phoneNumber=" + this.c + ")";
    }
}
