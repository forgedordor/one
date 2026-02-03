package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrl extends iay {
    public Object a;

    public hrl(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.iay
    public final /* bridge */ /* synthetic */ iay a(long j) {
        return new hrl(hzt.b().v(), this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        this.a = ((hrl) iayVar).a;
    }
}
