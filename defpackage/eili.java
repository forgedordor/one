package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eili implements ebzu {
    final /* synthetic */ ebzu a;
    final /* synthetic */ eilm b;

    public eili(eilm eilmVar, ebzu ebzuVar) {
        this.a = ebzuVar;
        this.b = eilmVar;
    }

    @Override // defpackage.ebzu
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        eigp eigpVar = this.b.a;
        ebzu ebzuVar = this.a;
        eieh eiehVarD = eigpVar.d("com/google/apps/tiktok/tracing/contrib/poke/PokeTraceCreation$1", "run", 35, ebzuVar.b());
        try {
            String strC = ebzuVar.c(context, strArr);
            eiehVarD.close();
            return strC;
        } catch (Throwable th) {
            try {
                eiehVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ebzu
    public final String[] d(Context context, String[] strArr) {
        return this.a.d(context, strArr);
    }
}
