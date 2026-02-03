package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzg extends dvzh {
    private final dvyz a;

    public dvzg(dvyz dvyzVar) {
        this.a = dvyzVar;
    }

    @Override // defpackage.dwbc
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbc) {
            dwbc dwbcVar = (dwbc) obj;
            if (dwbcVar.b() == 4 && this.a.equals(dwbcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvzh, defpackage.dwbc
    public final dvyz f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{kickGroupUsers=" + this.a.toString() + "}";
    }
}
