package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaod extends eaps {
    public final List a;

    public eaod(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.a = list;
    }

    @Override // defpackage.eaps
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaps) {
            return this.a.equals(((eaps) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AuthorAttributions{asList=" + this.a.toString() + "}";
    }
}
