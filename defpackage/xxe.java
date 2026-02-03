package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxe {
    public final List a;
    public final int b;
    public final fduf c;
    public final int d;

    public xxe(List list, int i) {
        this.a = list;
        this.b = i;
        this.c = fdvf.a(Integer.valueOf(i));
        this.d = list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxe)) {
            return false;
        }
        xxe xxeVar = (xxe) obj;
        return fdbq.f(this.a, xxeVar.a) && this.b == xxeVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "FixedPager(messages=" + this.a + ", initialPage=" + this.b + ")";
    }
}
