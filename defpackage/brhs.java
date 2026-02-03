package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brhs extends dqws {
    public brhs(String[] strArr) {
        super("smarts_personalization_features", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brhr b() {
        l();
        return new brhr(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = brhv.a;
        k(new brht((brhu) function.apply(new brhu())));
    }
}
