package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmg extends dwjr {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;
    private final long e;
    private final dwji f;
    private final dwji g;

    public dwmg(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, long j, dwji dwjiVar, dwji dwjiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
        this.e = j;
        this.f = dwjiVar;
        this.g = dwjiVar2;
    }

    @Override // defpackage.dwjr
    public final long a() {
        return this.e;
    }

    @Override // defpackage.dwjr
    public final dwji b() {
        return this.f;
    }

    @Override // defpackage.dwjr
    public final dwji c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwjr) {
            dwjr dwjrVar = (dwjr) obj;
            if (this.a.equals(dwjrVar.l()) && this.b.equals(dwjrVar.j()) && this.c.equals(dwjrVar.h()) && this.d.equals(dwjrVar.g()) && this.e == dwjrVar.a() && this.f.equals(dwjrVar.b()) && this.g.equals(dwjrVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwjr
    public final ejwi g() {
        return this.d;
    }

    @Override // defpackage.dwjr
    public final ejwi h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.dwjr
    public final ejwi j() {
        return this.b;
    }

    @Override // defpackage.dwjr
    public final ejwi l() {
        return this.a;
    }

    public final String toString() {
        dwji dwjiVar = this.g;
        dwji dwjiVar2 = this.f;
        ejwi ejwiVar = this.d;
        ejwi ejwiVar2 = this.c;
        ejwi ejwiVar3 = this.b;
        return "Action{traceId=" + String.valueOf(this.a) + ", messageId=" + String.valueOf(ejwiVar3) + ", eventCallbackPayload=" + String.valueOf(ejwiVar2) + ", eventCallbackDestination=" + String.valueOf(ejwiVar) + ", actionTriggeredLogId=" + this.e + ", actionPayload=" + dwjiVar2.toString() + ", eventCallbackFailureActionPayload=" + dwjiVar.toString() + "}";
    }
}
