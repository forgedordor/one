package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crcj extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ fdkf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crcj(fcxy fcxyVar, crcm crcmVar, fdkf fdkfVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = fdkfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crcj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        crif crifVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            crifVar = (crif) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            crif crifVar2 = (crif) this.b.b.b();
            fdkf fdkfVar = this.c;
            this.d = crifVar2;
            this.a = 1;
            Object objC = fdkfVar.c(this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            crifVar = crifVar2;
            obj = objC;
        }
        crifVar.o((List) obj, ezai.SHOWN_REPLIED);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crcj crcjVar = new crcj(fcxyVar, this.b, this.c);
        crcjVar.d = obj;
        return crcjVar;
    }
}
