package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxf extends dwxh {
    private final dwpr a;

    public dwxf(dwpr dwprVar) {
        this.a = dwprVar;
    }

    @Override // defpackage.dwxh, defpackage.dwxj
    public final dwpr a() {
        return this.a;
    }

    @Override // defpackage.dwxj
    public final dwpu b() {
        return dwpu.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwxj) {
            dwxj dwxjVar = (dwxj) obj;
            if (dwpu.GROUP == dwxjVar.b() && this.a.equals(dwxjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockId{group=" + this.a.toString() + "}";
    }
}
