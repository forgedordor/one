package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sux {
    public static final eksp a = eksp.c("BugleVmt");
    public final fcsu b;
    public final fcsu c;
    public final Context d;
    public final fcyh e;
    public final fcyh f;
    public final fcyh g;
    public final eosc h;
    public final suy i;
    public final PackageManager j;
    private final fctc k;

    public sux(fcsu fcsuVar, fcsu fcsuVar2, Context context, fcyh fcyhVar, fcyh fcyhVar2, fcyh fcyhVar3, eosc eoscVar, suy suyVar, PackageManager packageManager) {
        context.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcyhVar3.getClass();
        eoscVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = context;
        this.e = fcyhVar;
        this.f = fcyhVar2;
        this.g = fcyhVar3;
        this.h = eoscVar;
        this.i = suyVar;
        this.j = packageManager;
        this.k = fctd.a(new fdae() { // from class: sui
            @Override // defpackage.fdae
            public final Object invoke() {
                cczi ccziVar = stt.a;
                return Boolean.valueOf(stt.a(this.a.d));
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.k.a()).booleanValue();
    }
}
