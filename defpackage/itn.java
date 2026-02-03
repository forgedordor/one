package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ito b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itn(ito itoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = itoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((itn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ito itoVar = this.b;
            PointerInputEventHandler pointerInputEventHandler = itoVar.d;
            this.a = 2;
            if (pointerInputEventHandler.invoke(itoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new itn(this.b, fcxyVar);
    }
}
