package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqy extends fcyz implements fdat {
    int a;
    final /* synthetic */ carc b;
    final /* synthetic */ PrintWriter c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqy(fcxy fcxyVar, carc carcVar, PrintWriter printWriter) {
        super(2, fcxyVar);
        this.b = carcVar;
        this.c = printWriter;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caqy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            carc carcVar = this.b;
            this.a = 1;
            obj = carcVar.a("BugleCmsBackupTimingDumper", this);
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
        caqy caqyVar = new caqy(fcxyVar, this.b, this.c);
        caqyVar.d = obj;
        return caqyVar;
    }
}
