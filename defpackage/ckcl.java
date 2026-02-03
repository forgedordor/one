package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckcl {
    public final ckbz a;
    public final List b;

    public ckcl(ckbz ckbzVar, List list) {
        ckbzVar.getClass();
        list.getClass();
        this.a = ckbzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckcl)) {
            return false;
        }
        ckcl ckclVar = (ckcl) obj;
        return this.a == ckclVar.a && fdbq.f(this.b, ckclVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsSettingsUiDataV2(rcsGlobalToggleState=" + this.a + ", simInfo=" + this.b + ")";
    }
}
