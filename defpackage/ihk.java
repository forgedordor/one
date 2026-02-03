package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihk extends fdbr implements fdap {
    final /* synthetic */ ihc a;
    final /* synthetic */ FocusTargetNode b;
    final /* synthetic */ FocusTargetNode c;
    final /* synthetic */ ihu d;
    final /* synthetic */ int e;
    final /* synthetic */ fdap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihk(ihc ihcVar, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, ihu ihuVar, int i, fdap fdapVar) {
        super(1);
        this.a = ihcVar;
        this.b = focusTargetNode;
        this.c = focusTargetNode2;
        this.d = ihuVar;
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
        boolean zD = ihl.d(focusTargetNode, this.d, this.e, this.f);
        Boolean boolValueOf = Boolean.valueOf(zD);
        boolValueOf.getClass();
        if (zD || !iumVar.a()) {
            return boolValueOf;
        }
        return null;
    }
}
