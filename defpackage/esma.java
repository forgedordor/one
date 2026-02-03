package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esma extends esmk {
    public final Context a;
    public final esog b;
    public final Executor c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final esol g;
    public final String h;
    public final ejxr i;
    public final ejxr j;
    public final esmv k;
    public final int l;
    public final long m;
    public final long n;
    private final diep o;
    private final ejxr p;
    private final ejxr q;

    public esma(Context context, diep diepVar, esog esogVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, esol esolVar, String str, ejxr ejxrVar, ejxr ejxrVar2, ejxr ejxrVar3, ejxr ejxrVar4, esmv esmvVar, int i, long j, long j2) {
        this.a = context;
        this.o = diepVar;
        this.b = esogVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = esolVar;
        this.h = str;
        this.i = ejxrVar;
        this.p = ejxrVar2;
        this.q = ejxrVar3;
        this.j = ejxrVar4;
        this.k = esmvVar;
        this.l = i;
        this.m = j;
        this.n = j2;
    }

    @Override // defpackage.esmk
    public final int a() {
        return this.l;
    }

    @Override // defpackage.esmk
    public final long b() {
        return this.m;
    }

    @Override // defpackage.esmk
    public final long c() {
        return this.n;
    }

    @Override // defpackage.esmk
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.esmk
    public final diep e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        esol esolVar;
        esmv esmvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof esmk) {
            esmk esmkVar = (esmk) obj;
            if (this.a.equals(esmkVar.d()) && this.o.equals(esmkVar.e()) && this.b.equals(esmkVar.k()) && this.c.equals(esmkVar.p()) && this.d.equals(esmkVar.n()) && this.e.equals(esmkVar.o()) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(esmkVar.q()) : esmkVar.q() == null) && ((esolVar = this.g) != null ? esolVar.equals(esmkVar.l()) : esmkVar.l() == null)) {
                esmkVar.t();
                String str = this.h;
                if (str != null ? str.equals(esmkVar.m()) : esmkVar.m() == null) {
                    if (this.i.equals(esmkVar.i()) && this.p.equals(esmkVar.h()) && this.q.equals(esmkVar.g()) && this.j.equals(esmkVar.f()) && ((esmvVar = this.k) != null ? esmvVar.equals(esmkVar.j()) : esmkVar.j() == null)) {
                        esmkVar.s();
                        if (this.l == esmkVar.a() && this.m == esmkVar.b() && this.n == esmkVar.c()) {
                            esmkVar.r();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.esmk
    public final ejxr f() {
        return this.j;
    }

    @Override // defpackage.esmk
    public final ejxr g() {
        return this.q;
    }

    @Override // defpackage.esmk
    public final ejxr h() {
        return this.p;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        esol esolVar = this.g;
        int iHashCode3 = iHashCode2 ^ (esolVar == null ? 0 : esolVar.hashCode());
        String str = this.h;
        int iHashCode4 = ((((((((((iHashCode3 * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        esmv esmvVar = this.k;
        int iHashCode5 = (((iHashCode4 ^ (esmvVar != null ? esmvVar.hashCode() : 0)) * (-721379959)) ^ this.l) * 1000003;
        long j = this.m;
        int i = (iHashCode5 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.n;
        return (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    @Override // defpackage.esmk
    public final ejxr i() {
        return this.i;
    }

    @Override // defpackage.esmk
    public final esmv j() {
        return this.k;
    }

    @Override // defpackage.esmk
    public final esog k() {
        return this.b;
    }

    @Override // defpackage.esmk
    public final esol l() {
        return this.g;
    }

    @Override // defpackage.esmk
    public final String m() {
        return this.h;
    }

    @Override // defpackage.esmk
    public final Executor n() {
        return this.d;
    }

    @Override // defpackage.esmk
    public final Executor o() {
        return this.e;
    }

    @Override // defpackage.esmk
    public final Executor p() {
        return this.c;
    }

    @Override // defpackage.esmk
    public final ScheduledExecutorService q() {
        return this.f;
    }

    public final String toString() {
        esmv esmvVar = this.k;
        ejxr ejxrVar = this.j;
        ejxr ejxrVar2 = this.q;
        ejxr ejxrVar3 = this.p;
        ejxr ejxrVar4 = this.i;
        esol esolVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.c;
        esog esogVar = this.b;
        diep diepVar = this.o;
        return "ChannelConfig{context=" + this.a.toString() + ", clock=" + diepVar.toString() + ", transport=" + esogVar.toString() + ", lightweightExecutor=" + executor3.toString() + ", backgroundExecutor=" + executor2.toString() + ", blockingExecutor=" + executor.toString() + ", lightweightScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=" + String.valueOf(esolVar) + ", rpcCacheProvider=null, userAgentOverride=" + this.h + ", recordNetworkMetricsToPrimes=" + ejxrVar4.toString() + ", recordCachingMetricsToPrimes=" + ejxrVar3.toString() + ", recordBandwidthMetrics=" + ejxrVar2.toString() + ", grpcIdleTimeoutMillis=" + ejxrVar.toString() + ", grpcServiceConfig=" + String.valueOf(esmvVar) + ", consistencyTokenConfig=null, maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.m + ", grpcKeepAliveTimeoutMillis=" + this.n + ", channelCredentials=null}";
    }

    @Override // defpackage.esmk
    public final void r() {
    }

    @Override // defpackage.esmk
    public final void s() {
    }

    @Override // defpackage.esmk
    public final void t() {
    }
}
