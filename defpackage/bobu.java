package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bobu extends dqtb {
    public bobu() {
        super("conversation_participants", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = bocg.a;
        this.b = new boce((bocf) function.apply(new bocf()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bobt(this.a.a(), this.b);
    }
}
