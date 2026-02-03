package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofm extends dqws {
    public bofm(String[] strArr) {
        super("conversation_suggestions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bofl b() {
        l();
        return new bofl(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bofr.a;
        k(new bofp((bofq) function.apply(new bofq())));
    }
}
