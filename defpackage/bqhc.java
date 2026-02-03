package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhc extends dqws {
    public bqhc(String[] strArr) {
        super("message_labels", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqha b() {
        l();
        return new bqha(this.a.a());
    }

    public final void c(bqgm... bqgmVarArr) {
        int iIntValue = bqhf.c().intValue();
        if (((Integer) bqhf.b.getOrDefault(bqgmVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        m(bqgmVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bqhf.a;
        k(new bqhd((bqhe) function.apply(new bqhe())));
    }
}
