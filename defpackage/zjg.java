package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjg extends fcyz implements fdat {
    int a;
    final /* synthetic */ zjj b;
    final /* synthetic */ zjk c;
    final /* synthetic */ amty d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjg(zjj zjjVar, amty amtyVar, zjk zjkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zjjVar;
        this.d = amtyVar;
        this.c = zjkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            amty amtyVar = this.d;
            zjk zjkVar = this.c;
            amtyVar.b.invoke(zjkVar.name());
            if (zjkVar == zjk.f) {
                this.b.d.c(vwd.a);
                return fctx.a;
            }
            zjj zjjVar = this.b;
            int i2 = zjkVar.i;
            Context context = zjjVar.b;
            String string = context.getString(i2);
            string.getClass();
            String string2 = context.getString(R.string.emergency_questionnaire_card_message, string);
            string2.getClass();
            this.a = 2;
            if (zjjVar.b(string2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zjg(this.b, this.d, this.c, fcxyVar);
    }
}
