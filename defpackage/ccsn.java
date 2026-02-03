package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsn extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccsn(basd basdVar, auhk auhkVar, String str, Throwable th) {
        super("Failed to generate the MLS signature for rcsMessageId: " + basdVar.f() + " and receiptType: " + auhkVar.name() + " due to " + str + ". Error: " + th, th);
        basdVar.getClass();
        auhkVar.getClass();
    }
}
