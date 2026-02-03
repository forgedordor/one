package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btii extends dqws {
    public btii(String[] strArr) {
        super("reminders", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btig b() {
        l();
        return new btig(this.a.a());
    }

    public final void c(Function function) {
        bths[] bthsVarArr = {(bths) function.apply(btin.c)};
        int iIntValue = btin.e().intValue();
        if (((Integer) btin.b.getOrDefault(bthsVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        m(bthsVarArr);
    }

    public final void d(btim btimVar) {
        k(new btil(btimVar));
    }

    public final void e(Function function) {
        String[] strArr = btin.a;
        k(new btil((btim) function.apply(new btim())));
    }
}
