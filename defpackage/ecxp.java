package defpackage;

import android.util.Log;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecxp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ecxr b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecxp(ecxr ecxrVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ecxrVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ecxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (StatusException e) {
            if (e.a.getCode() != Status.Code.UNAUTHENTICATED) {
                throw e;
            }
            if (Log.isLoggable("ProfileCommon", 4)) {
                Log.i("ProfileCommon", "Refreshing expired auth token", e);
            }
            ecxr ecxrVar = this.b;
            fdat fdatVar = this.c;
            this.a = 2;
            Object objA = ecxrVar.a(fdatVar, this);
            if (objA != fcylVar) {
                return objA;
            }
        }
        if (i != 0) {
            if (i != 1) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        ecxr ecxrVar2 = this.b;
        fdat fdatVar2 = this.c;
        this.a = 1;
        Object objA2 = ecxrVar2.a(fdatVar2, this);
        return objA2 == fcylVar ? fcylVar : objA2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ecxp(this.b, this.c, fcxyVar);
    }
}
