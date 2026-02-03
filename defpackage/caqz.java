package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqz extends fcyz implements fdat {
    int a;
    final /* synthetic */ carc b;
    final /* synthetic */ PrintWriter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqz(carc carcVar, PrintWriter printWriter, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = carcVar;
        this.c = printWriter;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caqz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            carc carcVar = this.b;
            PrintWriter printWriter = this.c;
            this.a = 1;
            Object objA = fdin.a(eicg.a(carcVar.g), new caqy(null, carcVar, printWriter), this);
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
        return new caqz(this.b, this.c, fcxyVar);
    }
}
