package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njz {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
