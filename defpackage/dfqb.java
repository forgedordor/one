package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfqb {
    static final dfny a = dfod.a(182478066);
    public static final ContentType b;
    public static final String c;
    public static final ContentType d;
    public static final String e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f("application");
        efilVarD.e("vnd.google.rcs.encrypted");
        ContentType contentTypeG = efilVarD.g();
        b = contentTypeG;
        c = contentTypeG.toString();
        efil efilVarD2 = ContentType.d();
        efilVarD2.f("application");
        efilVarD2.e("vnd.google.rcs.ftd");
        ContentType contentTypeG2 = efilVarD2.g();
        d = contentTypeG2;
        e = contentTypeG2.toString();
        efil efilVarD3 = ContentType.d();
        efilVarD3.f("application");
        efilVarD3.e("vnd.google.rcs.success");
        f = efilVarD3.g();
        efil efilVarD4 = ContentType.d();
        efilVarD4.f("video");
        efilVarD4.e("aliasing");
        g = efilVarD4.g();
        efil efilVarD5 = ContentType.d();
        efilVarD5.f("video");
        efilVarD5.e("key-frame-request");
        h = efilVarD5.g();
        efil efilVarD6 = ContentType.d();
        efilVarD6.f("video");
        efilVarD6.e("ok");
        i = efilVarD6.g();
    }

    public static boolean a(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? b.g(contentType) || g.g(contentType) : b(contentType.f());
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return c.equals(str) || "video/aliasing".equals(str);
        }
        try {
            return a(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dhja.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }

    public static boolean c(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? d.g(contentType) || h.g(contentType) : d(contentType.f());
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return e.equals(str) || "video/key-frame-request".equals(str);
        }
        try {
            return c(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dhja.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }

    public static boolean e(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? f.g(contentType) || i.g(contentType) : f(contentType.f());
    }

    public static boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return "video/ok".equals(str) || "application/vnd.google.rcs.success".equals(str);
        }
        try {
            return e(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dhja.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }
}
