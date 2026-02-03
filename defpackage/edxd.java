package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edxd extends fcyz implements fdat {
    int a;
    final /* synthetic */ edxi b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edxd(edxi edxiVar, Account account, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edxiVar;
        this.c = account;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edxd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            edxi edxiVar = this.b;
            edxiVar.f.f(false);
            edxiVar.g.f(null);
            Account account = this.c;
            this.a = 1;
            edwi edwiVar = (edwi) edxiVar.a;
            Object objA = fdin.a(edwiVar.d, new edwc(edwiVar, account, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edxd(this.b, this.c, fcxyVar);
    }
}
