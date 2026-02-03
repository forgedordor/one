package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxjb extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxjd b;
    final /* synthetic */ Intent c;
    final /* synthetic */ dxfy d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjb(dxjd dxjdVar, Intent intent, dxfy dxfyVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxjdVar;
        this.c = intent;
        this.d = dxfyVar;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxjb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxjd dxjdVar = this.b;
            this.a = 1;
            if (dxjdVar.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxjb(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
