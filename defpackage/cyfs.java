package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfs extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ cyfu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfs(hox hoxVar, cyfu cyfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = cyfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyfs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [hox] */
    /* JADX WARN: Type inference failed for: r0v14 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        ?? r0;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        try {
        } catch (dcfv e) {
            cyfu.a.s("getKeyMaterial failed. Trying to resolving it.", e);
            cyfu cyfuVar = this.d;
            Status status = e.a;
            if (status.c()) {
                Bundle bundle = dcni.d() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
                Activity activity = cyfuVar.c;
                PendingIntent pendingIntent = status.i;
                dclh.m(pendingIntent);
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, null, 0, 0, 0, bundle);
            }
            this.c.b("Resolved the key.");
        } catch (dcff e2) {
            cyfu.a.s("getKeyMaterial failed", e2);
            this.c.b("getKeyMaterial failed.\n\ne");
        } catch (GeneralSecurityException e3) {
            cyfu.a.s("getKeyMaterial failed", e3);
            hox hoxVar = this.c;
            e3.toString();
            hoxVar.b("getKeyMaterial failed.\n\n ".concat(e3.toString()));
        }
        if (i == 0) {
            fctl.b(obj);
            hox hoxVar2 = this.c;
            cyda cydaVar = this.d.b;
            this.a = hoxVar2;
            this.b = 1;
            fdkf fdkfVarB = fdin.b(cydaVar.d, eicg.a(fcyi.a), fdjz.a, new cycr(null, cydaVar));
            if (fdkfVarB == fcylVar) {
                return fcylVar;
            }
            obj2 = hoxVar2;
            obj = fdkfVarB;
        } else {
            if (i != 1) {
                Object obj3 = this.a;
                fctl.b(obj);
                r0 = obj3;
                r0.b(obj);
                return fctx.a;
            }
            obj2 = this.a;
            fctl.b(obj);
        }
        this.a = obj2;
        this.b = 2;
        obj = ((fdkf) obj).c(this);
        if (obj != fcylVar) {
            r0 = obj2;
            r0.b(obj);
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyfs(this.c, this.d, fcxyVar);
    }
}
