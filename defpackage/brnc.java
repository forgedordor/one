package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brnc extends dqye {
    public brnc() {
        super("p2p_suggestions");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brnb b() {
        ah();
        return new brnb(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Function function) {
        String[] strArr = brnk.a;
        af(new brnd((brnj) function.apply(new brnj())));
    }
}
