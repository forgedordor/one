package defpackage;

import android.os.Build;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjz {
    public static volatile bly a;

    static {
        blv.b.a(bpc.a(), new lbz() { // from class: cjy
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                blt bltVar = (blt) obj;
                bly blyVar = cjz.a;
                ArrayList arrayList = new ArrayList();
                if (bltVar.a(SurfaceViewStretchedQuirk.class, Build.VERSION.SDK_INT < 33 && (("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) && ("F2Q".equalsIgnoreCase(Build.DEVICE) || "Q2Q".equalsIgnoreCase(Build.DEVICE))) || (("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE)))))) {
                    arrayList.add(new SurfaceViewStretchedQuirk());
                }
                if (bltVar.a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                cjz.a = new bly(arrayList);
                bbs.a("DeviceQuirks", "view DeviceQuirks = ".concat(bly.b(cjz.a)));
            }
        });
    }

    public static bls a(Class cls) {
        return a.a(cls);
    }
}
