package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkr extends dwks {
    private static final long serialVersionUID = 0;
    private final dwpk a;

    public dwkr(dwpk dwpkVar) {
        this.a = dwpkVar;
    }

    @Override // defpackage.dwpw
    public final dwpu b() {
        return dwpu.ONE_TO_ONE;
    }

    @Override // defpackage.dwks, defpackage.dwpw
    public final dwpk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwpw) {
            dwpw dwpwVar = (dwpw) obj;
            if (dwpu.ONE_TO_ONE == dwpwVar.b() && this.a.equals(dwpwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{oneToOne=" + this.a.toString() + "}";
    }
}
