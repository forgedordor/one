package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucv implements cucl {
    public final fdjx a;
    public final cuec b;
    public final ahax c;
    public final asgz d;
    private final Context e;
    private final aofc f;
    private final cudy g;
    private final fcsu h;
    private final fdpl i;

    public cucv(Context context, fdjx fdjxVar, cuec cuecVar, aofc aofcVar, crny crnyVar, ahax ahaxVar, cudy cudyVar, asgz asgzVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        cuecVar.getClass();
        aofcVar.getClass();
        crnyVar.getClass();
        ahaxVar.getClass();
        cudyVar.getClass();
        fcsuVar.getClass();
        this.e = context;
        this.a = fdjxVar;
        this.b = cuecVar;
        this.f = aofcVar;
        this.c = ahaxVar;
        this.g = cudyVar;
        this.d = asgzVar;
        this.h = fcsuVar;
        fdvc fdvcVarA = cuecVar.a();
        anpj anpjVarA = aofcVar.a();
        anpjVarA.getClass();
        this.i = fdud.a(fdvcVarA, anov.a(anpjVarA), cudyVar.a(), new cucu(this, null));
    }

    public static final dlcr d(aoer aoerVar) {
        return dlcs.a(aoerVar.d());
    }

    @Override // defpackage.cucl
    public final fdpl a() {
        return this.i;
    }

    public final djmn b(ekgb ekgbVar, aoer aoerVar, final ahat ahatVar, final fduf fdufVar) {
        Context context = this.e;
        String string = context.getString(R.string.sim_selector_dialog_title);
        string.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            final aoer aoerVar2 = (aoer) it.next();
            aoerVar2.getClass();
            arrayList.add(new dkcd(d(aoerVar2), aoerVar2.q(), c(aoerVar2), fdbq.f(aoerVar2, aoerVar), aoerVar2.x(), new fdae() { // from class: cucm
                @Override // defpackage.fdae
                public final Object invoke() {
                    aoer aoerVar3;
                    fduf fdufVar2;
                    Object objC;
                    do {
                        aoerVar3 = aoerVar2;
                        fdufVar2 = fdufVar;
                        objC = fdufVar2.c();
                    } while (!fdufVar2.g(objC, aoerVar3));
                    return fctx.a;
                }
            }));
        }
        String string2 = context.getString(R.string.sim_selector_dialog_confirm);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new fdae() { // from class: cucn
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                this.b.d((aoer) fdufVar.c());
                return fctx.a;
            }
        });
        String string3 = context.getString(R.string.sim_selector_dialog_dismiss);
        string3.getClass();
        return new djmn(string, arrayList, null, null, null, null, dktqVar, new dktq(string3, new fdae() { // from class: cuco
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }), null, 316);
    }

    public final String c(aoer aoerVar) {
        fcsu fcsuVar = this.h;
        String strP = aoerVar.p();
        if (((aqiu) fcsuVar.b()).a()) {
            strP = cssf.b(strP, false);
        }
        return strP == null ? "" : strP;
    }
}
