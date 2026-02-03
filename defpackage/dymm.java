package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dymm extends dykv {
    public final dyms a;

    public dymm(dyms dymsVar) {
        this.a = dymsVar;
    }

    @Override // defpackage.dykv
    public final ekhx a() {
        return ((dymg) this.a).d;
    }

    @Override // defpackage.dykv
    public final boolean b() {
        return ((Boolean) ((dymg) this.a).b.get()).booleanValue();
    }

    @Override // defpackage.dykv
    public final boolean c(fr frVar, dzdh dzdhVar, final Runnable runnable) {
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) dzdhVar;
        AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
        accountParticleDisc.getContext();
        Context context = accountParticleDisc.getContext();
        dzdp dzdpVar = (dzdp) frVar.h("com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
        if (dzdpVar == null) {
            dzdpVar = new dzdp();
        }
        dymg dymgVar = (dymg) this.a;
        abys abysVar = dymgVar.f.a;
        String str = abysVar.a;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        dymt dymtVar = new dymt(new ContextThemeWrapper(new ContextThemeWrapper(context, R.style.OneGoogle_Tooltip_White_GoogleMaterial_DayNight), R.style.OneGoogle_Attrs_GoogleMaterial), str, abysVar.b);
        dzdj dzdjVar = new dzdj(ejwi.j(Integer.valueOf(dqoc.a(dymtVar.getContext(), R.attr.colorSurface))), (dymgVar.c || dyrb.a(context)) ? ejwi.j(Integer.valueOf(dqoc.a(dymtVar.getContext(), R.attr.slimCardScrimColor))) : ejud.a, dymtVar, new PopupWindow.OnDismissListener() { // from class: dymk
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                runnable.run();
            }
        }, new dyml(this, dymtVar, dzdhVar, dzdpVar));
        boolean z = false;
        if (!dzdg.a(dzdhVar)) {
            return false;
        }
        dzdpVar.d = new dzdi(dzdjVar, dzdhVar);
        dzdpVar.c.b();
        Activity activity = (Activity) selectedAccountDisc.i.get();
        if (activity != null && activity.isFinishing()) {
            z = true;
        }
        if (dzdpVar.aF() || dzdpVar.e || z) {
            return true;
        }
        cg cgVar = new cg(frVar);
        cgVar.u(dzdpVar, "com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
        cgVar.k();
        return true;
    }

    @Override // defpackage.dykv
    public final int d() {
        return ((dymg) this.a).g;
    }

    public final void e(View view, int i) {
        int iD = d();
        evsl evslVar = dyxw.a;
        dyxz dyxzVar = (dyxz) dyya.a.createBuilder();
        emmn emmnVar = (emmn) emmo.a.createBuilder();
        emmd emmdVar = (emmd) emme.a.createBuilder();
        emmdVar.copyOnWrite();
        emme emmeVar = (emme) emmdVar.instance;
        emmeVar.c = iD - 1;
        emmeVar.b |= 2;
        emmnVar.copyOnWrite();
        emmo emmoVar = (emmo) emmnVar.instance;
        emme emmeVar2 = (emme) emmdVar.build();
        emmeVar2.getClass();
        emmoVar.e = emmeVar2;
        emmoVar.c |= 4;
        dyxzVar.copyOnWrite();
        dyya dyyaVar = (dyya) dyxzVar.instance;
        emmo emmoVar2 = (emmo) emmnVar.build();
        emmoVar2.getClass();
        dyyaVar.c = emmoVar2;
        dyyaVar.b = 1 | dyyaVar.b;
        dsva[] dsvaVarArr = {new dsva(evslVar, (dyya) dyxzVar.build())};
        dyxl dyxlVar = (dyxl) ((dymg) this.a).a;
        Object objA = dyxlVar.c.a();
        ecem.c();
        dtah dtahVar = dyxlVar.a;
        dsuy dsuyVarA = dtahVar.c().a(i);
        dsuyVarA.g(dtaa.a("onegoogle-android"));
        dsuyVarA.g(dyxj.d(dyxlVar.b, objA).a());
        dsuyVarA.f(dsvaVarArr[0]);
        dtahVar.b().b(view, dsuyVarA);
    }

    public final void f(View view) {
        dyyg.a(((dyxl) ((dymg) this.a).a).a.a(), new dsve(5), view);
    }
}
