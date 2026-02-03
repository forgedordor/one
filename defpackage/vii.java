package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vii extends fcyz implements fdat {
    int a;
    final /* synthetic */ vij b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vii(vij vijVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vijVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vii) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarN = this.c.n();
            this.a = 1;
            obj = fdxs.c(eijuVarN, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        vij vijVar = this.b;
        Context context = vijVar.a;
        String str = (String) obj;
        String string = context.getString(R.string.message_details_popup_title);
        str.getClass();
        String string2 = context.getString(R.string.close_button_text);
        string2.getClass();
        vijVar.b.c(new djmj(str, null, null, string, true, false, new dktq(string2, new fdae() { // from class: vih
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, null, 422), true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vii(this.b, this.c, fcxyVar);
    }
}
