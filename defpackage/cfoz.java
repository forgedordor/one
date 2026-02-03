package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfoz implements cfoy {
    private static final cqce a = cqce.g("BugleNetwork", "UserDataInboxMessageHandler");
    private final Map b;

    public cfoz(Map map) {
        this.b = map;
        for (fely felyVar : ((ekgp) map).keySet()) {
            cqbd cqbdVarD = a.d();
            cqbdVarD.I("Registered UserData InboxMessageHandler");
            cqbdVarD.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, felyVar.name());
            cqbdVarD.r();
        }
    }

    @Override // defpackage.cfoy
    public final eiju a(ezjj ezjjVar) {
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        if (ezjiVarB.equals(ezji.USERDATA)) {
            try {
                eznm eznmVar = (eznm) evsn.parseFrom(eznm.a, ezjjVar.e, evrr.a());
                Map map = this.b;
                fely felyVarB = fely.b(eznmVar.d);
                if (felyVarB == null) {
                    felyVarB = fely.UNRECOGNIZED;
                }
                cfoy cfoyVar = (cfoy) map.get(felyVarB);
                if (cfoyVar != null) {
                    return cfoyVar.a(ezjjVar);
                }
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Got UserData InboxMessage with unhandled type ");
                fely felyVarB2 = fely.b(eznmVar.d);
                if (felyVarB2 == null) {
                    felyVarB2 = fely.UNRECOGNIZED;
                }
                cqbdVarE.I(felyVarB2.name());
                cqbdVarE.A("messageId", ezjjVar.c);
                cqbdVarE.r();
                return eijx.e(true);
            } catch (evtj e) {
                cqbd cqbdVarE2 = a.e();
                cqbdVarE2.I("Failed to parse UserDataMessage");
                cqbdVarE2.A("messageId", ezjjVar.c);
                cqbdVarE2.s(e);
            }
        }
        cqbd cqbdVarE3 = a.e();
        cqbdVarE3.I("Ignoring non UserData InboxMessage or invalid UserData InboxMessage");
        ezji ezjiVarB2 = ezji.b(ezjjVar.d);
        if (ezjiVarB2 == null) {
            ezjiVarB2 = ezji.UNRECOGNIZED;
        }
        cqbdVarE3.A("messageType", ezjiVarB2);
        cqbdVarE3.A("messageId", ezjjVar.c);
        cqbdVarE3.r();
        return eijx.e(true);
    }
}
