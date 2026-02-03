package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotb {
    public final List a;
    public final dpxe b;
    public final String c;

    public dotb(List list, dpxe dpxeVar, String str) {
        this.a = list;
        this.b = dpxeVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dotb)) {
            return false;
        }
        dotb dotbVar = (dotb) obj;
        return fdbq.f(this.a, dotbVar.a) && this.b == dotbVar.b && fdbq.f(this.c, dotbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dpxe dpxeVar = this.b;
        int iHashCode2 = (iHashCode + (dpxeVar == null ? 0 : dpxeVar.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProxyScreenArguments(categories=" + this.a + ", initialScreen=" + this.b + ", initialSearchTerm=" + this.c + ")";
    }
}
