package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iev extends fdbr implements fdap {
    final /* synthetic */ fdap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iev(fdap fdapVar) {
        super(1);
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        imw imwVar = (imw) obj;
        this.a.invoke(imwVar);
        imwVar.p();
        return fctx.a;
    }
}
