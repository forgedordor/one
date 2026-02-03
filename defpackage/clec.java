package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clec {
    private static final cqce a = cqce.g("BugleDataModel", "IncomingRcsChatSessionEventHandler");
    private final fcsu b;
    private final ayqn c;

    public clec(fcsu fcsuVar, ayqn ayqnVar) {
        this.b = fcsuVar;
        this.c = ayqnVar;
    }

    private static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    private static boolean c(int i) {
        return i == 10 || i == 11 || i == 12;
    }

    public final void a(basd basdVar, int i, boolean z) {
        fcsu fcsuVar = this.b;
        MessageCoreData messageCoreDataX = ((baxe) fcsuVar.b()).x(basdVar);
        if (messageCoreDataX == null) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Cannot revoke reports for deleted rcs");
            cqbdVarE.h(basdVar);
            cqbdVarE.r();
            return;
        }
        int i2 = 1;
        ejwl.a(b(i) || c(i));
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("RCS Report failed to send");
        cqbdVarC.h(messageCoreDataX.F());
        cqbdVarC.y("reportType", i);
        cqbdVarC.B("isPermanentFailure", z);
        cqbdVarC.r();
        boolean zB = b(i);
        bvdx bvdxVarL = zB ? messageCoreDataX.L() : messageCoreDataX.N();
        if (!bvdxVarL.equals(bvdx.UNKNOWN)) {
            if (!bvdxVarL.equals(bvdx.SENT)) {
                cqbd cqbdVarE2 = cqceVar.e();
                cqbdVarE2.I("Status should be SENT or UNKNOWN");
                cqbdVarE2.A("status", bvdxVarL);
                cqbdVarE2.r();
                return;
            }
            if (z) {
                return;
            }
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("handleFailedReportWithNewReportStatus");
            if (zB) {
                brduVar.x(bvdx.NOT_SENT);
            } else {
                brduVar.y(bvdx.NOT_SENT);
            }
            ((baxe) fcsuVar.b()).R(messageCoreDataX.A(), messageCoreDataX.C(), brduVar);
            ((SendReportAction) this.c.b()).l(false, false);
            return;
        }
        int iH = messageCoreDataX.h();
        if (z) {
            cqbd cqbdVarE3 = cqceVar.e();
            cqbdVarE3.I("Permanently failed to send a report for rcs ");
            cqbdVarE3.h(basdVar);
            cqbdVarE3.y("reportType", i);
            cqbdVarE3.y("status", messageCoreDataX.h());
            cqbdVarE3.r();
            i2 = 3;
        } else {
            if (!b(i)) {
                i2 = iH;
            } else if (iH == 1) {
            }
            if (!c(i) || i2 != 3) {
                cqbd cqbdVarE4 = cqceVar.e();
                cqbdVarE4.I("Cannot revoke reports for rcs");
                cqbdVarE4.h(basdVar);
                cqbdVarE4.y("reportType", i);
                cqbdVarE4.y("status", messageCoreDataX.h());
                cqbdVarE4.r();
                return;
            }
            i2 = 2;
        }
        String[] strArr2 = MessagesTable.a;
        brdu brduVar2 = new brdu();
        brduVar2.ap("handleFailedReport");
        brduVar2.s(i2);
        ((baxe) fcsuVar.b()).R(messageCoreDataX.A(), messageCoreDataX.C(), brduVar2);
        ((SendReportAction) this.c.b()).l(false, false);
    }
}
