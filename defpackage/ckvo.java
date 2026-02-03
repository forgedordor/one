package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckvo extends dqws {
    public ckvo(String[] strArr) {
        super("message_reactions LEFT JOIN messages ON (messages._id=message_reactions.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ckvm b() {
        l();
        return new ckvm(this.a.a());
    }
}
