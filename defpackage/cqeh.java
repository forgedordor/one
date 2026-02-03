package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqeh implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ lvc b;
    final /* synthetic */ Runnable c;

    public cqeh(View view, lvc lvcVar, Runnable runnable) {
        this.a = view;
        this.b = lvcVar;
        this.c = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        Handler handler = cqdq.a;
        final lvc lvcVar = this.b;
        final Runnable runnable = this.c;
        handler.post(new Runnable() { // from class: cqeg
            @Override // java.lang.Runnable
            public final void run() {
                if (((lvn) lvcVar).c.equals(lvb.e)) {
                    runnable.run();
                }
            }
        });
    }
}
