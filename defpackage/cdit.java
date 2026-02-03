package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdit extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdiv b;
    final /* synthetic */ UserRecoverableAuthException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdit(cdiv cdivVar, UserRecoverableAuthException userRecoverableAuthException, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdivVar;
        this.c = userRecoverableAuthException;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdit) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((cden) this.b.a.b()).b(this.c);
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdit(this.b, this.c, fcxyVar);
    }
}
