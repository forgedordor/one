package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpmg extends dqtb {
    public bpmg() {
        super("flagged_messages", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bpmq.a;
        this.b = new bpmo((bpmp) function.apply(new bpmp()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bpmf(this.a.a(), this.b);
    }
}
