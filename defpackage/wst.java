package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wst extends fdbo implements fdap {
    public static final wst a = new wst();

    public wst() {
        super(1, bpbj.class, "getIsUrgent", "getIsUrgent()Z", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        bpbj bpbjVar = (bpbj) obj;
        bpbjVar.getClass();
        bpbjVar.aA(4, "is_urgent");
        return Boolean.valueOf(bpbjVar.e);
    }
}
