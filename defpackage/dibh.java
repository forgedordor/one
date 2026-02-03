package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibh extends diaj {
    public dibh() {
        super(dbjt.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        ejwi ejwiVarJ;
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 5) {
            throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbkn dbknVar = dbkwVar.b == 5 ? (dbkn) dbkwVar.c : dbkn.a;
        if (dbknVar.b == 1 && ((Boolean) dbknVar.c).booleanValue()) {
            diao diaoVar = new diao(diapVar);
            diaoVar.c();
            return diaoVar.a();
        }
        dbkw dbkwVar2 = (dbkw) ejwiVar.c();
        dbkn dbknVar2 = dbkwVar2.b == 5 ? (dbkn) dbkwVar2.c : dbkn.a;
        String str = dbknVar2.b == 2 ? (String) dbknVar2.c : "";
        ActivityManager activityManager = (ActivityManager) diapVar.b.getSystemService("activity");
        if (activityManager == null) {
            throw new IllegalStateException("ActivityManager is null!");
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                ejwiVarJ = ejud.a;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(str)) {
                ejwiVarJ = ejwi.j(Integer.valueOf(next.pid));
                break;
            }
        }
        if (!ejwiVarJ.g()) {
            Log.d("ProcessRestartFix", String.format("Process '%s' is not currently running.", str));
            return diapVar;
        }
        Integer num = (Integer) ejwiVarJ.c();
        int iIntValue = num.intValue();
        Log.i("ProcessRestartFix", String.format("Killing '%s' pid=%d", str, num));
        if (iIntValue == Process.myPid()) {
            diao diaoVar2 = new diao(diapVar);
            diaoVar2.h = true;
            return diaoVar2.a();
        }
        Process.killProcess(iIntValue);
        diao diaoVar3 = new diao(diapVar);
        diaoVar3.h = false;
        return diaoVar3.a();
    }

    @Override // defpackage.diaj
    public final String b() {
        return "ProcessRestartFix";
    }
}
