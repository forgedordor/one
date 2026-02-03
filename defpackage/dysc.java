package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dysc extends kc implements dyqh {
    public dytx ai;
    public dyud aj;
    public ExpressSignInLayout ak;
    public Runnable am;
    public final dyqi ag = new dyqi(this);
    public final abs ah = new dysa(this);
    public boolean al = true;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.express_sign_in_dialog, viewGroup);
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) viewInflate.findViewById(R.id.express_sign_in_modal);
        this.ak = expressSignInLayout;
        final Runnable runnable = new Runnable() { // from class: dyry
            @Override // java.lang.Runnable
            public final void run() {
                this.a.hh();
            }
        };
        expressSignInLayout.d(new dysm() { // from class: dysl
            @Override // defpackage.dysm
            public final void a(dytu dytuVar) {
                dytuVar.u = runnable;
            }
        });
        if (this.al) {
            viewInflate.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: dyrz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.aV();
                }
            });
        }
        ley.p(this.ak, new dysb(this));
        return viewInflate;
    }

    public final void aV() {
        ExpressSignInLayout expressSignInLayout = this.ak;
        if (expressSignInLayout != null) {
            expressSignInLayout.d(new dysm() { // from class: dyse
                @Override // defpackage.dysm
                public final void a(dytu dytuVar) {
                    dytuVar.i();
                }
            });
        }
        hh();
        Runnable runnable = this.am;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ea
    public final void ap(final View view, Bundle bundle) {
        this.ag.c(new Runnable() { // from class: dyrw
            @Override // java.lang.Runnable
            public final void run() {
                dysc dyscVar = this.a;
                boolean z = false;
                if (dyscVar.ai != null && dyscVar.aj != null) {
                    z = true;
                }
                View view2 = view;
                ejwl.b(z, "Post initialization code ran without being initialized");
                ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) view2.findViewById(R.id.express_sign_in_modal);
                expressSignInLayout.c(dyscVar.ai, dyscVar.aj, true, ejwi.j((ach) dyscVar.gV()));
                dyscVar.ah.h(true);
                expressSignInLayout.findViewById(R.id.content_container).setOnTouchListener(new View.OnTouchListener() { // from class: dyrx
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
        });
    }

    @Override // defpackage.dyqh
    public final boolean b() {
        return (this.ai == null || this.aj == null) ? false : true;
    }

    @Override // defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Dialog dialogGK = super.gK(bundle);
        ((abk) dialogGK).b.b(this, this.ah);
        return dialogGK;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        q(2, R.style.OneGoogle_ExpressSignInDialog);
    }

    @Override // defpackage.dn
    public final void hh() {
        if (aF()) {
            if (aJ()) {
                super.dismissAllowingStateLoss();
            } else {
                super.hh();
            }
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Runnable runnable = this.am;
        if (runnable != null) {
            runnable.run();
        }
    }
}
