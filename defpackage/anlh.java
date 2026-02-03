package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anlh implements anmk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/IncomingExpiredOrNotAvailableFailedStatusHandler");

    @Override // defpackage.anmk
    public final /* bridge */ /* synthetic */ anlb a(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) throws Resources.NotFoundException {
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        String string = resources.getString(R.string.message_status_download_error);
        string.getClass();
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/IncomingExpiredOrNotAvailableFailedStatusHandler", "convert", 38, "IncomingExpiredOrNotAvailableFailedStatusHandler.kt")).D("Message with id %s has status %s", bindData.E().b(), string);
        return new anky(string);
    }

    @Override // defpackage.anmk
    public final /* synthetic */ anpj b(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anmj.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }
}
