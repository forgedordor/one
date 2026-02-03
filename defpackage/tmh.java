package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tmh extends fcyz implements fdat {
    int a;
    final /* synthetic */ efwo b;
    final /* synthetic */ tmi c;
    final /* synthetic */ efyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmh(efwo efwoVar, tmi tmiVar, efyr efyrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
        this.c = tmiVar;
        this.d = efyrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tmh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        trs trsVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                efwo efwoVar = this.b;
                if (efwoVar.a() == -1) {
                    ekrw ekrwVarH = tmi.a.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 50, "FiAccountRequirement.kt")).q("received Invalid account.");
                    throw new tmj(1);
                }
                eiju eijuVarC = ((tml) ehlh.a(this.c.b, tml.class, efwoVar)).b().c();
                eijuVarC.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarC, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            trs trsVar2 = (trs) obj;
            if (trsVar2 == null) {
                fdbq.c("fiVerificationData");
                trsVar = null;
            } else {
                trsVar = trsVar2;
            }
            if (!trsVar.c) {
                ekrw ekrwVarH2 = tmi.a.h();
                ekrwVarH2.X(eksq.a, "BugleCms");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 81, "FiAccountRequirement.kt")).q("The selected account is not an active Fi account.");
                throw new tmj(2);
            }
            ekrw ekrwVarH3 = tmi.a.h();
            ekrwVarH3.X(eksq.a, "BugleCms");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 77, "FiAccountRequirement.kt")).q("The selected account is an active Fi account.");
            Intent intent = this.d.a;
            if (intent != null) {
                intent.putExtra("RCS_IS_ON", trsVar2.d);
            }
            return egbd.d();
        } catch (Exception e) {
            ekrw ekrwVarJ = tmi.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 69, "FiAccountRequirement.kt")).q("internal error when get FiVerificationData.");
            throw new tmj(3, e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tmh(this.b, this.c, this.d, fcxyVar);
    }
}
