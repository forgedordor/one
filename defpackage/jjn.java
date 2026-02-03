package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjn extends fdbr implements fdat {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ jkp b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjn(AndroidComposeView androidComposeView, jkp jkpVar, fdat fdatVar) {
        super(2);
        this.a = androidComposeView;
        this.b = jkpVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            jmh.a(this.a, this.b, this.c, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
