package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brmv extends dqtb {
    public brmv() {
        super("p2p_suggestions", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = brnk.a;
        this.b = new brnd((brnj) function.apply(new brnj()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new brmu(this.a.a(), this.b);
    }
}
