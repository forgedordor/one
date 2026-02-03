package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizb {
    public final diyz a;
    public final List b;
    public final boolean c;
    public final diys d;
    private final diys e;
    private final boolean f;

    public /* synthetic */ dizb(diyz diyzVar, List list, boolean z, diys diysVar, int i) {
        this.a = diyzVar;
        this.b = list;
        this.c = ((i & 4) == 0) & z;
        this.e = null;
        this.d = (i & 16) != 0 ? null : diysVar;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dizb)) {
            return false;
        }
        dizb dizbVar = (dizb) obj;
        if (!fdbq.f(this.a, dizbVar.a) || !fdbq.f(this.b, dizbVar.b) || this.c != dizbVar.c) {
            return false;
        }
        diys diysVar = dizbVar.e;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, dizbVar.d)) {
            return false;
        }
        boolean z = dizbVar.f;
        return true;
    }

    public final int hashCode() {
        diyz diyzVar = this.a;
        int iHashCode = ((diyzVar == null ? 0 : diyzVar.hashCode()) * 31) + this.b.hashCode();
        boolean z = this.c;
        diys diysVar = this.d;
        return (((((iHashCode * 31) + diza.a(z)) * 961) + (diysVar != null ? diysVar.hashCode() : 0)) * 31) + diza.a(true);
    }

    public final String toString() {
        return "CardstoneUiData(title=" + this.a + ", listItems=" + this.b + ", isError=" + this.c + ", confirmButton=null, cancelButton=" + this.d + ", useOutline=true)";
    }
}
