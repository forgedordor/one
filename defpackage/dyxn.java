package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyxn extends dyay {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ dyxo c;

    public dyxn(dyxo dyxoVar, View view, int i) {
        this.a = view;
        this.b = i;
        this.c = dyxoVar;
    }

    @Override // defpackage.dyay
    public final void b(final Object obj) {
        final View view = this.a;
        final int i = this.b;
        view.post(new Runnable() { // from class: dyxm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.a.b(view, i, obj);
            }
        });
    }
}
