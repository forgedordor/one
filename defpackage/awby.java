package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awby extends dqws {
    public awby(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awbw b() {
        l();
        return new awbw(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = awcb.a;
        k(new awbz((awca) function.apply(new awca())));
    }
}
