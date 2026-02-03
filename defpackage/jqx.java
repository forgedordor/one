package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jqx extends fcyz implements fdat {
    int a;
    final /* synthetic */ jrb b;
    final /* synthetic */ ScrollCaptureSession c;
    final /* synthetic */ Rect d;
    final /* synthetic */ Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqx(jrb jrbVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = jrbVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            jrb jrbVar = this.b;
            ScrollCaptureSession scrollCaptureSession = this.c;
            kjd kjdVarF = ikh.f(this.d);
            this.a = 1;
            obj = jrbVar.a(scrollCaptureSession, kjdVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.e.z(ikh.b((kjd) obj));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jqx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
