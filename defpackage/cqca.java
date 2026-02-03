package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqca {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/LogUtil");
    private static final AtomicReference c = new AtomicReference();
    private static volatile boolean d = false;
    public static volatile boolean b = false;

    @Deprecated
    public static String a(Intent intent) {
        StringBuilder sb = new StringBuilder();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                sb.append("\n");
                sb.append(str);
                sb.append(" = ");
                sb.append(obj == null ? "null" : cqcv.b(obj.toString()));
            }
        }
        return sb.toString();
    }

    static Level b(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? Level.FINEST : Level.SEVERE : Level.WARNING : Level.INFO : Level.FINE;
    }

    @Deprecated
    public static void c(String str, String str2) {
        ekrd ekrdVar = (ekrd) a.e();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 245, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void d(String str, String str2, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.e();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 263, "LogUtil.java")).P(str2, objArr);
    }

    @Deprecated
    public static void e(Context context, cqpz cqpzVar, PrintWriter printWriter, cqcb cqcbVar) {
        cqbz cqbzVarC;
        cqbz cqbzVar = null;
        try {
            if ((cqcbVar == cqcb.BUGLE) == craf.g(context)) {
                cqbzVarC = (cqbz) c.get();
            } else {
                cqbzVarC = cqbz.c(context, cqpzVar, cqcbVar.d, "Bugle");
                cqbzVar = cqbzVarC;
            }
            if (cqbzVarC != null) {
                cqbzVarC.a(printWriter, cqcbVar);
            }
            if (cqbzVar != null) {
                try {
                    cqbzVar.close();
                } catch (IOException e) {
                    Log.e("Bugle", "priorLogSaver.close: ", e);
                }
            }
        } catch (Throwable th) {
            if (cqbzVar != null) {
                try {
                    cqbzVar.close();
                } catch (IOException e2) {
                    Log.e("Bugle", "priorLogSaver.close: ", e2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void f(String str, String str2) {
        ekrd ekrdVar = (ekrd) a.i();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 451, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void g(String str, String str2, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.i();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 468, "LogUtil.java")).P(str2, objArr);
    }

    @Deprecated
    public static void h(String str, Throwable th, String str2) {
        ekrd ekrdVar = (ekrd) a.i();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 491, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void i(String str, String str2) {
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 308, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void j(String str, String str2, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 325, "LogUtil.java")).P(str2, objArr);
    }

    @Deprecated
    public static void k(String str, Throwable th, String str2) {
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 348, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void l(String str, String str2) {
        ekrd ekrdVar = (ekrd) a.g();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", 183, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void m(String str, String str2, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.g();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", BasePaymentResult.ERROR_REQUEST_FAILED, "LogUtil.java")).P(str2, objArr);
    }

    @Deprecated
    public static void n(String str, String str2) {
        ekrd ekrdVar = (ekrd) a.j();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 369, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void o(String str, String str2, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.j();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 386, "LogUtil.java")).P(str2, objArr);
    }

    @Deprecated
    public static void p(String str, Throwable th, String str2) {
        ekrd ekrdVar = (ekrd) a.j();
        ekrdVar.X(eksq.a, str);
        ekrdVar.Y(ekrq.a);
        ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 409, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static boolean q(String str, int i) {
        return Log.isLoggable(str, i);
    }

    static void r(StringBuilder sb, String str, String str2) {
        if (sb.length() + str.length() > 4000) {
            i("Bugle", sb.toString());
            sb.setLength(0);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
        }
        sb.append(str);
    }

    public static byte[] s(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= i) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = length - i;
        byteArrayOutputStream.write(String.format("*** Initial %d bytes truncated ***\n", Integer.valueOf(i2)).getBytes(StandardCharsets.UTF_8));
        byteArrayOutputStream.write(bArr, i2, i);
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static void t(Throwable th, String str, Object... objArr) {
        ekrd ekrdVar = (ekrd) a.j();
        ekrdVar.X(eksq.a, "RcsClientLib");
        ekrdVar.Y(ekrq.a);
        ((ekrd) ((ekrd) ekrdVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 429, "LogUtil.java")).P(str, objArr);
    }

    public static void u() {
        b = false;
    }
}
