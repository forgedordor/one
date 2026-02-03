package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvt {
    public final String a;
    public final List b;
    public final fdae c;
    public final afvs d;

    public afvt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvt)) {
            return false;
        }
        afvt afvtVar = (afvt) obj;
        return fdbq.f(this.a, afvtVar.a) && fdbq.f(this.b, afvtVar.b) && fdbq.f(this.c, afvtVar.c) && fdbq.f(this.d, afvtVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ", flags=" + this.d + ")";
    }

    public afvt(String str, List list, fdae fdaeVar, afvs afvsVar) {
        this.a = str;
        this.b = list;
        this.c = fdaeVar;
        this.d = afvsVar;
    }

    public /* synthetic */ afvt(byte[] bArr) {
        this("", fcvo.a, new fdae() { // from class: afvr
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new afvs((byte[]) null));
    }
}
