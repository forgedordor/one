package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywa extends dywb {
    public static final dbyw a = dbyw.c(78315553, eyen.LOGGER_OVERRIDE_PROVIDER);
    private final dxxk b;
    private final dbyl c;
    private final dbyl d;
    private final String e;

    public dywa(dxxk dxxkVar, Context context) {
        List list = dbyl.m;
        dbyi dbyiVar = new dbyi(context, "ONEGOOGLE_MOBILE");
        dbyiVar.g = new dbyu() { // from class: dyvz
            @Override // defpackage.dbyu
            public final dbyw a() {
                return dywa.a;
            }
        };
        dbyl dbylVarC = dbyiVar.c();
        dbyl dbylVarL = dbyl.l(context, "ONEGOOGLE_MOBILE");
        this.c = dbylVarC;
        this.d = dbylVarL;
        this.b = dxxkVar;
        this.e = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.dywb, defpackage.dywc
    public final void a(Object obj, exbg exbgVar) {
        dxxk dxxkVar = this.b;
        egbe egbeVar = (egbe) obj;
        int i = 2;
        int i2 = (egbeVar == null ? new dsty(3, null) : "pseudonymous".equals(egbeVar.b().k) ? new dsty(2, null) : "incognito".equals(egbeVar.b().k) ? new dsty(3, null) : ((egli) dxxkVar).g(egbeVar) ? dsty.a(egli.i(egbeVar)) : new dsty(2, null)).b;
        if (i2 == 4) {
            return;
        }
        if (i2 != 1 || (obj != null && dxxkVar.g(obj))) {
            i = i2;
        }
        b(i, obj, exbgVar);
    }

    public final void b(int i, Object obj, exbg exbgVar) {
        dbyk dbykVarJ;
        int iA = exbp.a(exbgVar.c);
        boolean z = false;
        ejwl.a((iA == 0 || iA == 1) ? false : true);
        int iA2 = exbm.a(exbgVar.d);
        ejwl.a((iA2 == 0 || iA2 == 1) ? false : true);
        int iA3 = exbk.a(exbgVar.f);
        if (iA3 != 0 && iA3 != 1) {
            z = true;
        }
        ejwl.a(z);
        exbh exbhVar = (exbh) exbi.a.createBuilder();
        exbf exbfVar = (exbf) exbgVar.toBuilder();
        String str = this.e;
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        str.getClass();
        exbgVar2.b |= 64;
        exbgVar2.g = str;
        exbg exbgVar3 = (exbg) exbfVar.build();
        exbhVar.copyOnWrite();
        exbi exbiVar = (exbi) exbhVar.instance;
        exbgVar3.getClass();
        exbiVar.c = exbgVar3;
        exbiVar.b |= 1;
        exbi exbiVar2 = (exbi) exbhVar.build();
        int i2 = i - 1;
        if (i2 != 0) {
            dbykVarJ = i2 != 1 ? this.d.j(exbiVar2) : this.c.j(exbiVar2);
        } else {
            dbykVarJ = this.c.j(exbiVar2);
            dbykVarJ.h(String.valueOf(this.b.c(obj)));
        }
        dbykVarJ.j((exbp.a(exbgVar.c) != 0 ? r8 : 1) - 1);
        dbykVarJ.c();
    }
}
