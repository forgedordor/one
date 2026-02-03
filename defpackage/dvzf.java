package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzf extends dvzh {
    private final dwat a;

    public dvzf(dwat dwatVar) {
        this.a = dwatVar;
    }

    @Override // defpackage.dwbc
    public final int b() {
        return 5;
    }

    @Override // defpackage.dvzh, defpackage.dwbc
    public final dwat e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbc) {
            dwbc dwbcVar = (dwbc) obj;
            if (dwbcVar.b() == 5 && this.a.equals(dwbcVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{createGroup=" + this.a.toString() + "}";
    }
}
