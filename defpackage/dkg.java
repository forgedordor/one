package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkg implements PointerInputEventHandler {
    final /* synthetic */ dkh a;

    public dkg(dkh dkhVar) {
        this.a = dkhVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new dkf(this.a, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
