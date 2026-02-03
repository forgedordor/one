package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.MonthDay;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ResolvedRecipient b;
    final /* synthetic */ tfq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfp(ResolvedRecipient resolvedRecipient, tfq tfqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = resolvedRecipient;
        this.c = tfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ResolvedRecipient resolvedRecipient = this.b;
            if (resolvedRecipient != null) {
                tfq tfqVar = this.c;
                Uri uriE = resolvedRecipient.e();
                alqm alqmVarG = resolvedRecipient.g();
                MonthDay monthDayC = tep.c(tfqVar.h.a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/contact_event");
                contentValues.put("data2", (Integer) 3);
                contentValues.put("data1", monthDayC.toString());
                ekgb ekgbVarR = ekgb.r(contentValues);
                ekgbVarR.getClass();
                tfqVar.g.h(new agbo(uriE, alqmVarG, 11, ekgbVarR));
            }
            tfq tfqVar2 = this.c;
            fcyh fcyhVarA = eicg.a(tfqVar2.b);
            tfo tfoVar = new tfo(null, tfqVar2);
            this.a = 1;
            if (fdin.a(fcyhVarA, tfoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tfp(this.b, this.c, fcxyVar);
    }
}
