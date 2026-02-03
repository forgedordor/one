package defpackage;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abig implements View.OnLayoutChangeListener {
    final /* synthetic */ ScrollView a;
    final /* synthetic */ TextView b;

    public abig(ScrollView scrollView, TextView textView) {
        this.a = scrollView;
        this.b = textView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        int bottom = this.b.getBottom();
        ScrollView scrollView = this.a;
        scrollView.scrollTo(0, bottom);
        scrollView.removeOnLayoutChangeListener(this);
    }
}
