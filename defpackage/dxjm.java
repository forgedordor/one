package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxjm extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxjn b;
    final /* synthetic */ dxid c;
    final /* synthetic */ Context d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjm(dxjn dxjnVar, dxid dxidVar, Context context, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxjnVar;
        this.c = dxidVar;
        this.d = context;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxjm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxjn dxjnVar = this.b;
            dxid dxidVar = this.c;
            Context context = this.d;
            long j = this.e;
            dxfy dxfyVarB = dxjl.b(context);
            this.a = 1;
            if (dxjnVar.a.c(dxidVar, dxfyVarB, j, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxjm(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
