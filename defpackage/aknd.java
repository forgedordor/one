package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aknd extends fcyz implements fdat {
    int a;
    final /* synthetic */ aknj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aknd(fcxy fcxyVar, aknj aknjVar) {
        super(2, fcxyVar);
        this.b = aknjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aknd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eiju eijuVarC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aknj aknjVar = this.b;
        ConversationIdType conversationIdType = aknjVar.d.l().a;
        if (((Boolean) asqt.b.e()).booleanValue()) {
            asqr asqrVar = aknjVar.b;
            eijuVarC = auvw.c(asqrVar.b, fcyi.a, fdjz.a, new asqn(asqrVar, conversationIdType, null));
        } else {
            eijuVarC = eijx.e(asqe.HIDE);
            eijuVarC.getClass();
        }
        this.a = 1;
        Object objC = fdxs.c(eijuVarC, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aknd akndVar = new aknd(fcxyVar, this.b);
        akndVar.c = obj;
        return akndVar;
    }
}
