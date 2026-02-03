package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqh {
    public final Context a;
    public final cgqm b;
    public final cgoz c;
    public final fcsu d;
    public final cssf e;
    public final fcsu f;

    public cgqh(Context context, cgqm cgqmVar, cgoz cgozVar, fcsu fcsuVar, cssf cssfVar, fcsu fcsuVar2) {
        this.a = context;
        this.b = cgqmVar;
        this.c = cgozVar;
        this.d = fcsuVar;
        this.e = cssfVar;
        this.f = fcsuVar2;
    }

    public static String a(bajf bajfVar, cgpe cgpeVar) {
        return bajfVar.Q() ? bajfVar.o() : ejwk.b(((cglx) cgpeVar).a);
    }

    public final boolean b(bajf bajfVar, ekgb ekgbVar, cgpe cgpeVar) {
        if (!craf.b && !craf.f(this.a)) {
            boolean z = ekgbVar.size() == 1 && bajfVar.G() == ((baea) ekis.j(ekgbVar)).h();
            cglx cglxVar = (cglx) cgpeVar;
            String str = cglxVar.d;
            if (str != null && cglxVar.c != null && ((le.m(str) || le.z(str)) && z)) {
                return true;
            }
        }
        return false;
    }
}
