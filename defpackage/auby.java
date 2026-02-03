package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ContentType;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auby {
    public static final aubx a(ContentType contentType) {
        aubv aubvVar = (aubv) aubx.a.createBuilder();
        aubvVar.getClass();
        String strC = contentType.c();
        strC.getClass();
        aubz.c(strC, aubvVar);
        String strB = contentType.b();
        strB.getClass();
        aubz.b(strB, aubvVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((aubx) aubvVar.instance).e)).getClass();
        ekgp ekgpVarA = contentType.a();
        ekgpVarA.getClass();
        aubvVar.a(ekgpVarA);
        return aubz.a(aubvVar);
    }

    public static final aubx b(String str) {
        return a(ContentType.e(str));
    }

    public static final aubx c(String str) {
        str.getClass();
        try {
            return a(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            aubv aubvVar = (aubv) aubx.a.createBuilder();
            aubvVar.getClass();
            aubz.c("application", aubvVar);
            aubz.b("octet-stream", aubvVar);
            return aubz.a(aubvVar);
        }
    }

    public static final ContentType d(aubx aubxVar) {
        aubxVar.getClass();
        efil efilVarD = ContentType.d();
        if ((aubxVar.b & 1) != 0) {
            efilVarD.f(aubxVar.c);
        }
        if ((aubxVar.b & 2) != 0) {
            efilVarD.e(aubxVar.d);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(aubxVar.e);
        mapUnmodifiableMap.getClass();
        if (!mapUnmodifiableMap.isEmpty()) {
            Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(aubxVar.e);
            mapUnmodifiableMap2.getClass();
            efilVarD.h(ekfv.e(mapUnmodifiableMap2));
        }
        return efilVarD.g();
    }

    public static final ContentType e(aubx aubxVar) {
        aubxVar.getClass();
        efil efilVarD = ContentType.d();
        int i = aubxVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            efilVarD.f("application");
            efilVarD.e("octet-stream");
        } else {
            efilVarD.f(aubxVar.c);
            efilVarD.e(aubxVar.d);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(aubxVar.e);
        mapUnmodifiableMap.getClass();
        if (!mapUnmodifiableMap.isEmpty()) {
            Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(aubxVar.e);
            mapUnmodifiableMap2.getClass();
            efilVarD.h(ekfv.e(mapUnmodifiableMap2));
        }
        return efilVarD.g();
    }

    public static final ContentType f(String str) {
        str.getClass();
        try {
            return ContentType.e(str);
        } catch (IllegalArgumentException unused) {
            ContentType contentType = ContentType.d;
            contentType.getClass();
            return contentType;
        }
    }

    public static final boolean g(aubx aubxVar, aubx aubxVar2) {
        aubxVar2.getClass();
        return fdbq.f(aubxVar.c, aubxVar2.c) && fdbq.f(aubxVar.d, aubxVar2.d);
    }

    public static final boolean h(aubx aubxVar, ContentType contentType) {
        AutoValue_ContentType autoValue_ContentType = (AutoValue_ContentType) contentType;
        return fdbq.f(aubxVar.c, autoValue_ContentType.a) && fdbq.f(aubxVar.d, autoValue_ContentType.b);
    }

    public static final boolean i(String str, ContentType contentType) {
        return h(a(contentType), ContentType.e(str));
    }

    public static /* synthetic */ String j(aubx aubxVar) {
        aubxVar.getClass();
        return aubxVar.c + "/" + aubxVar.d;
    }
}
