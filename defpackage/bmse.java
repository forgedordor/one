package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmse extends dqtb {
    public bmse() {
        super("cms_deleted_messages_buffer", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bmso.a;
        this.b = new bmsm((bmsn) function.apply(new bmsn()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bmsd(this.a.a(), this.b);
    }
}
