package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhg {
    public final cwhs a;
    public final fdvc b;
    public final fduj c;

    public cwhg(cwhs cwhsVar, fdvc fdvcVar, fduj fdujVar) {
        this.a = cwhsVar;
        this.b = fdvcVar;
        this.c = fdujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhg)) {
            return false;
        }
        cwhg cwhgVar = (cwhg) obj;
        return fdbq.f(this.a, cwhgVar.a) && fdbq.f(this.b, cwhgVar.b) && fdbq.f(this.c, cwhgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConversationDetailsScreenUiData(conversationDetailsUiData=" + this.a + ", popupUiData=" + this.b + ", snackbarUiDataFlow=" + this.c + ")";
    }
}
