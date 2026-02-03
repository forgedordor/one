package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfn implements vdy {
    public final afzc a;
    public final aisp b;
    public final fcsu c;
    public final fdpl d;
    public final fdap e;
    private final Context f;
    private final fdpl g;
    private final fdpl h;
    private final fdjx i;
    private final fduj j;
    private final Set k;

    public vfn(Context context, fdpl fdplVar, fdpl fdplVar2, fdjx fdjxVar, afzc afzcVar, aisp aispVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fduj fdujVar) {
        context.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdjxVar.getClass();
        afzcVar.getClass();
        aispVar.getClass();
        fcsuVar.getClass();
        this.f = context;
        this.g = fdplVar;
        this.h = fdplVar2;
        this.i = fdjxVar;
        this.a = afzcVar;
        this.b = aispVar;
        this.c = fcsuVar2;
        this.j = fdujVar;
        cwdc cwdcVar = (cwdc) fdct.b(optional);
        this.d = fdud.c(fdplVar, fdplVar2, cwdcVar != null ? cwdcVar.b : new fdpu(null), ((cliy) fcsuVar.b()).h(), fdujVar, new vfl(this, null));
        this.e = auxh.a(new vfm(this), 1000L, fdjxVar);
        this.k = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }

    public final dihq c(final ekgb ekgbVar, boolean z, boolean z2) {
        String string = this.f.getString(R.string.call_action);
        string.getClass();
        return new dihq(string, djrr.W, false, false, z, z2, null, false, null, new fdae() { // from class: vfk
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.e.invoke(ekgbVar);
                return fctx.a;
            }
        }, 972);
    }
}
