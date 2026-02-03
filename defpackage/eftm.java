package defpackage;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftm implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ GlifLayout a;

    public eftm(GlifLayout glifLayout) {
        this.a = glifLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        GlifLayout glifLayout = this.a;
        ScrollView scrollViewN = glifLayout.n();
        ScrollView scrollViewM = glifLayout.m();
        if (scrollViewN == null && scrollViewM == null) {
            return;
        }
        glifLayout.p(!(GlifLayout.s(scrollViewM) || GlifLayout.s(scrollViewN)));
    }
}
