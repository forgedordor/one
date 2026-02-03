package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtx extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new adtt(this);
    }

    public final void b(Function... functionArr) {
        adtx[] adtxVarArr = new adtx[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = adty.a;
            adtxVarArr[i] = (adtx) function.apply(new adtx());
        }
        aq(adtxVarArr);
    }

    public final void c(long j) {
        ap(new dqty("conversations._id", 7, Long.valueOf(j)));
    }

    public final void d(long j) {
        ap(new dqty("conversations._id", 8, Long.valueOf(j)));
    }

    public final void e() {
        ap(new dqpn("conversations.participant_normalized_destination", 5));
    }

    public final void f(long j) {
        ap(new dqty("conversations.sort_timestamp", 1, Long.valueOf(j)));
    }

    public final void g(long j) {
        ap(new dqty("conversations.sort_timestamp", 7, Long.valueOf(j)));
    }

    public final void h(long j) {
        ap(new dqty("conversations.sort_timestamp", 8, Long.valueOf(j)));
    }
}
