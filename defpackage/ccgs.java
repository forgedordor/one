package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccgs extends dqtb {
    public ccgs() {
        super("mls_key_packages", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ccgr b() {
        return new ccgr(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = ccha.a;
        this.b = new ccgy((ccgz) function.apply(new ccgz()));
    }
}
