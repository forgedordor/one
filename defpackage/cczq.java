package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczq {
    public cczq(cczr cczrVar, cczn ccznVar, fcsu fcsuVar) {
        eieu eieuVarK = eiiy.k("FlagsInitializer#constructor");
        try {
            cczrVar.a();
            ccznVar.a();
            fcsuVar.b();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
