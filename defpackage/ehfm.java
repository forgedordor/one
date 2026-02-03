package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfm implements ehea {
    private final ehgl a;
    private final dzyn b;
    private final Map c;
    private final String d;

    public ehfm(ehgl ehglVar, dzyn dzynVar, Map map, String str) {
        ehglVar.getClass();
        dzynVar.getClass();
        this.a = ehglVar;
        this.b = dzynVar;
        this.c = map;
        this.d = str;
    }

    private final ListenableFuture c(dzzs dzzsVar) {
        return this.a.a(this.d, dzzsVar);
    }

    private final void d(evqs evqsVar) {
        if (evqsVar != null) {
            dzyn dzynVar = this.b;
            Map map = this.c;
            String str = this.d;
            Set set = (Set) map.get(dzyc.b(str));
            if (set == null) {
                set = fcvq.a;
            }
            ((each) dzynVar.c).a(evqsVar, set, "", str, false, true);
        }
    }

    @Override // defpackage.ehea
    public final ListenableFuture a(String str, evqs evqsVar, dzzs dzzsVar) {
        if (!fdbq.f(str, "")) {
            throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
        }
        d(evqsVar);
        return c(dzzsVar);
    }

    @Override // defpackage.ehea
    public final ListenableFuture b(evqs evqsVar, dzzs dzzsVar) {
        d(evqsVar);
        return c(dzzsVar);
    }
}
