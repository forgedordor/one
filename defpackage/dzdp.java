package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdp extends ea implements dyqh {
    private boolean ag;
    public dzdt b;
    public dzdo d;
    public boolean e;
    public boolean a = false;
    public final dyqi c = new dyqi(this);

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_tooltip_fragment, viewGroup);
    }

    public final void a() {
        dzdt dzdtVar = this.b;
        if (dzdtVar != null) {
            dzdtVar.a();
            this.b = null;
        }
        e();
    }

    @Override // defpackage.ea
    public final void ai() {
        dzdo dzdoVar;
        dzdt dzdtVar = this.b;
        if (dzdtVar != null) {
            dzdtVar.a();
        }
        if (!this.e && (dzdoVar = this.d) != null) {
            ((dzdj) ((dzdi) dzdoVar).a).d.onDismiss();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        if (this.ag && !this.a) {
            e();
        }
        this.c.c(new Runnable() { // from class: dzdk
            @Override // java.lang.Runnable
            public final void run() {
                final dzdp dzdpVar = this.a;
                dzdo dzdoVar = dzdpVar.d;
                dzdoVar.getClass();
                dzdi dzdiVar = (dzdi) dzdoVar;
                dzdpVar.b = new dzdt(dzdiVar.b, dzdiVar.a, new PopupWindow.OnDismissListener() { // from class: dzdl
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        dzdpVar.e();
                    }
                });
                View rootView = ((SelectedAccountDisc) ((dzdi) dzdpVar.d).b).c.getRootView();
                rootView.getViewTreeObserver().addOnGlobalLayoutListener(new dzdn(dzdpVar, rootView));
                rootView.requestLayout();
            }
        });
    }

    @Override // defpackage.dyqh
    public final boolean b() {
        return this.d != null;
    }

    public final void e() {
        if (G() == null || G().isFinishing() || !aF() || this.s) {
            return;
        }
        cg cgVar = new cg(J());
        cgVar.o(this);
        cgVar.k();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.a = bundle != null && bundle.getBoolean("SHOW_STATE_KEY");
        this.ag = bundle != null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("SHOW_STATE_KEY", this.a);
        this.e = true;
    }
}
