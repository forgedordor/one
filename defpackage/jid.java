package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jid extends fdbr implements fdap {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jid(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AndroidComposeView androidComposeView = this.a;
        return new jkb(androidComposeView, androidComposeView.J, (fdjx) obj);
    }
}
