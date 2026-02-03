package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsmj extends dqtb {
    public bsmj() {
        super("pending_incoming_message_rcs_table", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bsmv.a;
        this.b = new bsmr((bsmu) function.apply(new bsmu()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bsmi(this.a.a(), this.b);
    }
}
