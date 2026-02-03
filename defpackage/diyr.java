package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyr {
    public final String a;
    public final String b;
    public final List c;

    public diyr(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diyr)) {
            return false;
        }
        diyr diyrVar = (diyr) obj;
        return fdbq.f(this.a, diyrVar.a) && fdbq.f(this.b, diyrVar.b) && fdbq.f(this.c, diyrVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CardUiData(title=" + this.a + ", subtitle=" + this.b + ", items=" + this.c + ")";
    }
}
