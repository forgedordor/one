package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwna extends dwpo {
    public final dwpx a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final boolean e;
    public final long f;
    public final long g;
    public final boolean h;
    public final Map i;
    public final ejwi j;
    public final ekgb k;
    public final long l;
    public final long m;
    public final evqs n;
    public final long o;
    public final long p;

    public dwna(dwpx dwpxVar, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, boolean z, long j, long j2, boolean z2, Map map, ejwi ejwiVar4, ekgb ekgbVar, long j3, long j4, evqs evqsVar, long j5, long j6) {
        this.a = dwpxVar;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = ejwiVar3;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = z2;
        this.i = map;
        this.j = ejwiVar4;
        this.k = ekgbVar;
        this.l = j3;
        this.m = j4;
        this.n = evqsVar;
        this.o = j5;
        this.p = j6;
    }

    @Override // defpackage.dwpo
    public final long a() {
        return this.o;
    }

    @Override // defpackage.dwpo
    public final long b() {
        return this.f;
    }

    @Override // defpackage.dwpo
    public final long c() {
        return this.g;
    }

    @Override // defpackage.dwpo
    public final long d() {
        return this.p;
    }

    @Override // defpackage.dwpo
    public final long e() {
        return this.l;
    }

    @Override // defpackage.dwpo
    public final long f() {
        return this.m;
    }

    @Override // defpackage.dwpo
    public final dwpn g() {
        return new dwmz(this);
    }

    @Override // defpackage.dwpo
    public final dwpx h() {
        return this.a;
    }

    @Override // defpackage.dwpo
    public final ejwi i() {
        return this.d;
    }

    @Override // defpackage.dwpo
    public final ejwi j() {
        return this.c;
    }

    @Override // defpackage.dwpo
    public final ejwi k() {
        return this.j;
    }

    @Override // defpackage.dwpo
    public final ejwi l() {
        return this.b;
    }

    @Override // defpackage.dwpo
    public final ekgb m() {
        return this.k;
    }

    @Override // defpackage.dwpo
    public final evqs n() {
        return this.n;
    }

    @Override // defpackage.dwpo
    public final Map o() {
        return this.i;
    }

    @Override // defpackage.dwpo
    public final boolean p() {
        return this.h;
    }

    @Override // defpackage.dwpo
    public final boolean q() {
        return this.e;
    }

    public final String toString() {
        evqs evqsVar = this.n;
        ekgb ekgbVar = this.k;
        ejwi ejwiVar = this.j;
        Map map = this.i;
        ejwi ejwiVar2 = this.d;
        ejwi ejwiVar3 = this.c;
        ejwi ejwiVar4 = this.b;
        return "Conversation{conversationId=" + this.a.toString() + ", title=" + String.valueOf(ejwiVar4) + ", imageUrl=" + String.valueOf(ejwiVar3) + ", image=" + String.valueOf(ejwiVar2) + ", isImageStale=" + this.e + ", expirationTimeMillis=" + this.f + ", lastDeletedTimeMillis=" + this.g + ", blockable=" + this.h + ", appData=" + map.toString() + ", suggestionList=" + String.valueOf(ejwiVar) + ", capabilities=" + ekgbVar.toString() + ", propertiesExpirationTimeMillis=" + this.l + ", serverTimestampUs=" + this.m + ", conversationContext=" + evqsVar.toString() + ", createdTimestampMs=" + this.o + ", localUpdateTimestampMs=" + this.p + "}";
    }
}
