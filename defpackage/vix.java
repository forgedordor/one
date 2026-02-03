package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vix implements vdy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/actions/editmessage/EditActionPlugin");
    public final Context b;
    public final fdjx c;
    public final fcsu d;
    public final zqm e;
    public final zup f;
    public final acgu g;
    public final wwd h;
    private final fduj i;
    private final fdpl j;
    private final Set k;

    public vix(Context context, fdjx fdjxVar, wwd wwdVar, fcsu fcsuVar, fdpl fdplVar, fduj fdujVar, zqm zqmVar, zup zupVar, acgu acguVar) {
        context.getClass();
        fdjxVar.getClass();
        wwdVar.getClass();
        fcsuVar.getClass();
        fdujVar.getClass();
        zqmVar.getClass();
        acguVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.h = wwdVar;
        this.d = fcsuVar;
        this.i = fdujVar;
        this.e = zqmVar;
        this.f = zupVar;
        this.g = acguVar;
        this.j = fdud.a(zqmVar.a(), fdujVar, fdplVar, new viu(this, null));
        this.k = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.j;
    }
}
