package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hji implements AccessibilityManager.AccessibilityStateChangeListener, hsf {
    public final hjg b;
    private final hox c = new hpl(false, hsi.a);
    public final hjh a = new hjh();

    public hji() {
        this.b = Build.VERSION.SDK_INT >= 33 ? new hjg() : null;
    }

    public static final boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && fdgn.G(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && fdgn.G(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hsf
    public final /* bridge */ /* synthetic */ Object a() {
        hjg hjgVar;
        boolean z = false;
        if (((Boolean) this.c.a()).booleanValue() && (((Boolean) this.a.a.a()).booleanValue() || (((hjgVar = this.b) != null && ((Boolean) hjgVar.a.a()).booleanValue()) || (hjgVar != null && ((Boolean) hjgVar.b.a()).booleanValue())))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void b(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        b(z);
    }
}
