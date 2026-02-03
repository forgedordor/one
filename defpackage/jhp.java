package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhp extends fdbr implements fdap {
    final /* synthetic */ fdci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhp(fdci fdciVar) {
        super(1);
        this.a = fdciVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a = (FocusTargetNode) obj;
        return true;
    }
}
