package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agvo extends fcyz implements fdat {
    int a;
    final /* synthetic */ agvz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvo(agvz agvzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agvo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarE = agvz.a.e();
            ekrwVarE.X(eksq.a, "BugleGemini");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$refreshInternal$2$1", "invokeSuspend", 134, "PenpalReauthenticateHandlerImpl.kt")).q("Refreshing OAuth2 token from conversation screen");
            agvz agvzVar = this.b;
            ListenableFuture listenableFutureA = ((egej) agvzVar.m.b()).a((efwo) agvzVar.i.b());
            this.a = 1;
            obj = fdxs.c(listenableFutureA, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        ListenableFuture listenableFutureA2 = drgi.a(((dbmr) this.b.l.b()).c((Account) obj, "oauth2:https://www.googleapis.com/auth/tachyon", agvz.b));
        this.a = 2;
        Object objC = fdxs.c(listenableFutureA2, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agvo(this.b, fcxyVar);
    }
}
