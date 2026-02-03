package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgq implements acth {
    public final Context a;
    public final ecjh b;
    public final fcsu c;
    public final fcsu d;
    public final efwo e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fdjx j;

    public ctgq(Context context, ecjh ecjhVar, fcsu fcsuVar, fcsu fcsuVar2, efwo efwoVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fdjx fdjxVar) {
        context.getClass();
        ecjhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        efwoVar.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = ecjhVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = efwoVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fdjxVar;
    }

    @Override // defpackage.acth
    public final eiju a() {
        actk actkVarL = actn.l();
        acte acteVar = (acte) actkVarL;
        acteVar.a = "spatula_zero_day_banner";
        Context context = this.a;
        acteVar.b = context.getText(R.string.spatula_home_banner_title);
        acteVar.c = context.getText(R.string.spatula_home_banner_body);
        actkVarL.c(R.drawable.gs_blur_on_vd_theme_24);
        actkVarL.d(new actl() { // from class: ctgk
            @Override // defpackage.actl
            public final void n() {
                ((ctgt) this.a.g.b()).a(ctgs.a);
            }
        });
        acteVar.d = context.getText(R.string.spatula_home_banner_dismiss_button);
        acteVar.f = new actm() { // from class: ctgl
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) {
                this.a.e(ctgs.b);
            }
        };
        actkVarL.e(context.getText(R.string.spatula_home_banner_learn_more_button));
        acteVar.e = new actm() { // from class: ctgm
            @Override // defpackage.actm
            public final void a(egpr egprVar, View view) throws IOException {
                Intent intentAddFlags = new Intent("com.google.android.gms.spatula.settings.action.OPEN_SPATULA_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                intentAddFlags.getClass();
                ctgq ctgqVar = this.a;
                eiid.o(ctgqVar.a, intentAddFlags);
                ctgqVar.e(ctgs.c);
            }
        };
        eiju eijuVarE = eijx.e(actkVarL.a());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.acth
    public final eiju b() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new ctgp(this, null));
    }

    @Override // defpackage.acth
    public final /* synthetic */ Set c() {
        return new ekph(cdpg.HOME);
    }

    @Override // defpackage.acth
    public final int d() {
        return 5;
    }

    public final void e(ctgs ctgsVar) {
        auvw.k(this.j, null, null, new ctgo(this, ctgsVar, null), 3).hK(new fdap() { // from class: ctgj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((egzh) this.a.i.b()).a(eijx.e(null), acto.a);
                return fctx.a;
            }
        });
    }
}
