package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ vvg c;
    final /* synthetic */ vup d;
    final /* synthetic */ vvf e;
    final /* synthetic */ amie f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvc(vvg vvgVar, amie amieVar, vup vupVar, vvf vvfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = vvgVar;
        this.f = amieVar;
        this.d = vupVar;
        this.e = vvfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vvc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            list = obj2;
        } else {
            fctl.b(obj);
            ekrw ekrwVarF = vvf.a.f();
            ekrwVarF.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logMessageQueued$1", "invokeSuspend", 78, "BugleMessageQueuedLogger.kt");
            vvg vvgVar = this.c;
            amie amieVar = this.f;
            vup vupVar = this.d;
            ekrdVar.I("Logging message queued: %s, analyticsId: %s, imageCompressionInfo: %s", vvgVar, amieVar, vupVar);
            vvf vvfVar = this.e;
            vvw vvwVar = vvgVar.a;
            List listD = vvfVar.d(vvwVar, vvgVar.b);
            if (listD == null) {
                listD = fcvo.a;
            }
            List listAh = fcva.ah(listD, fcva.q(vvfVar.c(vvgVar, vupVar)));
            this.a = listAh;
            this.b = 1;
            obj = vvfVar.b(vvwVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            list = listAh;
        }
        amie amieVar2 = this.f;
        vvf vvfVar2 = this.e;
        vvg vvgVar2 = this.c;
        emvw emvwVar = (emvw) obj;
        enul enulVarA = enuk.a((emzm) emzn.a.createBuilder());
        enulVarA.c(amieVar2.a);
        if (!list.isEmpty()) {
            enulVarA.e();
            enulVarA.d(list);
        }
        vvfVar2.e(vvgVar2.a, enulVarA);
        if (emvwVar != null) {
            enulVarA.b(emvwVar);
        }
        final emzn emznVarA = enulVarA.a();
        vvfVar2.k(new Supplier() { // from class: vvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return emznVarA;
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vvc(this.c, this.f, this.d, this.e, fcxyVar);
    }
}
