package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anlq implements anly {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler");
    private final bvur b;

    public anlq(bvur bvurVar) {
        bvurVar.getClass();
        this.b = bvurVar;
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
    public final anla c(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) throws Resources.NotFoundException {
        String string;
        String strV;
        if (this.b.h() && bvdi.d(ajtsVar.A()) && andwVar.a() != 0) {
            ekgb ekgbVar2 = ((anar) anclVar).j;
            int size = ekgbVar2.size();
            ekgbVar2.getClass();
            Iterator<E> it = ekgbVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strV = null;
                    break;
                }
                strV = ((ResolvedRecipient) it.next()).v();
                if (strV != null) {
                    break;
                }
            }
            if (strV == null) {
                string = resources.getQuantityString(R.plurals.mapi_message_status_recipients_failed_decryption, size, Integer.valueOf(size));
                string.getClass();
            } else if (size > 1) {
                int i = size - 1;
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, resources.getQuantityString(R.plurals.name_and_other_plural, i, strV, Integer.valueOf(i)));
                string.getClass();
            } else {
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, strV);
                string.getClass();
            }
        } else {
            string = resources.getString(R.string.mapi_message_status_recipient_failed_decryption);
            string.getClass();
        }
        String str = string;
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler", "convertFailure", 64, "OutgoingFailedRecipientDidNotDecryptStatusHandler.kt")).D("Message with id %x has status %s", bindData, str);
        return new anla(str, 2, bindData.s() == 19, bindData.m() == 3 && !ajtsVar.S(), true, false, false, false, false, 480);
    }
}
