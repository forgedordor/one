package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpm {
    private final Context a;
    private final bywf b;

    public clpm(Context context, bywf bywfVar) {
        context.getClass();
        this.a = context;
        this.b = bywfVar;
    }

    public final Object a(MessageCoreData messageCoreData) {
        ekgb ekgbVarR;
        ArrayList arrayList = ((MessageData) messageCoreData).i;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("MessageCoreData has no parts.");
        }
        bywf bywfVar = this.b;
        MessagesTable.BindData bindDataJ = messageCoreData.J();
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) fcva.N(arrayList);
        if (messagePartCoreData.be()) {
            String strAb = messagePartCoreData.ab();
            if (strAb == null) {
                throw new IllegalArgumentException("MessageCoreData as invalid EoE attachment");
            }
            clmw clmwVarA = clhr.a(strAb);
            bscl bsclVarW = messagePartCoreData.E().w();
            bsclVarW.t("text/plain");
            Context context = this.a;
            clmu clmuVar = clmwVarA.c;
            if (clmuVar == null) {
                clmuVar = clmu.a;
            }
            clmt clmtVarB = clmt.b(clmuVar.c);
            if (clmtVarB == null) {
                clmtVarB = clmt.UNRECOGNIZED;
            }
            bsclVarW.Z(context.getString(clmtVarB == clmt.HELP_NOT_LONGER_NEED ? R.string.end_of_emergency_help_not_needed : R.string.end_of_emergency_help_needed));
            ekgbVarR = ekgb.r(bsclVarW.a());
            ekgbVarR.getClass();
        } else {
            ekgbVarR = ekgb.r(messagePartCoreData.E());
            ekgbVarR.getClass();
        }
        Uri uriA = bywfVar.a(bindDataJ, ekgbVarR);
        return uriA != null ? uriA : fctl.a(new IllegalStateException("Failed to insert the message into database."));
    }
}
