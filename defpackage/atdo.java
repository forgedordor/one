package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atdo extends atdr {
    private final atbq a;

    public atdo(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.atdr, defpackage.atef
    public final atbq a() {
        return this.a;
    }

    @Override // defpackage.atef
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atef) {
            atef atefVar = (atef) obj;
            if (atefVar.b() == 2 && this.a.equals(atefVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadFailure=" + this.a.toString() + "}";
    }
}
