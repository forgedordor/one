package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqq implements PointerInputEventHandler {
    final /* synthetic */ dmqz a;
    final /* synthetic */ lvj b;
    final /* synthetic */ hox c;
    final /* synthetic */ fdae d;

    public dmqq(dmqz dmqzVar, lvj lvjVar, hox hoxVar, fdae fdaeVar) {
        this.a = dmqzVar;
        this.b = lvjVar;
        this.c = hoxVar;
        this.d = fdaeVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final dmqz dmqzVar = this.a;
        final lvj lvjVar = this.b;
        final hox hoxVar = this.c;
        fdap fdapVar = new fdap() { // from class: dmqn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dmqz dmqzVar2 = dmqzVar;
                if (dmqzVar2 != null) {
                    hox hoxVar2 = hoxVar;
                    if (!dmqw.d(hoxVar2)) {
                        dmqzVar2.a.invoke(lvjVar);
                        dmqw.c(hoxVar2, true);
                    }
                }
                return fctx.a;
            }
        };
        dmqp dmqpVar = new dmqp(dmqzVar, hoxVar, null);
        final fdae fdaeVar = this.d;
        Object objI = dzm.i(isnVar, null, fdapVar, dmqpVar, new fdap() { // from class: dmqo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdaeVar.invoke();
                return fctx.a;
            }
        }, fcxyVar, 1);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
