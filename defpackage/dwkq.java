package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkq extends dwks {
    private static final long serialVersionUID = 0;
    private final dwpr a;

    public dwkq(dwpr dwprVar) {
        this.a = dwprVar;
    }

    @Override // defpackage.dwks, defpackage.dwpw
    public final dwpr a() {
        return this.a;
    }

    @Override // defpackage.dwpw
    public final dwpu b() {
        return dwpu.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwpw) {
            dwpw dwpwVar = (dwpw) obj;
            if (dwpu.GROUP == dwpwVar.b() && this.a.equals(dwpwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{group=" + this.a.toString() + "}";
    }
}
