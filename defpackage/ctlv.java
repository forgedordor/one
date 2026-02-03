package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctlv extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ fdap c;
    final /* synthetic */ ctju d;
    final /* synthetic */ Context e;
    final /* synthetic */ View f;
    final /* synthetic */ jmj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctlv(ejy ejyVar, fdap fdapVar, ctju ctjuVar, jmj jmjVar, Context context, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = fdapVar;
        this.d = ctjuVar;
        this.g = jmjVar;
        this.e = context;
        this.f = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctlv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: ctlt
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Boolean.valueOf(ejyVar.i());
                }
            });
            ctlu ctluVar = new ctlu(this.c, this.d, this.g, this.e, this.f);
            this.a = 1;
            if (fdplVarA.a(ctluVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctlv(this.b, this.c, this.d, this.g, this.e, this.f, fcxyVar);
    }
}
