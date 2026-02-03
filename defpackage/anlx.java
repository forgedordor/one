package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class anlx {
    public static anlb a(anly anlyVar, Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        anla anlaVarC = anlyVar.c(resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
        String strX = bindData.X();
        if (TextUtils.isEmpty(strX)) {
            return anlaVarC;
        }
        String str = anlaVarC.a;
        return new anla(str == null ? null : resources.getString(R.string.message_status_error, str, strX), anlaVarC.i, anlaVarC.b, anlaVarC.c, anlaVarC.d, false, false, false, false, 480);
    }
}
