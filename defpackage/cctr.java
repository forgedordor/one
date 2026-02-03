package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cctr extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccts b;
    final /* synthetic */ cctv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cctr(ccts cctsVar, cctv cctvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cctsVar;
        this.c = cctvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cctr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccts cctsVar = this.b;
            cctv cctvVar = this.c;
            String str = cctvVar.h;
            str.getClass();
            ccps ccpsVar = cctvVar.c;
            if (ccpsVar == null) {
                ccpsVar = ccps.a;
            }
            ccpm ccpmVar = cctsVar.b;
            ccpsVar.getClass();
            ccpl ccplVarA = ccpmVar.a(ccpsVar);
            evqs evqsVar = cctvVar.d;
            evqsVar.getClass();
            evvp evvpVar = cctvVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            ccud ccudVar = cctsVar.a;
            evvpVar.getClass();
            Instant instantD = evxd.d(evvpVar);
            this.a = 1;
            if (ccudVar.b(str, ccplVarA, evqsVar, instantD, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cctr(this.b, this.c, fcxyVar);
    }
}
