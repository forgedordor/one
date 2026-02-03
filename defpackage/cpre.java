package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpre {
    public static void a(ParticipantsTable.BindData bindData, ekfw ekfwVar) {
        String strL = bindData.L();
        String strR = bindData.R();
        if (!TextUtils.isEmpty(strL) || TextUtils.isEmpty(strR)) {
            return;
        }
        ekfwVar.h(new cpyp(strR, 1));
    }
}
