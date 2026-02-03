package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsw implements dvhc {
    private static WeakReference a = new WeakReference(null);
    private final ekgb b = ekgb.r(2);

    private dwsw() {
    }

    public static synchronized dwsw c() {
        dwsw dwswVar = (dwsw) a.get();
        if (dwswVar != null) {
            return dwswVar;
        }
        dwsw dwswVar2 = new dwsw();
        a = new WeakReference(dwswVar2);
        return dwswVar2;
    }

    @Override // defpackage.dvhc
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dvhc
    public final List b(dwcm dwcmVar, dvrd dvrdVar, Context context) {
        return Arrays.asList(new dwsx(context));
    }
}
