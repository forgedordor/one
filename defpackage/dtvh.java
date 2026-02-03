package defpackage;

import android.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtvh implements dtpa {
    final /* synthetic */ duab a;
    final /* synthetic */ dtoz b;
    final /* synthetic */ kvq c;
    final /* synthetic */ kwx d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ dtvl g;

    public dtvh(dtvl dtvlVar, duab duabVar, dtoz dtozVar, kvq kvqVar, kwx kwxVar, int i, String str) {
        this.a = duabVar;
        this.b = dtozVar;
        this.c = kvqVar;
        this.d = kwxVar;
        this.e = i;
        this.f = str;
        this.g = dtvlVar;
    }

    @Override // defpackage.dtpa
    public final void a(long j) {
        String str = ((duaa) this.a).a;
        dtvl dtvlVar = this.g;
        ListenableFuture listenableFutureD = dtvlVar.g.d(str);
        final dtoz dtozVar = this.b;
        final kvq kvqVar = this.c;
        final kwx kwxVar = this.d;
        final int i = this.e;
        eika.k(listenableFutureD, new eooz() { // from class: dtvd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (!ejwiVar.g()) {
                    return eorv.a;
                }
                if (((ListenableFuture) ejwiVar.c()).isDone()) {
                    return eorv.a;
                }
                dtmn dtmnVar = (dtmn) dtozVar;
                if (dtmnVar.g == 2) {
                    int i2 = i;
                    kwx kwxVar2 = kwxVar;
                    kvq kvqVar2 = kvqVar;
                    kvqVar2.A = "progress";
                    kvqVar2.r(R.drawable.stat_sys_download);
                    kvqVar2.h(dtmnVar.a);
                    kvqVar2.q(0, 0, true);
                    kwxVar2.g(i2, kvqVar2.a());
                }
                return eorv.a;
            }
        }, dtvlVar.i);
    }

    @Override // defpackage.dtpa
    public final void b() {
        String str = ((duaa) this.a).a;
        dtvl dtvlVar = this.g;
        ListenableFuture listenableFutureC = dtvlVar.g.c(str);
        final dtoz dtozVar = this.b;
        final kvq kvqVar = this.c;
        final String str2 = this.f;
        final kwx kwxVar = this.d;
        final int i = this.e;
        eika.k(listenableFutureC, new eooz() { // from class: dtvg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue() && ((dtmn) dtozVar).g == 2) {
                    int i2 = i;
                    kwx kwxVar2 = kwxVar;
                    String str3 = str2;
                    kvq kvqVar2 = kvqVar;
                    kvqVar2.A = "status";
                    kvqVar2.h(str3);
                    kvqVar2.r(R.drawable.stat_sys_download);
                    kvqVar2.o(true);
                    kvqVar2.q(0, 0, false);
                    kwxVar2.g(i2, kvqVar2.a());
                }
                return eorv.a;
            }
        }, dtvlVar.i);
    }

    @Override // defpackage.dtpa
    public final void c() {
        final dtoz dtozVar = this.b;
        final kvq kvqVar = this.c;
        final duab duabVar = this.a;
        eika.i(new eooy() { // from class: dtve
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dtmn dtmnVar = (dtmn) dtozVar;
                int i = dtmnVar.g;
                dtvh dtvhVar = this.a;
                if (i == 2) {
                    kvqVar.b.clear();
                    new kwx(dtvhVar.g.a).d(null, dtmnVar.a.hashCode());
                }
                duab duabVar2 = duabVar;
                dtvl dtvlVar = dtvhVar.g;
                ((duvp) dtvlVar.j.c()).j(dtmnVar.a);
                return dtvlVar.g.e(((duaa) duabVar2).a);
            }
        }, this.g.i);
    }
}
