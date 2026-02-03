package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbe extends fcyz implements fdat {
    final /* synthetic */ xbh a;
    final /* synthetic */ fhaz b;
    final /* synthetic */ fhaz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbe(fcxy fcxyVar, xbh xbhVar, fhaz fhazVar, fhaz fhazVar2) {
        super(2, fcxyVar);
        this.a = xbhVar;
        this.b = fhazVar;
        this.c = fhazVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xbe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fhaz fhazVar = this.c;
        fhazVar.getClass();
        fhaz fhazVar2 = this.b;
        fhazVar2.getClass();
        fhazVar.getClass();
        ecem.c();
        cmxm cmxmVar = cmxm.SEND_BUTTON_ACCURATE;
        String str = fhazVar2.b;
        boolean zBooleanValue = ((Boolean) cmxn.l.e()).booleanValue();
        cmxn cmxnVar = this.a.a.a;
        if (zBooleanValue) {
            ((ConcurrentHashMap) cmxnVar.x.get(cmxmVar.ordinal())).remove(str);
        }
        cmxnVar.g(cmxmVar, fhazVar.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xbe xbeVar = new xbe(fcxyVar, this.a, this.b, this.c);
        xbeVar.d = obj;
        return xbeVar;
    }
}
