package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lba {
    static final cub a = new cub(16);
    public static final ExecutorService b;
    static final Object c;
    static final cvw d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new lbh());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new cvw();
    }

    static laz a(String str, Context context, List list, int i) {
        laz lazVar;
        int i2;
        int length;
        Typeface typefaceC;
        plm.a("getFontSync");
        try {
            Typeface typeface = (Typeface) a.c(str);
            if (typeface != null) {
                lazVar = new laz(typeface);
            } else {
                try {
                    lbc lbcVarA = las.a(context, list);
                    if (lbcVarA.a != 0) {
                        i2 = -2;
                    } else {
                        lbd[] lbdVarArrA = lbcVarA.a();
                        if (lbdVarArrA == null || (length = lbdVarArrA.length) == 0) {
                            i2 = 1;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i4 = lbdVarArrA[i3].e;
                                if (i4 != 0) {
                                    i2 = i4 < 0 ? -3 : i4;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (i2 != 0) {
                        lazVar = new laz(i2);
                    } else {
                        List list2 = lbcVarA.b;
                        if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                            typefaceC = kzi.c(context, lbcVarA.a(), i);
                        } else {
                            kzq kzqVar = kzi.a;
                            plm.a("TypefaceCompat.createFromFontInfoWithFallback");
                            try {
                                typefaceC = kzi.a.f(context, list2, i);
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (typefaceC != null) {
                            a.d(str, typefaceC);
                            lazVar = new laz(typefaceC);
                        } else {
                            lazVar = new laz(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    lazVar = new laz(-1);
                }
            }
            return lazVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String b(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((lat) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
