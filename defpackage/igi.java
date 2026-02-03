package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igi extends fdbr implements fdap {
    final /* synthetic */ fdci a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igi(fdci fdciVar, int i) {
        super(1);
        this.a = fdciVar;
        this.b = i;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((FocusTargetNode) obj).a(this.b));
        fdci fdciVar = this.a;
        fdciVar.a = boolValueOf;
        Boolean bool = (Boolean) fdciVar.a;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
