package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctol extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctom b;
    boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctol(fcxy fcxyVar, ctom ctomVar) {
        super(2, fcxyVar);
        this.b = ctomVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctol) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eiju eijuVar;
        boolean z;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            ctom ctomVar = this.b;
            eiju eijuVarA = ctomVar.b.a();
            eiju eijuVarA2 = ctomVar.c.a();
            eijuVarA.getClass();
            this.d = eijuVarA2;
            this.a = 1;
            Object objC = fdxs.c(eijuVarA, this);
            if (objC != fcylVar) {
                eijuVar = eijuVarA2;
                obj = objC;
            }
            return fcylVar;
        }
        if (i != 1) {
            z = this.c;
            fctl.b(obj);
            Object objOrElse = ((Optional) obj).orElse("");
            objOrElse.getClass();
            return new ctok(z, (String) objOrElse);
        }
        eijuVar = (eiju) this.d;
        fctl.b(obj);
        obj.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        eijuVar.getClass();
        this.d = null;
        this.c = zBooleanValue;
        this.a = 2;
        Object objC2 = fdxs.c(eijuVar, this);
        if (objC2 != fcylVar) {
            z = zBooleanValue;
            obj = objC2;
            Object objOrElse2 = ((Optional) obj).orElse("");
            objOrElse2.getClass();
            return new ctok(z, (String) objOrElse2);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctol ctolVar = new ctol(fcxyVar, this.b);
        ctolVar.d = obj;
        return ctolVar;
    }
}
