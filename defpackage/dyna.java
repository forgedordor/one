package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyna implements View.OnAttachStateChangeListener {
    final /* synthetic */ dxye a;
    final /* synthetic */ dynb b;

    public dyna(dynb dynbVar, dxye dxyeVar) {
        this.a = dxyeVar;
        this.b = dynbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccountParticleDisc accountParticleDisc = this.b.a;
        dxye dxyeVar = this.a;
        accountParticleDisc.f(dxyeVar);
        dxyeVar.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.a.k(this.a);
    }
}
