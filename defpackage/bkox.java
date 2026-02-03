package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkox extends dqws<bkot, bkov, bkox, ParticipantIdsQuery.BindData, bkos> {
    public bkox(String[] strArr) {
        super("participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkov b() {
        l();
        return new bkov(this.a.a());
    }
}
