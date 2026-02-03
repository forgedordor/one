package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlj extends dwll {
    private final int a;

    public dwlj(int i) {
        this.a = i;
    }

    @Override // defpackage.dwrq
    public final dwrs a() {
        return dwrs.INDENTATION;
    }

    @Override // defpackage.dwll, defpackage.dwrq
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrq) {
            dwrq dwrqVar = (dwrq) obj;
            if (dwrs.INDENTATION == dwrqVar.a() && this.a == dwrqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "LineStyle{indentation=" + this.a + "}";
    }
}
