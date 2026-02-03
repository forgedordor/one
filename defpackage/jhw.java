package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhw extends fdbr implements fdap {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhw(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((FocusTargetNode) obj).a(this.a));
    }
}
