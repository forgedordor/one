package defpackage;

import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzdt {
    public final dzdh a;
    public final dzds b = new dzds(this);
    public final PopupWindow.OnDismissListener c;
    public TooltipView d;

    public dzdt(dzdh dzdhVar, dzdu dzduVar, PopupWindow.OnDismissListener onDismissListener) {
        this.a = dzdhVar;
        this.c = onDismissListener;
        dzdj dzdjVar = (dzdj) dzduVar;
        TooltipView tooltipView = new TooltipView(dzdjVar.c, dzdhVar, dzdjVar.e);
        this.d = tooltipView;
        tooltipView.c(((Integer) ((ejwt) dzdjVar.a).a).intValue());
        TooltipView tooltipView2 = this.d;
        ejwi ejwiVar = dzdjVar.b;
        dzdv dzdvVar = tooltipView2.i;
        if (ejwiVar.g()) {
            dzdvVar.b = true;
            dzdvVar.a.setColor(((Integer) ejwiVar.c()).intValue());
        }
    }

    final void a() {
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.a).c;
        dzds dzdsVar = this.b;
        accountParticleDisc.removeOnAttachStateChangeListener(dzdsVar);
        dyqy.a(accountParticleDisc, dzdsVar);
        TooltipView tooltipView = this.d;
        if (tooltipView == null || !tooltipView.isShown()) {
            return;
        }
        TooltipView tooltipView2 = this.d;
        tooltipView2.c.dismiss();
        tooltipView2.b.removeView(tooltipView2.i);
        this.d = null;
    }
}
