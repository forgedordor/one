package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejan implements fdpm {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdos b;

    public ejan(fdos fdosVar, fdat fdatVar) {
        this.b = fdosVar;
        this.a = fdatVar;
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        ejam ejamVar = new ejam(this.a, obj, null);
        fdos fdosVar = this.b;
        Object objA = fdosVar.a(fdil.c(fdosVar, null, ejamVar, 3), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
