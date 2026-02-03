package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhff {
    public static final /* synthetic */ int a = 0;
    private static volatile List d;
    private static volatile List e;
    private static final ekrg b = ekrg.c("com/google/android/ims/security/SecurityUtil");
    private static final Object c = new Object();
    private static final dfny f = dfod.a(132284100);
    private static final dfny g = dfod.a(183130735);

    public static int a(Context context, String str, List list) throws NoSuchAlgorithmException {
        int i;
        NoSuchAlgorithmException noSuchAlgorithmException;
        PackageManager packageManager = context.getPackageManager();
        int i2 = -1;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                int length = signatureArr.length;
                if (length <= 0) {
                    try {
                        ekrw ekrwVarI = b.i();
                        ekrwVarI.X(eksq.a, "BugleRcsEngine");
                        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 290, "SecurityUtil.java")).q("Package signed with < 1 signature.");
                        return -1;
                    } catch (NoSuchAlgorithmException e2) {
                        noSuchAlgorithmException = e2;
                        i = -1;
                        ekrw ekrwVarI2 = b.i();
                        ekrwVarI2.X(eksq.a, "BugleRcsEngine");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(noSuchAlgorithmException)).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", (char) 317, "SecurityUtil.java")).q("checkForValidSignature caught");
                        return i;
                    }
                }
                ekrg ekrgVar = b;
                ekrw ekrwVarE = ekrgVar.e();
                ekrz ekrzVar = eksq.a;
                ekrwVarE.X(ekrzVar, "BugleRcsEngine");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 294, "SecurityUtil.java")).t("SecurityUtil>getUidIfValidSignature: whiteListedSignatures: %s", list);
                int i3 = 0;
                while (i3 < length) {
                    byte[] bArrDigest = messageDigest.digest(signatureArr[i3].toByteArray());
                    i = i2;
                    try {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        MessageDigest messageDigest2 = messageDigest;
                        int length2 = bArrDigest.length;
                        Signature[] signatureArr2 = signatureArr;
                        StringBuilder sb = new StringBuilder(length2 + length2);
                        int i4 = 0;
                        while (i4 < length2) {
                            int i5 = length2;
                            byte b2 = bArrDigest[i4];
                            sb.append(cArr[(b2 & 240) >>> 4]);
                            sb.append(cArr[b2 & 15]);
                            i4++;
                            length2 = i5;
                        }
                        String string = sb.toString();
                        ekrw ekrwVarE2 = ekrgVar.e();
                        ekrwVarE2.X(ekrzVar, "BugleRcsEngine");
                        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 302, "SecurityUtil.java")).D("SecurityUtil>getUidIfValidSignature: packageName: %s, hexSignatureSha1: %s", str, string);
                        if (!list.contains(string)) {
                            ekrw ekrwVarI3 = ekrgVar.i();
                            ekrwVarI3.X(ekrzVar, "BugleRcsEngine");
                            ((ekrd) ((ekrd) ekrwVarI3).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 308, "SecurityUtil.java")).D("Invalid signature found for %s: %s", str, string);
                            return i;
                        }
                        i3++;
                        i2 = i;
                        messageDigest = messageDigest2;
                        signatureArr = signatureArr2;
                    } catch (PackageManager.NameNotFoundException unused) {
                        return i;
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        noSuchAlgorithmException = e;
                        ekrw ekrwVarI22 = b.i();
                        ekrwVarI22.X(eksq.a, "BugleRcsEngine");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI22).g(noSuchAlgorithmException)).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", (char) 317, "SecurityUtil.java")).q("checkForValidSignature caught");
                        return i;
                    }
                }
                dhja.o("All signatures are whitelisted. Allowing %s", str);
                return packageManager.getApplicationInfo(str, 0).uid;
            } catch (PackageManager.NameNotFoundException unused2) {
                return -1;
            }
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            i = i2;
        }
    }

    public static String b() {
        return ((Boolean) dfog.o().a.aC.a()).booleanValue() ? (String) dfog.o().a.aD.a() : (String) dfbw.c.a();
    }

    public static void c(Context context, Intent intent) {
        intent.putExtra("pending_intent", ((Boolean) g.a()).booleanValue() ? PendingIntent.getBroadcast(context, 0, intent, crag.a(1073741824)) : PendingIntent.getBroadcast(context, 0, intent, 0));
    }

    public static void d(Context context, int i) throws RemoteException {
        boolean zContains;
        if (i == Process.myUid()) {
            return;
        }
        Object obj = c;
        synchronized (obj) {
            dfny dfnyVar = f;
            if (((Boolean) dfnyVar.a()).booleanValue()) {
                zContains = g(context).contains(Integer.valueOf(i));
            } else {
                if (d == null) {
                    if (((Boolean) dfnyVar.a()).booleanValue()) {
                        ekrw ekrwVarG = b.g();
                        ekrwVarG.X(eksq.a, "BugleRcsEngine");
                        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/ims/security/SecurityUtil", "updateWhitelists", 136, "SecurityUtil.java")).q("Skipping UID allowlist cache update");
                    } else {
                        d = g(context);
                        synchronized (obj) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = dhkz.b((String) dfbw.b.a()).iterator();
                            while (it.hasNext()) {
                                int iF = f(context, (String) it.next(), (String) dfbw.d.a());
                                if (iF != -1) {
                                    arrayList.add(Integer.valueOf(iF));
                                }
                            }
                            e = arrayList;
                            dhhb.a.e(b());
                            dhhb.c.e((String) dfbw.a.a());
                            dhhb.b.e((String) dfbw.d.a());
                            dhhb.d.e((String) dfbw.b.a());
                        }
                    }
                }
                List list = d;
                list.getClass();
                zContains = list.contains(Integer.valueOf(i));
            }
        }
        if (!zContains) {
            throw new RemoteException("Operation not allowed: Package not white listed.");
        }
    }

    public static boolean e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent == null) {
            dhja.k("Missing pending intent.", new Object[0]);
            return false;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            return "com.google.android.ims".equals(pendingIntent.getCreatorPackage()) && dhka.l(context);
        }
        return true;
    }

    private static int f(Context context, String str, String str2) {
        return a(context, str, dhkz.b(str2));
    }

    private static List g(Context context) {
        ArrayList arrayList;
        synchronized (c) {
            arrayList = new ArrayList();
            Iterator it = dhkz.b((String) dfbw.a.a()).iterator();
            while (it.hasNext()) {
                int iF = f(context, (String) it.next(), b());
                if (iF != -1) {
                    arrayList.add(Integer.valueOf(iF));
                }
            }
        }
        return arrayList;
    }
}
