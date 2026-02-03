package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efco extends effi {
    private final String a;
    private final int b;

    public efco(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.effi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.effi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof effi) {
            effi effiVar = (effi) obj;
            if (this.b == effiVar.b() && this.a.equals(effiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
