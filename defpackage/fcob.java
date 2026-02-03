package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcob implements fdpm {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdpm b;

    public fcob(fdap fdapVar, fdpm fdpmVar) {
        this.a = fdapVar;
        this.b = fdpmVar;
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        Object objA = ((fdpl) this.a.invoke(obj)).a(new fcoa(this.b), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
