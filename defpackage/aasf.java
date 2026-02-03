package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasf {
    static final cczi a = cdag.h(cdag.b, "disable_logging_data_donation_event_logger", false);
    public final fcsu b;
    public final fcsu c;
    private final eosc d;

    public aasf(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    public final void a(final elwr elwrVar) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        auvh.h(eijx.f(new Runnable() { // from class: aase
            @Override // java.lang.Runnable
            public final void run() {
                aasf aasfVar = this.a;
                if (((cqpz) aasfVar.c.b()).i("bugle_enable_analytics", true)) {
                    elwr elwrVar2 = elwrVar;
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.DATA_DONATION_EVENT;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b = 1 | ellhVar.b;
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    elxh elxhVar = (elxh) elwrVar2.build();
                    elxhVar.getClass();
                    ellhVar2.ax = elxhVar;
                    ellhVar2.d |= 2097152;
                    ((aill) aasfVar.b.b()).j(ellgVar);
                }
            }
        }, this.d));
    }

    public final void b(int i) {
        elwr elwrVar = (elwr) elxh.a.createBuilder();
        elwv elwvVar = (elwv) elww.a.createBuilder();
        elwvVar.copyOnWrite();
        elww elwwVar = (elww) elwvVar.instance;
        elwwVar.c = i - 1;
        elwwVar.b |= 1;
        elwrVar.copyOnWrite();
        elxh elxhVar = (elxh) elwrVar.instance;
        elww elwwVar2 = (elww) elwvVar.build();
        elwwVar2.getClass();
        elxhVar.c = elwwVar2;
        elxhVar.b = 3;
        a(elwrVar);
    }

    public final void c(int i) {
        elwr elwrVar = (elwr) elxh.a.createBuilder();
        elwx elwxVar = (elwx) elwy.a.createBuilder();
        elwxVar.copyOnWrite();
        elwy elwyVar = (elwy) elwxVar.instance;
        elwyVar.c = i - 1;
        elwyVar.b |= 1;
        elwrVar.copyOnWrite();
        elxh elxhVar = (elxh) elwrVar.instance;
        elwy elwyVar2 = (elwy) elwxVar.build();
        elwyVar2.getClass();
        elxhVar.c = elwyVar2;
        elxhVar.b = 2;
        a(elwrVar);
    }
}
