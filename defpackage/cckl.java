package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckl extends dqws {
    public cckl(String[] strArr) {
        super("mls_messages", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cckk b() {
        l();
        return new cckk(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = cckr.a;
        k(new cckp((cckq) function.apply(new cckq())));
    }
}
