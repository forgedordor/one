package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafc implements cadz {
    public static final eksp a = eksp.c("BugleCms");
    private static final ekrz b = new ekrz("unregister_reason", String.class, false, false);
    private final ceff c;

    public cafc(ceff ceffVar) {
        this.c = ceffVar;
    }

    @Override // defpackage.cadz
    public final eiju a(int i, final caei caeiVar) {
        ekrz ekrzVarA = cady.a(caeiVar);
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(ekrzVarA, Integer.valueOf(i));
        ekslVar.X(b, Integer.toString(1));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "doWork", 49, "CmsUnregisterTachyonStep.java")).q("Doing Tachyon gaia unregister");
        eiju eijuVarR = this.c.r();
        ejvr ejvrVar = new ejvr() { // from class: cafa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) cafc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "doWork", 55, "CmsUnregisterTachyonStep.java")).q("Tachyon gaia unregister completed successfully");
                caec caecVar = (caec) caeiVar.toBuilder();
                caecVar.copyOnWrite();
                caei caeiVar2 = (caei) caecVar.instance;
                caeiVar2.f = 2;
                caeiVar2.c |= 4;
                return (caei) caecVar.build();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarR.h(ejvrVar, eoqgVar).f(Throwable.class, new eooz() { // from class: cafb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                eksp ekspVar = cafc.a;
                if (!Status.c(th).getCode().equals(Status.Code.UNAUTHENTICATED)) {
                    return eijx.d(th);
                }
                caei caeiVar2 = caeiVar;
                eksp ekspVar2 = cafc.a;
                ((eksl) ekspVar2.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "handleException", 65, "CmsUnregisterTachyonStep.java")).q("UNAUTHENTICATED from Tachyon");
                ((eksl) ((eksl) ekspVar2.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "handleException", 66, "CmsUnregisterTachyonStep.java")).q("Tachyon gaia unregister completed successfully");
                caec caecVar = (caec) caeiVar2.toBuilder();
                caecVar.copyOnWrite();
                caei caeiVar3 = (caei) caecVar.instance;
                caeiVar3.f = 2;
                caeiVar3.c |= 4;
                return eijx.e((caei) caecVar.build());
            }
        }, eoqgVar);
    }
}
