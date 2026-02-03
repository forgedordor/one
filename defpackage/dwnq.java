package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnq extends dwqw {
    public final String a;
    public final dwpk b;
    public final dwpx c;
    public final long d;
    public final ejwi e;
    public final dwqo f;
    public final dwqq g;
    public final ejwi h;
    public final ekgp i;
    public final int j;
    public final dwqt k;
    public final int l;
    public final int m;
    public final evqs n;
    public final ejwi o;
    public final ekgb p;
    public final ekgp q;
    public final int r;

    public dwnq(String str, int i, dwpk dwpkVar, dwpx dwpxVar, long j, ejwi ejwiVar, dwqo dwqoVar, dwqq dwqqVar, ejwi ejwiVar2, ekgp ekgpVar, int i2, dwqt dwqtVar, int i3, int i4, evqs evqsVar, ejwi ejwiVar3, ekgb ekgbVar, ekgp ekgpVar2) {
        this.a = str;
        this.r = i;
        this.b = dwpkVar;
        this.c = dwpxVar;
        this.d = j;
        this.e = ejwiVar;
        this.f = dwqoVar;
        this.g = dwqqVar;
        this.h = ejwiVar2;
        this.i = ekgpVar;
        this.j = i2;
        this.k = dwqtVar;
        this.l = i3;
        this.m = i4;
        this.n = evqsVar;
        this.o = ejwiVar3;
        this.p = ekgbVar;
        this.q = ekgpVar2;
    }

    @Override // defpackage.dwqw
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dwqw
    public final int b() {
        return this.m;
    }

    @Override // defpackage.dwqw
    public final int c() {
        return this.l;
    }

    @Override // defpackage.dwqw
    public final long d() {
        return this.d;
    }

    @Override // defpackage.dwqw
    public final dwpk e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqw) {
            dwqw dwqwVar = (dwqw) obj;
            if (this.a.equals(dwqwVar.r()) && this.r == dwqwVar.s() && this.b.equals(dwqwVar.e()) && this.c.equals(dwqwVar.f()) && this.d == dwqwVar.d() && this.e.equals(dwqwVar.k()) && this.f.equals(dwqwVar.h()) && this.g.equals(dwqwVar.i()) && this.h.equals(dwqwVar.m()) && this.i.equals(dwqwVar.o()) && this.j == dwqwVar.a() && this.k.equals(dwqwVar.j()) && this.l == dwqwVar.c() && this.m == dwqwVar.b() && this.n.equals(dwqwVar.q()) && this.o.equals(dwqwVar.l()) && ekjz.h(this.p, dwqwVar.n()) && ekmi.m(this.q, dwqwVar.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwqw
    public final dwpx f() {
        return this.c;
    }

    @Override // defpackage.dwqw
    public final dwqk g() {
        return new dwnp(this);
    }

    @Override // defpackage.dwqw
    public final dwqo h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.r) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((((((((((((((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.dwqw
    public final dwqq i() {
        return this.g;
    }

    @Override // defpackage.dwqw
    public final dwqt j() {
        return this.k;
    }

    @Override // defpackage.dwqw
    public final ejwi k() {
        return this.e;
    }

    @Override // defpackage.dwqw
    public final ejwi l() {
        return this.o;
    }

    @Override // defpackage.dwqw
    public final ejwi m() {
        return this.h;
    }

    @Override // defpackage.dwqw
    public final ekgb n() {
        return this.p;
    }

    @Override // defpackage.dwqw
    public final ekgp o() {
        return this.i;
    }

    @Override // defpackage.dwqw
    public final ekgp p() {
        return this.q;
    }

    @Override // defpackage.dwqw
    public final evqs q() {
        return this.n;
    }

    @Override // defpackage.dwqw
    public final String r() {
        return this.a;
    }

    @Override // defpackage.dwqw
    public final int s() {
        return this.r;
    }

    public final String toString() {
        String str = this.r != 1 ? "OUTGOING" : "INCOMING";
        dwpk dwpkVar = this.b;
        dwpx dwpxVar = this.c;
        ejwi ejwiVar = this.e;
        dwqo dwqoVar = this.f;
        dwqq dwqqVar = this.g;
        ejwi ejwiVar2 = this.h;
        ekgp ekgpVar = this.i;
        dwqt dwqtVar = this.k;
        evqs evqsVar = this.n;
        ejwi ejwiVar3 = this.o;
        ekgb ekgbVar = this.p;
        ekgp ekgpVar2 = this.q;
        return "Message{messageId=" + this.a + ", messageType=" + str + ", sender=" + dwpkVar.toString() + ", conversationId=" + dwpxVar.toString() + ", serverTimestampUs=" + this.d + ", fallback=" + String.valueOf(ejwiVar) + ", messageContent=" + dwqoVar.toString() + ", messageStatus=" + dwqqVar.toString() + ", snippet=" + String.valueOf(ejwiVar2) + ", metadata=" + ekgpVar.toString() + ", capability=" + this.j + ", renderingDetails=" + dwqtVar.toString() + ", intendedRenderingType=" + this.l + ", filterableFlags=" + this.m + ", conversationContext=" + evqsVar.toString() + ", featureType=" + String.valueOf(ejwiVar3) + ", activeDecorationIds=" + ekgbVar.toString() + ", possibleDecorations=" + ekmi.g(ekgpVar2) + "}";
    }
}
