package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjj implements PointerInputEventHandler {
    final /* synthetic */ fdci a;
    final /* synthetic */ djjn b;
    final /* synthetic */ Context c;
    final /* synthetic */ fdjx d;
    final /* synthetic */ hox e;
    final /* synthetic */ iqa f;
    final /* synthetic */ hox g;
    final /* synthetic */ hox h;
    final /* synthetic */ fdap i;

    public djjj(fdci fdciVar, djjn djjnVar, Context context, fdjx fdjxVar, hox hoxVar, iqa iqaVar, hox hoxVar2, hox hoxVar3, fdap fdapVar) {
        this.a = fdciVar;
        this.b = djjnVar;
        this.c = context;
        this.d = fdjxVar;
        this.e = hoxVar;
        this.f = iqaVar;
        this.g = hoxVar2;
        this.h = hoxVar3;
        this.i = fdapVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdci fdciVar = this.a;
        final hox hoxVar = this.e;
        final djjn djjnVar = this.b;
        final Context context = this.c;
        final fdjx fdjxVar = this.d;
        final iqa iqaVar = this.f;
        fdap fdapVar = new fdap() { // from class: djjf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdci fdciVar2 = fdciVar;
                fdciVar2.a = djjnVar.d.invoke(context);
                fdil.d(fdjxVar, null, null, new djjh(fdciVar2, hoxVar, iqaVar, null), 3);
                return fctx.a;
            }
        };
        djji djjiVar = new djji(fdciVar, this.g, this.h, hoxVar, djjnVar, iqaVar, null);
        final fdap fdapVar2 = this.i;
        Object objI = dzm.i(isnVar, null, fdapVar, djjiVar, new fdap() { // from class: djjg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdapVar2.invoke(djdi.f);
                hoxVar.b(false);
                return fctx.a;
            }
        }, fcxyVar, 1);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
