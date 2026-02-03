package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmo implements vdy {
    public final Context a;
    public final fdjx b;
    public final afzc c;
    public final ajln d;
    public final fdpl e;
    private final fdpl f;
    private final Optional g;
    private final Set h;

    public vmo(Context context, fdjx fdjxVar, fdpl fdplVar, Optional optional, afzc afzcVar, ajln ajlnVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        afzcVar.getClass();
        ajlnVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.f = fdplVar;
        this.g = optional;
        this.c = afzcVar;
        this.d = ajlnVar;
        cwdc cwdcVar = (cwdc) fdct.b(optional);
        this.e = avac.i(fdplVar, cwdcVar != null ? cwdcVar.b : new fdpu(null), fdjxVar, new vmn(this, null));
        this.h = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.h;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.e;
    }
}
