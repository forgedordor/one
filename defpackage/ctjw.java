package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjw {
    public final ctrh a;
    public final fdpl b;
    public final ctno c;
    public final ctlz d;
    public final ctot e;
    public final ctoe f;
    public final List g;
    public final fdap h;
    public final fdat i;
    public final fdae j;
    public final ctju k;

    public ctjw(ctrh ctrhVar, fdpl fdplVar, ctno ctnoVar, ctlz ctlzVar, ctot ctotVar, ctoe ctoeVar, List list, fdap fdapVar, fdat fdatVar, fdae fdaeVar, ctju ctjuVar) {
        ctrhVar.getClass();
        fdplVar.getClass();
        ctnoVar.getClass();
        ctotVar.getClass();
        list.getClass();
        ctjuVar.getClass();
        this.a = ctrhVar;
        this.b = fdplVar;
        this.c = ctnoVar;
        this.d = ctlzVar;
        this.e = ctotVar;
        this.f = ctoeVar;
        this.g = list;
        this.h = fdapVar;
        this.i = fdatVar;
        this.j = fdaeVar;
        this.k = ctjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctjw)) {
            return false;
        }
        ctjw ctjwVar = (ctjw) obj;
        return fdbq.f(this.a, ctjwVar.a) && fdbq.f(this.b, ctjwVar.b) && fdbq.f(this.c, ctjwVar.c) && fdbq.f(this.d, ctjwVar.d) && fdbq.f(this.e, ctjwVar.e) && fdbq.f(this.f, ctjwVar.f) && fdbq.f(this.g, ctjwVar.g) && fdbq.f(this.h, ctjwVar.h) && fdbq.f(this.i, ctjwVar.i) && fdbq.f(this.j, ctjwVar.j) && fdbq.f(this.k, ctjwVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ctlz ctlzVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (ctlzVar == null ? 0 : ctlzVar.hashCode())) * 31) + this.e.hashCode()) * 31;
        ctoe ctoeVar = this.f;
        return ((((((((((iHashCode2 + (ctoeVar != null ? ctoeVar.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ContactListUnifiedUiData(favorites=" + this.a + ", contacts=" + this.b + ", headerIndex=" + this.c + ", createGroup=" + this.d + ", chatbotDirectory=" + this.e + ", penpalRow=" + this.f + ", groupChats=" + this.g + ", onContactListScroll=" + this.h + ", onContactListInteractive=" + this.i + ", onActivateFastScroll=" + this.j + ", flags=" + this.k + ")";
    }
}
