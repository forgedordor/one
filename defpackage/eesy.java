package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesy extends ViewOutlineProvider {
    final /* synthetic */ eesz a;

    public eesy(eesz eeszVar) {
        this.a = eeszVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path = this.a.d;
        if (path.isEmpty()) {
            return;
        }
        outline.setPath(path);
    }
}
