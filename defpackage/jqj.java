package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jqj extends fdbr implements fdae {
    final /* synthetic */ fdae a;
    final /* synthetic */ ivy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqj(fdae fdaeVar, ivy ivyVar) {
        super(0);
        this.a = fdaeVar;
        this.b = ivyVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ihu ihuVar;
        fdae fdaeVar = this.a;
        if (fdaeVar != null && (ihuVar = (ihu) fdaeVar.invoke()) != null) {
            return ihuVar;
        }
        ivy ivyVar = this.b;
        if (true != ivyVar.u()) {
            ivyVar = null;
        }
        if (ivyVar != null) {
            return iia.c(kjh.d(ivyVar.g()));
        }
        return null;
    }
}
