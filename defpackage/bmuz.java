package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmuz extends dqtb {
    public bmuz() {
        super("cms_media_notifications", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bmvh.a;
        this.b = new bmvf((bmvg) function.apply(new bmvg()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bmuy(this.a.a(), this.b);
    }
}
