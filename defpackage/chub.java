package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chub extends fcyz implements fdat {
    final /* synthetic */ ezny a;
    final /* synthetic */ chuc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chub(ezny eznyVar, chuc chucVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = eznyVar;
        this.b = chucVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chub) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        evsn evsnVarBuildPartial = this.a.buildPartial();
        evsnVarBuildPartial.getClass();
        ezny eznyVar = (ezny) ((eznz) evsnVarBuildPartial).toBuilder();
        eznyVar.getClass();
        DesugarCollections.unmodifiableList(((eznz) eznyVar.instance).b).getClass();
        List<String> list = chuc.a;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (String str : list) {
            eznt ezntVar = (eznt) eznv.a.createBuilder();
            ezntVar.getClass();
            eznx eznxVar = eznx.a;
            eznw eznwVar = (eznw) eznxVar.createBuilder();
            eznwVar.getClass();
            eykf.b("+g.gsma.rcs.botversion", eznwVar);
            eyke.b(eykf.a(eznwVar), ezntVar);
            eznw eznwVar2 = (eznw) eznxVar.createBuilder();
            eznwVar2.getClass();
            eykf.b(str, eznwVar2);
            eyke.c(eykf.a(eznwVar2), ezntVar);
            eyke.d(3, ezntVar);
            arrayList.add(eyke.a(ezntVar));
        }
        chuc chucVar = this.b;
        eznyVar.a(arrayList);
        if (chucVar.b.a()) {
            DesugarCollections.unmodifiableList(((eznz) eznyVar.instance).b).getClass();
            eznt ezntVar2 = (eznt) eznv.a.createBuilder();
            ezntVar2.getClass();
            eznx eznxVar2 = eznx.a;
            eznw eznwVar3 = (eznw) eznxVar2.createBuilder();
            eznwVar3.getClass();
            eykf.b("+g.gsma.rcs.botversion", eznwVar3);
            eyke.b(eykf.a(eznwVar3), ezntVar2);
            eznw eznwVar4 = (eznw) eznxVar2.createBuilder();
            eznwVar4.getClass();
            eykf.b("#=0.93", eznwVar4);
            eyke.c(eykf.a(eznwVar4), ezntVar2);
            eyke.d(3, ezntVar2);
            eznyVar.b(eyke.a(ezntVar2));
        }
        if (((eoth) ((dfkq) chucVar.c).a.b()).a("cslib.enable_open_url_webview_actions")) {
            DesugarCollections.unmodifiableList(((eznz) eznyVar.instance).b).getClass();
            eznt ezntVar3 = (eznt) eznv.a.createBuilder();
            ezntVar3.getClass();
            eznx eznxVar3 = eznx.a;
            eznw eznwVar5 = (eznw) eznxVar3.createBuilder();
            eznwVar5.getClass();
            eykf.b("+g.gsma.rcs.botversion", eznwVar5);
            eyke.b(eykf.a(eznwVar5), ezntVar3);
            eznw eznwVar6 = (eznw) eznxVar3.createBuilder();
            eznwVar6.getClass();
            eykf.b("#=1.9", eznwVar6);
            eyke.c(eykf.a(eznwVar6), ezntVar3);
            eyke.d(3, ezntVar3);
            eznyVar.b(eyke.a(ezntVar3));
        }
        DesugarCollections.unmodifiableList(((eznz) eznyVar.instance).b).getClass();
        eznt ezntVar4 = (eznt) eznv.a.createBuilder();
        ezntVar4.getClass();
        eznx eznxVar4 = eznx.a;
        eznw eznwVar7 = (eznw) eznxVar4.createBuilder();
        eznwVar7.getClass();
        eykf.b("+g.3gpp.iari-ref", eznwVar7);
        eyke.b(eykf.a(eznwVar7), ezntVar4);
        eznw eznwVar8 = (eznw) eznxVar4.createBuilder();
        eznwVar8.getClass();
        eykf.b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot", eznwVar8);
        eyke.c(eykf.a(eznwVar8), ezntVar4);
        eyke.d(3, ezntVar4);
        eznyVar.b(eyke.a(ezntVar4));
        evsn evsnVarBuild = eznyVar.build();
        evsnVarBuild.getClass();
        evsf builder = ((eznz) evsnVarBuild).toBuilder();
        builder.getClass();
        return builder;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chub(this.a, this.b, fcxyVar);
    }
}
