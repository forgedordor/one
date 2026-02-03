package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczp implements eyif {
    public static cczn a(Context context) {
        eieu eieuVarK = eiiy.k("FlagsInitModule#providePhenotypeInit");
        try {
            cczn ccznVar = new cczn(context);
            eieuVarK.close();
            return ccznVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
