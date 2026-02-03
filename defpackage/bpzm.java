package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzm extends dqtb {
    public bpzm() {
        super("messages_annotations", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bpzx.a;
        this.b = new bpzv((bpzw) function.apply(new bpzw()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bpzl(this.a.a(), this.b);
    }
}
