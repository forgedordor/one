package defpackage;

import java.security.GeneralSecurityException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpod extends cpnl implements cpoc {
    private static final cqce b = cqce.g("BugleCms", "CmsCipherKeyBuilderImpl");
    private static final cqce c = cqce.g("BugleCmsFolsom", "CmsCipherKeyBuilderImpl");
    private final cphs d;

    public cpod(cphs cphsVar, fcsu fcsuVar) {
        super(fcsuVar);
        this.d = cphsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static epjj e(bnar bnarVar) {
        epji epjiVar = (epji) epjj.a.createBuilder();
        byte[] bArrQ = bnarVar.q();
        if (bArrQ == null) {
            return null;
        }
        evqs evqsVarX = evqs.x(bArrQ);
        epjiVar.copyOnWrite();
        ((epjj) epjiVar.instance).c = evqsVarX;
        epjk epjkVar = (epjk) ((ekod) cptt.j).d.get(Integer.valueOf(bnarVar.m()));
        if (epjkVar == null) {
            return null;
        }
        epjiVar.copyOnWrite();
        ((epjj) epjiVar.instance).d = epjkVar.a();
        int iK = bnarVar.k();
        epjiVar.copyOnWrite();
        ((epjj) epjiVar.instance).b = iK;
        return (epjj) epjiVar.build();
    }

    private final eqnd f(bnar bnarVar, ekgb ekgbVar, boolean z) {
        ecem.b();
        ejwl.a(bnarVar.m() == 2);
        cqce cqceVar = c;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.B("isUpdate", z);
        cqbdVarC.I("Building encrypted Backup Key...");
        cqbdVarC.r();
        if (ekgbVar.isEmpty()) {
            cqbd cqbdVarE = cqceVar.e();
            cqbdVarE.B("isUpdate", z);
            cqbdVarE.I("No folsomKeys are available.");
            cqbdVarE.r();
            throw new cpzc(73, cpyz.NO_RETRY);
        }
        try {
            cphr cphrVarA = this.d.a(ekgbVar);
            epjj epjjVarE = e(bnarVar);
            if (epjjVarE == null) {
                throw new cpzc(75, cpyz.NO_RETRY);
            }
            String strO = bnarVar.o();
            String.format(Locale.US, "CorrelationId expected to be populated for Backup Key. key index = %d", Integer.valueOf(bnarVar.k()));
            strO.getClass();
            evqs byteString = epjjVarE.toByteString();
            int iK = bnarVar.k();
            try {
                epkg epkgVar = (epkg) epkh.a.createBuilder();
                epkgVar.copyOnWrite();
                ((epkh) epkgVar.instance).c = iK;
                evqs evqsVarB = cphrVarA.b(byteString);
                epkgVar.copyOnWrite();
                ((epkh) epkgVar.instance).b = evqsVarB;
                eqns eqnsVarI = i((epkh) epkgVar.build());
                cqbd cqbdVarC2 = cqceVar.c();
                cqbdVarC2.B("isUpdate", z);
                cqbdVarC2.I("Built payload for encrypted Backup Key");
                cqbdVarC2.r();
                return z ? h(bnarVar, "encrypted_backup_key", eqnsVarI) : g(bnarVar, strO, "encrypted_backup_key", eqnsVarI);
            } catch (Exception e) {
                b.o("Failed to encrypt Backup Key with the Folsom Key", e);
                throw new cpzc(76, cpyz.NO_RETRY, e);
            }
        } catch (GeneralSecurityException e2) {
            cqbd cqbdVarE2 = c.e();
            cqbdVarE2.B("isUpdate", z);
            cqbdVarE2.y("folsomKeysSize", ekgbVar.size());
            cqbdVarE2.I("Failed to instantiate a GmsCryptor");
            cqbdVarE2.r();
            throw new cpzc(74, cpyz.NO_RETRY, e2);
        }
    }

    private static eqnd g(bnar bnarVar, String str, String str2, eqns eqnsVar) {
        eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
        eqncVar.a(str2);
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).k = str;
        eqmk eqmkVar = (eqmk) eqml.a.createBuilder();
        eqmkVar.copyOnWrite();
        ((eqml) eqmkVar.instance).d = 5;
        eqncVar.copyOnWrite();
        eqnd eqndVar = (eqnd) eqncVar.instance;
        eqml eqmlVar = (eqml) eqmkVar.build();
        eqmlVar.getClass();
        eqndVar.f = eqmlVar;
        eqndVar.b |= 1;
        eqncVar.copyOnWrite();
        eqnd eqndVar2 = (eqnd) eqncVar.instance;
        eqnsVar.getClass();
        eqndVar2.i = eqnsVar;
        eqndVar2.b |= 4;
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).d = "root";
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).e = eqnh.a(4);
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.s.get()).e()).booleanValue()) {
            if (bnarVar.m() == 1) {
                eqncVar.a("encryption_key");
            } else if (bnarVar.m() == 3) {
                eqncVar.a("hmac_sha256_key");
            }
        }
        return (eqnd) eqncVar.build();
    }

    private static eqnd h(bnar bnarVar, String str, eqns eqnsVar) {
        String strP = bnarVar.p();
        if (ejwk.c(strP)) {
            throw new cpzb(String.format("Missing CMS Object ID for CmsTable key type %s, key index %d", Integer.valueOf(bnarVar.m()), Integer.valueOf(bnarVar.k())));
        }
        eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
        eqncVar.copyOnWrite();
        eqnd eqndVar = (eqnd) eqncVar.instance;
        strP.getClass();
        eqndVar.c = strP;
        eqncVar.a(str);
        eqncVar.copyOnWrite();
        eqnd eqndVar2 = (eqnd) eqncVar.instance;
        eqnsVar.getClass();
        eqndVar2.i = eqnsVar;
        eqndVar2.b |= 4;
        return (eqnd) eqncVar.build();
    }

    private static eqns i(epkh epkhVar) {
        eqnr eqnrVar = (eqnr) eqns.a.createBuilder();
        eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
        eqntVar.copyOnWrite();
        ((eqnu) eqntVar.instance).f = "key_content@message.cms.google";
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        evqs byteString = epkhVar.toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        evqe evqeVar = (evqe) evqdVar.build();
        eqntVar.copyOnWrite();
        eqnu eqnuVar = (eqnu) eqntVar.instance;
        evqeVar.getClass();
        eqnuVar.g = evqeVar;
        eqnuVar.b |= 1;
        eqnu eqnuVar2 = (eqnu) eqntVar.build();
        eqnrVar.copyOnWrite();
        eqns eqnsVar = (eqns) eqnrVar.instance;
        eqnuVar2.getClass();
        eqnsVar.a();
        eqnsVar.b.add(0, eqnuVar2);
        return (eqns) eqnrVar.build();
    }

    private final eqns j(bnar bnarVar, epjj epjjVar) {
        epkg epkgVar = (epkg) epkh.a.createBuilder();
        evqs byteString = epjjVar.toByteString();
        if (bnarVar.m() != 2) {
            bnar bnarVarC = ((cpqk) this.a.b()).c(2);
            if (bnarVarC == null) {
                throw new cpny("Failed to encrypt key, no key found");
            }
            try {
                l(byteString.I(), bnarVarC, epkgVar);
            } catch (Exception e) {
                b.o("Failed to encrypt key", e);
                throw new cpoa("Failed to encrypt key", e);
            }
        } else {
            epkgVar.copyOnWrite();
            ((epkh) epkgVar.instance).c = -1;
            epkgVar.copyOnWrite();
            ((epkh) epkgVar.instance).b = byteString;
        }
        return i((epkh) epkgVar.build());
    }

    @Override // defpackage.cpoc
    public final eqnd a(bnar bnarVar) {
        ecem.b();
        epjj epjjVarE = e(bnarVar);
        if (epjjVarE == null) {
            return null;
        }
        String strO = bnarVar.o();
        String.format(Locale.US, "CorrelationId expected to be populated. key index = %d, key type = %d", Integer.valueOf(bnarVar.k()), Integer.valueOf(bnarVar.m()));
        strO.getClass();
        return g(bnarVar, strO, bnarVar.m() == 2 ? "backup_key" : "cipher", j(bnarVar, epjjVarE));
    }

    @Override // defpackage.cpoc
    public final eqnd b(bnar bnarVar, ekgb ekgbVar) {
        return f(bnarVar, ekgbVar, false);
    }

    @Override // defpackage.cpoc
    public final eqnd c(bnar bnarVar) {
        ecem.b();
        ejwl.a(bnarVar.m() == 2);
        epjj epjjVarE = e(bnarVar);
        if (epjjVarE == null) {
            throw new cpzc(75, cpyz.NO_RETRY);
        }
        c.p("Building Backup Key for update...");
        return h(bnarVar, "backup_key", j(bnarVar, epjjVarE));
    }

    @Override // defpackage.cpoc
    public final eqnd d(bnar bnarVar, ekgb ekgbVar) {
        return f(bnarVar, ekgbVar, true);
    }
}
