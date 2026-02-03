package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwk implements dxvy {
    public static final eksp a = eksp.c("GnpSdk");
    public final dxnl b;
    public final Context c;
    public final dxve d;
    public final boolean e;
    public final fcsu f;
    public final dxpd g;
    private final fcyh h;

    public dxwk(dxnl dxnlVar, fcyh fcyhVar, dxpd dxpdVar, Context context, dxve dxveVar, boolean z, fcsu fcsuVar) {
        dxnlVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        fcsuVar.getClass();
        this.b = dxnlVar;
        this.h = fcyhVar;
        this.g = dxpdVar;
        this.c = context;
        this.d = dxveVar;
        this.e = z;
        this.f = fcsuVar;
    }

    @Override // defpackage.dxvy
    public final Object a(evjz evjzVar, fcxy fcxyVar) {
        return fdin.a(this.h, new dxwj(this, evjzVar, null), fcxyVar);
    }
}
