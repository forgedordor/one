package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekvv {
    protected ekvv() {
    }

    public static void b(ekvt ekvtVar, boolean z) {
        try {
            ekvtVar.close();
        } catch (RuntimeException e) {
            if (z) {
                return;
            }
            if (!(e instanceof ekvs)) {
                throw new ekvs(e);
            }
        }
    }

    public abstract ekvr a();
}
