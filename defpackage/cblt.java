package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblt extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cblt(String str, cblu cbluVar) {
        super("A " + cbluVar + " runner is already running for queue " + str);
        str.getClass();
        cbluVar.getClass();
    }
}
