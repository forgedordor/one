package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ko extends lfp {
    final /* synthetic */ ks a;

    public ko(ks ksVar) {
        this.a = ksVar;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void a() {
        View view;
        ks ksVar = this.a;
        if (ksVar.k && (view = ksVar.f) != null) {
            view.setTranslationY(0.0f);
            ksVar.c.setTranslationY(0.0f);
        }
        ksVar.c.setVisibility(8);
        ksVar.c.a(false);
        ksVar.n = null;
        na naVar = ksVar.i;
        if (naVar != null) {
            naVar.a(ksVar.h);
            ksVar.h = null;
            ksVar.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = ksVar.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ley.a;
            lel.c(actionBarOverlayLayout);
        }
    }
}
