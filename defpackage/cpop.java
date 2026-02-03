package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpop {
    public static final cqce a = cqce.g("BugleCmsFolsom", "CmsCipherKeyFactoryImpl");
    public final eqnd b;
    public final auso c;
    public final eosc d;
    public final eosc e;
    public final cphs f;
    private final fcsu g;

    public cpop(auso ausoVar, cphs cphsVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, eqnd eqndVar) {
        this.b = eqndVar;
        this.c = ausoVar;
        this.f = cphsVar;
        this.g = fcsuVar;
        this.d = eoscVar;
        this.e = eoscVar2;
    }

    public final bnar a(epjj epjjVar) {
        String[] strArr = bncb.a;
        bnau bnauVar = new bnau();
        bnauVar.e(epjjVar.b);
        int i = epjjVar.d;
        epjk epjkVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : epjk.CMS_HMAC_SHA256_KEY : epjk.CMS_BACKUP_KEY : epjk.CMS_ENCRYPTION_KEY : epjk.CMS_UNKNOWN_KEY;
        if (epjkVar == null) {
            epjkVar = epjk.UNRECOGNIZED;
        }
        Integer num = (Integer) cptt.j.get(epjkVar);
        if (num == null) {
            throw new RuntimeException("Key Type cannot be mapped, make sure CmsObjectBuilderUtility contains the key type and the key type is backed up properly. Key type: " + epjjVar.d);
        }
        bnauVar.f(num.intValue());
        evqs evqsVar = epjjVar.c;
        if (evqsVar.H()) {
            throw new RuntimeException(String.format("Key is empty, make sure you have backed up the key. KeyType: %d, KeyIndex: %d", Integer.valueOf(epjjVar.d), Integer.valueOf(epjjVar.b)));
        }
        bnauVar.d(evqsVar.I());
        eqnd eqndVar = this.b;
        bnauVar.c(eqndVar.c);
        bnauVar.b(eqndVar.k);
        return bnauVar.a();
    }

    public final bnar b(evqs evqsVar, int i) {
        try {
            bnar bnarVarB = ((Boolean) ((cczi) cpyl.X.get()).e()).booleanValue() ? ((cpqk) this.g.b()).b(i, 2) : ((cpqk) this.g.b()).c(2);
            byte[] bArrQ = bnarVarB == null ? null : bnarVarB.q();
            if (bnarVarB == null || bArrQ == null) {
                throw new cpon();
            }
            return a((epjj) evsn.parseFrom(epjj.a, cpob.a(evqsVar.I(), bArrQ)));
        } catch (evtj e) {
            throw new cpok(e, "Failed to create ".concat(String.valueOf(epjj.class.getSimpleName())));
        } catch (Exception e2) {
            if (e2 instanceof cpyv) {
                throw ((cpyv) e2);
            }
            throw new cpom(e2, String.format("Can't decrypt %s for %s", epkh.class.getSimpleName(), epjj.class.getSimpleName()));
        }
    }
}
