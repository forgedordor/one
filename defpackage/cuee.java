package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuee extends fcyz implements fdat {
    int a;
    final /* synthetic */ cuef b;
    final /* synthetic */ SelfIdentityId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuee(cuef cuefVar, SelfIdentityId selfIdentityId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cuefVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuee) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVarE = auvw.e(((aofc) this.b.b.b()).e(this.c));
            this.a = 1;
            obj = fdkfVarE.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        aoer aoerVar = (aoer) fdct.b((Optional) obj);
        if (aoerVar == null) {
            ekrw ekrwVarJ = cuef.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/startchat/tracker/SelectedSelfIdentityTrackerImpl$initialize$2", "invokeSuspend", 71, "SelectedSelfIdentityTrackerImpl.kt")).q("Self-identity was not present in the repository.");
        }
        this.b.d(aoerVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuee(this.b, this.c, fcxyVar);
    }
}
