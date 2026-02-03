package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmws extends dqtb {
    public bmws() {
        super("cms_notifications", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bmxa.a;
        this.b = new bmwy((bmwz) function.apply(new bmwz()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bmwr(this.a.a(), this.b);
    }
}
