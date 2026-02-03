package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmb implements eyif {
    /* JADX WARN: Type inference failed for: r4v0, types: [cfgy, java.lang.Object] */
    public static cfze a(Context context, final ceql ceqlVar, ceff ceffVar, Optional optional, Optional optional2, Optional optional3, eosc eoscVar) {
        fcsu fcsuVar = new fcsu() { // from class: tma
            @Override // defpackage.fcsu
            public final Object b() {
                return ceqlVar;
            }
        };
        Object obj = optional.get();
        return new cfze(context, fcsuVar, (cfrx) obj, optional2.get(), (cfpl) optional3.get(), eoscVar, ceffVar, 4, Optional.empty(), cfgy.a, Duration.ofSeconds(((Integer) cefs.p.e()).intValue()), ((Integer) cefs.q.e()).intValue(), ((Integer) cefs.r.e()).intValue(), false, true, false);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
