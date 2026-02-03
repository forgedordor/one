package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbtd extends dqws<bbtb, bbtc, bbtd, ConversationIdsQuery.BindData, bbta> {
    public bbtd(String[] strArr) {
        super("conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bbtc b() {
        l();
        return new bbtc(this.a.a());
    }
}
