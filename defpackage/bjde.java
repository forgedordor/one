package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjde extends dqws {
    public bjde(String[] strArr) {
        super("messages_annotations INNER JOIN conversations ON (conversations.latest_message_id=messages_annotations.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjdd b() {
        l();
        return new bjdd(this.a.a());
    }
}
