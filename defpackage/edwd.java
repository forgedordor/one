package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edwd extends fcyz implements fdat {
    int a;
    final /* synthetic */ edwi b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edwd(edwi edwiVar, Account account, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edwiVar;
        this.c = account;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edwd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                edvw edvwVar = this.b.b;
                String str = this.c.name;
                str.getClass();
                this.a = 1;
                obj = edvwVar.a(str, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            edvv edvvVar = (edvv) obj;
            fduf fdufVar = this.b.e;
            edwo edwoVar = edwo.a;
            String str2 = edvvVar.a;
            Object obj2 = edvvVar.b;
            String str3 = this.c.name;
            str3.getClass();
            fdufVar.g(edwoVar, new edwn(str2, obj2, str3, etvj.MESSAGE_UNDEFINED, true, false, edvvVar.c, false));
        } catch (Exception e) {
            ((ekrd) ((ekrd) edwi.a.i()).g(e).h("com/google/android/libraries/user/profile/quickeditor/data/ProfileRepositoryImpl$launchAccountInfoLoad$1", "invokeSuspend", 112, "ProfileRepositoryImpl.kt")).q("failed to load owner state");
            edwi edwiVar = this.b;
            edwiVar.e.f(new edwj(e));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edwd(this.b, this.c, fcxyVar);
    }
}
