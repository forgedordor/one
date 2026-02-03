package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afns {
    public final boolean a;
    public final List b;
    public final afoc c;
    public final dloh d;
    public final afnr e;

    public afns(boolean z, List list, afoc afocVar, dloh dlohVar, afnr afnrVar) {
        list.getClass();
        dlohVar.getClass();
        this.a = z;
        this.b = list;
        this.c = afocVar;
        this.d = dlohVar;
        this.e = afnrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afns)) {
            return false;
        }
        afns afnsVar = (afns) obj;
        return this.a == afnsVar.a && fdbq.f(this.b, afnsVar.b) && fdbq.f(this.c, afnsVar.c) && fdbq.f(this.d, afnsVar.d) && fdbq.f(this.e, afnsVar.e);
    }

    public final int hashCode() {
        return ((((((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "EditMessageUiData(isOpened=" + this.a + ", selectedRecipients=" + this.b + ", bottomContentUiData=" + this.c + ", topAppBarUiData=" + this.d + ", flags=" + this.e + ")";
    }
}
