package defpackage;

import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axu {
    private final TorchFlashRequiredFor3aUpdateQuirk a;

    public axu(bly blyVar) {
        this.a = (TorchFlashRequiredFor3aUpdateQuirk) blyVar.a(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public final boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.a;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null && (Build.VERSION.SDK_INT < 28 || amb.b(torchFlashRequiredFor3aUpdateQuirk.b, 5) != 5)) {
            z = true;
        }
        bbs.a("UseFlashModeTorchFor3aUpdate", a.r(z, "shouldUseFlashModeTorch: "));
        return z;
    }
}
