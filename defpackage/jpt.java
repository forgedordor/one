package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpt extends fdbr implements fdat {
    final /* synthetic */ jpw a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpt(jpw jpwVar, fdat fdatVar) {
        super(2);
        this.a = jpwVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            AndroidCompositionLocals_androidKt.a(this.a.a, this.b, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
