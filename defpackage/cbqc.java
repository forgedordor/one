package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqc {
    private final fcsu a;

    public cbqc(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [fcvp] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final eyga a(eyga eygaVar, eyga eygaVar2) {
        eyge eygeVarA;
        Map mapUnmodifiableMap;
        eygaVar.getClass();
        eygaVar2.getClass();
        eyfy eyfyVar = (eyfy) eygaVar.toBuilder();
        eyfyVar.getClass();
        for (cbqb cbqbVar : ((cbqe) this.a.b()).b) {
            evtg evtgVar = cbqbVar.c;
            evtgVar.getClass();
            Set setAv = fcva.av(evtgVar);
            eyge eygeVar = (eyge) eygb.a(eyfyVar).get(cbqbVar.b);
            ?? linkedHashMap = 0;
            linkedHashMap = 0;
            if (eygeVar != null) {
                eygc eygcVar = (eygc) eygeVar.toBuilder();
                eygcVar.getClass();
                for (String str : cbqbVar.c) {
                    DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eyge) eygcVar.instance).b)).getClass();
                    str.getClass();
                    eygcVar.copyOnWrite();
                    ((eyge) eygcVar.instance).a().remove(str);
                }
                eygeVarA = eygf.a(eygcVar);
            } else {
                eygeVarA = null;
            }
            if (eygeVarA != null && eygeVarA.b.size() == 0) {
                eygb.a(eyfyVar);
                String str2 = cbqbVar.b;
                str2.getClass();
                eyfyVar.b(str2);
            } else if (eygeVarA != null) {
                eygb.a(eyfyVar);
                String str3 = cbqbVar.b;
                str3.getClass();
                eygb.c(str3, eygeVarA, eyfyVar);
            }
            eyge eygeVar2 = (eyge) DesugarCollections.unmodifiableMap(eygaVar2.b).get(cbqbVar.b);
            if (eygeVar2 != null && (mapUnmodifiableMap = DesugarCollections.unmodifiableMap(eygeVar2.b)) != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    if (setAv.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap == 0) {
                linkedHashMap = fcvp.a;
            }
            if (!linkedHashMap.isEmpty()) {
                eygb.a(eyfyVar);
                String str4 = cbqbVar.b;
                str4.getClass();
                evwo evwoVarA = eygb.a(eyfyVar);
                String str5 = cbqbVar.b;
                str5.getClass();
                eygc eygcVar2 = (eygc) eyge.a.createBuilder();
                eygcVar2.getClass();
                eygc eygcVar3 = (eygc) ((eyge) Map.EL.getOrDefault(evwoVarA, str5, eygf.a(eygcVar2))).toBuilder();
                eygcVar3.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eyge) eygcVar3.instance).b)).getClass();
                eygf.b(linkedHashMap, eygcVar3);
                eygb.c(str4, eygf.a(eygcVar3), eyfyVar);
            }
        }
        return eygb.b(eyfyVar);
    }
}
