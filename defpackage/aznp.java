package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aznp extends dqws {
    public aznp(String[] strArr) {
        super("parts_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azno b() {
        l();
        return new azno(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = azns.a;
        k(new aznq((aznr) function.apply(new aznr())));
    }
}
