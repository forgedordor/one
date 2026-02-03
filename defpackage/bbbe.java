package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbbe {
    public static brvp a(String str) {
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        brvqVar.v(null);
        brvqVar.T(-2);
        brvqVar.S(-1);
        brvqVar.R(str);
        brvqVar.I(str);
        brvqVar.q(str);
        brvqVar.u(str);
        brvqVar.t(null);
        brvqVar.N(null);
        brvqVar.l(-1L);
        brvqVar.D(null);
        brvqVar.e(false);
        brvqVar.U(0);
        brvqVar.V(null);
        return brvqVar;
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (d(bindData) && !bbdl.k(bindData)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(ParticipantsTable.BindData bindData) {
        String strV = bindData.V();
        cqce cqceVar = cmvy.a;
        return alwh.i(strV);
    }

    public static boolean d(ParticipantsTable.BindData bindData) {
        return bindData.p() == 1;
    }
}
