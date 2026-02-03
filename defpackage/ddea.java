package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ddea {
    public static ddet b;
    public static ddes c;
    public static String d;
    public final Context e;
    public String f;
    private static final Map g = new csq();
    public static final long a = TimeUnit.DAYS.toMillis(7);

    protected ddea(Context context) {
        this.f = "";
        this.e = context.getApplicationContext();
        this.f = "";
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("InstanceID", "Never happens: can't find own package ".concat(e.toString()));
            return 0;
        }
    }

    public static String b(KeyPair keyPair) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static synchronized ddea d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (b == null) {
            Log.w("InstanceID", "Instance ID SDK is deprecated, " + applicationContext.getPackageName() + " should update to use Firebase Instance ID");
            b = new ddet(applicationContext);
            c = new ddes(applicationContext);
        }
        d = Integer.toString(a(applicationContext));
        Map map = g;
        ddea ddeaVar = (ddea) map.get("");
        if (ddeaVar != null) {
            return ddeaVar;
        }
        ddea ddeaVar2 = new ddea(applicationContext);
        map.put("", ddeaVar2);
        return ddeaVar2;
    }

    public final KeyPair c() {
        ddet ddetVar = b;
        dclh.m(ddetVar);
        return ddetVar.a(this.f).a;
    }
}
