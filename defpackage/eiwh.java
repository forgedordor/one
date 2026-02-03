package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwh extends eiwi {
    private final String a;

    public eiwh(String str) {
        this.a = str;
    }

    @Override // defpackage.eixz
    public final int b() {
        return 1;
    }

    @Override // defpackage.eiwi, defpackage.eixz
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eixz) {
            eixz eixzVar = (eixz) obj;
            if (eixzVar.b() == 1 && this.a.equals(eixzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringOrEnumValue{stringValue=" + this.a + "}";
    }
}
