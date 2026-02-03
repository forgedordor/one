package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmi extends esof {
    public final Context a;
    public final URI b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final String f;
    public final ejxr g;
    public final esmv h;
    public final Integer i;
    public final Integer j;
    public final long k;
    public final int l;
    public final long m;
    private final Executor o;
    private final long p;

    public esmi(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, String str, ejxr ejxrVar, esmv esmvVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.a = context;
        this.b = uri;
        this.o = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = str;
        this.g = ejxrVar;
        this.h = esmvVar;
        this.i = num;
        this.j = num2;
        this.k = j;
        this.l = i;
        this.p = j2;
        this.m = j3;
    }

    @Override // defpackage.esof
    public final int a() {
        return this.l;
    }

    @Override // defpackage.esof
    public final long b() {
        return this.k;
    }

    @Override // defpackage.esof
    public final long c() {
        return this.p;
    }

    @Override // defpackage.esof
    public final long d() {
        return this.m;
    }

    @Override // defpackage.esof
    public final Context e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        esmv esmvVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof esof) {
            esof esofVar = (esof) obj;
            if (this.a.equals(esofVar.e()) && this.b.equals(esofVar.k()) && this.o.equals(esofVar.l()) && this.c.equals(esofVar.m()) && this.d.equals(esofVar.n()) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(esofVar.o()) : esofVar.o() == null) && ((str = this.f) != null ? str.equals(esofVar.j()) : esofVar.j() == null) && this.g.equals(esofVar.f()) && ((esmvVar = this.h) != null ? esmvVar.equals(esofVar.g()) : esofVar.g() == null) && ((num = this.i) != null ? num.equals(esofVar.i()) : esofVar.i() == null) && ((num2 = this.j) != null ? num2.equals(esofVar.h()) : esofVar.h() == null) && this.k == esofVar.b() && this.l == esofVar.a() && this.p == esofVar.c() && this.m == esofVar.d()) {
                esofVar.p();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.esof
    public final ejxr f() {
        return this.g;
    }

    @Override // defpackage.esof
    public final esmv g() {
        return this.h;
    }

    @Override // defpackage.esof
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        String str = this.f;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        esmv esmvVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (esmvVar == null ? 0 : esmvVar.hashCode())) * 1000003;
        Integer num = this.i;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.j;
        int iHashCode6 = num2 != null ? num2.hashCode() : 0;
        long j = this.k;
        int i = (((((iHashCode5 ^ iHashCode6) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j2 = this.p;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.m;
        return (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    @Override // defpackage.esof
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.esof
    public final String j() {
        return this.f;
    }

    @Override // defpackage.esof
    public final URI k() {
        return this.b;
    }

    @Override // defpackage.esof
    public final Executor l() {
        return this.o;
    }

    @Override // defpackage.esof
    public final Executor m() {
        return this.c;
    }

    @Override // defpackage.esof
    public final Executor n() {
        return this.d;
    }

    @Override // defpackage.esof
    public final ScheduledExecutorService o() {
        return this.e;
    }

    public final String toString() {
        esmv esmvVar = this.h;
        ejxr ejxrVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.e;
        Executor executor = this.d;
        Executor executor2 = this.c;
        Executor executor3 = this.o;
        URI uri = this.b;
        return "TransportConfig{applicationContext=" + String.valueOf(this.a) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.f + ", recordNetworkMetricsToPrimes=" + String.valueOf(ejxrVar) + ", grpcServiceConfig=" + String.valueOf(esmvVar) + ", trafficStatsUid=" + this.i + ", trafficStatsTag=" + this.j + ", grpcIdleTimeoutMillis=" + this.k + ", maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    @Override // defpackage.esof
    public final void p() {
    }
}
