package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmg {
    public final String a;
    public final List b;
    private final String c = null;
    private final boolean d = true;
    private final boolean e = true;

    public dlmg(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlmg)) {
            return false;
        }
        dlmg dlmgVar = (dlmg) obj;
        if (!fdbq.f(this.a, dlmgVar.a)) {
            return false;
        }
        String str = dlmgVar.c;
        if (!fdbq.f(null, null) || !fdbq.f(this.b, dlmgVar.b)) {
            return false;
        }
        boolean z = dlmgVar.d;
        boolean z2 = dlmgVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + 1231) * 31) + 1231;
    }

    public final String toString() {
        return "TooltipUiData(body=" + this.a + ", title=null, actions=" + this.b + ", isPersistent=true, isVisible=true)";
    }
}
