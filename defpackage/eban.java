package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eban implements eayv {
    private static final ekrg a = ekrg.c("com/google/android/libraries/privatetelemetry/mobalt/observations/AtLeastOnceObservationGenerator");
    private final ebbg b;
    private final ebbe c;
    private final ebat d;
    private final SecureRandom e;
    private final int f;
    private final int g;
    private final ejrp h;
    private final ejsi i;

    public eban(ebbg ebbgVar, ebbe ebbeVar, ebat ebatVar, SecureRandom secureRandom, int i, int i2, ejrp ejrpVar, ejsi ejsiVar) {
        this.b = ebbgVar;
        this.c = ebbeVar;
        this.d = ebatVar;
        this.e = secureRandom;
        this.f = i;
        this.g = i2;
        this.h = ejrpVar;
        this.i = ejsiVar;
    }

    private final ejrv b(int i, ejsu ejsuVar) {
        ejru ejruVar = (ejru) ejrv.a.createBuilder();
        ejruVar.copyOnWrite();
        ((ejrv) ejruVar.instance).c = this.f;
        ejruVar.copyOnWrite();
        ((ejrv) ejruVar.instance).d = this.g;
        int i2 = this.h.b;
        ejruVar.copyOnWrite();
        ((ejrv) ejruVar.instance).e = i2;
        int i3 = this.i.f;
        ejruVar.copyOnWrite();
        ((ejrv) ejruVar.instance).f = i3;
        ejruVar.copyOnWrite();
        ((ejrv) ejruVar.instance).g = i;
        ejruVar.copyOnWrite();
        ejrv ejrvVar = (ejrv) ejruVar.instance;
        ejsuVar.getClass();
        ejrvVar.h = ejsuVar;
        ejrvVar.b |= 1;
        return (ejrv) ejruVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ekgb c(ekgb ekgbVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfw ekfwVar2 = new ekfw();
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            int iIntValue = ((Integer) ekgbVar.get(i2)).intValue();
            ejrq ejrqVar = (ejrq) ejrr.a.createBuilder();
            ejrw ejrwVar = (ejrw) ejrx.a.createBuilder();
            ejrwVar.copyOnWrite();
            ((ejrx) ejrwVar.instance).b = iIntValue;
            ejrx ejrxVar = (ejrx) ejrwVar.build();
            ejrqVar.copyOnWrite();
            ejrr ejrrVar = (ejrr) ejrqVar.instance;
            ejrxVar.getClass();
            ejrrVar.c = ejrxVar;
            ejrrVar.b = 13;
            evqs evqsVarA = eayu.a(this.e);
            ejrqVar.copyOnWrite();
            ((ejrr) ejrqVar.instance).d = evqsVarA;
            ekfwVar2.h((ejrr) ejrqVar.build());
        }
        ejrq ejrqVar2 = (ejrq) ejrr.a.createBuilder();
        ejsk ejskVar = ejsk.a;
        ejrqVar2.copyOnWrite();
        ejrr ejrrVar2 = (ejrr) ejrqVar2.instance;
        ejskVar.getClass();
        ejrrVar2.c = ejskVar;
        ejrrVar2.b = 10000;
        SecureRandom secureRandom = this.e;
        evqs evqsVarA2 = eayu.a(secureRandom);
        ejrqVar2.copyOnWrite();
        ((ejrr) ejrqVar2.instance).d = evqsVarA2;
        ekfwVar2.h((ejrr) ejrqVar2.build());
        ekgb ekgbVarG = ekfwVar2.g();
        int i3 = ((ekoe) ekgbVarG).c;
        int i4 = 0;
        boolean z = true;
        while (i4 < i3) {
            ejrr ejrrVar3 = (ejrr) ekgbVarG.get(i4);
            ebax ebaxVar = (ebax) ebay.a.createBuilder();
            ebaxVar.copyOnWrite();
            ebay ebayVar = (ebay) ebaxVar.instance;
            ejrrVar3.getClass();
            ebayVar.d = ejrrVar3;
            ebayVar.b |= 1;
            if (z) {
                evqs evqsVarA3 = eayu.a(secureRandom);
                ebaxVar.copyOnWrite();
                ((ebay) ebaxVar.instance).c = evqsVarA3;
            }
            ekfwVar.h((ebay) ebaxVar.build());
            i4++;
            z = false;
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023d  */
    @Override // defpackage.eayv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.util.List a(int r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eban.a(int, java.util.List):java.util.List");
    }
}
