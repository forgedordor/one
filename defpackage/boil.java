package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boil extends dqtb {
    public boil() {
        super("conversation_to_participants", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boik b() {
        return new boik(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = boiv.a;
        this.b = new boit((boiu) function.apply(new boiu()));
    }
}
