package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcw implements djvp {
    public final String a;
    public final List b;

    public dkcw(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkcw)) {
            return false;
        }
        dkcw dkcwVar = (dkcw) obj;
        return fdbq.f(this.a, dkcwVar.a) && fdbq.f(this.b, dkcwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SimSwitcherUiData(selectedId=" + this.a + ", items=" + this.b + ")";
    }
}
