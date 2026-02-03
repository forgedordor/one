package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehur extends fbos {
    final /* synthetic */ ehry a;
    final /* synthetic */ ehus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehur(ehus ehusVar, fbnh fbnhVar, ehry ehryVar) {
        super(fbnhVar);
        this.a = ehryVar;
        this.b = ehusVar;
    }

    @Override // defpackage.fbot, defpackage.fbnh
    public final void a(fbng fbngVar, fbrg fbrgVar) {
        ehus ehusVar = this.b;
        ehusVar.c = ehusVar.b.a();
        super.a(new ehuq(this, fbngVar, this.a), fbrgVar);
    }
}
