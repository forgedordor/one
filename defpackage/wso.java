package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wso extends fdbo implements fdap {
    public static final wso a = new wso();

    public wso() {
        super(1, bpbj.class, "getIsEncrypted", "getIsEncrypted()Z", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        bpbj bpbjVar = (bpbj) obj;
        bpbjVar.getClass();
        bpbjVar.aA(6, "is_encrypted");
        return Boolean.valueOf(bpbjVar.g);
    }
}
