package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtu extends dwtx {
    private final dwvh b;

    public dwtu(dwvh dwvhVar) {
        this.b = dwvhVar;
    }

    @Override // defpackage.dwtx, defpackage.dwvx
    public final dwvh a() {
        return this.b;
    }

    @Override // defpackage.dwvx
    public final dwvw b() {
        return dwvw.CARD_CAROUSEL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwvx) {
            dwvx dwvxVar = (dwvx) obj;
            if (dwvw.CARD_CAROUSEL == dwvxVar.b() && this.b.equals(dwvxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{cardCarousel=" + this.b.toString() + "}";
    }
}
