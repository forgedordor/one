package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyz {
    public final String a;
    public final String b;
    public final List c;
    public final fdae d;

    public xyz(String str, String str2, List list, fdae fdaeVar) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyz)) {
            return false;
        }
        xyz xyzVar = (xyz) obj;
        return fdbq.f(this.a, xyzVar.a) && fdbq.f(this.b, xyzVar.b) && fdbq.f(this.c, xyzVar.c) && fdbq.f(this.d, xyzVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "MessageToolbarUiData(title=" + this.a + ", subtitle=" + this.b + ", actions=" + this.c + ", onClickCloseButton=" + this.d + ")";
    }
}
