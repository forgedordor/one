package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axri extends fcyz implements fdat {
    int a;
    final /* synthetic */ axrj b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axri(axrj axrjVar, MessageCoreData messageCoreData, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axrjVar;
        this.c = messageCoreData;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axri) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarF = ((aurx) this.b.I.b()).f();
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        axrj axrjVar = this.b;
        auml aumlVar = (auml) obj;
        aumlVar.getClass();
        elng elngVarL = autx.l(aumlVar);
        axrjVar.K.set(new axre().fH().fM(elngVarL));
        ((ajhd) axrjVar.r.b()).C(this.c, new Integer(this.d), this.e, elngVarL);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new axri(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
