package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iha extends fdbr implements fdae {
    final /* synthetic */ fdci a;
    final /* synthetic */ FocusTargetNode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iha(fdci fdciVar, FocusTargetNode focusTargetNode) {
        super(0);
        this.a = fdciVar;
        this.b = focusTargetNode;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        FocusTargetNode focusTargetNode = this.b;
        this.a.a = focusTargetNode.e();
        return fctx.a;
    }
}
