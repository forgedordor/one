package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmma extends dqws {
    public bmma(String[] strArr) {
        super("business_conversations_metadata", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmlz b() {
        l();
        return new bmlz(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bmmf.a;
        k(new bmmd((bmme) function.apply(new bmme())));
    }
}
