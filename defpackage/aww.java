package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aww {
    public final boolean a;
    public final boolean b;

    public aww(bly blyVar) {
        this.a = blyVar.d(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = awv.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
