package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egbo implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof egbp) {
                egbp egbpVar = (egbp) cause;
                ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) egbq.b.i()).g(th)).h("com/google/apps/tiktok/account/data/AccountDataServiceImpl$1", "onFailure", 112, "AccountDataServiceImpl.java");
                boolean z = egbpVar.a;
                esvg esvgVar = esvg.NO_USER_DATA;
                ekrdVar.L("Cannot get fresh accounts after retries. hasLastSyncTimestampMs: %s, lastSyncTimestampMs: %s, hasLastInvalidateTimestampMs: %s, lastInvalidateTimestampMs: %s, requestTimeMs: %s, maxAgeMs: %s", new esvh(esvgVar, Boolean.valueOf(z)), new esvh(esvgVar, Long.valueOf(egbpVar.b)), new esvh(esvgVar, Boolean.valueOf(egbpVar.c)), new esvh(esvgVar, Long.valueOf(egbpVar.d)), new esvh(esvgVar, Long.valueOf(egbpVar.e)), new esvh(esvgVar, Long.valueOf(egbpVar.f)));
                return;
            }
        }
    }
}
