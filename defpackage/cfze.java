package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.net.tachyonreceiver.PullMessagesWorker;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfze {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver");
    public final Context b;
    public final ejxr c;
    public final ejxr d;
    public final ejxr e;
    public volatile boolean f = false;
    private final eosc g;

    public cfze(Context context, final fcsu fcsuVar, final cfrx cfrxVar, final cfgy cfgyVar, final cfpl cfplVar, eosc eoscVar, final cedp cedpVar, final int i, final Optional optional, final Duration duration, final Duration duration2, final int i2, final int i3, final boolean z, final boolean z2, final boolean z3) {
        this.b = context;
        this.g = eoscVar;
        this.c = ejxx.a(new ejxr() { // from class: cfyy
            @Override // defpackage.ejxr
            public final Object get() {
                cepf cepfVar = (cepf) fcsuVar.b();
                cfrx cfrxVar2 = cfrxVar;
                Map map = (Map) cfrxVar2.a.b();
                map.getClass();
                Map map2 = (Map) cfrxVar2.b.b();
                map2.getClass();
                cenj cenjVar = (cenj) cfrxVar2.c.b();
                cenjVar.getClass();
                eosd eosdVar = (eosd) cfrxVar2.d.b();
                eosdVar.getClass();
                fdjx fdjxVar = (fdjx) cfrxVar2.e.b();
                fdjxVar.getClass();
                cogw cogwVar = (cogw) cfrxVar2.f.b();
                cogwVar.getClass();
                ains ainsVar = (ains) cfrxVar2.g.b();
                ainsVar.getClass();
                cepfVar.getClass();
                cedp cedpVar2 = cedpVar;
                cedpVar2.getClass();
                return new cfrw(map, map2, cenjVar, eosdVar, fdjxVar, cogwVar, ainsVar, cfrxVar2.h, cepfVar, cedpVar2);
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: cfyz
            @Override // defpackage.ejxr
            public final Object get() {
                cfrl cfrlVar = (cfrl) this.a.c.get();
                cepf cepfVar = (cepf) fcsuVar.b();
                cfpl cfplVar2 = cfplVar;
                cenj cenjVar = (cenj) cfplVar2.a.b();
                cenjVar.getClass();
                eosc eoscVar2 = (eosc) cfplVar2.b.b();
                eoscVar2.getClass();
                cfrlVar.getClass();
                cepfVar.getClass();
                cedp cedpVar2 = cedpVar;
                cedpVar2.getClass();
                return new cfpk(cenjVar, eoscVar2, cfplVar2.c, cfrlVar, cepfVar, cedpVar2, z, emjc.a(i));
            }
        });
        this.d = ejxx.a(new ejxr() { // from class: cfza
            @Override // defpackage.ejxr
            public final Object get() {
                cfze cfzeVar = this.a;
                cfrl cfrlVar = (cfrl) cfzeVar.c.get();
                cepf cepfVar = (cepf) fcsuVar.b();
                Optional optionalOf = z3 ? Optional.of(cfzeVar.e) : Optional.empty();
                int i4 = i;
                cedp cedpVar2 = cedpVar;
                cfhn cfhnVar = (cfhn) cfgyVar;
                cenj cenjVar = (cenj) cfhnVar.b.b();
                cenjVar.getClass();
                ains ainsVar = (ains) cfhnVar.e.b();
                ainsVar.getClass();
                eosd eosdVar = (eosd) cfhnVar.g.b();
                eosdVar.getClass();
                eosc eoscVar2 = (eosc) cfhnVar.h.b();
                eoscVar2.getClass();
                cogw cogwVar = (cogw) cfhnVar.j.b();
                cogwVar.getClass();
                eigp eigpVar = (eigp) cfhnVar.k.b();
                eigpVar.getClass();
                cfrlVar.getClass();
                cepfVar.getClass();
                cedpVar2.getClass();
                boolean z4 = z2;
                boolean z5 = z;
                int i5 = i3;
                int i6 = i2;
                Duration duration3 = duration2;
                Duration duration4 = duration;
                Optional optional2 = optional;
                optional2.getClass();
                duration4.getClass();
                duration3.getClass();
                fcsu fcsuVar2 = cfhnVar.m;
                fcsu fcsuVar3 = cfhnVar.l;
                fcsu fcsuVar4 = cfhnVar.i;
                return new cfhm(cenjVar, cfhnVar.c, cfhnVar.d, ainsVar, cfhnVar.f, eosdVar, eoscVar2, fcsuVar4, cogwVar, eigpVar, fcsuVar3, fcsuVar2, cfrlVar, cepfVar, cedpVar2, i4, optional2, optionalOf, duration4, duration3, i6, i5, z5, z4);
            }
        });
    }

    public final eiju a(final ezol ezolVar, eiju eijuVar) {
        return eijuVar.e(Throwable.class, new ejvr() { // from class: cfzd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (!cems.d(th)) {
                    ekrw ekrwVarJ = cfze.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cems.a, cems.a(th));
                    ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessages", 160, "TachyonReceiver.java")).q("Tachyon PullMessages or RegisterRefresh failed with non-retriable error");
                    return null;
                }
                ezol ezolVar2 = ezolVar;
                cfze cfzeVar = this.a;
                ekrw ekrwVarJ2 = cfze.a.j();
                ekrwVarJ2.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.X(cems.a, cems.a(th));
                ((ekrd) ((ekrd) ekrdVar2.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessages", 151, "TachyonReceiver.java")).q("Tachyon PullMessages or RegisterRefresh failed with retriable error");
                PullMessagesWorker.c(cfzeVar.b, ezolVar2);
                return null;
            }
        }, this.g);
    }

    public final eiju b(ezol ezolVar) {
        this.f = true;
        return a(ezolVar, ((cfpa) this.e.get()).a());
    }

    public final eiju c(final ezol ezolVar) {
        this.f = false;
        return ((cfpa) this.e.get()).a().h(new ejvr() { // from class: cfzb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new qao();
            }
        }, eoqg.a).e(Throwable.class, new ejvr() { // from class: cfzc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (!cems.d(th)) {
                    ekrw ekrwVarJ = cfze.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cems.a, cems.a(th));
                    ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", 207, "TachyonReceiver.java")).q("Tachyon PullMessagesFromWorker failed with a non-retriable error");
                    return new qam();
                }
                cfze cfzeVar = this.a;
                ekrg ekrgVar = cfze.a;
                ekrw ekrwVarJ2 = ekrgVar.j();
                ekrz ekrzVar = eksq.a;
                ekrwVarJ2.X(ekrzVar, "BugleNetwork");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.X(cems.a, cems.a(th));
                ((ekrd) ((ekrd) ekrdVar2.g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", 187, "TachyonReceiver.java")).q("Tachyon PullMessagesFromWorker failed with a retriable error");
                if (!cfzeVar.f) {
                    return new qan();
                }
                ezol ezolVar2 = ezolVar;
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesFromWorker", 192, "TachyonReceiver.java")).q("Re-scheduling a Tachyon PullMessagesWorker retry due to a new request");
                PullMessagesWorker.c(cfzeVar.b, ezolVar2);
                return new qam();
            }
        }, this.g);
    }

    public final eiju d() {
        return ((cfgx) this.d.get()).a();
    }

    public final void e() {
        ((cfgx) this.d.get()).c();
    }

    public final eiju f(String str) {
        return ((cfgx) this.d.get()).d(str);
    }
}
