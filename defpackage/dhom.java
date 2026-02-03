package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhom extends fcyz implements fdat {
    final /* synthetic */ dhop a;
    final /* synthetic */ sfp b;
    final /* synthetic */ List c;
    final /* synthetic */ dhuu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhom(dhop dhopVar, sfp sfpVar, List list, dhuu dhuuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dhopVar;
        this.b = sfpVar;
        this.c = list;
        this.d = dhuuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrd ekrdVar = (ekrd) dhop.a.h().h("com/google/android/libraries/abuse/hades/moirai/MoiraiApi$classifyForInstrumentation$5", "invokeSuspend", 240, "MoiraiApi.kt");
        dhop dhopVar = this.a;
        dhnv dhnvVar = dhopVar.b;
        ekrdVar.t("Calling classify for client %s", dhnvVar);
        dhuh dhuhVarA = dhopVar.d.a(dhnvVar.b);
        ejxm ejxmVarC = ejxm.c(ejya.b);
        dhuu dhuuVar = this.d;
        try {
            dhwy dhwyVar = dhopVar.f;
            if (dhwyVar == null) {
                fdbq.c("classifier");
                dhwyVar = null;
            }
            dhwj dhwjVarA = dhwyVar.a(dhuuVar);
            dhop dhopVar2 = this.a;
            dhub dhubVar = dhopVar2.d;
            dhnv dhnvVar2 = dhopVar2.b;
            dhuh dhuhVarA2 = dhubVar.a(dhnvVar2.b);
            if (dhuhVarA2 != null) {
                dhuhVarA2.a(dhnvVar2, dhwjVarA, this.b);
            }
            if (this.b != null) {
                return new dhuw(new dhvp("NONE", dhun.a, 4));
            }
            List list = this.c;
            fcvo fcvoVar = fcvo.a;
            return new dhuw(fcvoVar, dhwjVarA.a, list.contains(dhve.d) ? dhwjVarA.d : fcvoVar);
        } catch (dhvf e) {
            if (dhuhVarA != null) {
                dhuhVarA.d(dhnvVar, e.a, ejxmVarC.a(TimeUnit.MILLISECONDS), e.b, e.c, e.d);
            }
            throw e;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhom(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
