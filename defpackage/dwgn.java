package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgn implements dvhc {
    private static WeakReference b = new WeakReference(null);
    public dwgq a;
    private final ekgb c;

    private dwgn() {
        int i = ekgb.d;
        this.c = ekoe.a;
        this.a = null;
    }

    public static synchronized dwgn c() {
        return d();
    }

    public static synchronized dwgn d() {
        dwgn dwgnVar = (dwgn) b.get();
        if (dwgnVar != null) {
            return dwgnVar;
        }
        dwgn dwgnVar2 = new dwgn();
        b = new WeakReference(dwgnVar2);
        return dwgnVar2;
    }

    @Override // defpackage.dvhc
    public final ekgb a() {
        return this.c;
    }

    @Override // defpackage.dvhc
    public final List b(dwcm dwcmVar, dvrd dvrdVar, Context context) {
        this.a = new dwgv(context, dvrdVar, new dwgy(dwcmVar));
        return ekgb.r(new dwgo());
    }
}
