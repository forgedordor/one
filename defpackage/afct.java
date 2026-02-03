package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afct extends dqws {
    public afct(String[] strArr) {
        super("message_labels LEFT JOIN messages ON (messages._id=message_labels.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afcs b() {
        l();
        return new afcs(this.a.a());
    }
}
