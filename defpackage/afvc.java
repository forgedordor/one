package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvc implements afwv {
    public final djyu a;
    private final String b;
    private final afvc c = this;

    public afvc(String str, djyu djyuVar) {
        this.b = str;
        this.a = djyuVar;
    }

    @Override // defpackage.afwv
    public final afvc a() {
        return this.c;
    }

    @Override // defpackage.afwv
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvc)) {
            return false;
        }
        afvc afvcVar = (afvc) obj;
        return fdbq.f(this.b, afvcVar.b) && fdbq.f(this.a, afvcVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "BasicSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
