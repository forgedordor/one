package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jli extends fdbr implements fdat {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jli(ComposeView composeView, int i) {
        super(2);
        this.a = composeView;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.b | 1);
        this.a.b((hml) obj, iA);
        return fctx.a;
    }
}
