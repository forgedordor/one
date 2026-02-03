package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmw implements cfmz {
    public static final epea a;
    public static final epea b;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate");
    private final fcsu d;

    static {
        epdy epdyVar = (epdy) epea.a.createBuilder();
        epdyVar.copyOnWrite();
        ((epea) epdyVar.instance).b = epdz.a(4);
        a = (epea) epdyVar.build();
        epdy epdyVar2 = (epdy) epea.a.createBuilder();
        epdyVar2.copyOnWrite();
        ((epea) epdyVar2.instance).b = epdz.a(3);
        b = (epea) epdyVar2.build();
    }

    public ckmw(fcsu fcsuVar) {
        this.d = fcsuVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        epdx epdxVar = (epdx) evuhVar;
        if (!epdxVar.c.isEmpty() && (epdxVar.b & 1) != 0) {
            ckmc ckmcVarB = ckmc.b(epdxVar.e);
            if (ckmcVarB == null) {
                ckmcVarB = ckmc.UNRECOGNIZED;
            }
            if (ckmcVarB != ckmc.REACTION_ACTION_UNSPECIFIED) {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleReactions");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(ckmz.c, epdxVar.c);
                ekrz ekrzVar = ckmz.g;
                ckmc ckmcVarB2 = ckmc.b(epdxVar.e);
                if (ckmcVarB2 == null) {
                    ckmcVarB2 = ckmc.UNRECOGNIZED;
                }
                ekrdVar.X(ekrzVar, ckmcVarB2);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternal", 67, "SendReactionDelegate.java")).q("Initiating reaction sending from Ditto.");
                ckms ckmsVar = (ckms) this.d.b();
                String str = epdxVar.c;
                ckmb ckmbVar = epdxVar.d;
                if (ckmbVar == null) {
                    ckmbVar = ckmb.a;
                }
                ckmb ckmbVar2 = ckmbVar;
                ckmc ckmcVarB3 = ckmc.b(epdxVar.e);
                if (ckmcVarB3 == null) {
                    ckmcVarB3 = ckmc.UNRECOGNIZED;
                }
                ckmc ckmcVar = ckmcVarB3;
                epes epesVar = epdxVar.f;
                if (epesVar == null) {
                    epesVar = epes.a;
                }
                epes epesVar2 = epesVar;
                str.getClass();
                ckmbVar2.getClass();
                ckmcVar.getClass();
                epesVar2.getClass();
                return auvw.c(ckmsVar.b, fcyi.a, fdjz.a, new ckmr(ckmsVar, str, ckmbVar2, ckmcVar, epesVar2, null)).h(new ejvr() { // from class: ckmv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        epea epeaVar = ckmw.a;
                        return (bool == null || !bool.booleanValue()) ? ckmw.a : ckmw.b;
                    }
                }, eoqg.a);
            }
        }
        ekrw ekrwVarJ = c.j();
        ekrwVarJ.X(eksq.a, "BugleReactions");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ;
        ekrdVar2.X(new ekrz("has_reaction", Boolean.class, false, false), Boolean.valueOf(1 == (epdxVar.b & 1)));
        ekrdVar2.X(ckmz.c, epdxVar.c);
        ekrz ekrzVar2 = ckmz.g;
        ckmc ckmcVarB4 = ckmc.b(epdxVar.e);
        if (ckmcVarB4 == null) {
            ckmcVarB4 = ckmc.UNRECOGNIZED;
        }
        ekrdVar2.X(ekrzVar2, ckmcVarB4);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/reactions/ditto/delegate/SendReactionDelegate", "handleRequestInternal", 59, "SendReactionDelegate.java")).q("Cannot send a reaction from Ditto.");
        return eijx.e(a);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        return (epdx) evsn.parseFrom(epdx.a, evqsVar, evrr.a());
    }
}
