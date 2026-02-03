package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadk {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final eryd b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public eadk(Context context, eadm eadmVar) {
        this.a = eadmVar.c ? dzyc.c(context, eadmVar.b) : eadmVar.b;
        eryd erydVarB = eryd.b(eadmVar.d);
        this.b = erydVarB == null ? eryd.UNKNOWN : erydVarB;
        this.c = eadmVar.g;
        this.d = eadmVar.e;
        this.e = eadmVar.f;
    }

    public static Map a(Context context) {
        Map mapC;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapC = g;
            if (mapC == null) {
                ekgi ekgiVar = new ekgi();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(a.v(str, "phenotype/"));
                                    try {
                                        evrr evrrVar = evrr.a;
                                        evuq evuqVar = evuq.a;
                                        eadk eadkVar = new eadk(context, (eadm) evsn.parseFrom(eadm.a, inputStreamOpen, evrr.a));
                                        ekgiVar.i(eadkVar.a, eadkVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (evtj e) {
                                    Log.e("PackageInfo", a.v(str, "Unable to read Phenotype PackageMetadata for "), e);
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                mapC = ekgiVar.c();
                g = mapC;
            }
        }
        return mapC;
    }
}
