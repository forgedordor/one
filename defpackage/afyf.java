package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afyf implements afxz {
    public final Context a;
    public final afzc b;
    public final afuc c;
    public final fcsu d;
    public final asgv e;
    public final fcsu f;
    public final fduf g;
    public final dihq h;
    private final fdjx i;
    private final dloh j;
    private final afyi k;
    private final fdvc l;

    public afyf(Context context, fdjx fdjxVar, afzc afzcVar, afuc afucVar, fcsu fcsuVar, afus afusVar, afvu afvuVar, asgv asgvVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        afzcVar.getClass();
        afucVar.getClass();
        fcsuVar.getClass();
        afusVar.getClass();
        afvuVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.i = fdjxVar;
        this.b = afzcVar;
        this.c = afucVar;
        this.d = fcsuVar;
        this.e = asgvVar;
        this.f = fcsuVar2;
        fduf fdufVarA = fdvf.a(false);
        this.g = fdufVarA;
        String string = context.getString(R.string.search_action);
        string.getClass();
        dihq dihqVar = new dihq(string, djrr.dx, false, false, true, false, null, false, null, new fdae() { // from class: afya
            @Override // defpackage.fdae
            public final Object invoke() {
                afyf afyfVar = this.a;
                afxx.d((afxx) afyfVar.d.b(), 9, 0, 0, 6);
                afyfVar.g.f(true);
                return fctx.a;
            }
        }, 996);
        this.h = dihqVar;
        List listB = fcva.b(dihqVar);
        dihq dihqVarB = b();
        String string2 = context.getString(R.string.multi_share_top_app_bar_title);
        string2.getClass();
        dloh dlohVar = new dloh(new dlnp(string2, null, null, false, null, null, null, 254), dihqVarB, listB, false, false, null, null, 112);
        this.j = dlohVar;
        afyi afyiVar = new afyi(dlohVar, new afvt(null), fcvo.a, new afyh(asgvVar.a()));
        this.k = afyiVar;
        this.l = fdtg.b(fdud.b(afucVar.b(), afusVar.a, afvuVar.a(), fdufVarA, new afye(this, null)), fdjxVar, fdur.a(0L, 3), afyiVar);
    }

    @Override // defpackage.afxz
    public final fdvc a() {
        return this.l;
    }

    public final dihq b() {
        Context context = this.a;
        djrr djrrVar = djrr.q;
        String string = context.getString(R.string.multi_share_top_app_bar_back);
        string.getClass();
        return new dihq(string, djrrVar, false, false, false, false, null, false, null, new fdae() { // from class: afyc
            @Override // defpackage.fdae
            public final Object invoke() {
                afyf afyfVar = this.a;
                afxx.d((afxx) afyfVar.d.b(), 11, 0, 0, 6);
                fduf fdufVar = afyfVar.g;
                if (((Boolean) fdufVar.c()).booleanValue()) {
                    afyfVar.c.c();
                    fdufVar.f(false);
                } else {
                    afyfVar.b.h(agbf.a);
                }
                return fctx.a;
            }
        }, 1020);
    }
}
