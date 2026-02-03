package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkku extends dqws<bkkq, bkks, bkku, MessageWithTextIdsQuery.BindData, bkkp> {
    public bkku(String[] strArr) {
        super("parts", strArr, null, null, "content_type IN ('text/plain', 'text/html', 'application/vnd.wap.xhtml+xml', 'application/vnd.gsma.rcspushlocation+xml') AND length(text) > 0", "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkks b() {
        l();
        return new bkks(this.a.a());
    }
}
