package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atcq extends atcr {
    private final ekhe a;

    public atcq(ekhe ekheVar) {
        this.a = ekheVar;
    }

    @Override // defpackage.atdc
    public final int b() {
        return 1;
    }

    @Override // defpackage.atcr, defpackage.atdc
    public final ekhe c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atdc) {
            atdc atdcVar = (atdc) obj;
            if (atdcVar.b() == 1 && this.a.equals(atdcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{httpHeaders=" + this.a.toString() + "}";
    }
}
