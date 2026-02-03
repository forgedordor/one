package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afyi {
    public final dloh a;
    public final afvt b;
    public final List c;
    public final afyh d;
    private final boolean e;

    public /* synthetic */ afyi(dloh dlohVar, afvt afvtVar, List list, afyh afyhVar) {
        dlohVar.getClass();
        afvtVar.getClass();
        list.getClass();
        this.a = dlohVar;
        this.e = true;
        this.b = afvtVar;
        this.c = list;
        this.d = afyhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afyi)) {
            return false;
        }
        afyi afyiVar = (afyi) obj;
        if (!fdbq.f(this.a, afyiVar.a)) {
            return false;
        }
        boolean z = afyiVar.e;
        return fdbq.f(this.b, afyiVar.b) && fdbq.f(this.c, afyiVar.c) && fdbq.f(this.d, afyiVar.d);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "AutoCompleteTopAppBarUiData(topAppBarUiData=" + this.a + ", focusTextField=true, suggestionListUiData=" + this.b + ", selectedRecipients=" + this.c + ", flags=" + this.d + ")";
    }
}
