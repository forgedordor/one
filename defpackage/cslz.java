package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.Telephony;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cslz implements cslj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl");
    public final Context b;
    public final fcsu c;
    private final fdjx d;
    private final fcyh e;
    private final aqzb f;
    private final fcsu g;
    private final fcsu h;
    private final String i;

    public cslz(Context context, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, aqzb aqzbVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        aqzbVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = context;
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.c = fcsuVar;
        this.f = aqzbVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = "com.android.providers.telephony";
    }

    private final boolean l(dhyt dhytVar) {
        return dhytVar != null && dhytVar.a.a == 3;
    }

    @Override // defpackage.cslj
    public final Object a(Uri uri, fcxy fcxyVar) {
        return eicj.a(this.e, new csll(this, uri, null), fcxyVar);
    }

    @Override // defpackage.cslj
    public final Object b(Uri uri, fcxy fcxyVar) {
        return eicj.a(this.e, new cslq(this, uri, null), fcxyVar);
    }

    @Override // defpackage.cslj
    public final Object c(fcxy fcxyVar) {
        return eicj.a(this.e, new cslv(this, null), fcxyVar);
    }

    public final ParcelFileDescriptor d(Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor;
        eieu eieuVarH = eiiy.h("HaasProxyImpl.openImageFileDescriptor");
        try {
            Context context = this.b;
            if (bxlf.j(uri, context)) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleSpam");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl", "openImageFileDescriptor", 311, "HaasProxyImpl.kt")).q("Opening file from scratch space");
                parcelFileDescriptor = ParcelFileDescriptor.open(bxlf.h(uri, context), VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                parcelFileDescriptor.getClass();
            } else {
                parcelFileDescriptor = ebsv.a(context, uri, "r", e(uri)).getParcelFileDescriptor();
                parcelFileDescriptor.getClass();
            }
            fczl.a(eieuVarH, null);
            return parcelFileDescriptor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    public final ebsu e(Uri uri) {
        String string = uri.toString();
        string.getClass();
        String string2 = Telephony.Mms.CONTENT_URI.toString();
        string2.getClass();
        boolean zT = fdgn.t(string, string2);
        if (!this.f.a()) {
            return ebsu.a(zT ? this.i : "com.google.android.apps.messaging");
        }
        if (zT) {
            return ebsu.a(this.i);
        }
        if (fdbq.f(uri.getScheme(), "content")) {
            return ebsu.a("com.google.android.apps.messaging");
        }
        if (!fdbq.f(uri.getScheme(), "file")) {
            Objects.toString(uri);
            throw new UnsupportedOperationException("Unsupported URI format: ".concat(String.valueOf(uri)));
        }
        ebsu ebsuVar = ebsu.c;
        ebsuVar.getClass();
        return ebsuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0111, code lost:
    
        if (r13 != r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:14:0x002f, B:51:0x0113, B:54:0x011c, B:47:0x00fd, B:49:0x0105), top: B:66:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.net.Uri r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslz.f(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslz.g(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cslr
            if (r0 == 0) goto L13
            r0 = r6
            cslr r0 = (defpackage.cslr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cslr r0 = new cslr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            cslz r5 = r0.d
            eieu r0 = r0.e
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r5 = move-exception
            goto L69
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            fcyh r6 = r0.u()
            boolean r6 = defpackage.eicg.b(r6)
            if (r6 == 0) goto L6f
            java.lang.String r6 = "HaasProxyImpl.classifyVideoCore"
            eieu r6 = defpackage.eiiy.h(r6)
            r0.e = r6     // Catch: java.lang.Throwable -> L67
            r0.d = r4     // Catch: java.lang.Throwable -> L67
            r0.c = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r4.i(r5, r0)     // Catch: java.lang.Throwable -> L67
            if (r5 == r1) goto L66
            r0 = r6
            r6 = r5
            r5 = r4
        L57:
            dhyt r6 = (defpackage.dhyt) r6     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5.l(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            defpackage.fczl.a(r0, r6)
            return r5
        L66:
            return r1
        L67:
            r5 = move-exception
            r0 = r6
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = move-exception
            defpackage.fczl.a(r0, r5)
            throw r6
        L6f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslz.h(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:34:0x00c2, B:36:0x00db, B:37:0x00e8, B:40:0x00fe, B:41:0x011b), top: B:55:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.net.Uri r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslz.i(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.net.Uri r13, java.lang.String r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslz.j(android.net.Uri, java.lang.String, fcxy):java.lang.Object");
    }

    public final int k(Throwable th) {
        if (!(th instanceof dcff)) {
            return th instanceof CancellationException ? 6 : 2;
        }
        if (((dcff) th).a.g != Status.f.g) {
            return 3;
        }
        try {
            return this.b.getPackageManager().getPackageInfo("com.google.android.safetycore", 0) == null ? 5 : 4;
        } catch (Throwable unused) {
            return 5;
        }
    }
}
