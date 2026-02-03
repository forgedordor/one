package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzh implements cubn {
    public final djyu a;
    private final String b;
    private final ctzh c = this;

    public ctzh(String str, djyu djyuVar) {
        this.b = str;
        this.a = djyuVar;
    }

    @Override // defpackage.cubn
    public final ctzh a() {
        return this.c;
    }

    @Override // defpackage.cubn
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctzh)) {
            return false;
        }
        ctzh ctzhVar = (ctzh) obj;
        return fdbq.f(this.b, ctzhVar.b) && fdbq.f(this.a, ctzhVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ContactSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
