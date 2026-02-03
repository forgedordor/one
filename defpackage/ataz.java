package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ataz extends atbb {
    private final atbt a;

    public ataz(atbt atbtVar) {
        this.a = atbtVar;
    }

    @Override // defpackage.atbv
    public final int b() {
        return 3;
    }

    @Override // defpackage.atbb, defpackage.atbv
    public final atbt d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atbv) {
            atbv atbvVar = (atbv) obj;
            if (atbvVar.b() == 3 && this.a.equals(atbvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithHttpResponse=" + this.a.toString() + "}";
    }
}
