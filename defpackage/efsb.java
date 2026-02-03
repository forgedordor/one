package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsb implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public efsb(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TemplateLayout templateLayout = this.a;
        templateLayout.getViewTreeObserver().removeOnPreDrawListener(templateLayout.f);
        templateLayout.setXFraction(templateLayout.e);
        return true;
    }
}
