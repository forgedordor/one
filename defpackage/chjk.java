package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chjk extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ chjl c;
    final /* synthetic */ chik d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chjk(chjl chjlVar, chik chikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = chjlVar;
        this.d = chikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chjk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
            objC = obj;
        } else {
            fctl.b(obj);
            chjl chjlVar = this.c;
            chik chikVar = this.d;
            ContentValues contentValues = new ContentValues();
            chia chiaVar = chikVar.d;
            chjn chjnVar = chiaVar.e;
            String str = chjnVar.a;
            if (str.length() > 0) {
                contentValues.put("subject", str);
            }
            int i = chjnVar.b;
            contentValues.put("sub_id", Integer.valueOf(i));
            contentValues.put("reply_path_present", Integer.valueOf(chjnVar.c ? 1 : 0));
            String str2 = chjnVar.d;
            if (str2.length() > 0) {
                contentValues.put("service_center", str2);
            }
            contentValues.put("protocol", Integer.valueOf(chjnVar.e));
            contentValues.put("address", chiaVar.b.j());
            if (chjlVar.a.O()) {
                contentValues.put("date_sent", Long.valueOf(chiaVar.c.toEpochMilli()));
            }
            contentValues.put("date", Long.valueOf(chiaVar.d.toEpochMilli()));
            contentValues.put("body", chiaVar.a);
            contentValues.put("m_cls", Integer.valueOf(chiaVar.f - 1));
            contentValues.put("error_code", (Integer) 0);
            eiju eijuVarF = chjlVar.b.f(i, contentValues, chikVar.a, chjnVar.f);
            this.a = contentValues;
            this.b = 1;
            objC = fdxs.c(eijuVarF, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            obj2 = contentValues;
        }
        aydc aydcVar = (aydc) objC;
        chhu chhuVar = new chhu(aydcVar.h(), new cnqj(aydcVar.d()), aydcVar.o());
        chhz chhzVar = new chhz(aydcVar.p(), aydcVar.n(), aydcVar.r(), craf.i(this.c.c), aydcVar.j(), aydcVar.f(), null);
        chik chikVar2 = this.d;
        return new chif(chikVar2.a, chikVar2.b, chikVar2.c, chikVar2.d, chhuVar, chhzVar, (ContentValues) obj2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chjk(this.c, this.d, fcxyVar);
    }
}
