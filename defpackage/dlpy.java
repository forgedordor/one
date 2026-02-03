package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpy {
    public final List a;
    public final String b;
    public final fdae c;

    public dlpy(List list, String str, fdae fdaeVar) {
        this.a = list;
        this.b = str;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlpy)) {
            return false;
        }
        dlpy dlpyVar = (dlpy) obj;
        return fdbq.f(this.a, dlpyVar.a) && fdbq.f(this.b, dlpyVar.b) && fdbq.f(this.c, dlpyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TypingIndicatorUiData(monogramItemList=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
