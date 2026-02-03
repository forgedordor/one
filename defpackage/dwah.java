package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwah extends dwbg {
    public final dwpx a;
    public final dwaz b;

    public dwah(dwpx dwpxVar, dwaz dwazVar) {
        this.a = dwpxVar;
        this.b = dwazVar;
    }

    @Override // defpackage.dwbg
    public final dwaz a() {
        return this.b;
    }

    @Override // defpackage.dwbg
    public final dwpx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwbg) {
            dwbg dwbgVar = (dwbg) obj;
            if (this.a.equals(dwbgVar.b()) && this.b.equals(dwbgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dwaz dwazVar = this.b;
        return "SessionProfileUpdate{conversationId=" + this.a.toString() + ", profileInfo=" + dwazVar.toString() + "}";
    }
}
