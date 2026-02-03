package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfzc extends dfzd {
    final /* synthetic */ dfze a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfzc(dfze dfzeVar) {
        super(dfzeVar);
        this.a = dfzeVar;
    }

    @Override // defpackage.dfzd
    protected final void a() {
        dfze dfzeVar = this.a;
        dfzeVar.d();
        dfzeVar.b(true);
    }

    @Override // defpackage.dfzd
    protected final void b() {
        dfze dfzeVar = this.a;
        dfzeVar.d();
        dfzeVar.b(false);
    }
}
