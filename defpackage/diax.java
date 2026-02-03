package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diax implements diag {
    @Override // defpackage.diag
    public final void a(dbjs dbjsVar) {
        int iB = dbjr.b(dbjsVar.f);
        if ((iB != 0 && iB == 6 && Log.isLoggable("AppDoctorLogger", 6)) || Log.isLoggable("AppDoctorLogger", 4)) {
            StringBuilder sb = new StringBuilder("AppDoctorEvent<");
            if ((dbjsVar.b & 1) != 0) {
                sb.append("package_name='");
                sb.append(dbjsVar.c);
                sb.append("' ");
            }
            if ((dbjsVar.b & 2) != 0) {
                sb.append("process_name='");
                sb.append(dbjsVar.d);
                sb.append("' ");
            }
            sb.append("fix='");
            dbjt dbjtVarB = dbjt.b(dbjsVar.e);
            if (dbjtVarB == null) {
                dbjtVarB = dbjt.UNRECOGNIZED;
            }
            sb.append(dbjtVarB.a());
            sb.append("' status='");
            int iB2 = dbjr.b(dbjsVar.f);
            if (iB2 == 0) {
                iB2 = 1;
            }
            int i = iB2 - 2;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(dbjr.a(iB2)) : "IN_PROGRESS" : "FAILED" : "SKIPPED" : "COMPLETED" : "PROPOSED" : "UNSPECIFIED");
            sb.append("' entryPoint='");
            int i2 = dbjsVar.g;
            dbjq dbjqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : dbjq.TELEDOCTOR : dbjq.STARTUP : dbjq.UNKNOWN;
            if (dbjqVar == null) {
                dbjqVar = dbjq.UNRECOGNIZED;
            }
            sb.append(dbjqVar.a());
            sb.append("'>");
            int iB3 = dbjr.b(dbjsVar.f);
            if (iB3 != 0 && iB3 == 6) {
                Log.e("AppDoctorLogger", sb.toString());
            } else {
                Log.i("AppDoctorLogger", sb.toString());
            }
        }
    }
}
