package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqtt extends dqtb {
    public bqtt() {
        super("message_status", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bqub.a;
        this.b = new bqtz((bqua) function.apply(new bqua()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bqts(this.a.a(), this.b);
    }
}
