package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esua {
    private final estx a;
    private final ejwi b;
    private final fbuj c;
    private final String d;
    private final Map e;
    private final fcsu f;
    private final ejwi g;
    private final Context h;

    public esua(ejwi ejwiVar, fbuj fbujVar, String str, Map map, fcsu fcsuVar, estx estxVar, ejwi ejwiVar2, Context context) {
        this.b = ejwiVar;
        this.c = fbujVar;
        this.d = str;
        this.e = map;
        this.f = fcsuVar;
        this.a = estxVar;
        this.g = ejwiVar2;
        this.h = context;
    }

    public final fbnd a(String str, fbud fbudVar, fbub fbubVar, boolean z) {
        fbur fbunVar;
        ejwl.b(true, "Cross-User channel must not be used with the current UserHandle.");
        if (str.equals(this.d) || "robolectric".equals(Build.FINGERPRINT)) {
            return (fbnd) this.f.b();
        }
        drgk.a();
        fbty fbtyVarA = fbty.a((ComponentName) this.e.get(str));
        if (z) {
            PackageManager packageManager = this.h.getPackageManager();
            Object obj = espi.a;
            fbunVar = new espg(packageManager);
        } else {
            int i = fbuq.a;
            fbunVar = new fbun();
        }
        return this.a.a(fbtyVarA, fbudVar, fbubVar, fbunVar, this.c, this.b, this.g);
    }
}
