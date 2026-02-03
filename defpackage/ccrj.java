package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrj {
    public final fcsu a;
    public final fcsu b;
    private final Context c;

    public ccrj(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public static /* synthetic */ void c(ccrj ccrjVar, String str, efkk efkkVar, atav atavVar, String str2, int i, eprw eprwVar, int i2, int i3, int i4) {
        eprw eprwVarA;
        int i5;
        ccrj ccrjVar2;
        String str3;
        efkk efkkVar2;
        atav atavVar2;
        String str4;
        if ((i4 & 32) != 0) {
            eprv eprvVar = (eprv) eprw.a.createBuilder();
            eprvVar.getClass();
            eprwVarA = eprx.a(eprvVar);
        } else {
            eprwVarA = eprwVar;
        }
        int i6 = (i4 & 16) != 0 ? 1 : i;
        int i7 = (i4 & 64) != 0 ? 2 : i2;
        if ((i4 & 128) != 0) {
            i5 = 1;
            str3 = str;
            efkkVar2 = efkkVar;
            atavVar2 = atavVar;
            str4 = str2;
            ccrjVar2 = ccrjVar;
        } else {
            i5 = i3;
            ccrjVar2 = ccrjVar;
            str3 = str;
            efkkVar2 = efkkVar;
            atavVar2 = atavVar;
            str4 = str2;
        }
        ccrjVar2.b(str3, efkkVar2, atavVar2, str4, i6, eprwVarA, i7, i5);
    }

    public static /* synthetic */ void d(ccrj ccrjVar, String str, emey emeyVar, int i, String str2, Integer num, String str3, int i2) {
        str.getClass();
        emeyVar.getClass();
        emev emevVar = (emev) emez.a.createBuilder();
        emevVar.copyOnWrite();
        emez emezVar = (emez) emevVar.instance;
        emezVar.c = emeyVar.p;
        emezVar.b |= 1;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (i != 0) {
            emevVar.copyOnWrite();
            emez emezVar2 = (emez) emevVar.instance;
            emezVar2.d = i - 1;
            emezVar2.b |= 2;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if (str2 != null) {
            emevVar.copyOnWrite();
            emez emezVar3 = (emez) emevVar.instance;
            emezVar3.b |= 8;
            emezVar3.e = str2;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            emevVar.copyOnWrite();
            emez emezVar4 = (emez) emevVar.instance;
            emezVar4.b |= 16;
            emezVar4.f = iIntValue;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        if (str3 != null) {
            emevVar.copyOnWrite();
            emez emezVar5 = (emez) emevVar.instance;
            emezVar5.b |= 32;
            emezVar5.g = str3;
        }
        elrw elrwVar = (elrw) elrx.a.createBuilder();
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        elrxVar.c = 12;
        elrxVar.b |= 1;
        emez emezVar6 = (emez) emevVar.build();
        elrwVar.copyOnWrite();
        elrx elrxVar2 = (elrx) elrwVar.instance;
        emezVar6.getClass();
        elrxVar2.k = emezVar6;
        elrxVar2.b |= 512;
        elvs elvsVarB = dhia.b(ccrjVar.c);
        elrwVar.copyOnWrite();
        elrx elrxVar3 = (elrx) elrwVar.instance;
        elvsVarB.getClass();
        elrxVar3.h = elvsVarB;
        elrxVar3.b |= 64;
        elrwVar.copyOnWrite();
        elrx elrxVar4 = (elrx) elrwVar.instance;
        elrxVar4.b |= 128;
        elrxVar4.i = str;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_RCS_PROVISIONING;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elrx elrxVar5 = (elrx) elrwVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elrxVar5.getClass();
        ellhVar2.t = elrxVar5;
        ellhVar2.b |= 4096;
        cbqh.b((cbqh) ccrjVar.a.b(), emxt.BUGLE_RCS_PROVISIONING, ellgVar);
    }

    public final void a(enao enaoVar, String str, String str2, int i, int i2, enba enbaVar) {
        enbaVar.getClass();
        emzy emzyVar = (emzy) enbu.a.createBuilder();
        emzyVar.getClass();
        emzt.g(str, emzyVar);
        emzt.f(enbaVar, emzyVar);
        emzt.d(str2, emzyVar);
        emzt.c(i, emzyVar);
        emzt.b(i2, emzyVar);
        enab enabVar = (enab) enaq.a.createBuilder();
        enabVar.getClass();
        enabVar.copyOnWrite();
        enaq enaqVar = (enaq) enabVar.instance;
        enaqVar.c = enaoVar;
        enaqVar.b = 1;
        emzt.e(emzu.a(enabVar), emzyVar);
        enbu enbuVarA = emzt.a(emzyVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MLS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b = 1 | ellhVar.b;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.cx = enbuVarA;
        ellhVar2.i |= 8;
        cbqh.b((cbqh) this.a.b(), emxt.BUGLE_MLS_EVENT, ellgVar);
    }

    public final void b(String str, efkk efkkVar, atav atavVar, String str2, int i, eprw eprwVar, int i2, int i3) {
        int i4;
        int iB;
        str.getClass();
        atavVar.getClass();
        if (i == 0) {
            throw null;
        }
        eprwVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        emzy emzyVar = (emzy) enbu.a.createBuilder();
        emzyVar.getClass();
        emzt.g(str, emzyVar);
        enar enarVar = (enar) enay.a.createBuilder();
        enarVar.getClass();
        int iOrdinal = atavVar.ordinal();
        int iB2 = 2;
        if (iOrdinal == 0) {
            i4 = 1;
        } else if (iOrdinal == 1) {
            i4 = 2;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            i4 = 3;
        }
        enarVar.copyOnWrite();
        enay enayVar = (enay) enarVar.instance;
        enayVar.h = i4 - 1;
        enayVar.b |= 32;
        if (str2.length() > 0) {
            enarVar.copyOnWrite();
            enay enayVar2 = (enay) enarVar.instance;
            enayVar2.b |= 1;
            enayVar2.c = str2;
        }
        Object objApply = ccrl.a.apply(efkkVar);
        objApply.getClass();
        enarVar.copyOnWrite();
        enay enayVar3 = (enay) enarVar.instance;
        enayVar3.d = ((enaw) objApply).f;
        enayVar3.b |= 2;
        enarVar.copyOnWrite();
        enay enayVar4 = (enay) enarVar.instance;
        enayVar4.e = i - 1;
        enayVar4.b |= 4;
        enas enasVar = (enas) enat.a.createBuilder();
        enasVar.getClass();
        int i5 = eprwVar.c;
        int i6 = i5 != 0 ? i5 != 4 ? i5 != 5 ? 0 : 2 : 1 : 3;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 0) {
            if (i5 == 4 && (iB2 = eptr.b(((Integer) eprwVar.d).intValue())) == 0) {
                iB2 = 1;
            }
            enasVar.copyOnWrite();
            enat enatVar = (enat) enasVar.instance;
            enatVar.c = Integer.valueOf(eptr.a(iB2));
            enatVar.b = 1;
        } else if (i7 == 1) {
            if (i5 == 5) {
                iB = eptw.b(((Integer) eprwVar.d).intValue());
                if (iB == 0) {
                    iB = 1;
                }
            } else {
                iB = 2;
            }
            enasVar.copyOnWrite();
            enat enatVar2 = (enat) enasVar.instance;
            enatVar2.c = Integer.valueOf(eptw.a(iB));
            enatVar2.b = 2;
        } else if (i7 != 2) {
            throw new fctg();
        }
        evsn evsnVarBuild = enasVar.build();
        evsnVarBuild.getClass();
        enarVar.copyOnWrite();
        enay enayVar5 = (enay) enarVar.instance;
        enayVar5.f = (enat) evsnVarBuild;
        enayVar5.b |= 8;
        enarVar.copyOnWrite();
        enay enayVar6 = (enay) enarVar.instance;
        enayVar6.g = epvd.b(i2);
        enayVar6.b |= 16;
        if (i3 != 1) {
            enarVar.copyOnWrite();
            enay enayVar7 = (enay) enarVar.instance;
            enayVar7.i = i3 - 1;
            enayVar7.b |= 64;
        }
        evsn evsnVarBuild2 = enarVar.build();
        evsnVarBuild2.getClass();
        emzyVar.copyOnWrite();
        enbu enbuVar = (enbu) emzyVar.instance;
        enbuVar.d = (enay) evsnVarBuild2;
        enbuVar.c = 4;
        enbu enbuVarA = emzt.a(emzyVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MLS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.cx = enbuVarA;
        ellhVar2.i |= 8;
        cbqh.b((cbqh) this.a.b(), emxt.BUGLE_MLS_EVENT, ellgVar);
    }
}
