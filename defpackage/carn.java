package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carn extends fcyz implements fdat {
    int a;
    final /* synthetic */ carq b;
    final /* synthetic */ PrintWriter c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public carn(fcxy fcxyVar, carq carqVar, PrintWriter printWriter) {
        super(2, fcxyVar);
        this.b = carqVar;
        this.c = printWriter;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((carn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            carq carqVar = this.b;
            this.a = 1;
            obj = carqVar.c("BugleCmsRestoreTimingDumper", this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cqby cqbyVar = (cqby) obj;
        try {
            cqbyVar.a(this.c, cqcb.DIAGNOSTICS);
            fczl.a(cqbyVar, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        carn carnVar = new carn(fcxyVar, this.b, this.c);
        carnVar.d = obj;
        return carnVar;
    }
}
