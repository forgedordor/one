package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrl implements cxrz {
    final /* synthetic */ TextView a;

    public cxrl(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.cxrz
    public final void a() {
        final TextView textView = this.a;
        ecem.e(new Runnable() { // from class: cxrk
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText("Result: unverified");
            }
        });
    }

    @Override // defpackage.cxrz
    public final void b() {
        final TextView textView = this.a;
        ecem.e(new Runnable() { // from class: cxrj
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText("Result: verified");
            }
        });
    }
}
