package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fld implements PointerInputEventHandler {
    final /* synthetic */ flg a;
    final /* synthetic */ fdae b;

    public fld(flg flgVar, fdae fdaeVar) {
        this.a = flgVar;
        this.b = fdaeVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new flc(this.a, this.b, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
