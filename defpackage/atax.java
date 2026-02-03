package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atax extends atbb {
    private final atcm a;

    public atax(atcm atcmVar) {
        this.a = atcmVar;
    }

    @Override // defpackage.atbb, defpackage.atbv
    public final atcm a() {
        return this.a;
    }

    @Override // defpackage.atbv
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atbv) {
            atbv atbvVar = (atbv) obj;
            if (atbvVar.b() == 2 && this.a.equals(atbvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{executeHttpRequest=" + this.a.toString() + "}";
    }
}
