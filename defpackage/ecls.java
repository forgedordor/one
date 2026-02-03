package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecls implements eyif {
    /* JADX WARN: Multi-variable type inference failed */
    public static ecjl a(Executor executor, ecev ecevVar, Set set) {
        eclv eclvVar = eclv.a;
        HashMap map = new HashMap();
        ekgb ekgbVarN = ekgb.n(set);
        int size = ekgbVarN.size();
        for (int i = 0; i < size; i++) {
            ecjm.a((eclo) ekgbVarN.get(i), map);
        }
        return new ecjl(executor, ecevVar, eclvVar, map);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
