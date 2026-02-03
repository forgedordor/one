package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iej extends fdbr implements fdap {
    final /* synthetic */ fdci a;
    final /* synthetic */ iek b;
    final /* synthetic */ ief c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iej(fdci fdciVar, iek iekVar, ief iefVar) {
        super(1);
        this.a = fdciVar;
        this.b = iekVar;
        this.c = iefVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jgg jggVar = (jgg) obj;
        iek iekVar = (iek) jggVar;
        if (!((AndroidComposeView) jbg.f(this.b)).k.b.contains(iekVar) || !iel.b(iekVar, iem.a(this.c))) {
            return jgf.a;
        }
        this.a.a = jggVar;
        return jgf.c;
    }
}
