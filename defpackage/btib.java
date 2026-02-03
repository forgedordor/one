package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btib extends dqtb {
    public btib() {
        super("reminders", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = btin.a;
        this.b = new btil((btim) function.apply(new btim()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new btia(this.a.a(), this.b);
    }
}
