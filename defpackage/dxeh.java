package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxeh extends pnz {
    final /* synthetic */ dxei b;

    public dxeh(dxei dxeiVar) {
        this.b = dxeiVar;
    }

    @Override // defpackage.pnz
    public final void b(Drawable drawable) {
        this.b.b.post(new Runnable() { // from class: dxeg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.c.start();
            }
        });
    }
}
