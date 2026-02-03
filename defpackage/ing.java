package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ing extends fdbr implements fdap {
    final /* synthetic */ ini a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ing(ini iniVar) {
        super(1);
        this.a = iniVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ini iniVar = this.a;
        imz imzVar = (imz) obj;
        ikd ikdVar = iniVar.e;
        if (iniVar.g && iniVar.p && ikdVar != null) {
            imt imtVarT = imzVar.t();
            long jA = imtVarT.a();
            imtVarT.b().l();
            try {
                imtVarT.c.g(ikdVar);
                iniVar.f(imzVar);
            } finally {
                imtVarT.b().j();
                imtVarT.h(jA);
            }
        } else {
            iniVar.f(imzVar);
        }
        return fctx.a;
    }
}
