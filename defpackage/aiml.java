package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiml extends aimh {
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.aimh
    public final boolean a(aiol aiolVar) {
        aioj aiojVarB = aioj.b(aiolVar.b);
        if (aiojVarB == null) {
            aiojVarB = aioj.LOG_SPEC_UNSPECIFIED;
        }
        return ((Boolean) Map.EL.putIfAbsent(this.a, aiojVarB, true)) == null;
    }
}
