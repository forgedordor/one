package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhku extends dqws<bhkq, bhks, bhku, LocationAndLinkAnnotationIdsQuery.BindData, bhkp> {
    public bhku(String[] strArr) {
        super("messages_annotations", strArr, null, null, "annotation_type IN (6, 2)", "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bhks b() {
        l();
        return new bhks(this.a.a());
    }
}
