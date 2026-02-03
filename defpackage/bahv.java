package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bahv {
    public abstract MessagePartData a(Parcel parcel);

    public abstract MessagePartData b(MessagePartData messagePartData);

    public abstract MessagePartData c(bahy bahyVar);

    public abstract MessagePartData d(bgzy bgzyVar);

    public abstract MessagePartData e(PartsTable.BindData bindData);

    public final MessagePartData f(bsgt bsgtVar) {
        return e((PartsTable.BindData) bsgtVar.cQ());
    }

    public final MessagePartData g(String str, Uri uri, int i, Long l, elha elhaVar, bvdy bvdyVar) {
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.c = str;
        bacmVar.e = uri;
        bahxVarD.o(l != null ? l.longValue() : -1L);
        bahxVarD.f(i);
        bahxVarD.n(elhaVar);
        bahxVarD.l(bvdyVar);
        return c(bahxVarD.q());
    }

    public final MessagePartData h(String str, elha elhaVar) {
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.b = str;
        bacmVar.c = RbmSpecificMessage.CONTENT_TYPE;
        bahxVarD.n(elhaVar);
        return c(bahxVarD.q());
    }

    public final MessagePartData i(String str) {
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.b = str;
        bacmVar.c = "text/plain";
        bahxVarD.n(elha.TEXT_PART);
        return c(bahxVarD.q());
    }
}
