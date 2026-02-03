package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecse {
    public static final long a = TimeUnit.DAYS.toMillis(1);

    static int a() {
        String strG = g();
        if (strG.contains(".")) {
            strG = strG.substring(strG.lastIndexOf(".") + 1);
        }
        return Integer.parseInt(strG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle b(expy expyVar) {
        expx expxVar = expyVar.c;
        if (expxVar == null) {
            expxVar = expx.a;
        }
        evtg evtgVar = expxVar.b;
        int size = evtgVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            expw expwVar = (expw) evtgVar.get(i);
            bundle.putString(expwVar.b, expwVar.c);
        }
        return bundle;
    }

    public static evuh c(evuh evuhVar, byte[] bArr) {
        try {
            return evuhVar.toBuilder().mergeFrom(bArr, evrr.a()).build();
        } catch (evtj e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.exny d(android.content.Context r6) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecse.d(android.content.Context):exny");
    }

    public static String e(PackageInfo packageInfo) {
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    return null;
                }
                int length = bArrDigest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(ejuf.c(str)).matches()) {
            Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return "";
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            Uri uri = Uri.parse(str);
            try {
                ecsj ecsjVar = ecrz.c;
                if (ecrz.b(fblz.a.get().a(ecrz.b))) {
                    return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), null).toString();
                }
                return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery() != null ? URLEncoder.encode(uri.getQuery(), "utf-8") : "").toString();
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                Log.e("SurveyUtils", e.getMessage());
            }
        }
        Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return "";
    }

    static String g() {
        ecsj ecsjVar = ecrz.c;
        Context context = ecrz.b;
        fbkg fbkgVar = fbkg.a;
        String strA = fbkgVar.get().a(context);
        if (!strA.equals("1")) {
            return strA;
        }
        ecsj ecsjVar2 = ecrz.c;
        return fbkgVar.get().b(ecrz.b);
    }

    public static void h(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void i(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean j(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean k(expq expqVar) {
        exps expsVar = expqVar.f;
        if (expsVar == null) {
            expsVar = exps.a;
        }
        return expsVar.b;
    }

    public static boolean l(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(expq expqVar) {
        if (expqVar.g.size() <= 1) {
            exqd exqdVar = (exqd) expqVar.g.get(0);
            int i = exqdVar.i;
            int iA = exqc.a(i);
            if (iA != 0 && iA == 3) {
                exnl exnlVar = (exqdVar.c == 4 ? (exqz) exqdVar.d : exqz.a).c;
                if (exnlVar == null) {
                    exnlVar = exnl.a;
                }
                Iterator<E> it = exnlVar.b.iterator();
                while (it.hasNext()) {
                    int iA2 = exnh.a(((exnj) it.next()).c);
                    if (iA2 != 0 && iA2 == 4) {
                        return true;
                    }
                }
                return false;
            }
            int iA3 = exqc.a(i);
            if (iA3 != 0 && iA3 == 5) {
                return false;
            }
        }
        return true;
    }
}
