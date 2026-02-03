package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkv implements dxkt {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxgj c;

    public dxkv(Context context, dxgj dxgjVar, dxve dxveVar) {
        context.getClass();
        dxgjVar.getClass();
        this.b = context;
        this.c = dxgjVar;
        dxveVar.a(context);
    }

    @Override // defpackage.dxkt
    public final void a(dxku dxkuVar) {
        dxhe dxheVarA;
        dbyl dbylVarA;
        evcp evcpVar = (evcp) evcr.a.createBuilder();
        evcpVar.getClass();
        evcm evcmVar = (evcm) evco.a.createBuilder();
        evcmVar.getClass();
        evch evchVar = (evch) evck.a.createBuilder();
        evchVar.getClass();
        DesugarCollections.unmodifiableList(((evck) evchVar.instance).c).getClass();
        evchVar.copyOnWrite();
        evck evckVar = (evck) evchVar.instance;
        evtg evtgVar = evckVar.c;
        if (!evtgVar.c()) {
            evckVar.c = evsn.mutableCopy(evtgVar);
        }
        dxkx dxkxVar = (dxkx) dxkuVar;
        evpz.addAll(dxkxVar.j, evckVar.c);
        dxgy dxgyVar = dxkxVar.a;
        evchVar.copyOnWrite();
        evck evckVar2 = (evck) evchVar.instance;
        evckVar2.b |= 1;
        evckVar2.d = ((dxgw) dxgyVar).a;
        dxqt dxqtVar = dxkxVar.c;
        if (dxkxVar.e != null || TextUtils.isEmpty(dxkxVar.l)) {
            dxheVarA = dxkxVar.e;
        } else {
            dxhd dxhdVarR = dxhe.r();
            dxhdVarR.l(dxwh.a);
            ((dxhb) dxhdVarR).f = dxkxVar.l;
            dxheVarA = dxhdVarR.a();
        }
        evej evejVarA = dxqtVar.a(dxheVarA);
        evchVar.copyOnWrite();
        evck evckVar3 = (evck) evchVar.instance;
        evckVar3.i = evejVarA;
        evckVar3.b |= 32;
        evdz evdzVarA = dxkxVar.d.a();
        evchVar.copyOnWrite();
        evck evckVar4 = (evck) evchVar.instance;
        evckVar4.h = evdzVarA;
        evckVar4.b |= 16;
        long j = dxkxVar.k;
        evchVar.copyOnWrite();
        evck evckVar5 = (evck) evchVar.instance;
        evckVar5.b |= 256;
        evckVar5.k = j;
        evdg evdgVar = dxkxVar.i;
        if (evdgVar != null) {
            evcz evczVar = (evcz) evda.a.createBuilder();
            evczVar.getClass();
            evczVar.copyOnWrite();
            evda evdaVar = (evda) evczVar.instance;
            evdaVar.c = evdgVar;
            evdaVar.b |= 1;
            evsn evsnVarBuild = evczVar.build();
            evsnVarBuild.getClass();
            evchVar.copyOnWrite();
            evck evckVar6 = (evck) evchVar.instance;
            evckVar6.j = (evda) evsnVarBuild;
            evckVar6.b |= 64;
        }
        String str = dxkxVar.f;
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            evcl.a(str, evchVar);
        }
        String str2 = dxkxVar.g;
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            evchVar.copyOnWrite();
            evck evckVar7 = (evck) evchVar.instance;
            evckVar7.b |= 4;
            evckVar7.f = str2;
        }
        String str3 = dxkxVar.h;
        if (!TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            evcl.a(str3, evchVar);
        }
        Long l = dxkxVar.n;
        if (l != null) {
            long jLongValue = l.longValue();
            evchVar.copyOnWrite();
            evck evckVar8 = (evck) evchVar.instance;
            evckVar8.b |= 8;
            evckVar8.g = jLongValue;
        }
        evsn evsnVarBuild2 = evchVar.build();
        evsnVarBuild2.getClass();
        evcmVar.copyOnWrite();
        evco evcoVar = (evco) evcmVar.instance;
        evcoVar.e = (evck) evsnVarBuild2;
        evcoVar.b |= 1;
        int i = dxkxVar.q;
        int i2 = 3;
        if (i != 0) {
            evek evekVar = (evek) evem.a.createBuilder();
            evekVar.getClass();
            evekVar.copyOnWrite();
            evem evemVar = (evem) evekVar.instance;
            evemVar.c = i - 1;
            evemVar.b |= 1;
            int i3 = dxkxVar.t;
            if (i3 != 0) {
                evekVar.copyOnWrite();
                evem evemVar2 = (evem) evekVar.instance;
                evemVar2.d = i3 - 1;
                evemVar2.b |= 64;
            }
            evsn evsnVarBuild3 = evekVar.build();
            evsnVarBuild3.getClass();
            evcmVar.copyOnWrite();
            evco evcoVar2 = (evco) evcmVar.instance;
            evcoVar2.d = (evem) evsnVarBuild3;
            evcoVar2.c = 2;
        } else {
            int i4 = dxkxVar.r;
            if (i4 != 0) {
                evdp evdpVar = (evdp) evds.a.createBuilder();
                evdpVar.getClass();
                evdpVar.copyOnWrite();
                evds evdsVar = (evds) evdpVar.instance;
                evdsVar.c = i4 - 1;
                evdsVar.b |= 1;
                int i5 = dxkxVar.u;
                if (i5 != 0) {
                    evdpVar.copyOnWrite();
                    evds evdsVar2 = (evds) evdpVar.instance;
                    evdsVar2.e = i5 - 1;
                    evdsVar2.b |= 256;
                }
                String str4 = dxkxVar.m;
                if (str4 != null) {
                    evdpVar.copyOnWrite();
                    evds evdsVar3 = (evds) evdpVar.instance;
                    evdsVar3.b |= 32;
                    evdsVar3.d = str4;
                }
                evsn evsnVarBuild4 = evdpVar.build();
                evsnVarBuild4.getClass();
                evcmVar.copyOnWrite();
                evco evcoVar3 = (evco) evcmVar.instance;
                evcoVar3.d = (evds) evsnVarBuild4;
                evcoVar3.c = 3;
            } else {
                int i6 = dxkxVar.s;
                if (i6 == 0) {
                    throw new IllegalStateException("GnpLogEvent must have interactionType, failureType, or systemEventType.");
                }
                evec evecVar = (evec) evee.a.createBuilder();
                evecVar.getClass();
                evecVar.copyOnWrite();
                evee eveeVar = (evee) evecVar.instance;
                eveeVar.c = i6 - 1;
                eveeVar.b |= 1;
                evsn evsnVarBuild5 = evecVar.build();
                evsnVarBuild5.getClass();
                evcmVar.copyOnWrite();
                evco evcoVar4 = (evco) evcmVar.instance;
                evcoVar4.d = (evee) evsnVarBuild5;
                evcoVar4.c = 4;
            }
        }
        evsn evsnVarBuild6 = evcmVar.build();
        evsnVarBuild6.getClass();
        evcpVar.copyOnWrite();
        evcr evcrVar = (evcr) evcpVar.instance;
        evcrVar.c = (evco) evsnVarBuild6;
        evcrVar.b |= 2;
        int iOrdinal = dxkxVar.b.ordinal();
        if (iOrdinal == 0) {
            i2 = 4;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i2 = 14;
            } else if (iOrdinal == 3) {
                i2 = 13;
            } else if (iOrdinal == 4) {
                i2 = 15;
            } else {
                if (iOrdinal != 5) {
                    throw new fctg();
                }
                i2 = 2;
            }
        }
        evcpVar.copyOnWrite();
        evcr evcrVar2 = (evcr) evcpVar.instance;
        evcrVar2.d = i2 - 1;
        evcrVar2.b |= 4;
        evsn evsnVarBuild7 = evcpVar.build();
        evsnVarBuild7.getClass();
        evcr evcrVar3 = (evcr) evsnVarBuild7;
        String str5 = dxkxVar.o;
        if (str5 == null) {
            dbyi dbyiVarI = dbyl.i(this.c.a, "CHIME");
            dbyiVarI.g = new dxgi();
            dbylVarA = dbyiVarI.c();
        } else {
            dbylVarA = this.c.a("CHIME", str5);
        }
        dbyk dbykVarK = dbylVarA.k(evcrVar3, dqnz.b(this.b, new evcg()));
        if (!dxkxVar.p.isEmpty()) {
            dbykVarK.i(fcva.aC(dxkxVar.p));
        }
        dbykVarK.c();
        a.o().t("GNP ClearCut log [%s]", evcrVar3);
    }
}
