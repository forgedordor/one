package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjm {
    public final String a;
    public final qbo b;
    public final pzs c;
    public final long d;
    public final long e;
    public final long f;
    public final pzj g;
    public final int h;
    public final pza i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public qjm(String str, qbo qboVar, pzs pzsVar, long j, long j2, long j3, pzj pzjVar, int i, pza pzaVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        qboVar.getClass();
        pzsVar.getClass();
        pzaVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = qboVar;
        this.c = pzsVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = pzjVar;
        this.h = i;
        this.i = pzaVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjm)) {
            return false;
        }
        qjm qjmVar = (qjm) obj;
        return fdbq.f(this.a, qjmVar.a) && this.b == qjmVar.b && fdbq.f(this.c, qjmVar.c) && this.d == qjmVar.d && this.e == qjmVar.e && this.f == qjmVar.f && fdbq.f(this.g, qjmVar.g) && this.h == qjmVar.h && this.i == qjmVar.i && this.j == qjmVar.j && this.k == qjmVar.k && this.l == qjmVar.l && this.m == qjmVar.m && this.n == qjmVar.n && this.o == qjmVar.o && fdbq.f(this.p, qjmVar.p) && fdbq.f(this.q, qjmVar.q);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        pzj pzjVar = this.g;
        long j = this.f;
        int iA = (((((((((((iHashCode * 31) + qjl.a(this.d)) * 31) + qjl.a(this.e)) * 31) + qjl.a(j)) * 31) + pzjVar.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        List list = this.p;
        long j2 = this.n;
        return (((((((((((((((iA * 31) + qjl.a(this.j)) * 31) + qjl.a(this.k)) * 31) + this.l) * 31) + this.m) * 31) + qjl.a(j2)) * 31) + this.o) * 31) + list.hashCode()) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
