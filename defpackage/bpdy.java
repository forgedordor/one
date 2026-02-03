package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpdy extends dqws {
    public bpdy(String[] strArr) {
        super("emergency_questionnaire_option", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpdx b() {
        l();
        return new bpdx(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bped.a;
        k(new bpeb((bpec) function.apply(new bpec())));
    }
}
