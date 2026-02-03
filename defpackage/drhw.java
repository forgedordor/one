package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drhw {
    public static volatile drhw e;

    public static drhw c() {
        if (e == null) {
            synchronized (drhw.class) {
                if (e == null) {
                    try {
                        Class.forName("drhv");
                        if (e == null) {
                            throw new IllegalStateException("HatsModule is not initialized.");
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalStateException("Failed to initialize HatsModule", e2);
                    }
                }
            }
        }
        return e;
    }

    public abstract drgw a();

    public abstract drid b();
}
