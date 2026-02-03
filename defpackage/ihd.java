package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihd extends fdbr implements fdae {
    final /* synthetic */ FocusTargetNode a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihd(FocusTargetNode focusTargetNode) {
        super(0);
        this.a = focusTargetNode;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.e();
        return fctx.a;
    }
}
