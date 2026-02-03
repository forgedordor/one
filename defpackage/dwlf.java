package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlf extends dwlh {
    private final dwqs a;

    public dwlf(dwqs dwqsVar) {
        this.a = dwqsVar;
    }

    @Override // defpackage.dwqt
    public final dwqv a() {
        return dwqv.OVERLAY;
    }

    @Override // defpackage.dwlh, defpackage.dwqt
    public final dwqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqt) {
            dwqt dwqtVar = (dwqt) obj;
            if (dwqv.OVERLAY == dwqtVar.a() && this.a.equals(dwqtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingDetails{overlay=" + this.a.toString() + "}";
    }
}
