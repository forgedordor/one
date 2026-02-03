package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class axus {
    public static axus l(Uri uri, Context context, MessageIdType messageIdType, String str, boolean z, baqv baqvVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        return new axlr(uri, context, messageIdType, barn.b(str), z, baqvVar, messageCoreData, i, j, bindData, z2);
    }

    public abstract int a();

    public abstract long b();

    public abstract Context c();

    public abstract Uri d();

    public abstract MessageCoreData e();

    public abstract baqv f();

    public abstract ConversationIdType g();

    public abstract MessageIdType h();

    public abstract ParticipantsTable.BindData i();

    public abstract boolean j();

    public abstract boolean k();

    final ConversationIdType m() {
        baqv baqvVarF = f();
        return baqvVarF == null ? barn.a : baqvVarF.a();
    }
}
