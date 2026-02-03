package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atcp extends atcr {
    private final atbq a;

    public atcp(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.atcr, defpackage.atdc
    public final atbq a() {
        return this.a;
    }

    @Override // defpackage.atdc
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atdc) {
            atdc atdcVar = (atdc) obj;
            if (atdcVar.b() == 2 && this.a.equals(atdcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{error=" + this.a.toString() + "}";
    }
}
