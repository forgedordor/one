package defpackage;

import android.graphics.drawable.ShapeDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpgf extends fcyz implements fdat {
    final /* synthetic */ ShapeDrawable a;
    final /* synthetic */ jyq b;
    final /* synthetic */ jfw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpgf(ShapeDrawable shapeDrawable, jyq jyqVar, jfw jfwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = shapeDrawable;
        this.b = jyqVar;
        this.c = jfwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpgf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ShapeDrawable shapeDrawable = this.a;
        shapeDrawable.getClass();
        shapeDrawable.getPaint().setColor(ijg.b(this.b.f()));
        dpfq dpfqVar = (dpfq) this.c.a;
        if (dpfqVar != null) {
            dpfqVar.invalidate();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpgf(this.a, this.b, this.c, fcxyVar);
    }
}
