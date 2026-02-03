package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihi extends fdbr implements fdap {
    final /* synthetic */ ihc a;
    final /* synthetic */ FocusTargetNode b;
    final /* synthetic */ FocusTargetNode c;
    final /* synthetic */ FocusTargetNode d;
    final /* synthetic */ int e;
    final /* synthetic */ fdap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihi(ihc ihcVar, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, fdap fdapVar) {
        super(1);
        this.a = ihcVar;
        this.b = focusTargetNode;
        this.c = focusTargetNode2;
        this.d = focusTargetNode3;
        this.e = i;
        this.f = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ium iumVar = (ium) obj;
        int i = this.a.a;
        FocusTargetNode focusTargetNode = this.c;
        if (this.b != ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).h) {
            return true;
        }
        boolean zC = ihj.c(focusTargetNode, this.d, this.e, this.f);
        Boolean boolValueOf = Boolean.valueOf(zC);
        boolValueOf.getClass();
        if (zC || !iumVar.a()) {
            return boolValueOf;
        }
        return null;
    }
}
