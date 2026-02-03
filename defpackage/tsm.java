package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tsm extends fcyz implements fdat {
    int a;
    final /* synthetic */ tsn b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsm(tsn tsnVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tsnVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tsm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                tsl tslVar = (tsl) ((Optional) ((eyig) this.b.b).a).get();
                this.a = 1;
                obj = tslVar.a();
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            tsk tskVar = (tsk) obj;
            eqna eqnaVarB = eqna.b(tskVar.b);
            if (eqnaVarB == null) {
                eqnaVarB = eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
            }
            if (eqnaVarB == eqna.ENABLED) {
                String str = tskVar.c;
                str.getClass();
                if (str.length() > 0 && tskVar.d) {
                    tsn tsnVar = this.b;
                    ((acgu) tsnVar.c.b()).a(30);
                    ((ains) tsnVar.d.b()).c("Bugle.Prompt.Fi.SignIn.Trigger.Event.Counts");
                }
            }
        } catch (Throwable th) {
            ekrw ekrwVarJ = tsn.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged$execute$1", "invokeSuspend", 55, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Failed to retrieve FiSignInPromoData");
            if ((th instanceof fbtf) && (th.getCause() instanceof UserRecoverableAuthException)) {
                ((ains) this.b.d.b()).e("Bugle.Prompt.Fi.SignIn.Failure.Event.Counts", 1);
            } else {
                ((ains) this.b.d.b()).e("Bugle.Prompt.Fi.SignIn.Failure.Event.Counts", 0);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tsm(this.b, this.c, fcxyVar);
    }
}
