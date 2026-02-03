package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscm extends fcyz implements fdat {
    final /* synthetic */ MessageCoreData a;
    final /* synthetic */ cscs b;
    final /* synthetic */ Integer c;
    final /* synthetic */ cskl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscm(fcxy fcxyVar, MessageCoreData messageCoreData, cscs cscsVar, Integer num, cskl csklVar) {
        super(2, fcxyVar);
        this.a = messageCoreData;
        this.b = cscsVar;
        this.c = num;
        this.d = csklVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.e;
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fcyh fcyhVarA = eicg.a(fcyiVar);
        cscs cscsVar = this.b;
        MessageCoreData messageCoreData = this.a;
        fdkf fdkfVarB = fdin.b(fdjxVar, fcyhVarA, fdjzVar, new cscn(null, cscsVar, messageCoreData));
        fdkf fdkfVarC = eicj.c(fdjxVar, new csck(cscsVar, messageCoreData, null));
        return new csch(messageCoreData, ((cspk) cscsVar.c.b()).a(messageCoreData), ((cspg) cscsVar.d.b()).a(messageCoreData.A()), fdkfVarB, fdkfVarC, fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new csco(null, cscsVar, messageCoreData)), fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new cscp(null, fdkfVarC)), new cscj(cscsVar, messageCoreData, null), this.c, this.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cscm cscmVar = new cscm(fcxyVar, this.a, this.b, this.c, this.d);
        cscmVar.e = obj;
        return cscmVar;
    }
}
