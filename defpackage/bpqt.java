package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpqt extends dqtb {
    public bpqt() {
        super("generic_worker_queue", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bprf.a;
        this.b = new bprd((bpre) function.apply(new bpre()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bpqs(this.a.a(), this.b);
    }
}
