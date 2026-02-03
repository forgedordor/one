package defpackage;

import android.content.Context;
import android.telecom.TelecomManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszm {
    private final Context a;
    private final ejya b;
    private final crma c;
    private final cszj d;
    private final TelecomManager e;

    public cszm(Context context, ejya ejyaVar, crma crmaVar, cszj cszjVar) {
        context.getClass();
        crmaVar.getClass();
        this.a = context;
        this.b = ejyaVar;
        this.c = crmaVar;
        this.d = cszjVar;
        this.e = (TelecomManager) context.getSystemService(TelecomManager.class);
    }

    private static final long b(ejxm ejxmVar) {
        long seconds = ejxmVar.d().toSeconds();
        return seconds - (seconds % 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cszm.a(fcxy):java.lang.Object");
    }
}
