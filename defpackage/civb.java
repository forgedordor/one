package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class civb {
    public static Optional a(eyga eygaVar, civa civaVar, String str) {
        if (eygaVar == null) {
            return Optional.empty();
        }
        civaVar.getClass();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
            if (ejuf.e(civaVar.q, (String) entry.getKey())) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                    if (ejuf.e(str, (String) entry2.getKey())) {
                        return Optional.of((String) entry2.getValue());
                    }
                }
            }
        }
        return Optional.empty();
    }
}
