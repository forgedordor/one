package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igh extends fdbr implements fdap {
    final /* synthetic */ FocusTargetNode a;
    final /* synthetic */ FocusOwnerImpl b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igh(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, fdap fdapVar) {
        super(1);
        this.a = focusTargetNode;
        this.b = focusOwnerImpl;
        this.c = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zBooleanValue;
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        if (fdbq.f(focusTargetNode, this.a)) {
            zBooleanValue = false;
        } else {
            if (fdbq.f(focusTargetNode, this.b.c)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = ((Boolean) this.c.invoke(focusTargetNode)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
