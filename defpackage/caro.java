package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caro extends fcyz implements fdat {
    int a;
    final /* synthetic */ carq b;
    final /* synthetic */ PrintWriter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caro(carq carqVar, PrintWriter printWriter, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = carqVar;
        this.c = printWriter;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caro) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            carq carqVar = this.b;
            PrintWriter printWriter = this.c;
            this.a = 1;
            Object objA = fdin.a(eicg.a(carqVar.f), new carn(null, carqVar, printWriter), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new caro(this.b, this.c, fcxyVar);
    }
}
