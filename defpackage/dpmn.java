package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmn extends fcyz implements fdat {
    final /* synthetic */ Window a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpmn(Window window, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = window;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpmn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Window window = this.a;
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpmn(this.a, fcxyVar);
    }
}
