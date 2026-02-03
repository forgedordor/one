package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atdq extends atdr {
    private final coiz a;

    public atdq(coiz coizVar) {
        this.a = coizVar;
    }

    @Override // defpackage.atef
    public final int b() {
        return 3;
    }

    @Override // defpackage.atdr, defpackage.atef
    public final coiz d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atef) {
            atef atefVar = (atef) obj;
            if (atefVar.b() == 3 && this.a.equals(atefVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{unsupportedNetwork=" + this.a.toString() + "}";
    }
}
