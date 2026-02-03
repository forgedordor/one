package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycl implements View.OnAttachStateChangeListener {
    final /* synthetic */ dyco a;

    public dycl(dyco dycoVar) {
        this.a = dycoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        final dyco dycoVar = this.a;
        dydm dydmVar = (dydm) dycoVar.a;
        dydmVar.b.c(dycoVar.c);
        dycoVar.b.c.f(dycoVar.d);
        ejwi ejwiVar = dydmVar.h;
        dycoVar.c();
        final boolean z = false;
        dyrf.a(new Runnable(z) { // from class: dyck
            public final /* synthetic */ boolean b = false;

            @Override // java.lang.Runnable
            public final void run() {
                dyco dycoVar2 = this.a;
                SelectedAccountDisc selectedAccountDisc = dycoVar2.b;
                final AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
                accountParticleDisc.setVisibility(0);
                selectedAccountDisc.b.setVisibility(8);
                accountParticleDisc.getClass();
                selectedAccountDisc.post(new Runnable() { // from class: dycd
                    @Override // java.lang.Runnable
                    public final void run() {
                        accountParticleDisc.requestLayout();
                    }
                });
                dycoVar2.b();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dyco dycoVar = this.a;
        dydm dydmVar = (dydm) dycoVar.a;
        ejwi ejwiVar = dydmVar.h;
        dydmVar.b.d(dycoVar.c);
        dycoVar.b.c.k(dycoVar.d);
    }
}
