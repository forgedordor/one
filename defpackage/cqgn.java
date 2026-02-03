package defpackage;

import android.content.Context;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqgn {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cqgn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    public final cqgm a(Consumer consumer, int i) {
        if (!craf.e) {
            cqgv cqgvVar = (cqgv) this.a.b();
            crot crotVar = (crot) cqgvVar.a.b();
            crotVar.getClass();
            eosc eoscVar = (eosc) cqgvVar.b.b();
            eoscVar.getClass();
            egpm egpmVar = (egpm) cqgvVar.c.b();
            egpmVar.getClass();
            eigp eigpVar = (eigp) cqgvVar.d.b();
            eigpVar.getClass();
            cqho cqhoVar = (cqho) cqgvVar.e.b();
            cqhoVar.getClass();
            return new cqgu(crotVar, eoscVar, egpmVar, eigpVar, cqhoVar, consumer, i);
        }
        if (!craf.f) {
            Context context = ((cqho) this.d.b()).a;
            if (kxj.c(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || kxj.c(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                cqhn cqhnVar = (cqhn) this.c.b();
                crot crotVar2 = (crot) cqhnVar.a.b();
                crotVar2.getClass();
                eosc eoscVar2 = (eosc) cqhnVar.b.b();
                eoscVar2.getClass();
                egpm egpmVar2 = (egpm) cqhnVar.c.b();
                egpmVar2.getClass();
                return new cqhm(crotVar2, eoscVar2, egpmVar2, consumer, i);
            }
        }
        cqhi cqhiVar = (cqhi) this.b.b();
        crot crotVar3 = (crot) cqhiVar.a.b();
        crotVar3.getClass();
        eosc eoscVar3 = (eosc) cqhiVar.b.b();
        eoscVar3.getClass();
        egpm egpmVar3 = (egpm) cqhiVar.c.b();
        egpmVar3.getClass();
        cqho cqhoVar2 = (cqho) cqhiVar.d.b();
        cqhoVar2.getClass();
        return new cqhh(crotVar3, eoscVar3, egpmVar3, cqhoVar2, consumer, i);
    }
}
