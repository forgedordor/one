package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyd extends czye implements efzm {
    final cqce a = cqce.g("Bugle", "ZeroStateSearchActivityPeer");
    public final ZeroStateSearchActivity b;
    public final czzy c;
    public final daoe d;
    public final cmea e;
    public final dacu f;
    public final tlt g;
    public final efxf h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public abs l;
    private final abxv n;

    public czyd(ZeroStateSearchActivity zeroStateSearchActivity, czzy czzyVar, daoe daoeVar, cmea cmeaVar, dacu dacuVar, tlt tltVar, efxf efxfVar, abxv abxvVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = zeroStateSearchActivity;
        this.c = czzyVar;
        this.d = daoeVar;
        this.e = cmeaVar;
        this.f = dacuVar;
        this.g = tltVar;
        this.n = abxvVar;
        this.h = efxfVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        cqce cqceVar = this.a;
        cqceVar.m("onAccountChanged called");
        efwo efwoVarA = efzkVar.a();
        czyw czywVar = new czyw();
        eyhj.e(czywVar);
        ehok.b(czywVar, efwoVarA);
        cqceVar.m("Replacing account fragment");
        dacu dacuVar = this.f;
        if (dacuVar.e().a() != null) {
            List list = (List) dacuVar.e().a();
            list.getClass();
            list.clear();
        }
        Bundle bundle = czywVar.m;
        ZeroStateSearchActivity zeroStateSearchActivity = this.b;
        Bundle extras = zeroStateSearchActivity.getIntent().getExtras();
        if (bundle == null || extras == null) {
            bundle = extras;
        } else {
            bundle.putAll(extras);
        }
        czywVar.at(bundle);
        cg cgVar = new cg(zeroStateSearchActivity.a());
        cgVar.x(R.id.zero_state_fragment_container, czywVar, "ZeroStateSearchFragmentPeer");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        this.n.a(efygVar);
    }

    public final void e() {
        ZeroStateSearchActivity zeroStateSearchActivity = this.b;
        ea eaVarH = zeroStateSearchActivity.a().h("ZeroStateSearchFragmentPeer");
        if (eaVarH != null) {
            czzj czzjVarH = ((czyw) eaVarH).H();
            if (czzjVarH.b.aF()) {
                if (czzjVarH.B.g() || czzjVarH.B.g()) {
                    return;
                }
                dabl dablVar = czzjVarH.g;
                aisq aisqVar = dablVar.f;
                if (aisqVar != null) {
                    aisqVar.a();
                    dablVar.f = null;
                }
            }
        }
        this.l.h(false);
        zeroStateSearchActivity.c().d();
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
