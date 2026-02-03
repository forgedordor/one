package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhjx extends dqws {
    public bhjx(String[] strArr) {
        super("draft_parts_view", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bhjw b() {
        l();
        return new bhjw(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bhka.a;
        k(new bhjy((bhjz) function.apply(new bhjz())));
    }
}
