package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwko extends dwkp {
    public final dwrc a;

    public dwko(dwrc dwrcVar) {
        this.a = dwrcVar;
    }

    @Override // defpackage.dwkp, defpackage.dwoy
    public final dwrc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwoy) {
            dwoy dwoyVar = (dwoy) obj;
            dwoyVar.b();
            if (this.a.equals(dwoyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Metadata{receiptMetadata=" + this.a.toString() + "}";
    }

    @Override // defpackage.dwoy
    public final void b() {
    }
}
