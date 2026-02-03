package defpackage;

import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyi {
    public static final ckmb a(ezfb ezfbVar, ckmg ckmgVar, fcsu fcsuVar) {
        ckmb ckmbVarB;
        ckml ckmlVarB;
        cklt ckltVarA;
        ezfbVar.getClass();
        ckmgVar.getClass();
        int iB = ezez.b(ezfbVar.e);
        if (iB != 0 && iB == 3) {
            eksp ekspVar = ckyh.a;
            try {
                ckltVarA = (cklt) evsn.parseFrom(cklt.a, (byte[]) ckyh.b.e());
                ckltVarA.getClass();
            } catch (evtj unused) {
                ckyh.a.a(Level.WARNING).q("Could not parse the iOS reaction type mapping from the Phenotype flag.");
                ckltVarA = cklq.a();
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ckltVarA.b);
            String str = ezfbVar.b;
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str2 = (String) mapUnmodifiableMap.get(lowerCase);
            if (str2 == null) {
                if (!((cqmb) fcsuVar.b()).e(ezfbVar.b)) {
                    return null;
                }
                str2 = ezfbVar.b;
                str2.getClass();
            }
            ckmbVarB = ckmgVar.b(str2);
            ckmlVarB = ckml.b(ckmbVarB.e);
            if (ckmlVarB == null) {
                ckmlVarB = ckml.UNRECOGNIZED;
            }
        } else {
            ckmbVarB = ckmgVar.b(ezfbVar.b);
            ckmlVarB = ckml.b(ckmbVarB.e);
            if (ckmlVarB == null) {
                ckmlVarB = ckml.UNRECOGNIZED;
            }
        }
        if (ckmlVarB == ckml.REACTION_TYPE_UNSPECIFIED) {
            return null;
        }
        return ckmbVarB;
    }

    public static final ckmc b(ezfb ezfbVar) {
        ezfbVar.getClass();
        int i = ezfbVar.d;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? ckmc.UNRECOGNIZED : ckmc.REMOVE_REACTION : ckmc.ADD_REACTION : ckmc.REACTION_ACTION_UNSPECIFIED;
    }
}
