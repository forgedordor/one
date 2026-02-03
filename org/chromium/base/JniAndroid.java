package org.chromium.base;

import android.text.TextUtils;
import android.util.Log;
import defpackage.a;
import defpackage.ffyb;
import defpackage.ffyc;
import defpackage.ffyh;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JniAndroid {
    private JniAndroid() {
    }

    private static Throwable handleException(Throwable th, String str) {
        try {
            ffyc.d("JniAndroid", "Handling uncaught Java exception", th);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new ffyb(str, th));
            ffyc.c("JniAndroid", "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th2) {
            ffyc.d("JniAndroid", "Exception in uncaught exception handler.", th2);
            return th2;
        }
    }

    private static String sanitizedStacktraceForUnhandledException(Throwable th) {
        int iLastIndexOf;
        try {
            try {
                String stackTraceString = Log.getStackTraceString(th);
                Pattern pattern = ffyh.a;
                if (TextUtils.isEmpty(stackTraceString)) {
                    return "";
                }
                String[] strArrSplit = stackTraceString.split("\\n");
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (!strArrSplit[i].startsWith("\tat ")) {
                        String string = strArrSplit[i];
                        if (!ffyh.b.matcher(string).find()) {
                            StringBuilder sb = new StringBuilder(string);
                            Pattern pattern2 = ffyh.a;
                            Matcher matcher = pattern2.matcher(sb);
                            int i2 = 0;
                            while (matcher.find(i2)) {
                                int iStart = matcher.start();
                                int iEnd = matcher.end();
                                String strSubstring = sb.substring(iStart, iEnd);
                                String[] strArr = ffyh.c;
                                int length = strArr.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < 3) {
                                        if (strSubstring.startsWith(strArr[i3])) {
                                            break;
                                        }
                                        i3++;
                                    } else if (!strSubstring.startsWith("chromium-") || (!strSubstring.endsWith(".apk") && !strSubstring.endsWith(".aab"))) {
                                        String[] strArr2 = ffyh.d;
                                        int length2 = strArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 14) {
                                                if (strSubstring.startsWith(strArr2[i4])) {
                                                    break;
                                                }
                                                i4++;
                                            } else if (!ffyh.a(strSubstring) && ((iLastIndexOf = strSubstring.lastIndexOf(".")) == -1 || !ffyh.a(strSubstring.substring(0, iLastIndexOf)))) {
                                                sb.replace(iStart, iEnd, "HTTP://WEBADDRESS.ELIDED");
                                                i2 = iStart + 24;
                                                matcher = pattern2.matcher(sb);
                                            }
                                        }
                                    }
                                }
                                i2 = iEnd;
                            }
                            string = sb.toString();
                        }
                        strArrSplit[i] = string;
                    }
                }
                return TextUtils.join("\n", strArrSplit);
            } catch (Throwable th2) {
                return a.v(Log.getStackTraceString(th2), "Error while getting stack trace: ");
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
