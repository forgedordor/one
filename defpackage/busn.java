package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class busn extends dqws {
    public busn(String[] strArr) {
        super("conversation_suggestions INNER JOIN messages ON (messages._id=conversation_suggestions.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final busm b() {
        l();
        return new busm(this.a.a());
    }
}
