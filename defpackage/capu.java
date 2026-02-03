package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capu implements caap {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler");
    private final byeq b;

    public capu(byeq byeqVar) {
        byeqVar.getClass();
        this.b = byeqVar;
    }

    @Override // defpackage.caap
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, cayy cayyVar, caas caasVar, Exception exc, fcxy fcxyVar) throws Throwable {
        capv capvVar = (capv) obj;
        capz capzVar = (capz) obj2;
        if ((exc instanceof CancellationException) || cayyVar.b()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler", "handlePermanentFailure", 54, "CmsSimFallbackErrorHandler.kt")).t("Phone Fallback Message Sending was cancelled for CmdId: %s", capzVar.c);
            return fctx.a;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarJ).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/CmsSimFallbackErrorHandler", "handlePermanentFailure", 61, "CmsSimFallbackErrorHandler.kt")).D("Could not send message via Phone Fallback. CmsId: %s, Processor: %s", capzVar.c, caasVar.getClass().getName());
        String str = capzVar.c;
        str.getClass();
        Object objB = b(capvVar, str, fcxyVar);
        return objB != fcyl.a ? fctx.a : objB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (defpackage.fdxs.c(r11, r0) != r2) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #4 {all -> 0x005b, blocks: (B:14:0x0030, B:19:0x0045, B:36:0x009a, B:22:0x0053, B:47:0x00c7, B:49:0x00d1, B:52:0x00f5), top: B:64:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x005b, blocks: (B:14:0x0030, B:19:0x0045, B:36:0x009a, B:22:0x0053, B:47:0x00c7, B:49:0x00d1, B:52:0x00f5), top: B:64:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0, types: [capv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.capv r10, final java.lang.String r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.capu.b(capv, java.lang.String, fcxy):java.lang.Object");
    }
}
