package defpackage;

import android.content.Context;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsa {
    private static ecsa b;
    public ecqn a;
    private final String c;

    private ecsa() {
        long jNextLong = new SecureRandom().nextLong();
        this.c = System.currentTimeMillis() + "_" + (jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong));
    }

    public static ecsa a() {
        if (b == null) {
            b = new ecsa();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.exhy r9, defpackage.evvp r10, defpackage.evrj r11, android.content.Context r12, java.lang.String r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecsa.e(exhy, evvp, evrj, android.content.Context, java.lang.String):void");
    }

    public final void b(exfi exfiVar, evvp evvpVar, evrj evrjVar, Context context, String str) {
        exhy exhyVar = (exhy) exhz.a.createBuilder();
        exhyVar.copyOnWrite();
        exhz exhzVar = (exhz) exhyVar.instance;
        exfiVar.getClass();
        exhzVar.e = exfiVar;
        exhzVar.b |= 2;
        e(exhyVar, evvpVar, evrjVar, context, str);
    }

    public final void c(exfy exfyVar, evvp evvpVar, evrj evrjVar, Context context, String str) {
        exhy exhyVar = (exhy) exhz.a.createBuilder();
        exhyVar.copyOnWrite();
        exhz exhzVar = (exhz) exhyVar.instance;
        exfyVar.getClass();
        exhzVar.g = exfyVar;
        exhzVar.b |= 8;
        e(exhyVar, evvpVar, evrjVar, context, str);
    }

    public final void d(exhx exhxVar, evvp evvpVar, evrj evrjVar, Context context, String str) {
        exhy exhyVar = (exhy) exhz.a.createBuilder();
        exhyVar.copyOnWrite();
        exhz exhzVar = (exhz) exhyVar.instance;
        exhxVar.getClass();
        exhzVar.f = exhxVar;
        exhzVar.b |= 4;
        e(exhyVar, evvpVar, evrjVar, context, str);
    }
}
