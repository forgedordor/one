package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhr extends fdbr implements fdap {
    final /* synthetic */ ifq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhr(ifq ifqVar) {
        super(1);
        this.a = ifqVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((FocusTargetNode) obj).a(this.a.a));
    }
}
