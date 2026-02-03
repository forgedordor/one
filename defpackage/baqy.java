package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqy {
    private final fcsu a;

    public baqy(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final baqv a(long j, bvdk bvdkVar, ParticipantsTable.BindData bindData, long j2) {
        baqv baqvVarAs;
        eieu eieuVarK = eiiy.k("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromParticipant");
        try {
            cqaz.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(bindData);
            if (((Boolean) avos.a.e()).booleanValue()) {
                bakt baktVar = (bakt) this.a.b();
                baqz baqzVarZ = bara.z();
                baqzVarZ.p(arrayList);
                baqzVarZ.f(bvdkVar);
                baqzVarZ.n(true);
                baqzVarZ.m(0);
                baqzVarZ.s(j2);
                baqzVarZ.o(true);
                baqzVarZ.l(false);
                baqzVarZ.x(new cnqj(j));
                baqzVarZ.k(false);
                baqvVarAs = baktVar.j(baqzVarZ.y());
            } else {
                baqvVarAs = ((bakt) this.a.b()).as(cmol.a, j, bvdkVar, arrayList, j2);
            }
            eieuVarK.close();
            return baqvVarAs;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final baqv b(cmtz cmtzVar, bvdk bvdkVar, int i) {
        return c(cmol.a, cmtzVar, bvdkVar, i);
    }

    public final baqv c(cmmp cmmpVar, cmtz cmtzVar, bvdk bvdkVar, int i) {
        eieu eieuVarK = eiiy.k("GetOrCreateConversationDatabaseOperations#getOrCreateConversationFromThreadData");
        try {
            cqaz.h();
            fcsu fcsuVar = this.a;
            ArrayList arrayListJ = ((bakt) fcsuVar.b()).J(cmtzVar, i);
            baqv baqvVarAs = ((bakt) fcsuVar.b()).as(cmmpVar, cmtzVar.a, bvdkVar, arrayListJ, -1L);
            eieuVarK.close();
            return baqvVarAs;
        } finally {
        }
    }

    public final ConversationIdType d(long j, bvdk bvdkVar, ParticipantsTable.BindData bindData) {
        return a(j, bvdkVar, bindData, -1L).a();
    }
}
