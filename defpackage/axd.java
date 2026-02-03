package defpackage;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axd {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public axd(bly blyVar, bly blyVar2) {
        this.a = blyVar2.d(TextureViewIsClosedQuirk.class);
        this.b = blyVar.d(PreviewOrientationIncorrectQuirk.class);
        this.c = blyVar.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(List list) {
        if ((this.a || this.b || this.c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bjz) it.next()).d();
            }
            bbs.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
