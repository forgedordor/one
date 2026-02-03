package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abno {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/dittosatellite/intent/DraftMessageJsBridgeRequestSender");
    public static final cqce b = cqce.g("Bugle", "DraftMessageJsBridgeRequestSender");
    public final Context c;
    public final fcyh d;
    public final fdjx e;
    private final fcyh f;
    private final fcsu g;
    private final fcsu h;

    public abno(Context context, fcyh fcyhVar, fcyh fcyhVar2, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.d = fcyhVar;
        this.f = fcyhVar2;
        this.e = fdjxVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
    }

    public static final boolean c(Intent intent) {
        return intent != null && fdbq.f("ForwardDraftIntentToDittoAction", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Intent r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abno.a(android.content.Intent, fcxy):java.lang.Object");
    }

    public final void b(eppi eppiVar) {
        abod abodVarA = ((aboe) this.h.b()).a();
        abodVarA.d = true;
        abodVarA.d(abou.FOREGROUND, eppiVar);
    }
}
