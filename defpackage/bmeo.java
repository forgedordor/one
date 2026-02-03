package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmeo extends dqws<bmek, bmem, bmeo, UrlSearchQuery.BindData, bmej> {
    public bmeo(String[] strArr) {
        super("messages_annotations INNER JOIN messages ON (messages._id=messages_annotations.message_id) INNER JOIN participants ON (participants._id=messages.sender_id) LEFT OUTER JOIN link_preview ON (link_preview.message_id=messages_annotations.message_id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN parent_disallowed_conversations ON (parent_disallowed_conversations.conversation_id=messages.conversation_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmem b() {
        l();
        return new bmem(this.a.a());
    }
}
