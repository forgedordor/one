package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import defpackage.bbf;
import defpackage.bch;
import defpackage.bdr;
import defpackage.bls;
import defpackage.bni;
import defpackage.bnk;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements bls {
    private static final Set a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean a() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "google".equalsIgnoreCase(Build.BRAND) && a.contains(Build.MODEL.toLowerCase());
    }

    public static final boolean c(Collection collection) {
        if (collection.size() != 3) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            if (bdrVar instanceof bch) {
                z = true;
            } else if (bdrVar instanceof bbf) {
                z3 = true;
            } else if (bdrVar.l.t(bni.y)) {
                z2 = bdrVar.l.l() == bnk.VIDEO_CAPTURE;
            }
        }
        return z && z2 && z3;
    }
}
