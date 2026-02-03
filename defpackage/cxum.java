package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxum {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/SearchDebugUtilsHelper");
    private final cqjy b;
    private final dakl c;

    public cxum(cqjy cqjyVar, dakl daklVar) {
        this.b = cqjyVar;
        this.c = daklVar;
    }

    public final boolean a(String str) {
        if (!TextUtils.equals(str, "*xyzzy*") && !TextUtils.equals(str, "*rcsxyzzy*")) {
            return false;
        }
        cqjy cqjyVar = this.b;
        boolean zR = cqjyVar.r();
        boolean z = !zR;
        cqcb cqcbVar = cqcb.BUGLE;
        ((Boolean) ccze.z.e()).booleanValue();
        cqcbVar.getClass();
        cqky cqkyVar = (cqky) cqjyVar.c.b();
        ((crqv) cqkyVar.b.b()).h("debugging_features_enabled", z);
        Iterator it = ((Set) cqkyVar.c.b()).iterator();
        while (it.hasNext()) {
            ((cqkz) it.next()).c();
        }
        ekrg ekrgVar = cqca.a;
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/ui/debug/SearchDebugUtilsHelper", "toggleDebugMenu", 52, "SearchDebugUtilsHelper.java")).t("Debugger menu enabled: %b", Boolean.valueOf(z));
        this.c.p(true != zR ? R.string.manual_debugger_enabled : R.string.manual_debugger_disabled);
        return true;
    }
}
