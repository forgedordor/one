package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eill extends eilk implements ebzx {
    final /* synthetic */ eilm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eill(eilm eilmVar, ebzx ebzxVar) {
        super(eilmVar, ebzxVar);
        this.c = eilmVar;
    }

    @Override // defpackage.ebzx
    public final ebzu a(String str) {
        ebzu ebzuVarA = ((ebzx) this.a).a(str);
        if (ebzuVarA == null) {
            return null;
        }
        return new eili(this.c, ebzuVarA);
    }

    @Override // defpackage.ebzx
    public final ebzv b(String str) {
        ebzv ebzvVarB = ((ebzx) this.a).b(str);
        if (ebzvVarB == null) {
            return null;
        }
        return this.c.a(ebzvVarB);
    }
}
