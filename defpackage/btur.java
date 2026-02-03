package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btur extends dqws {
    public btur(String[] strArr) {
        super("restore_workflow_scratch_suffix", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btuq b() {
        l();
        return new btuq(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = btuu.a;
        k(new btus((btut) function.apply(new btut())));
    }
}
