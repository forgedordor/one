package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhja {
    public static String a = "CarrierServices";
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static final ekrg d = ekrg.c("com/google/android/ims/util/log/CarrierServicesLog");
    public static final dhip b = new dhip("");
    private static final String e = dhja.class.getName();
    private static final AtomicReference f = new AtomicReference();
    public static int c = 4;

    private dhja() {
    }

    @Deprecated
    public static String a(Object obj) {
        return dhiz.UNKNOWN.c(obj);
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (Log.isLoggable(a, 3)) {
            return obj.toString();
        }
        return "Redacted-" + obj.toString().length() + "-chars";
    }

    @Deprecated
    public static void c(String str, Object... objArr) {
        n(3, b, null, str, objArr);
    }

    public static void d(dhip dhipVar, String str, Object... objArr) {
        n(3, dhipVar, null, str, objArr);
    }

    @Deprecated
    public static void e(Throwable th, String str, Object... objArr) {
        n(3, b, th, str, objArr);
    }

    public static void f(PrintWriter printWriter) {
        dhjh dhjhVar = (dhjh) f.get();
        if (dhjhVar != null) {
            dhjhVar.a(printWriter);
        }
    }

    @Deprecated
    public static void g(String str, Object... objArr) {
        n(6, b, null, str, objArr);
    }

    public static void h(dhip dhipVar, String str, Object... objArr) {
        n(6, dhipVar, null, str, objArr);
    }

    @Deprecated
    public static void i(Throwable th, String str, Object... objArr) {
        n(6, b, th, str, objArr);
    }

    public static void j(Throwable th, dhip dhipVar, String str, Object... objArr) {
        n(6, dhipVar, th, str, objArr);
    }

    @Deprecated
    public static void k(String str, Object... objArr) {
        n(4, b, null, str, objArr);
    }

    public static void l(dhip dhipVar, String str, Object... objArr) {
        n(4, dhipVar, null, str, objArr);
    }

    public static void m(dhip dhipVar, String str, Object... objArr) {
        Predicate predicate = new Predicate() { // from class: dhio
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = dhja.a;
                return Thread.currentThread().getId() == ((Thread) obj).getId();
            }
        };
        if (((Boolean) dfbu.h.a()).booleanValue()) {
            p(dhipVar, str, objArr);
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            for (Thread thread : allStackTraces.keySet()) {
                if (predicate.test(thread)) {
                    p(dhipVar, "Thread: %s, ", thread);
                    StackTraceElement[] stackTraceElementArr = allStackTraces.get(thread);
                    StringBuilder sb = new StringBuilder();
                    for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                        sb.append("at ");
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                    p(dhipVar, "stack: %s", sb.toString());
                }
            }
        }
    }

    public static void n(int i2, dhip dhipVar, Throwable th, String str, Object... objArr) {
        StackTraceElement stackTraceElement;
        if (Log.isLoggable(a, i2)) {
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            int i3 = 1;
            while (true) {
                if (i3 >= stackTrace.length) {
                    stackTraceElement = new StackTraceElement("<unknown>", "<unknown>", "<unknown>", 0);
                    break;
                }
                stackTraceElement = stackTrace[i3];
                String className = stackTraceElement.getClassName();
                if (!className.equals(e) && !className.endsWith("Log")) {
                    break;
                } else {
                    i3++;
                }
            }
            String str2 = (dhipVar == b || dhipVar == null) ? null : dhipVar.a;
            try {
                ekrd ekrdVarA = d.a(i2 != 3 ? i2 != 4 ? i2 != 5 ? (i2 == 6 || i2 == Integer.MAX_VALUE) ? Level.SEVERE : Level.FINEST : Level.WARNING : Level.INFO : Level.FINE);
                ekrdVarA.X(eksq.a, a);
                ekrdVarA.X(cqnc.U, str2);
                ekrdVarA.X(cqnc.P, Long.valueOf(Thread.currentThread().getId()));
                ((ekrd) ((ekrd) ((ekrd) ekrdVarA.h(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), null)).g(th)).h("com/google/android/ims/util/log/CarrierServicesLog", "logWithFlogger", 510, "third_party/java_src/android_libs/carrierservices/java/com/google/android/ims/util/log/CarrierServicesLog.java")).P(str, objArr);
            } catch (IllegalFormatException e2) {
                ekrg ekrgVar = d;
                ekrd ekrdVar = (ekrd) ekrgVar.i();
                ekrz ekrzVar = eksq.a;
                ekrdVar.X(ekrzVar, a);
                ekrz ekrzVar2 = cqnc.U;
                ekrdVar.X(ekrzVar2, str2);
                ((ekrd) ekrdVar.h(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), null)).q(str);
                ekrd ekrdVar2 = (ekrd) ekrgVar.i();
                ekrdVar2.X(ekrzVar, a);
                ekrdVar2.X(ekrzVar2, str2);
                ((ekrd) ((ekrd) ekrdVar2.g(e2)).h("com/google/android/ims/util/log/CarrierServicesLog", "logWithFlogger", 527, "third_party/java_src/android_libs/carrierservices/java/com/google/android/ims/util/log/CarrierServicesLog.java")).q("IllegalFormatException while formatting logging.");
            }
        }
    }

    @Deprecated
    public static void o(String str, Object... objArr) {
        n(2, b, null, str, objArr);
    }

    public static void p(dhip dhipVar, String str, Object... objArr) {
        n(2, dhipVar, null, str, objArr);
    }

    @Deprecated
    public static void q(String str, Object... objArr) {
        n(5, b, null, str, objArr);
    }

    public static void r(dhip dhipVar, String str, Object... objArr) {
        n(5, dhipVar, null, str, objArr);
    }

    @Deprecated
    public static void s(Throwable th, String str, Object... objArr) {
        n(5, b, th, str, objArr);
    }

    public static void t(Throwable th, dhip dhipVar, String str, Object... objArr) {
        n(5, dhipVar, th, str, objArr);
    }

    @Deprecated
    public static void u(String str, Object... objArr) {
        n(Alert.DURATION_SHOW_INDEFINITELY, b, null, str, objArr);
    }

    public static boolean v() {
        return c <= 3;
    }

    public static void w(int i2, int i3, String str, Object... objArr) {
        String str2;
        if (TextUtils.isEmpty((CharSequence) dfbu.j.a())) {
            return;
        }
        switch (i2) {
            case 1:
                str2 = "EVENT_SENT_VIA_EVENT_HUB";
                break;
            case 2:
                str2 = "IMDN_REPORT_PAGER_MSG_QUEUED";
                break;
            case 3:
                str2 = "IMDN_REPORT_PAGER_MSG_SENDING";
                break;
            case 4:
                str2 = "IMDN_REPORT_PAGER_RESPONSE_RECEIVED";
                break;
            case 5:
                str2 = "IMDN_REPORT_PAGER_MSG_CREATED";
                break;
            case 6:
                str2 = "IMDN_REPORT_PAGER_MSG_RECEIVED";
                break;
            case 7:
                str2 = "INTENT_SENT_TO_BUGLE";
                break;
            case 8:
                str2 = "MSRP_CONNECTION_ESTABLISHED";
                break;
            case 9:
                str2 = "MSRP_CONNECTION_DISCONNECTED";
                break;
            case 10:
                str2 = "MSRP_INIT_MSG_QUEUED";
                break;
            case 11:
                str2 = "MSRP_MSG_CANCELLED";
                break;
            case 12:
                str2 = "MSRP_MSG_GENERATED";
                break;
            case 13:
                str2 = "MSRP_MSG_QUEUED";
                break;
            case 14:
                str2 = "MSRP_MSG_RESPONSE_RECEIVED";
                break;
            case 15:
                str2 = "MSRP_MSG_SENDING";
                break;
            case 16:
                str2 = "MSRP_MSG_SENT";
                break;
            case 17:
                str2 = "MSRP_MSG_RECEIVED";
                break;
            case 18:
                str2 = "MSRP_REQUEST_RECEIVED";
                break;
            case 19:
                str2 = "MSRP_RESPONSE_RECEIVED";
                break;
            case 20:
                str2 = "MSRP_RESPONSE_SENT";
                break;
            case 21:
                str2 = "SIP_CONNECTION_ESTABLISHED";
                break;
            case 22:
                str2 = "SIP_CONNECTION_DISCONNECTED";
                break;
            case 23:
                str2 = "SIP_INVITE_CREATED";
                break;
            case 24:
                str2 = "SIP_INVITE_SENDING";
                break;
            case 25:
                str2 = "SIP_MSG_RECEIVED";
                break;
            case 26:
                str2 = "SIP_MSG_SENT";
                break;
            default:
                str2 = "SIP_RESPONSE_RECEIVED";
                break;
        }
        n(i3, new dhip("BSS_EVENT:".concat(str2)), null, str, objArr);
    }

    public static byte[] x(byte[] bArr, int i2) {
        int length = bArr.length;
        if (length <= i2) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = length - i2;
        byteArrayOutputStream.write(String.format(Locale.US, "*** Initial %d bytes truncated ***\n", Integer.valueOf(i3)).getBytes(StandardCharsets.UTF_8));
        byteArrayOutputStream.write(bArr, i3, i2);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0050, B:28:0x0091, B:30:0x00b7, B:34:0x00c7, B:38:0x00e1, B:40:0x00e9, B:43:0x00f3, B:44:0x00fb, B:46:0x0107, B:48:0x0131, B:47:0x012c, B:51:0x0141, B:37:0x00d8, B:18:0x0063, B:20:0x0071, B:24:0x0089, B:23:0x0081), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0050, B:28:0x0091, B:30:0x00b7, B:34:0x00c7, B:38:0x00e1, B:40:0x00e9, B:43:0x00f3, B:44:0x00fb, B:46:0x0107, B:48:0x0131, B:47:0x012c, B:51:0x0141, B:37:0x00d8, B:18:0x0063, B:20:0x0071, B:24:0x0089, B:23:0x0081), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0050, B:28:0x0091, B:30:0x00b7, B:34:0x00c7, B:38:0x00e1, B:40:0x00e9, B:43:0x00f3, B:44:0x00fb, B:46:0x0107, B:48:0x0131, B:47:0x012c, B:51:0x0141, B:37:0x00d8, B:18:0x0063, B:20:0x0071, B:24:0x0089, B:23:0x0081), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141 A[Catch: all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0050, B:28:0x0091, B:30:0x00b7, B:34:0x00c7, B:38:0x00e1, B:40:0x00e9, B:43:0x00f3, B:44:0x00fb, B:46:0x0107, B:48:0x0131, B:47:0x012c, B:51:0x0141, B:37:0x00d8, B:18:0x0063, B:20:0x0071, B:24:0x0089, B:23:0x0081), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [dhjh] */
    /* JADX WARN: Type inference failed for: r11v7, types: [dhjh] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [dhjh] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [dhjh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(android.content.Context r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhja.y(android.content.Context):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int z(java.lang.String r4) {
        /*
            r0 = 4
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.hashCode()
            r2 = 3
            r3 = 2
            switch(r1) {
                case 2251950: goto L36;
                case 2656902: goto L2c;
                case 64921139: goto L22;
                case 66247144: goto L18;
                case 1069090146: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "VERBOSE"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L40
            r4 = r0
            goto L41
        L18:
            java.lang.String r1 = "ERROR"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L40
            r4 = r2
            goto L41
        L22:
            java.lang.String r1 = "DEBUG"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L40
            r4 = 0
            goto L41
        L2c:
            java.lang.String r1 = "WARN"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L40
            r4 = r3
            goto L41
        L36:
            java.lang.String r1 = "INFO"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = -1
        L41:
            if (r4 == 0) goto L4f
            if (r4 == r3) goto L4d
            if (r4 == r2) goto L4b
            if (r4 == r0) goto L4a
            return r0
        L4a:
            return r3
        L4b:
            r4 = 6
            return r4
        L4d:
            r4 = 5
            return r4
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhja.z(java.lang.String):int");
    }
}
