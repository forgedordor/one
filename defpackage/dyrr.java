package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrr extends dyua {
    public dyuc a;
    public dyuo b;

    public dyrr() {
    }

    @Override // defpackage.dyua
    public final dyud a() {
        dyuo dyuoVar;
        dyuc dyucVar = this.a;
        if (dyucVar != null && (dyuoVar = this.b) != null) {
            return new dyrs(dyucVar, dyuoVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" onContinueWithAccountListenerWithAsyncCallback");
        }
        if (this.b == null) {
            sb.append(" features");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyua
    public final void b(dyuc dyucVar) {
        this.a = dyucVar;
    }

    public dyrr(dyud dyudVar) {
        dyrs dyrsVar = (dyrs) dyudVar;
        this.a = dyrsVar.a;
        this.b = dyrsVar.b;
    }
}
