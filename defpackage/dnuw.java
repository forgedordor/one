package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnuw implements fdat {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ dnux d;

    public dnuw(ComposeView composeView, boolean z, fdae fdaeVar, dnux dnuxVar) {
        this.a = composeView;
        this.b = z;
        this.c = fdaeVar;
        this.d = dnuxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlkk.c(null, null, null, null, null, null, null, null, null, false, null, 0, hxe.d(-666926481, new dnuv(this.a, this.b, this.c, this.d), hmlVar), hmlVar, 0, 384, 4095);
        }
        return fctx.a;
    }
}
