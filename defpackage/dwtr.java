package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwtr extends dwts {
    private final String b;

    public dwtr(String str) {
        this.b = str;
    }

    @Override // defpackage.dwvu
    public final dwvt b() {
        return dwvt.URL;
    }

    @Override // defpackage.dwts, defpackage.dwvu
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwvu) {
            dwvu dwvuVar = (dwvu) obj;
            if (dwvt.URL == dwvuVar.b() && this.b.equals(dwvuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaSource{url=" + this.b + "}";
    }
}
