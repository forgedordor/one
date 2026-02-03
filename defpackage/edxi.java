package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edxi extends lxd {
    public final edvz a;
    public final fdjx b;
    public final fdjx c;
    public final hox d;
    public final hsf e;
    public final fduf f;
    public final fduf g;
    public final fduf h;
    public final ecxo i;
    private final fcyh j;
    private final fcyh k;
    private final fdjx l;

    public edxi(fcyh fcyhVar, fcyh fcyhVar2, fdjx fdjxVar, edvz edvzVar, ecxo ecxoVar) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fdjxVar.getClass();
        this.j = fcyhVar;
        this.k = fcyhVar2;
        this.l = fdjxVar;
        this.a = edvzVar;
        this.i = ecxoVar;
        fdjx fdjxVarD = fdjy.d(fdjxVar, fcyhVar);
        this.b = fdjxVarD;
        this.c = fdjy.d(fdjxVar, fcyhVar2);
        hpl hplVar = new hpl(edwv.a, hsi.a);
        this.d = hplVar;
        this.e = hplVar;
        this.f = fdvf.a(false);
        this.g = fdvf.a(null);
        this.h = fdvf.a(null);
        fdil.d(fdjxVarD, null, null, new edxb(this, null), 3);
    }

    public final void a(Account account) {
        account.getClass();
        fdil.d(this.b, null, null, new edxd(this, account, null), 3);
    }
}
