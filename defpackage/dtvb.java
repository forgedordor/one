package defpackage;

import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtvb implements eora {
    final /* synthetic */ dtpa a;

    public dtvb(dtpa dtpaVar) {
        this.a = dtpaVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dtma dtmaVar = (dtma) obj;
        try {
            this.a.c();
        } catch (Exception e) {
            durt.q(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", dtmaVar.c);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        final dtvh dtvhVar = (dtvh) this.a;
        final duab duabVar = dtvhVar.a;
        final int i = dtvhVar.e;
        final kwx kwxVar = dtvhVar.d;
        final kvq kvqVar = dtvhVar.c;
        final dtoz dtozVar = dtvhVar.b;
        eika.i(new eooy() { // from class: dtvf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dtmn dtmnVar = (dtmn) dtozVar;
                int i2 = dtmnVar.g;
                dtvh dtvhVar2 = dtvhVar;
                if (i2 == 2) {
                    int i3 = i;
                    kwx kwxVar2 = kwxVar;
                    kvq kvqVar2 = kvqVar;
                    kvqVar2.b.clear();
                    kvqVar2.A = "status";
                    kvqVar2.h(dtvhVar2.g.a.getResources().getString(R.string.mdd_notification_download_failed));
                    kvqVar2.o(false);
                    kvqVar2.r(android.R.drawable.stat_sys_warning);
                    kvqVar2.q(0, 0, false);
                    kwxVar2.g(i3, kvqVar2.a());
                }
                duab duabVar2 = duabVar;
                dtvl dtvlVar = dtvhVar2.g;
                ((duvp) dtvlVar.j.c()).j(dtmnVar.a);
                return dtvlVar.g.e(((duaa) duabVar2).a);
            }
        }, dtvhVar.g.i);
    }
}
