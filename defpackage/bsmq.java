package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsmq extends dqws {
    public bsmq(String[] strArr) {
        super("pending_incoming_message_rcs_table", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsmo b() {
        l();
        return new bsmo(this.a.a());
    }

    public final void c(bslm... bslmVarArr) {
        int iIntValue = bsmv.c().intValue();
        for (bslm bslmVar : bslmVarArr) {
            if (((Integer) bsmv.b.getOrDefault(bslmVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bslmVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bsmv.a;
        k(new bsmr((bsmu) function.apply(new bsmu())));
    }
}
