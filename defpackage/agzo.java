package defpackage;

import com.android.vcard.VCardConfig;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzo {
    public final fcsu a;
    private final fcsu b;
    private final eosc c;

    public agzo(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
    }

    public final void a() {
        auvh.h(eijx.g(new Callable() { // from class: agzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = bodn.a;
                bodk bodkVar = new bodk(bodn.a);
                bodkVar.A("logPinToTopDailyEventLogger");
                int iH = bodkVar.b().h();
                enwf enwfVar = (enwf) enwg.a.createBuilder();
                enwfVar.copyOnWrite();
                enwg enwgVar = (enwg) enwfVar.instance;
                enwgVar.b |= 1;
                enwgVar.c = iH;
                enwg enwgVar2 = (enwg) enwfVar.build();
                aill aillVar = (aill) this.a.a.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.PIN_TO_TOP_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                enwi enwiVar = (enwi) enwk.a.createBuilder();
                enwiVar.copyOnWrite();
                enwk enwkVar = (enwk) enwiVar.instance;
                enwgVar2.getClass();
                enwkVar.c = enwgVar2;
                enwkVar.b = 5;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                enwk enwkVar2 = (enwk) enwiVar.build();
                enwkVar2.getClass();
                ellhVar2.aT = enwkVar2;
                ellhVar2.e |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                aillVar.j(ellgVar);
                return null;
            }
        }, this.c));
    }

    public final void b(int i, int i2, int i3) {
        ((ains) this.b.b()).e("Bugle.PinToTop.PinnedConversations.Counts", i2);
        enwd enwdVar = (enwd) enwe.a.createBuilder();
        enwdVar.copyOnWrite();
        enwe enweVar = (enwe) enwdVar.instance;
        enweVar.c = i - 1;
        enweVar.b |= 1;
        enwdVar.copyOnWrite();
        enwe enweVar2 = (enwe) enwdVar.instance;
        enweVar2.d = i3 - 1;
        enweVar2.b |= 2;
        enwe enweVar3 = (enwe) enwdVar.build();
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.PIN_TO_TOP_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enwi enwiVar = (enwi) enwk.a.createBuilder();
        enwiVar.copyOnWrite();
        enwk enwkVar = (enwk) enwiVar.instance;
        enweVar3.getClass();
        enwkVar.c = enweVar3;
        enwkVar.b = 4;
        enwk enwkVar2 = (enwk) enwiVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enwkVar2.getClass();
        ellhVar2.aT = enwkVar2;
        ellhVar2.e |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        aillVar.j(ellgVar);
    }
}
