package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmr extends dwoz {
    public final int a;
    public final dwoy b;

    public dwmr(int i, dwoy dwoyVar) {
        this.a = i;
        this.b = dwoyVar;
    }

    @Override // defpackage.dwoz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwoz
    public final dwoy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwoz) {
            dwoz dwozVar = (dwoz) obj;
            if (this.a == dwozVar.a() && this.b.equals(dwozVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CloudAnnotation{type=" + this.a + ", metadata=" + this.b.toString() + "}";
    }
}
