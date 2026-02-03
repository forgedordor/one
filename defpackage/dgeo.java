package defpackage;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgeo extends dgdq {
    final /* synthetic */ dgfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgeo(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        final dgfg dgfgVar = this.b;
        dgfgVar.G.c();
        if (dgfgVar.l) {
            ebqv ebqvVar = dgfgVar.x;
            String str = dgfgVar.y;
            if (ebqvVar == null || str == null) {
                dhja.h(dgfgVar.m, "SipTransport or Public User Identity is null.", new Object[0]);
                dgfgVar.w(dgfgVar.ag);
                return;
            }
            dfzx dfzxVarI = dfzy.i();
            dfzxVarI.g(ebqvVar.e());
            ((dfzv) dfzxVarI).b = str;
            dfzxVarI.e(ebqvVar.o() ? ebmr.TLS : ebqvVar.n() ? ebmr.TCP : ebmr.UDP);
            dfzxVarI.c(ebqvVar.a());
            dfzxVarI.b(dgfgVar.C);
            dgfgVar.s.a = dfzxVarI.a();
        }
        ebky ebkyVar = dgfgVar.v;
        if (ebkyVar != null) {
            dhip dhipVar = dgfgVar.m;
            final String strB = ejwk.b(ebkyVar.a);
            dhja.d(dhipVar, "Notify Registered. CallId=%s", strB);
            ScheduledExecutorService scheduledExecutorService = dgfgVar.R;
            scheduledExecutorService.execute(new Runnable() { // from class: dgdl
                @Override // java.lang.Runnable
                public final void run() {
                    Stream stream = Collection.EL.stream(dgfgVar.P);
                    final String str2 = strB;
                    stream.forEach(new Consumer() { // from class: dgcu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            dfny dfnyVar = dgfg.d;
                            ((dfyw) obj).j(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            scheduledExecutorService.execute(new Runnable() { // from class: dgdm
                @Override // java.lang.Runnable
                public final void run() {
                    Collection.EL.stream(dgfgVar.O).forEach(new Consumer() { // from class: dgdk
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            dfny dfnyVar = dgfg.d;
                            ((dfzi) obj).h();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            dgfgVar.p.e(dgfgVar.z, dgfgVar.C);
        }
        dgfgVar.K();
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void c() {
        super.c();
        final dgfg dgfgVar = this.b;
        dgfgVar.z();
        dgfgVar.p(14);
        dgfgVar.L.c();
        if (dgfgVar.l) {
            dgfgVar.s.c();
        }
        final dezf dezfVar = dgfgVar.D;
        dhja.d(dgfgVar.m, "Notify Terminated. reason=%s", dezfVar);
        ScheduledExecutorService scheduledExecutorService = dgfgVar.R;
        scheduledExecutorService.execute(new Runnable() { // from class: dgdd
            @Override // java.lang.Runnable
            public final void run() {
                Collection.EL.stream(dgfgVar.P).forEach(new Consumer() { // from class: dgde
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfyw) obj).l();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
        scheduledExecutorService.execute(new Runnable() { // from class: dgdf
            @Override // java.lang.Runnable
            public final void run() {
                Stream stream = Collection.EL.stream(dgfgVar.O);
                final dezf dezfVar2 = dezfVar;
                stream.forEach(new Consumer() { // from class: dgcw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dgfg.d;
                        ((dfzi) obj).i(dezfVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            int i2 = message.arg1;
            NetworkInfo networkInfo = (NetworkInfo) message.obj;
            dgfg dgfgVar = this.a;
            if (dgfgVar.l) {
                dhja.d(dgfgVar.m, "Using network callback for connectivity detection, ignore Connectivity Events.", new Object[0]);
            } else {
                dhip dhipVar = dgfgVar.m;
                dhja.p(dhipVar, "state=%d activeNetworkInfo=%s:", Integer.valueOf(i2), networkInfo);
                if (((Boolean) dgfg.h.a()).booleanValue() || networkInfo != null) {
                    if (i2 == 1) {
                        if (networkInfo != null) {
                            dfzr dfzrVar = dgfgVar.q;
                            dfzrVar.c();
                            dfyu dfyuVarA = dfzrVar.a();
                            if (dfyuVarA == null) {
                                dhja.l(dhipVar, "No network for RCS.", new Object[0]);
                                dgfgVar.N(dezf.NETWORK_ERROR);
                                dgfgVar.w(dgfgVar.ah);
                            } else if (dfyuVarA.c() != super.f()) {
                                dhja.l(dhipVar, "Preferred network changed. Re-registering.", new Object[0]);
                                dgfgVar.s(9, dezf.NETWORK_CHANGE);
                            }
                        }
                    } else if (networkInfo == null || super.f() == networkInfo.getType()) {
                        dhja.l(dhipVar, "Network is lost. type:%d", Integer.valueOf(super.f()));
                        dgfgVar.N(dezf.NETWORK_ERROR);
                        dgfgVar.w(dgfgVar.ah);
                    }
                }
            }
            return true;
        }
        if (i == 5) {
            Bundle bundle = (Bundle) message.obj;
            this.b.C(bundle.getString("transport_id"), (Throwable) bundle.getSerializable("transport_error_cause"));
            return true;
        }
        if (i == 8 || i == 9) {
            dgfg dgfgVar2 = this.b;
            dgfgVar2.N(message.obj);
            dhja.d(dgfgVar2.m, "Deregistering. reason=%s", dgfgVar2.D);
            if (dezf.NETWORK_ERROR.equals(message.obj) || dezf.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(message.obj)) {
                dgfgVar2.w(dgfgVar2.ah);
                return true;
            }
            dgfgVar2.w(dgfgVar2.ag);
            return true;
        }
        if (i == 14) {
            dgfg dgfgVar3 = this.b;
            dgfgVar3.w(dgfgVar3.ae);
            return true;
        }
        if (i == 17) {
            dgfg dgfgVar4 = this.b;
            dgfgVar4.N(dezf.SIM_REMOVED);
            dgfgVar4.w(dgfgVar4.ag);
            return true;
        }
        if (i != 21) {
            return super.e(message);
        }
        dgfg dgfgVar5 = this.b;
        dhja.r(dgfgVar5.m, "Network is lost.", new Object[0]);
        dgfgVar5.O();
        dgfgVar5.N(dezf.NETWORK_ERROR);
        dgfgVar5.w(dgfgVar5.ah);
        return true;
    }
}
