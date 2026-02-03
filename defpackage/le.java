package defpackage;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class le {
    public static final String[] a = {"video/mp4", "video/3gp", "video/3gpp", "video/3gpp2", "video/m4v", "video/mpeg4", "video/avc", "video/mpeg", "video/webm", "video/x-matroska", "video/hevc", "video/*"};
    public static final String[] b = {"image/jpeg", "image/jpg", "image/gif", "image/vnd.wap.wbmp", "image/webp", "image/png", "image/x-ms-bmp", "image/heif", "image/heic"};
    public static final String[] c = {"text/calendar", "text/x-vCalendar", "application/ics", "application/vcs", "application/hbs-vcs", "text/x-vcalendar"};
    public static final ekgp d = ekgp.l("application/txt", "text/plain");
    public static final ekgp e = ekgp.l("text/plain", "application/txt");
    public static final ekgb f = ekgb.v("text/plain", "text/html", "application/vnd.wap.xhtml+xml", RbmSuggestionResponse.CONTENT_TYPE, RbmSpecificMessage.CONTENT_TYPE);

    private le() {
    }

    public static boolean A(String str) {
        return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) || "application/vnd.ms-excel".equals(str);
    }

    public static String a(String str) {
        return !v(str) ? str : true != l(str) ? "text/plain" : "text/html";
    }

    public static String b(String str) {
        return !w(str) ? str : true != "text/html".equals(str) ? "application/txt" : "application/html";
    }

    public static String c(String str) {
        return (String) e.getOrDefault(str, str);
    }

    public static String d(String str) {
        String strE = e(str);
        if (strE == null) {
            return null;
        }
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(strE);
    }

    public static String e(String str) {
        ekgp ekgpVar = d;
        return ekgpVar.containsKey(str) ? (String) ekgpVar.get(str) : str;
    }

    public static boolean f(String str) {
        if (str != null) {
            return str.startsWith("audio/") || str.equalsIgnoreCase("application/ogg");
        }
        return false;
    }

    public static boolean g(String str) {
        String[] strArr = c;
        for (int i = 0; i < 6; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str) {
        return str.equals("application/msword") || str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    }

    public static boolean i(String str) {
        if (str != null) {
            return !(!p(str) || f(str) || m(str) || s(str) || z(str) || y(str)) || u(str);
        }
        return false;
    }

    public static boolean j(String str) {
        return TextUtils.equals(str, "image/gif");
    }

    public static boolean k(String str) {
        return Objects.equals(str, "image/heif") || Objects.equals(str, "image/heic");
    }

    public static boolean l(String str) {
        return str != null && str.equals("application/html");
    }

    public static boolean m(String str) {
        return n(str, true);
    }

    public static boolean n(String str, boolean z) {
        if (str == null || !str.startsWith("image/")) {
            return s(str) && z;
        }
        return true;
    }

    public static boolean o(String str) {
        return "image/jpeg".equals(str) || "image/jpg".equals(str);
    }

    public static boolean p(String str) {
        return (str == null || f.contains(str)) ? false : true;
    }

    public static boolean q(String str) {
        return str != null && str.equals("application/pdf");
    }

    public static boolean r(String str) {
        return "application/vnd.ms-powerpoint".equals(str) || "application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str);
    }

    public static boolean s(String str) {
        return str != null && TextUtils.equals(str, "application/vnd.gsma.rcspushlocation+xml");
    }

    public static boolean t(String str) {
        return m(str) || z(str) || f(str);
    }

    public static boolean u(String str) {
        if (str != null) {
            return q(str) || g(str) || v(str) || h(str) || r(str) || A(str);
        }
        return false;
    }

    public static boolean v(String str) {
        if (str != null) {
            return x(str) || l(str);
        }
        return false;
    }

    public static boolean w(String str) {
        return "text/plain".equals(str) || "text/html".equals(str) || "application/vnd.wap.xhtml+xml".equals(str);
    }

    public static boolean x(String str) {
        return str.equals("application/txt");
    }

    public static boolean y(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("text/x-vCard") || str.equalsIgnoreCase("text/vcard") || str.equalsIgnoreCase("text/x-vcard");
        }
        return false;
    }

    public static boolean z(String str) {
        return str != null && str.startsWith("video/");
    }
}
