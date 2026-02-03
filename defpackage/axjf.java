package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjf {
    public final Context a;
    private final fcsu b;
    private final fcsu c;

    public axjf(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final Uri a(ParticipantsTable.BindData bindData) {
        fcsu fcsuVar = this.c;
        Uri uriX = bindData.x();
        String strQ = bindData.Q();
        alqm alqmVarQ = ((alrj) fcsuVar.b()).q(bindData);
        boolean zD = bbbe.d(bindData);
        boolean zAa = bindData.aa();
        boolean zX = bindData.X();
        ParticipantColor participantColorA = bbax.a(bindData);
        bindData.G();
        return ((cpbn) this.b.b()).f(uriX, strQ, alqmVarQ, participantColorA, zD, zAa, zX);
    }

    public final Uri b(List list) {
        cqaz.k(!list.isEmpty());
        if (list.size() == 1) {
            return a((ParticipantsTable.BindData) list.get(0));
        }
        int iMin = Math.min(list.size(), 4);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(a((ParticipantsTable.BindData) list.get(i)));
        }
        return cpbr.p(this.a, arrayList);
    }

    public final Uri c(cpbl cpblVar, ekgb ekgbVar) {
        if (ekgbVar.size() == 1) {
            return ((ResolvedRecipient) ekgbVar.get(0)).c(cpblVar);
        }
        int iMin = Math.min(ekgbVar.size(), 4);
        ekfw ekfwVar = new ekfw();
        for (int i = 0; i < iMin; i++) {
            ekfwVar.h(((ResolvedRecipient) ekgbVar.get(i)).c(cpblVar));
        }
        return cpbr.p(this.a, ekfwVar.g());
    }
}
