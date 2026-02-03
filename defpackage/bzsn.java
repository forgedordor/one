package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzsn {
    private final cehg a;
    private final cqsp b;
    private final fcsu c;

    public bzsn(cehg cehgVar, cqsp cqspVar, fcsu fcsuVar) {
        this.a = cehgVar;
        this.b = cqspVar;
        this.c = fcsuVar;
    }

    static final boolean c(MessagePartCoreData messagePartCoreData) {
        return messagePartCoreData.t() != null && TextUtils.isEmpty(messagePartCoreData.P());
    }

    public final boolean a(MessagePartCoreData messagePartCoreData) {
        String strA;
        if (TextUtils.isEmpty(messagePartCoreData.O()) && messagePartCoreData.bj() && this.a.G(messagePartCoreData)) {
            String strR = messagePartCoreData.R();
            Uri uriV = messagePartCoreData.v();
            if (!le.j(strR)) {
                return true;
            }
            if (uriV != null && (strA = this.b.a(uriV)) != null && new File(strA).exists()) {
                return true;
            }
        }
        return false;
    }

    final boolean b(ParticipantsTable.BindData bindData) {
        boolean zP;
        fcsu fcsuVar = this.c;
        Uri uriX = bindData.x();
        String strU = bindData.U();
        if (!((Boolean) fcsuVar.b()).booleanValue()) {
            return uriX != null && TextUtils.isEmpty(strU);
        }
        chpq chpqVarG = bindData.G();
        chpq chpqVar = chpq.PROFILE_PEOPLE_SHARING_SOURCE;
        if (uriX != null) {
            zP = cqmz.p(uriX);
        } else {
            uriX = null;
            zP = true;
        }
        return uriX != null && TextUtils.isEmpty(strU) && chpqVarG != chpqVar && zP;
    }
}
