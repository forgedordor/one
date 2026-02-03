package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abuf extends fcyz implements fdat {
    int a;
    final /* synthetic */ abuh b;
    final /* synthetic */ Recipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abuf(abuh abuhVar, Recipient recipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abuhVar;
        this.c = recipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abuf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajln ajlnVar = (ajln) this.b.a.b();
        Recipient recipient = this.c;
        ekgb ekgbVarR = ekgb.r(recipient);
        String strX = recipient.x(false);
        if (aqbw.a()) {
            strX = cssf.a(strX);
        }
        eiju eijuVarM = ajlnVar.m(ekgbVarR, strX);
        eijuVarM.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarM, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abuf(this.b, this.c, fcxyVar);
    }
}
