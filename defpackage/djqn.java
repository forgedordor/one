package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqn {
    public final String a;
    public final List b;

    public djqn(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djqn)) {
            return false;
        }
        djqn djqnVar = (djqn) obj;
        return fdbq.f(this.a, djqnVar.a) && fdbq.f(this.b, djqnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FavoriteRowUiData(title=" + this.a + ", items=" + this.b + ")";
    }
}
