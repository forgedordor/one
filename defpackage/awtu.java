package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awtu extends axft {
    private final String a;
    private final axcm b;

    public awtu(String str, axcm axcmVar) {
        if (str == null) {
            throw new NullPointerException("Null rowId");
        }
        this.a = str;
        if (axcmVar == null) {
            throw new NullPointerException("Null token");
        }
        this.b = axcmVar;
    }

    @Override // defpackage.axft
    public final axcm a() {
        return this.b;
    }

    @Override // defpackage.axft
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axft) {
            axft axftVar = (axft) obj;
            if (this.a.equals(axftVar.b()) && this.b.equals(axftVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RowIdAndTokenPair{rowId=" + this.a + ", token=" + this.b.toString() + "}";
    }
}
