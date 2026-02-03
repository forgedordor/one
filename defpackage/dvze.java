package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvze extends dvzh {
    private final dwao a;

    public dvze(dwao dwaoVar) {
        this.a = dwaoVar;
    }

    @Override // defpackage.dwbc
    public final int b() {
        return 1;
    }

    @Override // defpackage.dvzh, defpackage.dwbc
    public final dwao d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbc) {
            dwbc dwbcVar = (dwbc) obj;
            if (dwbcVar.b() == 1 && this.a.equals(dwbcVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{changeGroupProfile=" + this.a.toString() + "}";
    }
}
