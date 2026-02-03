package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axs {
    public final boolean a;
    public final boolean b;

    public axs(bly blyVar) {
        boolean z;
        Iterator it = blyVar.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.b = blyVar.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
