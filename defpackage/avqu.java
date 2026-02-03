package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqu extends dqtb {
    public avqu() {
        super("conversation_matcher_cache", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final avqt b() {
        return new avqt(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = avrd.a;
        this.b = new avrb((avrc) function.apply(new avrc()));
    }
}
