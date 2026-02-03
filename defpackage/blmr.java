package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blmr extends dqws {
    public blmr(String[] strArr) {
        super("messages LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final blmq b() {
        l();
        return new blmq(this.a.a());
    }
}
