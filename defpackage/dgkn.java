package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgkn {
    private static final eksp e = eksp.c(dhin.a);
    public final ExecutorService a;
    public final deyo b;
    public final dgnl c;
    public final crny d;
    private final dgix f;
    private final dheq g;
    private final dgkj h;
    private final fcsu i;
    private final fcsu j;

    public dgkn(deyo deyoVar, dgnl dgnlVar, dgix dgixVar, dheq dheqVar, dgkj dgkjVar, crny crnyVar, ExecutorService executorService, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = deyoVar;
        this.c = dgnlVar;
        this.f = dgixVar;
        this.g = dheqVar;
        this.h = dgkjVar;
        this.d = crnyVar;
        this.i = fcsuVar;
        this.a = executorService;
        this.j = fcsuVar2;
    }

    private static void e(HttpURLConnection httpURLConnection, dgng dgngVar, dgib dgibVar, int i) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        dgngVar.ao(dgibVar, i);
    }

    private final void f(Context context, ckja ckjaVar, int i, String str, String str2, dggn dggnVar) {
        int i2;
        String str3;
        String str4;
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_UNKNOWN_STATE;
        String str5 = (String) Optional.ofNullable(str2).map(new Function() { // from class: ckis
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown");
        ckim ckimVar = new ckim();
        ckimVar.b(ewrpVar);
        ckimVar.f = 2;
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        ckimVar.b = str;
        ckimVar.a(str5);
        if (ckimVar.d == null) {
            ckimVar.d = (ewla) ewlc.a.createBuilder();
        }
        ewla ewlaVar = ckimVar.d;
        ewlaVar.copyOnWrite();
        ewlc ewlcVar = (ewlc) ewlaVar.instance;
        ewlc ewlcVar2 = ewlc.a;
        ewlcVar.c = i - 1;
        ewlcVar.b |= 1;
        ckimVar.b(ckjaVar.b());
        ckimVar.a(ckjaVar.f());
        deyo deyoVar = this.b;
        ewla ewlaVar2 = ckimVar.d;
        if (ewlaVar2 != null) {
            ckimVar.e = (ewlc) ewlaVar2.build();
        } else if (ckimVar.e == null) {
            ckimVar.e = (ewlc) ((ewla) ewlc.a.createBuilder()).build();
        }
        ewrp ewrpVar2 = ckimVar.a;
        if (ewrpVar2 != null && (i2 = ckimVar.f) != 0 && (str3 = ckimVar.b) != null && (str4 = ckimVar.c) != null) {
            deyoVar.j(context, new ckin(ewrpVar2, i2, str3, str4, ckimVar.e), dggnVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ckimVar.a == null) {
            sb.append(" requestState");
        }
        if (ckimVar.f == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (ckimVar.b == null) {
            sb.append(" requestId");
        }
        if (ckimVar.c == null) {
            sb.append(" provisioningSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a(HttpURLConnection httpURLConnection, InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                dhja.s(e2, "Unable to close response body input stream in state %s", str);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    final void b(String str) {
        dgsz dgszVar = (dgsz) this.i.b();
        int i = ekgb.d;
        dgszVar.s(str, ekoe.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6 A[Catch: dhhd -> 0x0252, dgqu -> 0x0254, IOException -> 0x0256, SocketTimeoutException -> 0x0258, all -> 0x025a, TryCatch #13 {SocketTimeoutException -> 0x0258, IOException -> 0x0256, blocks: (B:5:0x0015, B:7:0x003a, B:8:0x0041, B:10:0x004b, B:11:0x0052, B:50:0x016a, B:52:0x01f6, B:54:0x01fc, B:56:0x020a, B:58:0x0217, B:61:0x0235, B:63:0x023a, B:72:0x024a, B:71:0x0247, B:57:0x0211, B:74:0x024c, B:16:0x0066, B:18:0x0072, B:20:0x007c, B:49:0x0156), top: B:106:0x0015, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024c A[Catch: dhhd -> 0x0252, dgqu -> 0x0254, IOException -> 0x0256, SocketTimeoutException -> 0x0258, all -> 0x025a, PHI: r4
      0x024c: PHI (r4v19 int) = (r4v18 int), (r4v21 int) binds: [B:51:0x01f4, B:73:0x024b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #13 {SocketTimeoutException -> 0x0258, IOException -> 0x0256, blocks: (B:5:0x0015, B:7:0x003a, B:8:0x0041, B:10:0x004b, B:11:0x0052, B:50:0x016a, B:52:0x01f6, B:54:0x01fc, B:56:0x020a, B:58:0x0217, B:61:0x0235, B:63:0x023a, B:72:0x024a, B:71:0x0247, B:57:0x0211, B:74:0x024c, B:16:0x0066, B:18:0x0072, B:20:0x007c, B:49:0x0156), top: B:106:0x0015, outer: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final j$.util.Optional c(android.content.Context r21, defpackage.dgng r22, android.net.Network r23, java.lang.String r24, int r25, defpackage.ckja r26, defpackage.dggn r27) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgkn.c(android.content.Context, dgng, android.net.Network, java.lang.String, int, ckja, dggn):j$.util.Optional");
    }

    final void d(String str, HttpURLConnection httpURLConnection) {
        cqaz.l(httpURLConnection);
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        ArrayList<String> arrayList2 = new ArrayList();
        if (headerFields != null) {
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null && ("Set-Cookie".equals(key) || "Set-Cookie2".equals(key))) {
                    arrayList2.addAll(value);
                }
            }
        }
        ArrayList<HttpCookie> arrayList3 = new ArrayList();
        for (String str2 : arrayList2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    arrayList3.addAll(HttpCookie.parse(str2));
                } catch (IllegalArgumentException unused) {
                    dhja.q("Error parsing a cookie header '%s'", str2);
                }
            }
        }
        for (HttpCookie httpCookie : arrayList3) {
            dhja.o("Found [%s] cookie [%s]", httpCookie.getName(), dhiz.GENERIC.c(httpCookie.getValue()));
            if (httpCookie.getDiscard() || httpCookie.hasExpired()) {
                dhja.o("Ignore discarded, expired or empty name cookie", new Object[0]);
            } else {
                arrayList.add(new dgif(httpCookie));
            }
        }
        if (arrayList.isEmpty()) {
            dhja.q("Couldn't find cookies", new Object[0]);
        }
        ((dgsz) this.i.b()).s(str, arrayList);
    }
}
