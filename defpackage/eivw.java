package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eivw extends eivx {
    private final Enum a;

    public eivw(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.eivx, defpackage.eiwc
    public final Enum a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eiwc) {
            eiwc eiwcVar = (eiwc) obj;
            eiwcVar.b();
            if (this.a.equals(eiwcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PossibleValue{enumValue=" + this.a.toString() + "}";
    }

    @Override // defpackage.eiwc
    public final void b() {
    }
}
