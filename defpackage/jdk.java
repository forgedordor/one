package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdk extends fdbr implements fdae {
    final /* synthetic */ jdm a;
    final /* synthetic */ jfh b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdk(jdm jdmVar, jfh jfhVar, long j) {
        super(0);
        this.a = jdmVar;
        this.b = jfhVar;
        this.c = j;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        jdf jdfVarC;
        jdm jdmVar = this.a;
        iyk iygVar = null;
        if (jcx.a(jdmVar.o()) || jdmVar.f.c) {
            jer jerVar = jdmVar.q().x;
            if (jerVar != null) {
                iygVar = jerVar.m;
            }
        } else {
            jer jerVar2 = jdmVar.q().x;
            if (jerVar2 != null && (jdfVarC = jerVar2.C()) != null) {
                iygVar = jdfVarC.m;
            }
        }
        if (iygVar == null) {
            jfh jfhVar = this.b;
            fdap fdapVar = iyn.a;
            iygVar = new iyg(jfhVar);
        }
        long j = this.c;
        jdf jdfVarC2 = jdmVar.q().C();
        jdfVarC2.getClass();
        iygVar.t(jdfVarC2, j, 0.0f);
        return fctx.a;
    }
}
