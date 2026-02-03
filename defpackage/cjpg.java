package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjpg extends fcyz implements fdat {
    final /* synthetic */ cjpj a;
    final /* synthetic */ dggk b;
    final /* synthetic */ Integer c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjpg(cjpj cjpjVar, dggk dggkVar, Integer num, boolean z, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjpjVar;
        this.b = dggkVar;
        this.c = num;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        enyl enylVar = (enyl) enym.a.createBuilder();
        enylVar.getClass();
        Integer num = this.c;
        if (num != null) {
            int iIntValue = num.intValue();
            enylVar.copyOnWrite();
            enym enymVar = (enym) enylVar.instance;
            enymVar.b |= 2;
            enymVar.d = iIntValue;
        }
        boolean z = this.d;
        dggk dggkVar = this.b;
        enylVar.copyOnWrite();
        enym enymVar2 = (enym) enylVar.instance;
        enymVar2.b |= 4;
        enymVar2.e = z;
        if (dggkVar != null) {
            String strD = cjpj.d(dggkVar);
            enylVar.copyOnWrite();
            enym enymVar3 = (enym) enylVar.instance;
            enymVar3.b |= 1;
            enymVar3.c = strD;
        }
        evsn evsnVarBuild = enylVar.build();
        evsnVarBuild.getClass();
        int i = this.e;
        enym enymVar4 = (enym) evsnVarBuild;
        enyi enyiVar = (enyi) enys.a.createBuilder();
        enyiVar.getClass();
        enyt.c(i, enyiVar);
        int i2 = i - 1;
        if (i2 != 17) {
            switch (i2) {
                case 22:
                case 23:
                    break;
                case 24:
                    enyiVar.copyOnWrite();
                    enys enysVar = (enys) enyiVar.instance;
                    enysVar.f = enymVar4;
                    enysVar.b |= 8192;
                    break;
                case 25:
                    enyt.b(enymVar4, enyiVar);
                    break;
                case 26:
                    enyiVar.copyOnWrite();
                    enys enysVar2 = (enys) enyiVar.instance;
                    enysVar2.i = enymVar4;
                    enysVar2.b |= 65536;
                    break;
                case 27:
                    enyt.b(enymVar4, enyiVar);
                    break;
                case 28:
                    enyt.b(enymVar4, enyiVar);
                    break;
                default:
                    Objects.toString(enyk.a(i));
                    throw new IllegalArgumentException("Unsupported event type: ".concat(enyk.a(i)));
            }
        } else {
            enyt.b(enymVar4, enyiVar);
        }
        this.a.c(enyt.a(enyiVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjpg(this.a, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
