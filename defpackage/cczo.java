package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczo implements eyif {
    public static cczr a(final Context context) {
        eieu eieuVarK = eiiy.k("FlagsInitModule#provideGServicesInit");
        try {
            cczr cczrVar = new cczr() { // from class: cczm
                @Override // defpackage.cczw
                public final void a() {
                    dbhd.b(context);
                }
            };
            eieuVarK.close();
            return cczrVar;
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
