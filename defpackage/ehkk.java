package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkk {
    public final Context a;
    public final egbf b;
    public final ehhy c;
    public final eoqr d;
    public efwo e;
    private final eygg f;
    private final dzyn g;
    private final Map h;

    /* compiled from: PG */
    public interface a {
        ehey gk();

        ehey gl();
    }

    public ehkk(Context context, eygg eyggVar, dzyn dzynVar, egbf egbfVar, ehhy ehhyVar, Map map) {
        context.getClass();
        eyggVar.getClass();
        dzynVar.getClass();
        egbfVar.getClass();
        this.a = context;
        this.f = eyggVar;
        this.g = dzynVar;
        this.b = egbfVar;
        this.c = ehhyVar;
        this.h = map;
        this.d = new eoqr();
    }

    public final ListenableFuture a(dzzs dzzsVar, evqs evqsVar, String str, String str2) {
        String str3;
        if (evqsVar != null) {
            dzyn dzynVar = this.g;
            Set set = (Set) this.h.get(dzyc.b(str2));
            if (set == null) {
                set = fcvq.a;
            }
            str3 = str2;
            ((each) dzynVar.c).a(evqsVar, set, str, str3, true, true);
        } else {
            str3 = str2;
        }
        return ((ehgl) this.f.b()).a(str3, dzzsVar);
    }
}
