package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsb {
    public static exew a(exow exowVar) {
        exev exevVar = (exev) exew.a.createBuilder();
        int i = exowVar.b;
        exevVar.copyOnWrite();
        ((exew) exevVar.instance).b = i;
        int i2 = exowVar.c;
        exevVar.copyOnWrite();
        ((exew) exevVar.instance).c = i2;
        String str = exowVar.d;
        exevVar.copyOnWrite();
        exew exewVar = (exew) exevVar.instance;
        str.getClass();
        exewVar.d = str;
        return (exew) exevVar.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:208:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.exne r20, defpackage.exng r21, defpackage.ecsc r22, android.content.Context r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecsb.b(exne, exng, ecsc, android.content.Context, java.lang.String):void");
    }

    public static void c(ecsc ecscVar, Context context, String str) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            ecsa ecsaVarA = ecsa.a();
            exhv exhvVar = (exhv) exhx.a.createBuilder();
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).b = 0;
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).c = exhw.a(6);
            ecsaVarA.d((exhx) exhvVar.build(), ecscVar.b(), ecscVar.a(), context, str);
        }
    }

    public static void d(ecsc ecscVar, Context context, String str) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            ecsa ecsaVarA = ecsa.a();
            exhv exhvVar = (exhv) exhx.a.createBuilder();
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).b = 0;
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).c = exhw.a(8);
            ecsaVarA.d((exhx) exhvVar.build(), ecscVar.b(), ecscVar.a(), context, str);
        }
    }

    public static void e(ecsc ecscVar, Context context, String str) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            ecsa ecsaVarA = ecsa.a();
            exhv exhvVar = (exhv) exhx.a.createBuilder();
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).b = 0;
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).c = exhw.a(7);
            ecsaVarA.d((exhx) exhvVar.build(), ecscVar.b(), ecscVar.a(), context, str);
        }
    }

    private static exdu f(exnl exnlVar) {
        exdt exdtVar = (exdt) exdu.a.createBuilder();
        for (exnj exnjVar : exnlVar.b) {
            exdr exdrVar = (exdr) exds.a.createBuilder();
            int i = exnjVar.c;
            exdrVar.copyOnWrite();
            ((exds) exdrVar.instance).b = i;
            int i2 = exnjVar.d;
            exdrVar.copyOnWrite();
            ((exds) exdrVar.instance).c = i2;
            String str = exnjVar.e;
            exdrVar.copyOnWrite();
            exds exdsVar = (exds) exdrVar.instance;
            str.getClass();
            exdsVar.d = str;
            boolean z = exnjVar.f;
            exdrVar.copyOnWrite();
            ((exds) exdrVar.instance).e = z;
            exdtVar.copyOnWrite();
            exdu exduVar = (exdu) exdtVar.instance;
            exds exdsVar2 = (exds) exdrVar.build();
            exdsVar2.getClass();
            evtg evtgVar = exduVar.b;
            if (!evtgVar.c()) {
                exduVar.b = evsn.mutableCopy(evtgVar);
            }
            exduVar.b.add(exdsVar2);
        }
        return (exdu) exdtVar.build();
    }
}
