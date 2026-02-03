package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bks {
    static {
        bjo bjoVar = bku.F;
    }

    public static int a(bku bkuVar) {
        return ((Integer) bkuVar.m(bku.F)).intValue();
    }

    public static int b(bku bkuVar, int i) {
        return ((Integer) bkuVar.n(bku.G, Integer.valueOf(i))).intValue();
    }

    public static bvc c(bku bkuVar) {
        return (bvc) bkuVar.m(bku.N);
    }

    public static void d(bku bkuVar) {
        boolean zF = bkuVar.F();
        boolean z = bkuVar.O() != null;
        if (zF && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (bkuVar.M() != null) {
            if (zF || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    public static boolean e(bku bkuVar) {
        return bkuVar.t(bku.F);
    }

    public static int f(bku bkuVar) {
        return ((Integer) bkuVar.n(bku.H, -1)).intValue();
    }

    public static List g(bku bkuVar) {
        List list = (List) bkuVar.n(bku.O, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static Size h(bku bkuVar) {
        return (Size) bkuVar.n(bku.K, null);
    }

    public static Size i(bku bkuVar) {
        return (Size) bkuVar.n(bku.L, null);
    }

    public static int j(bku bkuVar) {
        return ((Integer) bkuVar.n(bku.I, -1)).intValue();
    }

    public static bvc k(bku bkuVar) {
        return (bvc) bkuVar.n(bku.N, null);
    }

    public static List l(bku bkuVar) {
        return (List) bkuVar.n(bku.M, null);
    }

    public static Size m(bku bkuVar) {
        return (Size) bkuVar.n(bku.J, null);
    }
}
