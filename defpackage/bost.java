package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bost extends dqtb {
    public bost() {
        super("conversations", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = botm.a;
        this.b = new botf((botl) function.apply(new botl()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new boss(this.a.a(), this.b);
    }
}
