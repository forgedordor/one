package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dceg {
    static volatile IGoogleCertificatesApi g;
    public static Context h;
    static final dcee a = new dcdw(dcec.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final dcee b = new dcdx(dcec.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final dcee c = new dcdy(dcec.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final dcee d = new dcdz(dcec.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final dcee e = new dcea(dcec.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final dcee f = new dceb(dcec.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    @Deprecated
    static dcel a(String str, dcec dcecVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, dcecVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static dcel b(final String str, final dcec dcecVar, final boolean z, boolean z2) {
        try {
            d();
            dclh.m(h);
            try {
                return g.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, dcecVar, z, z2), ObjectWrapper.wrap(h.getPackageManager())) ? dcel.a : new dcek(new Callable() { // from class: dcdv
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws NoSuchAlgorithmException {
                        Context context = dceg.h;
                        String str2 = str;
                        dcec dcecVar2 = dcecVar;
                        boolean z3 = z;
                        String str3 = (z3 || !dceg.b(str2, dcecVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestA = dcmu.a("SHA-256");
                        dclh.m(messageDigestA);
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, dcne.a(messageDigestA.digest(((dced) dcecVar2).a)), Boolean.valueOf(z3), "252020000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new dcel(false, "module call", e2);
            }
        } catch (dcvv e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new dcel(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    static synchronized void c(Context context) {
        if (h != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            h = context.getApplicationContext();
        }
    }

    static void d() {
        if (g != null) {
            return;
        }
        dclh.m(h);
        synchronized (i) {
            if (g == null) {
                g = IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.d(h, DynamiteModule.b, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
