package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxvo extends fcyz implements fdat {
    final /* synthetic */ cqce a;
    final /* synthetic */ ekgb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxvo(fcxy fcxyVar, cqce cqceVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.a = cqceVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxvo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cqce cqceVar = this.a;
        cqceVar.p("Local cms keys");
        ekqh it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            bnar bnarVar = (bnar) it.next();
            byte[] bArrQ = bnarVar.q();
            bArrQ.getClass();
            String strJ = eldz.h.j(bArrQ);
            int length = bArrQ.length;
            String strZ = length >= 32 ? fdgn.Z(strJ, 3) : a.e(length, "short(", ")");
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, bnarVar.m());
            cqbdVarC.y("index", bnarVar.k());
            cqbdVarC.A("cmsId", bnarVar.p());
            cqbdVarC.A("correlationId", bnarVar.o());
            cqbdVarC.A("ref", strZ);
            cqbdVarC.y("length", length);
            cqbdVarC.r();
        }
        cqceVar.p("End cms keys");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxvo cxvoVar = new cxvo(fcxyVar, this.a, this.b);
        cxvoVar.c = obj;
        return cxvoVar;
    }
}
