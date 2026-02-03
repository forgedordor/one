package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxvd {
    private static final eksp a = eksp.c("GnpSdk");

    public static dxvb g() {
        dxvb dxvbVar = new dxvb();
        dxvbVar.a = (byte) (dxvbVar.a | 12);
        return dxvbVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final String h() throws drji, evop {
        String strC = c();
        if (strC.startsWith("//")) {
            strC = "https:".concat(String.valueOf(strC));
        }
        String str = strC;
        boolean zStartsWith = str.startsWith("https://www.gstatic.com/gnp_");
        if (ebuj.a(str) || zStartsWith) {
            int iB = b() == -1 ? -1 : b();
            int iA = a() != -1 ? a() : -1;
            if (!zStartsWith) {
                int i = ebuh.a;
                String strB = ebuj.b(str, 0, iB, iA);
                if (strB != null) {
                    return strB;
                }
                if (iB == 0) {
                    if (iA != 0) {
                        iB = 0;
                    }
                }
                return ebuk.a(iB, iA, str);
            }
            int i2 = drjj.a;
            evow evowVar = new evow();
            Integer numValueOf = Integer.valueOf(iB);
            evot evotVar = evot.WIDTH;
            evowVar.b(evotVar, numValueOf);
            evowVar.a(evotVar);
            Integer numValueOf2 = Integer.valueOf(iA);
            evot evotVar2 = evot.HEIGHT;
            evowVar.b(evotVar2, numValueOf2);
            evowVar.a(evotVar2);
            try {
                try {
                    drjh drjhVar = new drjh(Uri.parse(str));
                    boolean z = true;
                    ejwl.b(true, "options is null");
                    ejwl.b(true, "url is null");
                    if (drjhVar.a() == null) {
                        z = false;
                    }
                    ejwl.b(z, "url path is null");
                    String strA = drjhVar.a();
                    if (strA.contains("=")) {
                        throw new evop("url path cannot already contain =");
                    }
                    String strC2 = evor.c("", evov.a(evowVar), false);
                    if (!strC2.isEmpty()) {
                        strA = evor.c.g(strA, strC2, new Object[0]);
                    }
                    return drjhVar.b(strA).a.toString();
                } catch (evop e) {
                    throw new drji(e);
                }
            } catch (drji e2) {
                ((eksl) ((eksl) ((eksl) a.j()).g(e2)).h("com/google/android/libraries/notifications/platform/media/GnpMedia", "getDownloadUrl", ']', "GnpMedia.java")).q("SCS options could not be added. Using raw url.");
                return str;
            }
        }
        return str;
    }
}
