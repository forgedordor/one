package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpfu {
    public final AccessibilityManager a;
    public final fdvc b;
    public final fdvc c;
    private final Context d;
    private final fdjx e;
    private final fdpl f;
    private final fdpl g;
    private final fdpl h;

    public cpfu(Context context, fdjx fdjxVar) {
        context.getClass();
        fdjxVar.getClass();
        this.d = context;
        this.e = fdjxVar;
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        this.a = accessibilityManager;
        fdpl fdplVarA = fdqq.a(new fdpb(new cpfo(this, null)));
        this.f = fdplVarA;
        fdpl fdplVarA2 = fdqq.a(new fdpb(new cpft(this, null)));
        this.g = fdplVarA2;
        fdpl fdplVarA3 = fdqq.a(new fdpb(new cpfj(this, null)));
        this.h = fdplVarA3;
        fdua fduaVar = new fdua(fdplVarA, fdplVarA3, new cpfk(null));
        fdus fdusVar = fdur.a;
        this.b = fdtg.b(fduaVar, fdjxVar, fdusVar, Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()));
        this.c = fdtg.b(new fdua(fdplVarA2, fdplVarA3, new cpfl(null)), fdjxVar, fdusVar, Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled() && a()));
    }

    public final boolean a() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null || enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        Iterator<T> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            String id = ((AccessibilityServiceInfo) it.next()).getId();
            id.getClass();
            if (fdgn.G(id, "voiceaccess", false)) {
                return true;
            }
        }
        return false;
    }
}
