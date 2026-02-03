package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgt implements hnx {
    final /* synthetic */ Window a;
    final /* synthetic */ hox b;

    public cwgt(Window window, hox hoxVar) {
        this.a = window;
        this.b = hoxVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        Window window = this.a;
        new lhb(window, window.getDecorView()).b(((Boolean) this.b.a()).booleanValue());
    }
}
