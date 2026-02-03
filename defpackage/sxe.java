package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxe {
    public final fcyh a;
    public final fcsu b;
    public final fcsu c;
    public final cogw d;
    public final aqzb e;
    private final fcsu f;

    public sxe(fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, aqzb aqzbVar) {
        fcyhVar.getClass();
        fcsuVar2.getClass();
        cogwVar.getClass();
        aqzbVar.getClass();
        this.a = fcyhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.d = cogwVar;
        this.e = aqzbVar;
    }

    public final void a(Uri uri, swy swyVar) {
        swf swfVar = (swf) this.f.b();
        Duration duration = swyVar.a;
        String strA = swyVar.a();
        long millis = duration.toMillis();
        swfVar.a.f(new swe(uri, strA, millis <= 0 ? 0.0f : swyVar.d.toMillis() / millis));
    }
}
