package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlgm implements PointerInputEventHandler {
    final /* synthetic */ List a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;

    public dlgm(List list, hox hoxVar, hox hoxVar2) {
        this.a = list;
        this.b = hoxVar;
        this.c = hoxVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objC = dijr.c(isnVar, dlgq.b(this.b), dlgq.a(this.c), this.a, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
