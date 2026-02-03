package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atay extends atbb {
    private final atbq a;

    public atay(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.atbv
    public final int b() {
        return 4;
    }

    @Override // defpackage.atbb, defpackage.atbv
    public final atbq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atbv) {
            atbv atbvVar = (atbv) obj;
            if (atbvVar.b() == 4 && this.a.equals(atbvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithFailure=" + this.a.toString() + "}";
    }
}
