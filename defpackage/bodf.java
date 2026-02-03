package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bodf extends dqtb {
    public bodf() {
        super("conversation_pin", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bodn.a;
        this.b = new bodl((bodm) function.apply(new bodm()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bode(this.a.a(), this.b);
    }
}
