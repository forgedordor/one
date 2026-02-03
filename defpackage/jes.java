package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jes {
    public static final icr a(jbf jbfVar, int i) {
        icr icrVar = jbfVar.D().w;
        if (icrVar != null && (icrVar.u & i) != 0) {
            while (icrVar != null) {
                int i2 = icrVar.t;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return icrVar;
                }
                icrVar = icrVar.w;
            }
        }
        return null;
    }
}
