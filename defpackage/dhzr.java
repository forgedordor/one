package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzr {
    public static final /* synthetic */ int a = 0;

    static {
        Object objA;
        try {
            System.loadLibrary("tartarus");
        } catch (UnsatisfiedLinkError e) {
            try {
                objA = Class.forName("android.app.Application", false, null);
            } catch (Throwable th) {
                objA = fctl.a(th);
            }
            if (fctk.d(objA)) {
                throw e;
            }
        }
    }
}
