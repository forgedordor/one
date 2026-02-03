package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeap extends fcyz implements fdat {
    final /* synthetic */ gun a;
    final /* synthetic */ add b;
    final /* synthetic */ Account c;
    final /* synthetic */ edwx d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeap(gun gunVar, add addVar, Account account, edwx edwxVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = gunVar;
        this.b = addVar;
        this.c = account;
        this.d = edwxVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eeap) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        guk gukVarA = this.a.a();
        if (gukVarA != null) {
            gukVarA.a();
        }
        add addVar = this.b;
        Account account = this.c;
        edwx edwxVar = this.d;
        String str = this.e;
        etzq etzqVar = etzq.OBAKE_PICTURE_PICKER_CROP_SCREEN;
        fcxe fcxeVar = new fcxe();
        fcxeVar.put("cau", "true");
        fcxeVar.put("hostSurface", "pqe");
        edws edwsVar = (edws) edwxVar;
        fcxeVar.put("mediaKey", edwsVar.c);
        fcxeVar.put("photoUrl", edwsVar.d);
        fcxeVar.put("photoSource", edwsVar.e);
        fcxeVar.put("hostId", str);
        addVar.c(eeax.a(account, etzqVar, fcwa.b(fcxeVar)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eeap(this.a, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
