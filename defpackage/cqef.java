package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqef implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Runnable b;

    public cqef(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final View view2 = this.a;
        view2.removeOnLayoutChangeListener(this);
        final Runnable runnable = this.b;
        cqdq.a.post(new Runnable() { // from class: cqee
            @Override // java.lang.Runnable
            public final void run() {
                if (view2.getContext() == null) {
                    return;
                }
                runnable.run();
            }
        });
    }
}
