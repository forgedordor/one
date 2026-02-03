package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxho extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxhr b;
    final /* synthetic */ Intent c;
    final /* synthetic */ dxfy d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxho(dxhr dxhrVar, Intent intent, dxfy dxfyVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxhrVar;
        this.c = intent;
        this.d = dxfyVar;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxho) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxhr dxhrVar = this.b;
            this.a = 1;
            if (dxhrVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxho(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
