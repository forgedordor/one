package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwg extends eiwi {
    private final Enum a;

    public eiwg(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.eiwi, defpackage.eixz
    public final Enum a() {
        return this.a;
    }

    @Override // defpackage.eixz
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eixz) {
            eixz eixzVar = (eixz) obj;
            if (eixzVar.b() == 2 && this.a.equals(eixzVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{enumValue=" + this.a.toString() + "}";
    }
}
