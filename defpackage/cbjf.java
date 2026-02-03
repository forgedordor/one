package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjf extends dqtb {
    public cbjf() {
        super("work_queue_work_manager_ids", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbje b() {
        return new cbje(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = cbjq.a;
        this.b = new cbjo((cbjp) function.apply(new cbjp()));
    }
}
