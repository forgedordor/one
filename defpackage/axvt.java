package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvt extends fcyz implements fdat {
    int a;
    final /* synthetic */ axwp b;
    final /* synthetic */ axus c;
    final /* synthetic */ axvu d;
    final /* synthetic */ emum e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvt(fcxy fcxyVar, axwp axwpVar, axus axusVar, axvu axvuVar, emum emumVar) {
        super(2, fcxyVar);
        this.b = axwpVar;
        this.c = axusVar;
        this.d = axvuVar;
        this.e = emumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        axwp axwpVar = this.b;
        cqce cqceVar = axwp.a;
        awgi awgiVar = (awgi) axwpVar.x.b();
        axus axusVar = this.c;
        ConversationIdType conversationIdTypeM = axusVar.m();
        baqv baqvVarF = axusVar.f();
        baqvVarF.getClass();
        axvu axvuVar = this.d;
        eiju eijuVarA = awgiVar.a(conversationIdTypeM, baqvVarF.b(), axvuVar.a, axvuVar.b, this.e);
        eijuVarA.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axvt axvtVar = new axvt(fcxyVar, this.b, this.c, this.d, this.e);
        axvtVar.f = obj;
        return axvtVar;
    }
}
