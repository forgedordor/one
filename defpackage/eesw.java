package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesw extends ViewOutlineProvider {
    final /* synthetic */ eesx a;

    public eesw(eesx eesxVar) {
        this.a = eesxVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        eesx eesxVar = this.a;
        if (eesxVar.b == null || eesxVar.c.isEmpty()) {
            return;
        }
        outline.setRoundRect((int) eesxVar.c.left, (int) eesxVar.c.top, (int) eesxVar.c.right, (int) eesxVar.c.bottom, eesxVar.e);
    }
}
