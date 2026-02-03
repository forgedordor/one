package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdc extends fdbr implements fdae {
    final /* synthetic */ jde a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ jft d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdc(jde jdeVar, long j, long j2, jft jftVar) {
        super(0);
        this.a = jdeVar;
        this.b = j;
        this.c = j2;
        this.d = jftVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jde jdeVar = this.a;
        jdeVar.M().a = false;
        jdeVar.M().b = this.b;
        jdeVar.M().c = this.c;
        fdap fdapVarN = this.d.a.n();
        if (fdapVarN != null) {
            fdapVarN.invoke(jdeVar.M());
        }
        return fctx.a;
    }
}
