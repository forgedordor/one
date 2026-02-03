package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjd implements PointerInputEventHandler {
    final /* synthetic */ fdcf a;
    final /* synthetic */ fdap b;
    final /* synthetic */ Context c;

    public djjd(fdcf fdcfVar, fdap fdapVar, Context context) {
        this.a = fdcfVar;
        this.b = fdapVar;
        this.c = context;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdce fdceVar = new fdce();
        final fdcf fdcfVar = this.a;
        fdap fdapVar = new fdap() { // from class: djiz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdcfVar.a = 0.0f;
                fdceVar.a = false;
                return fctx.a;
            }
        };
        fdae fdaeVar = new fdae() { // from class: djja
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        fdae fdaeVar2 = new fdae() { // from class: djjb
            @Override // defpackage.fdae
            public final Object invoke() {
                fdceVar.a = false;
                return fctx.a;
            }
        };
        final fdap fdapVar2 = this.b;
        final Context context = this.c;
        Object objB = dvn.b(isnVar, new dud(fdapVar, new fdat() { // from class: djjc
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                float fFloatValue = ((Float) obj2).floatValue();
                ((ise) obj).getClass();
                fdce fdceVar2 = fdceVar;
                if (!fdceVar2.a) {
                    fdap fdapVar3 = fdapVar2;
                    fdcf fdcfVar2 = fdcfVar;
                    float f = fdcfVar2.a + fFloatValue;
                    boolean z = false;
                    if (f < 0.0f && Math.abs(f) >= 150.0f && fdapVar3 != null) {
                        z = true;
                    }
                    fdceVar2.a = z;
                    fdcfVar2.a = f;
                    if (z) {
                        fdapVar3.invoke(context);
                    }
                }
                return fctx.a;
            }
        }, fdaeVar, fdaeVar2, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }
}
