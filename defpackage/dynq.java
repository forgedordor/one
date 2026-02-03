package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dynq {
    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb a(Context context, final dydh dydhVar, exbg exbgVar) {
        dyhu dyhuVarB;
        ekfw ekfwVar = new ekfw();
        dydm dydmVar = (dydm) dydhVar;
        dywb dywbVar = dydmVar.f;
        final dydi dydiVar = dydmVar.b;
        dyqr dyqrVar = new dyqr(dywbVar, exbgVar, dydiVar);
        dyhu dyhuVarA = dydt.a(dydhVar, context);
        if (dyhuVarA != null) {
            dyqs dyqsVar = new dyqs(((dyhx) dyhuVarA).f);
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            int i = 41;
            if (devicePolicyManager == null) {
                Log.e(dydt.a, "Failed to get DevicePolicyManager");
            } else {
                List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                if (activeAdmins != null) {
                    Iterator<ComponentName> it = activeAdmins.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                            i = 42;
                            break;
                        }
                    }
                }
            }
            dyqsVar.a(dyqrVar, i);
            ekfwVar.h(dyhuVarA.j(new dyqq(dyqsVar)));
        }
        Object objA = dydiVar.a();
        ejwi ejwiVar = ((dyii) dydmVar.e).f;
        dyhu dyhuVarB2 = null;
        if (!ejwiVar.g() || objA == null) {
            dyhuVarB = null;
        } else {
            Object objC = ejwiVar.c();
            dydmVar.c.a(objA);
            Drawable drawableA = ku.a(context, R.drawable.quantum_gm_ic_no_accounts_vd_theme_24);
            drawableA.getClass();
            dyhs dyhsVarH = dyhu.h();
            dyhsVarH.f(R.id.og_use_without_an_account);
            dyhw dyhwVar = (dyhw) dyhsVarH;
            dyhwVar.a = drawableA;
            dyhsVarH.g(context.getString(R.string.og_use_without_an_account));
            dyhsVarH.h(90140);
            dyhsVarH.i(false);
            dyhsVarH.d(((dynh) objC).b);
            dyhwVar.b = new View.OnClickListener() { // from class: dydu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dydiVar.h(null);
                }
            };
            dyhuVarB = b(dyhsVarH.b(), 6, dyqrVar);
        }
        if (dyhuVarB != null) {
            ekfwVar.h(dyhuVarB);
        }
        dypt dyptVarA = dypp.a(dydiVar, ((dydk) dydmVar.d).b, context);
        if (dyptVarA != null) {
            dyhs dyhsVarH2 = dyhu.h();
            dypr dyprVar = (dypr) dyptVarA;
            dyhsVarH2.f(dyprVar.a);
            dyhw dyhwVar2 = (dyhw) dyhsVarH2;
            dyhwVar2.a = dyprVar.b;
            dyhsVarH2.e(dyprVar.c);
            dyhsVarH2.g(dyprVar.d);
            dyhsVarH2.d(dyprVar.g);
            dyhwVar2.b = dyprVar.f;
            dyhsVarH2.h(dyprVar.e);
            ekfwVar.h(b(dyhsVarH2.b(), 11, dyqrVar));
        }
        if (dypn.a(context)) {
            dyhs dyhsVarH3 = dyhu.h();
            dyhsVarH3.f(R.id.og_ai_manage_accounts);
            Drawable drawableA2 = ku.a(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
            drawableA2.getClass();
            dyhw dyhwVar3 = (dyhw) dyhsVarH3;
            dyhwVar3.a = drawableA2;
            dyhsVarH3.g(context.getString(R.string.og_manage_accounts));
            dyhwVar3.b = new View.OnClickListener() { // from class: dydr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dydm dydmVar2 = (dydm) dydhVar;
                    ((dydk) dydmVar2.d).c.a(view, dydmVar2.b.a());
                }
            };
            dyhsVarH3.h(90142);
            dyhuVarB2 = dyhsVarH3.b();
        }
        if (dyhuVarB2 != null) {
            ekfwVar.h(b(dyhuVarB2, 12, dyqrVar));
        }
        ekgb ekgbVarG = ekfwVar.g();
        ekfw ekfwVar2 = new ekfw();
        int i2 = ((ekoe) ekgbVarG).c;
        for (int i3 = 0; i3 < i2; i3++) {
            final dyer dyerVar = new dyer((dyhu) ekgbVarG.get(i3));
            dyerVar.j(dygk.ALWAYS_HIDE_DIVIDER_CARD);
            ekfwVar2.h(new dyes(new dyfc() { // from class: dynp
                @Override // defpackage.dyfc
                public final dyfk a(Object obj) {
                    return dyerVar;
                }
            }));
        }
        return ekfwVar2.g();
    }

    private static dyhu b(dyhu dyhuVar, int i, dyqr dyqrVar) {
        dyqs dyqsVar = new dyqs(((dyhx) dyhuVar).f);
        dyqsVar.a(dyqrVar, i);
        return dyhuVar.j(new dyqq(dyqsVar));
    }
}
