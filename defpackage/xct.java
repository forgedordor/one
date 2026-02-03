package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xct implements fdpm {
    final /* synthetic */ xdz a;

    public xct(xdz xdzVar) {
        this.a = xdzVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iIntValue = ((Number) obj).intValue();
        xdz xdzVar = this.a;
        if (iIntValue != xdzVar.k.get()) {
            return fctx.a;
        }
        ekrw ekrwVarE = xdz.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.V(5, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$2$1", "emit", 236, "DraftTextUiAdapterImpl.kt")).q("Sending start typing notification");
        Object objC = fdxs.c(xdzVar.c().c(), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
