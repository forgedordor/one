package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daqx extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ daqz h;
    final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqx(daqz daqzVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.h = daqzVar;
        this.i = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.g != 0) {
                obj3 = this.f;
                obj2 = this.e;
                obj4 = this.d;
                obj6 = this.c;
                obj5 = this.b;
                Object obj7 = this.a;
                fctl.b(obj);
                eieuVar = obj7;
            } else {
                fctl.b(obj);
                daqz daqzVar = this.h;
                List list = this.i;
                eieu eieuVarH = eiiy.h("LoadPagedConversationHandlerImpl#loadRecentConversationsWithMessageAsFuture");
                ctbl ctblVar = (ctbl) ctbm.a.createBuilder();
                ctblVar.getClass();
                ctbn ctbnVar = new ctbn(ctblVar);
                ctaq ctaqVar = (ctaq) ctar.a.createBuilder();
                ctaqVar.getClass();
                ctaqVar.copyOnWrite();
                ((ctar) ctaqVar.instance).b = 9;
                evsn evsnVarBuild = ctaqVar.build();
                evsnVarBuild.getClass();
                ctbl ctblVar2 = ctbnVar.a;
                ctblVar2.copyOnWrite();
                ctbm ctbmVar = (ctbm) ctblVar2.instance;
                ctbmVar.e = (ctar) evsnVarBuild;
                ctbmVar.b |= 1;
                ctat ctatVarA = ctas.a((ctau) ctav.a.createBuilder());
                evwn evwnVarB = ctatVarA.b();
                daql daqlVar = (daql) daqzVar.b.b();
                this.a = eieuVarH;
                this.b = ctbnVar;
                this.c = ctatVarA;
                this.d = ctbnVar;
                this.e = ctatVarA;
                this.f = evwnVarB;
                this.g = 1;
                obj = fdin.a(eicg.a(daqlVar.d), new daqj(null, daqlVar, list), this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                obj2 = ctatVarA;
                obj3 = evwnVarB;
                obj4 = ctbnVar;
                obj5 = obj4;
                obj6 = obj2;
                eieuVar = eieuVarH;
            }
            ((ctat) obj2).c((evwn) obj3, (Iterable) obj);
            ctav ctavVarA = ((ctat) obj6).a();
            ctbl ctblVar3 = ((ctbn) obj4).a;
            ctblVar3.copyOnWrite();
            ctbm ctbmVar2 = (ctbm) ctblVar3.instance;
            ctbm ctbmVar3 = ctbm.a;
            ctbmVar2.d = ctavVarA;
            ctbmVar2.c = 2;
            evsn evsnVarBuild2 = ((ctbn) obj5).a.build();
            evsnVarBuild2.getClass();
            ctbm ctbmVar4 = (ctbm) evsnVarBuild2;
            fczl.a(eieuVar, null);
            return ctbmVar4;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daqx(this.h, this.i, fcxyVar);
    }
}
