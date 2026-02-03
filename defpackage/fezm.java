package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezm {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final fezn a(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return fezn.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return fezn.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return fezn.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return fezn.d;
            }
        } else if (str.equals("SSLv3")) {
            return fezn.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }
}
