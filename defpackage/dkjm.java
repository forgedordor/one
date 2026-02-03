package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkjm implements PointerInputEventHandler {
    final /* synthetic */ hsf a;
    final /* synthetic */ iqa b;
    final /* synthetic */ fdae c;

    public dkjm(hsf hsfVar, iqa iqaVar, fdae fdaeVar) {
        this.a = hsfVar;
        this.b = iqaVar;
        this.c = fdaeVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final hsf hsfVar = this.a;
        final fdap fdapVar = dkjn.b(hsfVar).l;
        fdap fdapVar2 = fdapVar != null ? new fdap() { // from class: dkjj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdapVar.invoke(dkkn.a);
                return fctx.a;
            }
        } : null;
        final iqa iqaVar = this.b;
        fdap fdapVar3 = new fdap() { // from class: dkjk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iqaVar.a(0);
                fdat fdatVar = dkjn.b(hsfVar).k;
                long j = ((ihs) obj).a;
                fdatVar.a(Integer.valueOf((int) Float.intBitsToFloat((int) (j >> 32))), Integer.valueOf((int) Float.intBitsToFloat((int) (j & 4294967295L))));
                return fctx.a;
            }
        };
        final fdae fdaeVar = this.c;
        Object objI = dzm.i(isnVar, fdapVar2, fdapVar3, null, new fdap() { // from class: dkjl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                hsf hsfVar2 = hsfVar;
                if (!((Boolean) dkjn.b(hsfVar2).j.invoke()).booleanValue() && !((Boolean) dkjn.b(hsfVar2).i.invoke()).booleanValue()) {
                    fdaeVar.invoke();
                }
                return fctx.a;
            }
        }, fcxyVar, 4);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
