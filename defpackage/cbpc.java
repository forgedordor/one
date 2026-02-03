package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpc extends RuntimeException {
    public final cbov a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbpc(cbov cbovVar, cbov cbovVar2) {
        super("Illegal state transition in the HeavyWorkStatusStateMachine from " + cbovVar + " to " + cbovVar2);
        cbovVar2.getClass();
        this.a = cbovVar;
    }
}
