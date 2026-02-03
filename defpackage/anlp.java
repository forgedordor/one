package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anlp implements anly {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedNoRetryNoFallbackStatusHandler");

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
        String string = resources.getString(R.string.mapi_message_status_send_failed_no_retry_no_fallback);
        string.getClass();
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedNoRetryNoFallbackStatusHandler", "convertFailure", 41, "OutgoingFailedNoRetryNoFallbackStatusHandler.kt")).D("Message with id %x has status %s", bindData, string);
        return new anla(string, 2, false, false, true, false, false, false, false, 492);
    }
}
