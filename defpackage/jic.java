package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jic extends fcyv {
    public /* synthetic */ Object a;
    final /* synthetic */ AndroidComposeView b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jic(AndroidComposeView androidComposeView, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = androidComposeView;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(null, this);
    }
}
