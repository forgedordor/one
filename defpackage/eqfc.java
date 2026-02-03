package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqfc {
    public static final exzo a(Throwable th, exzf exzfVar, fhaz fhazVar) {
        exzm exzmVarA;
        exzn exznVar = (exzn) exzo.a.createBuilder();
        exznVar.getClass();
        exze exzeVar = (exze) exzg.a.createBuilder();
        exzeVar.getClass();
        exza.b(exzfVar, exzeVar);
        exza.d(4, exzeVar);
        exza.e(4, exzeVar);
        if (th instanceof eqcx) {
            exzmVarA = eqcw.a(((eqcx) th).a);
        } else {
            exzk exzkVar = (exzk) exzm.a.createBuilder();
            exzkVar.getClass();
            exzj exzjVar = exzj.TACHYGRAM_ERROR_UNSPECIFIED;
            exzjVar.getClass();
            exzkVar.copyOnWrite();
            ((exzm) exzkVar.instance).b = exzjVar.a();
            exzd exzdVar = exzd.ERROR_RECOVERY_TYPE_UNSPECIFIED;
            exzdVar.getClass();
            exzkVar.copyOnWrite();
            ((exzm) exzkVar.instance).c = exzdVar.a();
            exzmVarA = exzb.a(exzkVar);
        }
        exza.c(exzmVarA, exzeVar);
        exzc.b(exza.a(exzeVar), exznVar);
        if (fhazVar != null) {
            String str = fhazVar.b;
            str.getClass();
            exzc.e(str, exznVar);
        }
        return exzc.a(exznVar);
    }

    public static final ezjd b(ezjj ezjjVar) {
        int i = ezjjVar.d;
        ezji ezjiVarB = ezji.b(i);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        if (ezjiVarB != ezji.GROUP) {
            ezji ezjiVarB2 = ezji.b(i);
            if (ezjiVarB2 == null) {
                ezjiVarB2 = ezji.UNRECOGNIZED;
            }
            ezjiVarB2.getClass();
            throw new eqht("Expected GROUP, but received: ".concat(String.valueOf(ezjiVarB2.name())));
        }
        try {
            evqs evqsVar = ezjjVar.e;
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            ezjd ezjdVar = (ezjd) evsn.parseFrom(ezjd.a, evqsVar, evrr.a);
            ezjdVar.getClass();
            return ezjdVar;
        } catch (evtj e) {
            throw new eqcx("Error parsing GroupMessage proto from InboxMessage's message field.", e);
        }
    }

    public static final eqfm c(int i, String str) {
        return new eqfm(i, "GroupMessage of type " + ezjc.a(i) + " does not have a " + str + " message.");
    }

    public static final exzf d(ezjj ezjjVar) {
        try {
            int iC = ezjc.c(b(ezjjVar).e);
            if (iC == 0) {
                iC = 1;
            }
            int i = iC - 2;
            if (i != -1 && i != 0) {
                switch (i) {
                    case 5:
                        return exzf.CREATE_GROUP;
                    case 6:
                        return exzf.ADD_GROUP_USERS;
                    case 7:
                        return exzf.KICK_GROUP_USERS;
                    case 8:
                        return exzf.GROUP_PROFILE_UPDATED;
                    case 9:
                        break;
                    case 10:
                        return exzf.CHANGE_GROUP_INFO;
                    default:
                        throw new fctg();
                }
            }
            return exzf.GROUP_OPERATION_UNSPECIFIED;
        } catch (eqcx unused) {
            return exzf.GROUP_OPERATION_UNSPECIFIED;
        }
    }
}
