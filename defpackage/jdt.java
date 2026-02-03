package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdt extends fdbr implements fdae {
    final /* synthetic */ jdv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdt(jdv jdvVar) {
        super(0);
        this.a = jdvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [iyk] */
    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        iyg iygVar;
        ?? r1;
        jdv jdvVar = this.a;
        jer jerVar = jdvVar.p().x;
        if (jerVar == null || (r1 = jerVar.m) == 0) {
            jfh jfhVarA = jcv.a(jdvVar.o());
            fdap fdapVar = iyn.a;
            iygVar = new iyg(jfhVarA);
        } else {
            iygVar = r1;
        }
        fdap fdapVar2 = jdvVar.C;
        ini iniVar = jdvVar.D;
        if (iniVar != null) {
            iygVar.w(jdvVar.p(), jdvVar.E, iniVar, jdvVar.F);
        } else if (fdapVar2 == null) {
            iygVar.t(jdvVar.p(), jdvVar.E, jdvVar.F);
        } else {
            iygVar.v(jdvVar.p(), jdvVar.E, jdvVar.F, fdapVar2);
        }
        return fctx.a;
    }
}
