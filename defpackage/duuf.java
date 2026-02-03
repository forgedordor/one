package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duuf {
    public static ecjb a(Context context, eosc eoscVar, final durk durkVar, dult dultVar, ejwi ejwiVar) {
        ecjs ecjsVarD = ecjv.d(context, eoscVar);
        ecjsVarD.c = duuj.d("gms_icing_mdd_groups", ejwiVar);
        ecjsVarD.b();
        ecjsVarD.e = new duuc(dultVar);
        ecjsVarD.d(new ecjt() { // from class: duud
            @Override // defpackage.ecjt
            public final evuh a(ecju ecjuVar, evuh evuhVar) {
                dtrp dtrpVar = (dtrp) dtrs.a.createBuilder();
                ekqg ekqgVarListIterator = ecjuVar.b().entrySet().listIterator();
                durk durkVar2 = durkVar;
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            dtrpVar.a((String) entry.getKey(), (dtqy) duuj.b(str, dtqy.a.getParserForType()));
                        } catch (evtj e) {
                            durt.g("SharedPreferences file groups metadata had unexpected format: %s", e);
                            durkVar2.l(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        durt.g("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                        durkVar2.l(1083);
                    }
                }
                return (dtrs) dtrpVar.build();
            }
        });
        return ecjsVarD.a();
    }

    public static ecjb b(Context context, eosc eoscVar, final durk durkVar, dult dultVar, ejwi ejwiVar) {
        ecjs ecjsVarD = ecjv.d(context, eoscVar);
        ecjsVarD.c = duuj.d("gms_icing_mdd_shared_files", ejwiVar);
        ecjsVarD.b();
        ecjsVarD.e = new duuc(dultVar);
        ecjsVarD.d(new ecjt() { // from class: duue
            @Override // defpackage.ecjt
            public final evuh a(ecju ecjuVar, evuh evuhVar) {
                dtsi dtsiVar = (dtsi) dtsk.a.createBuilder();
                ekqg ekqgVarListIterator = ecjuVar.b().entrySet().listIterator();
                durk durkVar2 = durkVar;
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    try {
                        String str = (String) entry.getValue();
                        str.getClass();
                        try {
                            dtsiVar.a((String) entry.getKey(), (dtsh) duuj.b(str, dtsh.a.getParserForType()));
                        } catch (evtj e) {
                            durt.g("SharedPreferences shared files metadata had unexpected format: %s", e);
                            durkVar2.l(1084);
                        }
                    } catch (ClassCastException | NullPointerException e2) {
                        durt.g("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                        durkVar2.l(1083);
                    }
                }
                return (dtsk) dtsiVar.build();
            }
        });
        return ecjsVarD.a();
    }
}
