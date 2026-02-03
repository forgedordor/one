package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anli implements anly {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCancelledMessageStatusHandler");

    @Override // defpackage.anmk
    public final /* synthetic */ anlb a(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anlx.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }

    @Override // defpackage.anmk
    public final /* synthetic */ anpj b(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anmj.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }

    @Override // defpackage.anly
    public final anla c(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) throws Resources.NotFoundException {
        String string = resources.getString(R.string.mapi_message_status_cancelled_sending);
        string.getClass();
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCancelledMessageStatusHandler", "convertFailure", 37, "OutgoingCancelledMessageStatusHandler.kt")).D("Message with id %x has status %s", bindData.E(), string);
        return new anla(string, 1, true, false, true, false, false, false, false, 480);
    }
}
