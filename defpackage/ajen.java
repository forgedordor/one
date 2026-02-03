package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajen extends ajfw {
    private final dzfh a;
    private final int b;

    public ajen(dzfh dzfhVar, int i) {
        if (dzfhVar == null) {
            throw new NullPointerException("Null eventName");
        }
        this.a = dzfhVar;
        this.b = i;
    }

    @Override // defpackage.ajfw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ajfw
    public final dzfh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajfw) {
            ajfw ajfwVar = (ajfw) obj;
            if (this.a.equals(ajfwVar.b()) && this.b == ajfwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "TraceSectionKey{eventName=" + this.a.a + ", cookie=" + this.b + "}";
    }
}
