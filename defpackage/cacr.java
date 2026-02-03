package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cacr implements cadz {
    public static final eksp a = eksp.c("BugleCms");
    private final Context b;
    private final eosc c;

    public cacr(Context context, eosc eoscVar) {
        this.b = context;
        this.c = eoscVar;
    }

    @Override // defpackage.cadz
    public final eiju a(final int i, final caei caeiVar) {
        final qbr qbrVarA = qbq.a(this.b);
        final ekrz ekrzVarA = cady.a(caeiVar);
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(ekrzVarA, Integer.valueOf(i));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CancelCmsWorkManagerWorkStep", "doWork", 44, "CancelCmsWorkManagerWorkStep.java")).q("Canceling CMS work manager work while disabling feature");
        eiju eijuVarG = eiju.g(((qbb) qbrVarA.b("CmsInitialWork")).c);
        eooz eoozVar = new eooz() { // from class: caco
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cacr.a;
                return ((qbb) qbrVarA.a("MediaRestore")).c;
            }
        };
        eosc eoscVar = this.c;
        return eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: cacp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cacr.a;
                return ((qbb) qbrVarA.a("CmsMediaUpload")).c;
            }
        }, eoscVar).h(new ejvr() { // from class: cacq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar2 = (eksl) cacr.a.h();
                ekslVar2.X(ekrzVarA, Integer.valueOf(i));
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CancelCmsWorkManagerWorkStep", "doWork", 63, "CancelCmsWorkManagerWorkStep.java")).q("Canceled CMS work manager work.");
                caec caecVar = (caec) caeiVar.toBuilder();
                caecVar.copyOnWrite();
                caei caeiVar2 = (caei) caecVar.instance;
                caeiVar2.f = 2;
                caeiVar2.c |= 4;
                return (caei) caecVar.build();
            }
        }, eoscVar);
    }
}
