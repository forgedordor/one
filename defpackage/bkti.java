package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkti extends dqws {
    public bkti(String[] strArr) {
        super("conversation_to_participants INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkth b() {
        l();
        return new bkth(this.a.a());
    }

    public final void c(Function function) {
        bktf[] bktfVarArr = {(bktf) function.apply(bktl.c)};
        int iA = bktl.a().M().a();
        Integer.valueOf(iA).getClass();
        if (((Integer) bktl.b.getOrDefault(bktfVarArr[0].toString(), -1)).intValue() > iA) {
            dqru.x("columnReference.toString()", iA);
        }
        m(bktfVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bktl.a;
        k(new bktj((bktk) function.apply(new bktk())));
    }
}
