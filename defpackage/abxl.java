package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxl implements eglf {
    final /* synthetic */ abxf a;
    final /* synthetic */ Activity b;
    final /* synthetic */ fcsu c;

    public abxl(abxf abxfVar, Activity activity, fcsu fcsuVar) {
        this.a = abxfVar;
        this.b = activity;
        this.c = fcsuVar;
    }

    @Override // defpackage.eglf
    public final dyib a() {
        boolean z = !((Boolean) abxb.a.e()).booleanValue();
        dyia dyiaVarC = dyib.c();
        dyiaVarC.b(z);
        return dyiaVarC.a();
    }

    @Override // defpackage.eglf
    public final dyif b(final dydi dydiVar) {
        dyie dyieVarA = dyif.a();
        dyjw dyjwVar = new dyjw();
        int i = ekgb.d;
        dyjwVar.a(ekoe.a);
        if (abxb.a()) {
            final abxf abxfVar = this.a;
            ekfw ekfwVar = new ekfw();
            ekgb ekgbVar = (ekgb) abxfVar.c.b();
            int size = ekgbVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ekfwVar.h(((acad) ekgbVar.get(i2)).a());
            }
            dyjwVar.a(ekfwVar.g());
            ekfw ekfwVar2 = new ekfw();
            Activity activity = abxfVar.a;
            eigp eigpVar = abxfVar.b;
            String string = activity.getString(R.string.app_name);
            eifs eifsVar = new eifs(eigpVar, "com/google/android/apps/messaging/gaia/OneGoogleActionsFactory", "getCommonActionSpec", 45, "Clicked account menu privacy", new View.OnClickListener() { // from class: abxc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((abwy) abxfVar.d.b()).a(new abww(abwv.PRIVACY));
                }
            });
            Drawable drawableA = ku.a(activity, R.drawable.ic_safer_shield_ic_outline_your_data);
            drawableA.getClass();
            dyhs dyhsVarH = dyhu.h();
            dyhsVarH.f(R.id.og_ai_privacy_advisor);
            dyhw dyhwVar = (dyhw) dyhsVarH;
            dyhwVar.a = drawableA;
            dyhsVarH.g(activity.getString(R.string.og_privacy_advisor, string));
            dyhsVarH.h(90536);
            dyhwVar.b = eifsVar;
            dyhsVarH.c(dyhr.PRIVACY_ADVISOR);
            ekfwVar2.h(dyhsVarH.b());
            String string2 = activity.getString(R.string.app_name);
            eifs eifsVar2 = new eifs(eigpVar, "com/google/android/apps/messaging/gaia/OneGoogleActionsFactory", "getCommonActionSpec", 55, "Clicked account menu settings", new View.OnClickListener() { // from class: abxd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((abwy) abxfVar.d.b()).a(new abww(abwv.SETTINGS));
                }
            });
            String string3 = activity.getString(R.string.og_app_settings, string2);
            dyhs dyhsVarH2 = dyhu.h();
            dyhsVarH2.f(R.id.og_ai_settings);
            dyhsVarH2.e(R.drawable.quantum_gm_ic_settings_vd_theme_24);
            dyhsVarH2.g(string3);
            dyhsVarH2.h(90537);
            ((dyhw) dyhsVarH2).b = eifsVar2;
            dyhsVarH2.i(true);
            dyhsVarH2.c(dyhr.SETTINGS);
            ekfwVar2.h(dyhsVarH2.b());
            if (!((Boolean) ackx.a.e()).booleanValue()) {
                eifs eifsVar3 = new eifs(eigpVar, "com/google/android/apps/messaging/gaia/OneGoogleActionsFactory", "getCommonActionSpec", 66, "Clicked account menu help and feedback", new View.OnClickListener() { // from class: abxe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((abwy) abxfVar.d.b()).a(new abww(abwv.HELP));
                    }
                });
                dyhs dyhsVarH3 = dyhu.h();
                dyhsVarH3.f(R.id.og_ai_help_and_feedback);
                dyhsVarH3.e(R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
                dyhsVarH3.g(activity.getString(R.string.og_help_feedback));
                dyhsVarH3.h(90538);
                ((dyhw) dyhsVarH3).b = eifsVar3;
                dyhsVarH3.i(true);
                dyhsVarH3.c(dyhr.HELP_AND_FEEDBACK);
                ekfwVar2.h(dyhsVarH3.b());
            }
            dyieVarA.b(ekfwVar2.g());
            dyih dyihVar = (dyih) dyieVarA;
            dyihVar.i = new dymw();
            Activity activity2 = this.b;
            final fcsu fcsuVar = this.c;
            dyihVar.a = ejwi.j(new dybe(new abxi(activity2, fcsuVar), new ejwm() { // from class: abxj
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return dydiVar.a() != null;
                }
            }));
            dyihVar.d = ejwi.j(new dynh(true, ejwi.j(new dypy() { // from class: abxk
                @Override // defpackage.dypy
                public final ListenableFuture a() {
                    ((abwy) fcsuVar.b()).a(new abww(abwv.SIGN_OUT_ACCOUNT));
                    return eijx.e(false);
                }
            })));
        }
        ekgb ekgbVar2 = dyjwVar.b;
        if (ekgbVar2 == null) {
            throw new IllegalStateException("Missing required properties: flavorCustomActions");
        }
        ((dyih) dyieVarA).e = new dyjx(dyjwVar.a, ekgbVar2, dyjwVar.c);
        return dyieVarA.a();
    }

    @Override // defpackage.eglf
    public final /* synthetic */ String c() {
        return "https://myaccount.google.com/";
    }

    @Override // defpackage.eglf
    public final /* synthetic */ String d() {
        return "https://policies.google.com/privacy";
    }

    @Override // defpackage.eglf
    public final /* synthetic */ String e() {
        return "https://policies.google.com/terms";
    }
}
