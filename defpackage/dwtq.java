package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwtq extends dwts {
    private final dwsu b;

    public dwtq(dwsu dwsuVar) {
        this.b = dwsuVar;
    }

    @Override // defpackage.dwts, defpackage.dwvu
    public final dwsu a() {
        return this.b;
    }

    @Override // defpackage.dwvu
    public final dwvt b() {
        return dwvt.MEDIA_ID;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwvu) {
            dwvu dwvuVar = (dwvu) obj;
            if (dwvt.MEDIA_ID == dwvuVar.b() && this.b.equals(dwvuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaSource{mediaId=" + this.b.toString() + "}";
    }
}
