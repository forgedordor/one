package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axav extends dqws {
    public axav(String[] strArr) {
        super("my_identities LEFT JOIN subscriptions ON (%JOIN_SUBSTITUTION_KEY%)", strArr, "token", null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axau b() {
        l();
        return new axau(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = axay.a;
        k(new axaw((axax) function.apply(new axax())));
    }
}
