package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnet extends dqtb {
    public bnet() {
        super("contacts", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bnfe.a;
        this.b = new bnfc((bnfd) function.apply(new bnfd()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bnes(this.a.a(), this.b);
    }
}
