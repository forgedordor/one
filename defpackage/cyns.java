package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyns extends cynv implements cypt {
    public static final cqce a = cqce.g("Bugle", "DittoActivity");
    private static final cczi q = cdag.g(cdag.b, "bugle_help_and_feedback_multi_device_context", "Messenger_multi_device");
    public View c;
    public abs d;
    public final DittoActivity e;
    public final fcsu f;
    public final eygg g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final boolean k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final fcsu r;
    public int b = 0;
    public Optional o = Optional.empty();

    public cyns(DittoActivity dittoActivity, fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.e = dittoActivity;
        this.f = fcsuVar;
        this.g = eyggVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.r = fcsuVar5;
        this.k = ((cqky) fcsuVar6.b()).a();
        this.l = fcsuVar7;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
        if (abxb.b()) {
            efxf efxfVar = (efxf) fcsuVar8.b();
            egap egapVarE = egaq.e(dittoActivity);
            egapVarE.d(egkc.class);
            egapVarE.d(eghx.class);
            efxfVar.g(egapVarE.a());
            efxfVar.e(new egkb((egkc) fcsuVar9.b()));
            efxfVar.e(new cynr(this));
        }
    }

    private final void e(String str, ea eaVar) {
        cg cgVar = new cg(this.e.a());
        cgVar.x(R.id.fragment_container, eaVar, str);
        cgVar.c();
    }

    public final void a() {
        ((achu) this.r.b()).d(this.e, (String) q.e());
    }

    public final void b(Optional optional) {
        if (this.b == 2) {
            d();
        } else {
            c(optional);
        }
    }

    public final void c(Optional optional) {
        ea eaVarH = this.e.a().h("qr_welcome");
        if (eaVarH == null) {
            if (abxb.b() && optional.isPresent()) {
                Object obj = optional.get();
                eaVarH = new cynn();
                eyhj.e(eaVarH);
                ehok.b(eaVarH, (efwo) obj);
            } else {
                eaVarH = new cynz();
                eyhj.e(eaVarH);
            }
        }
        e("qr_welcome", eaVarH);
        this.b = 1;
    }

    final void d() {
        cypj cypjVar = (cypj) this.e.a().h("qr_scanner");
        this.c.setVisibility(0);
        if (cypjVar == null) {
            cypjVar = new cypj();
        }
        e("qr_scanner", cypjVar);
        cypjVar.H().l = this;
        this.b = 2;
    }
}
