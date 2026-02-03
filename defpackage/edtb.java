package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edtb extends lxd {
    public final ecpy a;
    public final edgv b;
    public final ecpx c;
    public final lvx d;
    public final edmz e;
    public final eusa f;
    public boolean g;
    public boolean h;

    public edtb(ecpy ecpyVar, Context context, ejwi ejwiVar, edgv edgvVar, edmj edmjVar, edmz edmzVar, eusa eusaVar) {
        this.a = ecpyVar;
        this.b = edgvVar;
        Account account = (Account) ejwiVar.c();
        if (context == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (TextUtils.isEmpty("DGfUjvgDP0m9qsni3Km0UPdYwhSC")) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        this.c = new ecpx(context, "DGfUjvgDP0m9qsni3Km0UPdYwhSC", new edta(this), null, account, fbgv.a.get().A());
        lvx lvxVar = new lvx();
        this.d = lvxVar;
        this.e = edmzVar;
        this.f = eusaVar;
        lvxVar.p(edmjVar.b, new lvz() { // from class: edsz
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edhm edhmVar = (edhm) obj;
                if (edhmVar.b().g() && edhmVar.d() == 4) {
                    edtb edtbVar = this.a;
                    edtbVar.g = edtbVar.h;
                    edtbVar.h = ((edml) edhmVar.b().c()).c();
                }
            }
        });
    }
}
