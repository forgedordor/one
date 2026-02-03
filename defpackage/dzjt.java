package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjt {
    public final dziy a;
    private final Context b;

    public dzjt(dziy dziyVar, Context context) {
        this.a = dziyVar;
        this.b = context;
    }

    public static final fegz b(String str, boolean z, dzju dzjuVar) {
        ejwi ejwiVarB;
        fegy fegyVar = (fegy) fegz.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        fegyVar.copyOnWrite();
        fegz fegzVar = (fegz) fegyVar.instance;
        fegzVar.b |= 1;
        fegzVar.c = elapsedCpuTime;
        fegyVar.copyOnWrite();
        fegz fegzVar2 = (fegz) fegyVar.instance;
        fegzVar2.b |= 2;
        fegzVar2.d = z;
        int iActiveCount = Thread.activeCount();
        fegyVar.copyOnWrite();
        fegz fegzVar3 = (fegz) fegyVar.instance;
        fegzVar3.b |= 4;
        fegzVar3.e = iActiveCount;
        if (str != null) {
            fegyVar.copyOnWrite();
            fegz fegzVar4 = (fegz) fegyVar.instance;
            fegzVar4.b |= 8;
            fegzVar4.f = str;
        }
        final int iMyPid = Process.myPid();
        String str2 = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(iMyPid));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "r");
                try {
                    ejwiVarB = ejwi.i(randomAccessFile.readLine()).b(new ejvr() { // from class: dzrh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return Integer.valueOf(Integer.parseInt((String) obj));
                        }
                    });
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                ejwiVarB = ejud.a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (ejwiVarB.g()) {
                int iIntValue = ((Integer) ejwiVarB.c()).intValue();
                fegyVar.copyOnWrite();
                fegz fegzVar5 = (fegz) fegyVar.instance;
                fegzVar5.b |= 16;
                fegzVar5.g = iIntValue;
            }
            ejwi ejwiVar = !dzjuVar.b() ? ejud.a : (ejwi) ekis.c(dzjuVar.c(), new ejwm() { // from class: dzjp
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return ((ActivityManager.RunningAppProcessInfo) obj).pid == iMyPid;
                }
            }).b(new ejvr() { // from class: dzjq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ejwi.i(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
                }
            }).e(ejud.a);
            if (ejwiVar.g()) {
                String strFlattenToString = ((ComponentName) ejwiVar.c()).flattenToString();
                fegyVar.copyOnWrite();
                fegz fegzVar6 = (fegz) fegyVar.instance;
                strFlattenToString.getClass();
                fegzVar6.b |= 32;
                fegzVar6.h = strFlattenToString;
            }
            return (fegz) fegyVar.build();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    public final fegz a() {
        final dzju dzjuVarA = dzjr.a(this.b, "getAndroidProcessStats");
        return b(null, this.a.a(new ejxr() { // from class: dzjs
            @Override // defpackage.ejxr
            public final Object get() {
                return dzjuVarA;
            }
        }), dzjuVarA);
    }
}
