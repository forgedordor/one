package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuce {
    public final djkj a;
    public final ctye b;

    public cuce(djkj djkjVar, ctye ctyeVar) {
        ctyeVar.getClass();
        this.a = djkjVar;
        this.b = ctyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuce)) {
            return false;
        }
        cuce cuceVar = (cuce) obj;
        return fdbq.f(this.a, cuceVar.a) && fdbq.f(this.b, cuceVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AutoCompleteContactBarUiData(contactBarUiData=" + this.a + ", contactSuggestionListUiData=" + this.b + ")";
    }
}
