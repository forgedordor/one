package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihb {
    public static final ihc a(FocusTargetNode focusTargetNode) {
        return ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).e;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        jcr jcrVar;
        jfh jfhVar;
        jer jerVar = focusTargetNode.s.y;
        if (jerVar == null || (jcrVar = jerVar.t) == null || (jfhVar = jcrVar.k) == null) {
            return;
        }
        ige igeVar = ((AndroidComposeView) jfhVar).i;
    }
}
