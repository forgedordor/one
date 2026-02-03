package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjph extends fcyz implements fdat {
    final /* synthetic */ cjpj a;
    final /* synthetic */ dggk b;
    final /* synthetic */ Integer c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjph(cjpj cjpjVar, dggk dggkVar, Integer num, String str, String str2, boolean z, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjpjVar;
        this.b = dggkVar;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        enyn enynVar = (enyn) enyo.a.createBuilder();
        enynVar.getClass();
        dggk dggkVar = this.b;
        if (dggkVar != null) {
            String strD = cjpj.d(dggkVar);
            enynVar.copyOnWrite();
            enyo enyoVar = (enyo) enynVar.instance;
            enyoVar.b |= 1;
            enyoVar.c = strD;
        }
        Integer num = this.c;
        if (num != null) {
            int iIntValue = num.intValue();
            enynVar.copyOnWrite();
            enyo enyoVar2 = (enyo) enynVar.instance;
            enyoVar2.b |= 2;
            enyoVar2.d = iIntValue;
        }
        boolean z = this.f;
        String str = this.e;
        String str2 = this.d;
        enynVar.copyOnWrite();
        enyo enyoVar3 = (enyo) enynVar.instance;
        enyoVar3.b |= 4;
        enyoVar3.e = str2;
        enynVar.copyOnWrite();
        enyo enyoVar4 = (enyo) enynVar.instance;
        enyoVar4.b |= 8;
        enyoVar4.f = str;
        enynVar.copyOnWrite();
        enyo enyoVar5 = (enyo) enynVar.instance;
        enyoVar5.b |= 16;
        enyoVar5.g = z;
        evsn evsnVarBuild = enynVar.build();
        evsnVarBuild.getClass();
        int i = this.g;
        enyo enyoVar6 = (enyo) evsnVarBuild;
        enyi enyiVar = (enyi) enys.a.createBuilder();
        enyiVar.getClass();
        enyt.c(i, enyiVar);
        if (i - 1 != 18) {
            enyiVar.copyOnWrite();
            enys enysVar = (enys) enyiVar.instance;
            enysVar.h = enyoVar6;
            enysVar.b |= 32768;
        } else {
            enyiVar.copyOnWrite();
            enys enysVar2 = (enys) enyiVar.instance;
            enysVar2.g = enyoVar6;
            enysVar2.b |= 16384;
        }
        this.a.c(enyt.a(enyiVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjph(this.a, this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
