package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrj implements dxqt {
    public static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxmz c;

    public dxrj(Context context, dxmz dxmzVar, dxqs dxqsVar) {
        context.getClass();
        dxmzVar.getClass();
        dxqsVar.getClass();
        this.b = context;
        this.c = dxmzVar;
    }

    @Override // defpackage.dxqt
    public final evej a(dxhe dxheVar) throws NumberFormatException {
        String strP;
        evei eveiVar = (evei) evej.a.createBuilder();
        eveiVar.getClass();
        Context context = this.b;
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        eveiVar.copyOnWrite();
        evej evejVar = (evej) eveiVar.instance;
        evejVar.b |= 1;
        evejVar.e = packageName;
        evef evefVar = (evef) eveg.a.createBuilder();
        evefVar.getClass();
        eveh.d(evefVar);
        if (dxheVar != null && (strP = dxheVar.p()) != null) {
            eveh.c(strP, evefVar);
        }
        evcw evcwVar = (evcw) evcx.a.createBuilder();
        evcwVar.getClass();
        evdh evdhVar = (evdh) evdi.a.createBuilder();
        evdhVar.getClass();
        String packageName2 = context.getApplicationContext().getPackageName();
        packageName2.getClass();
        evdhVar.copyOnWrite();
        evdi evdiVar = (evdi) evdhVar.instance;
        evdiVar.b |= 8;
        evdiVar.f = packageName2;
        Object systemService = context.getSystemService("user");
        systemService.getClass();
        long serialNumberForUser = ((UserManager) systemService).getSerialNumberForUser(Process.myUserHandle());
        Long l = null;
        Long lValueOf = serialNumberForUser == -1 ? null : Long.valueOf(serialNumberForUser);
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            evdhVar.copyOnWrite();
            evdi evdiVar2 = (evdi) evdhVar.instance;
            evdiVar2.b |= 16;
            evdiVar2.g = jLongValue;
        }
        if (fbdm.a.get().b() || dxheVar == null) {
            String strB = this.c.b();
            if (strB != null && strB.length() != 0) {
                evdhVar.copyOnWrite();
                evdi evdiVar3 = (evdi) evdhVar.instance;
                evdiVar3.b |= 1;
                evdiVar3.c = strB;
            }
            try {
                long jB = devd.b(context.getContentResolver(), "android_id", -1L);
                Long lValueOf2 = jB == -1 ? null : Long.valueOf(jB);
                if (lValueOf2 == null) {
                    ((eksl) a.j()).q("Failed to get android ID.");
                }
                l = lValueOf2;
            } catch (SecurityException e) {
                ((eksl) ((eksl) a.i()).g(e)).q("Exception reading GServices key - ANDROID_ID.");
            }
            if (l != null) {
                long jLongValue2 = l.longValue();
                evdhVar.copyOnWrite();
                evdi evdiVar4 = (evdi) evdhVar.instance;
                evdiVar4.b |= 4;
                evdiVar4.e = jLongValue2;
            }
        }
        evsn evsnVarBuild = evdhVar.build();
        evsnVarBuild.getClass();
        evcy.b((evdi) evsnVarBuild, evcwVar);
        eveh.b(evcy.a(evcwVar), evefVar);
        eveg evegVarA = eveh.a(evefVar);
        eveiVar.copyOnWrite();
        evej evejVar2 = (evej) eveiVar.instance;
        evejVar2.d = evegVarA;
        evejVar2.c = 1;
        evsn evsnVarBuild2 = eveiVar.build();
        evsnVarBuild2.getClass();
        return (evej) evsnVarBuild2;
    }
}
