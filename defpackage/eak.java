package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eak extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ean c;
    final /* synthetic */ float d;
    final /* synthetic */ fdap e;
    final /* synthetic */ dwy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eak(ean eanVar, float f, fdap fdapVar, dwy dwyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = eanVar;
        this.d = f;
        this.e = fdapVar;
        this.f = dwyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eak eakVar;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            ean eanVar = this.c;
            float f = this.d;
            float fA = eanVar.a.a(f, deq.b(eanVar.c, f));
            if (Float.isNaN(fA)) {
                ebs.d("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            final fdcf fdcfVar = new fdcf();
            float fAbs = Math.abs(fA) * Math.signum(f);
            fdcfVar.a = fAbs;
            final fdap fdapVar = this.e;
            fdapVar.invoke(new Float(fAbs));
            dwy dwyVar = this.f;
            float f2 = fdcfVar.a;
            fdap fdapVar2 = new fdap() { // from class: eai
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    fdcf fdcfVar2 = fdcfVar;
                    float f3 = fdcfVar2.a - fFloatValue;
                    fdcfVar2.a = f3;
                    fdapVar.invoke(Float.valueOf(f3));
                    return fctx.a;
                }
            };
            this.a = fdcfVar;
            this.b = 1;
            eakVar = this;
            obj = eanVar.d(dwyVar, f2, f, fdapVar2, eakVar);
            if (obj != fcylVar) {
                obj2 = fdcfVar;
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        obj2 = this.a;
        fctl.b(obj);
        eakVar = this;
        ean eanVar2 = eakVar.c;
        deb debVar = (deb) obj;
        float fB = eanVar2.a.b(((Number) debVar.b()).floatValue());
        if (Float.isNaN(fB)) {
            ebs.d("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        final fdcf fdcfVar2 = (fdcf) obj2;
        fdcfVar2.a = fB;
        dwy dwyVar2 = eakVar.f;
        deb debVarC = dec.c(debVar, 0.0f, 0.0f, 30);
        ddz ddzVar = eanVar2.b;
        final fdap fdapVar3 = eakVar.e;
        fdap fdapVar4 = new fdap() { // from class: eaj
            @Override // defpackage.fdap
            public final Object invoke(Object obj3) {
                float fFloatValue = ((Float) obj3).floatValue();
                fdcf fdcfVar3 = fdcfVar2;
                float f3 = fdcfVar3.a - fFloatValue;
                fdcfVar3.a = f3;
                fdapVar3.invoke(Float.valueOf(f3));
                return fctx.a;
            }
        };
        eakVar.a = null;
        eakVar.b = 2;
        Object objB = eas.b(dwyVar2, fB, fB, debVarC, ddzVar, fdapVar4, eakVar);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eak(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
