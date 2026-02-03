package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dlyj c;
    final /* synthetic */ fdjc d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlyh(dlyj dlyjVar, fdjc fdjcVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dlyjVar;
        this.d = fdjcVar;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlyh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdcg fdcgVar = new fdcg();
            fdcg fdcgVar2 = new fdcg();
            dlyj dlyjVar = this.c;
            fdpl fdplVarC = fdsc.c(new fdvl(dlyjVar.b.a, new dlyd(this.d, null)), new dlyg(null));
            dlyf dlyfVar = new dlyf(fdcgVar2, fdcgVar, this.e, dlyjVar);
            this.a = fdcgVar;
            this.b = 1;
            if (fdplVarC.a(dlyfVar, this) == fcylVar) {
                return fcylVar;
            }
            obj2 = fdcgVar;
        }
        fdcg fdcgVar3 = (fdcg) obj2;
        if (fdcgVar3.a != 0) {
            ((ekrd) dlyj.a.h().h("com/google/android/libraries/compose/audio/processor/AudioLevelProcessor$launchInputCoroutine$job$1", "invokeSuspend", 105, "AudioLevelProcessor.kt")).r("Dropping maxAmplitude value %d due to non-complete audio level polling window.", fdcgVar3.a);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlyh(this.c, this.d, this.e, fcxyVar);
    }
}
