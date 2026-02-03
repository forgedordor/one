package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csas extends dqws {
    public csas(String[] strArr) {
        super("spam_logging_ids_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final csar b() {
        l();
        return new csar(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = csav.a;
        k(new csat((csau) function.apply(new csau())));
    }
}
