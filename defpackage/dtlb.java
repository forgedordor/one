package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlb extends ViewOutlineProvider {
    final /* synthetic */ dtli a;

    public dtlb(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        dtli dtliVar = this.a;
        dtliVar.h.getOutlineProvider().getOutline(dtliVar.h, outline);
    }
}
