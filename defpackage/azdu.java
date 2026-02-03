package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdu extends dqws {
    public azdu(String[] strArr) {
        super("message_reactions_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azdt b() {
        l();
        return new azdt(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = azdx.a;
        k(new azdv((azdw) function.apply(new azdw())));
    }
}
