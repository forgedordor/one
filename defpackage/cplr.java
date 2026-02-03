package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplr extends cprs {
    public MessageCoreData a;
    public ParticipantsTable.BindData b;
    public ParticipantsTable.BindData c;
    public bojh d;
    public bpvd e;
    public ekgb f;
    public ekgb g;
    public ekgp h;
    public ekgb i;

    @Override // defpackage.cprs
    public final void a(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null cmsData");
        }
        this.h = ekgpVar;
    }

    @Override // defpackage.cprs
    public final void b(List list) {
        this.f = ekgb.n(list);
    }

    @Override // defpackage.cprs
    public final void c(List list) {
        this.i = ekgb.n(list);
    }

    @Override // defpackage.cprs
    public final void d(List list) {
        this.g = ekgb.n(list);
    }
}
