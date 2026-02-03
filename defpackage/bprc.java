package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bprc extends dqye {
    public bprc() {
        super("generic_worker_queue");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bprb b() {
        ah();
        return new bprb(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        this.a.put("in_flight", Boolean.valueOf(z));
    }

    public final void d(Function function) {
        String[] strArr = bprf.a;
        af(new bprd((bpre) function.apply(new bpre())));
    }
}
