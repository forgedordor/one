package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vve extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ vvg c;
    final /* synthetic */ List d;
    final /* synthetic */ vup e;
    final /* synthetic */ vvf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vve(vvg vvgVar, List list, vup vupVar, vvf vvfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = vvgVar;
        this.d = list;
        this.e = vupVar;
        this.f = vvfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vve) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            ekrd ekrdVar = (ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 111, "BugleMessageQueuedLogger.kt");
            vvg vvgVar = this.c;
            List list2 = this.d;
            vup vupVar = this.e;
            ekrdVar.I("Logging split RCS message queued: %s, analyticsIds: %s, imageCompressionInfo: %s", vvgVar, list2, vupVar);
            vvf vvfVar = this.f;
            vvw vvwVar = vvgVar.a;
            List listAh = fcva.ah(fcva.h(vvfVar.d(vvwVar, vvgVar.b)), vvfVar.c(vvgVar, vupVar));
            if (listAh.size() != list2.size()) {
                throw new IllegalArgumentException("Size of attachmentInfos (" + listAh.size() + ") and attachmentAnalyticsIds (" + list2.size() + ") must match to log each messageQueuedEvent correctly");
            }
            this.a = listAh;
            this.b = 1;
            obj = vvfVar.b(vvwVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            list = listAh;
        }
        final emvw emvwVar = (emvw) obj;
        for (fcti fctiVar : fcva.ar(list, this.d)) {
            final List list3 = (List) fctiVar.a;
            final long jLongValue = ((Number) fctiVar.b).longValue();
            ekrw ekrwVarF2 = vvf.a.f();
            ekrwVarF2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarF2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 135, "BugleMessageQueuedLogger.kt")).C("Logging message queued attachmentInfo: %s, analyticsId: %s", list3, jLongValue);
            final vvf vvfVar2 = this.f;
            final vvg vvgVar2 = this.c;
            vvfVar2.k(new Supplier() { // from class: vvd
                @Override // java.util.function.Supplier
                public final Object get() {
                    enul enulVarA = enuk.a((emzm) emzn.a.createBuilder());
                    enulVarA.c(jLongValue);
                    enulVarA.e();
                    enulVarA.d(list3);
                    vvfVar2.e(vvgVar2.a, enulVarA);
                    emvw emvwVar2 = emvwVar;
                    if (emvwVar2 != null) {
                        enulVarA.b(emvwVar2);
                    }
                    return enulVarA.a();
                }
            });
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vve(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
