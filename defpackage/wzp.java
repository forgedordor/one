package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzp extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;

    public wzp(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzp) c((vzy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            vzy vzyVar = (vzy) this.b;
            fctl.b(obj);
            return vzyVar;
        }
        fctl.b(obj);
        vzy vzyVar2 = (vzy) this.b;
        ekrw ekrwVarG = xac.a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$enabledFlow$2", "invokeSuspend", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SendButtonUiAdapterImpl.kt")).t("SendButtonUiAdapterImpl.enabledFlow iconDataFlow with %s", vzyVar2);
        if (vzyVar2 == vzy.a) {
            long j = xac.b;
            this.b = vzyVar2;
            this.a = 1;
            if (fdkj.d(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        return vzyVar2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wzp wzpVar = new wzp(fcxyVar);
        wzpVar.b = obj;
        return wzpVar;
    }
}
