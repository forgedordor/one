package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctye {
    public final String a;
    public final List b;
    public final fdae c;
    public final String d;
    public final ctqg e;
    public final ctyd f;
    public final fdae g;

    public ctye() {
        this((String) null, (List) null, (fdae) null, (String) null, (ctyd) null, (fdae) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctye)) {
            return false;
        }
        ctye ctyeVar = (ctye) obj;
        return fdbq.f(this.a, ctyeVar.a) && fdbq.f(this.b, ctyeVar.b) && fdbq.f(this.c, ctyeVar.c) && fdbq.f(this.d, ctyeVar.d) && fdbq.f(this.e, ctyeVar.e) && fdbq.f(this.f, ctyeVar.f) && fdbq.f(this.g, ctyeVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        ctqg ctqgVar = this.e;
        int iHashCode3 = (((iHashCode2 + (ctqgVar == null ? 0 : ctqgVar.hashCode())) * 31) + this.f.hashCode()) * 31;
        fdae fdaeVar = this.g;
        return iHashCode3 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ", a11ySuggestionsTitle=" + this.d + ", emergencyRowUiData=" + this.e + ", flags=" + this.f + ", onShowingRcsCapabilitiesComplete=" + this.g + ")";
    }

    public ctye(String str, List list, fdae fdaeVar, String str2, ctqg ctqgVar, ctyd ctydVar, fdae fdaeVar2) {
        str.getClass();
        list.getClass();
        fdaeVar.getClass();
        ctydVar.getClass();
        this.a = str;
        this.b = list;
        this.c = fdaeVar;
        this.d = str2;
        this.e = ctqgVar;
        this.f = ctydVar;
        this.g = fdaeVar2;
    }

    public /* synthetic */ ctye(String str, List list, fdae fdaeVar, String str2, ctyd ctydVar, fdae fdaeVar2, int i) {
        this(1 == (i & 1) ? "" : str, (i & 2) != 0 ? fcvo.a : list, (i & 4) != 0 ? new fdae() { // from class: ctyb
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, (i & 8) != 0 ? null : str2, (ctqg) null, (i & 32) != 0 ? new ctyd(null) : ctydVar, (i & 64) != 0 ? null : fdaeVar2);
    }
}
