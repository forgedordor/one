package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihh implements Comparator {
    public static final ihh a = new ihh();

    private ihh() {
    }

    private static final hum a(jcr jcrVar) {
        hum humVar = new hum(new jcr[16]);
        while (jcrVar != null) {
            humVar.f(0, jcrVar);
            jcrVar = jcrVar.s();
        }
        return humVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj2;
        int i = 0;
        if (!ihf.d(focusTargetNode) || !ihf.d(focusTargetNode2)) {
            if (ihf.d(focusTargetNode)) {
                return -1;
            }
            return ihf.d(focusTargetNode2) ? 1 : 0;
        }
        jcr jcrVarD = jbg.d(focusTargetNode);
        jcr jcrVarD2 = jbg.d(focusTargetNode2);
        if (fdbq.f(jcrVarD, jcrVarD2)) {
            return 0;
        }
        hum humVarA = a(jcrVarD);
        hum humVarA2 = a(jcrVarD2);
        int iMin = Math.min(humVarA.b - 1, humVarA2.b - 1);
        if (iMin >= 0) {
            while (fdbq.f(humVarA.a[i], humVarA2.a[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return fdbq.a(((jcr) humVarA.a[i]).n(), ((jcr) humVarA2.a[i]).n());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
