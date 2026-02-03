package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzc extends dvzh {
    private final dvyz a;

    public dvzc(dvyz dvyzVar) {
        this.a = dvyzVar;
    }

    @Override // defpackage.dvzh, defpackage.dwbc
    public final dvyz a() {
        return this.a;
    }

    @Override // defpackage.dwbc
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbc) {
            dwbc dwbcVar = (dwbc) obj;
            if (dwbcVar.b() == 3 && this.a.equals(dwbcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{addGroupUsers=" + this.a.toString() + "}";
    }
}
