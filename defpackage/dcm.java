package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcm extends fdbr implements fdap {
    final /* synthetic */ dcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcm(dcf dcfVar) {
        super(1);
        this.a = dcfVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        imw imwVar = (imw) obj;
        imwVar.p();
        iac iacVar = this.a.h;
        if (iacVar.a() > 1) {
            fcva.s(iacVar, new dbw());
        }
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            ((dax) iacVar.get(i)).b(imwVar);
        }
        return fctx.a;
    }
}
