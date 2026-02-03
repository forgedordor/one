package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anlo implements anly {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedEmergencyNumberStatusHandler");
    private final cqbm b;

    public anlo(cqbm cqbmVar) {
        cqbmVar.getClass();
        this.b = cqbmVar;
    }

    @Override // defpackage.anmk
    public final /* synthetic */ anlb a(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anlx.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }

    @Override // defpackage.anmk
    public final /* synthetic */ anpj b(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anmj.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }

    @Override // defpackage.anly
    public final anla c(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        String string = ((cqey) this.b.a()).s() ? resources.getString(R.string.message_status_failed_emergency_number_on_satellite) : resources.getString(R.string.message_status_failed_emergency_number);
        string.getClass();
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedEmergencyNumberStatusHandler", "convertFailure", 47, "OutgoingFailedEmergencyNumberStatusHandler.kt")).D("Message with id %x has status %s", bindData.E(), string);
        return new anla(string, 2, false, false, false, false, false, false, false, 508);
    }
}
