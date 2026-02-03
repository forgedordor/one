package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtv extends dwtx {
    private final dwvz b;

    public dwtv(dwvz dwvzVar) {
        this.b = dwvzVar;
    }

    @Override // defpackage.dwvx
    public final dwvw b() {
        return dwvw.STACK_CARD;
    }

    @Override // defpackage.dwtx, defpackage.dwvx
    public final dwvz c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwvx) {
            dwvx dwvxVar = (dwvx) obj;
            if (dwvw.STACK_CARD == dwvxVar.b() && this.b.equals(dwvxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{stackCard=" + this.b.toString() + "}";
    }
}
