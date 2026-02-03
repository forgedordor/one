package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqw implements tdg {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    private final fcyh d;
    private final fdjx e;
    private final cvra f;

    public cvqw(Context context, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, cvra cvraVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.d = fcyhVar;
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = cvraVar;
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        cvra cvraVar = this.f;
        return egwx.a(fdqc.b(new fdua(cvraVar.b, cvraVar.a, new cvqz(cvraVar, null)), this.d), this.e, new cvqv(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        cczi ccziVar = cvqy.a;
        Object objE = ((cczi) cvqy.c.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }
}
