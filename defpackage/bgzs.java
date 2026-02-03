package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgzs extends dqws {
    public bgzs(String[] strArr) {
        super("conversation_to_participants LEFT JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bgzr b() {
        l();
        return new bgzr(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bgzx.a;
        k(new bgzt((bgzw) function.apply(new bgzw())));
    }
}
