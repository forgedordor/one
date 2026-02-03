package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfy extends fcyz implements fdat {
    int a;
    final /* synthetic */ yen b;
    final /* synthetic */ Context c;
    final /* synthetic */ ejy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfy(yen yenVar, Context context, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yenVar;
        this.c = context;
        this.d = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yfy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.d;
            yfu yfuVar = new yfu(fdqq.a(new yfx(hsb.a(new fdae() { // from class: yfr
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }))));
            this.a = 1;
            if (fdtc.a(yfuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        yen yenVar = this.b;
        yenVar.p.invoke(this.c);
        ygj.c(yenVar, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yfy(this.b, this.c, this.d, fcxyVar);
    }
}
