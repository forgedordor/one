package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boai extends dqws {
    public boai(String[] strArr) {
        super("conversation_participants_audit_log", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boah b() {
        l();
        return new boah(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = boal.a;
        k(new boaj((boak) function.apply(new boak())));
    }
}
