package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpte implements hnx {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;

    public dpte(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    @Override // defpackage.hnx
    public final void a() {
        this.a.setKeepScreenOn(this.b);
    }
}
