package defpackage;

import android.view.animation.OvershootInterpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkyx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkyx(ddp ddpVar, float f, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkyx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(this.c);
            dia diaVar = new dia(275, this.d, new des() { // from class: dkyw
                @Override // defpackage.des
                public final float a(float f2) {
                    return new OvershootInterpolator(2.4f).getInterpolation(f2);
                }
            });
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkyx(this.b, this.c, this.d, fcxyVar);
    }
}
