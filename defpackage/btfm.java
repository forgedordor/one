package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfm extends dqtb {
    public btfm() {
        super("recent_gifs", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = btfy.a;
        this.b = new btfw((btfx) function.apply(new btfx()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new btfl(this.a.a(), this.b);
    }
}
