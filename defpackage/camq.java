package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camq extends fcyz implements fdat {
    final /* synthetic */ cams a;
    final /* synthetic */ Integer b;
    final /* synthetic */ Integer c;
    final /* synthetic */ Integer d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camq(fcxy fcxyVar, cams camsVar, Integer num, Integer num2, Integer num3) {
        super(2, fcxyVar);
        this.a = camsVar;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Integer num = this.b;
        num.getClass();
        final int iIntValue = num.intValue();
        Integer num2 = this.c;
        num2.getClass();
        final int iIntValue2 = num2.intValue();
        Integer num3 = this.d;
        num3.getClass();
        final int iIntValue3 = num3.intValue();
        ecem.b();
        aurx aurxVar = this.a.c;
        aurxVar.e.get().m(new ejvr() { // from class: aumw
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj2).toBuilder();
                ausj ausjVar = ((aumq) builder.instance).C;
                if (ausjVar == null) {
                    ausjVar = ausj.a;
                }
                int i = iIntValue3;
                int i2 = iIntValue2;
                int i3 = iIntValue;
                ausi ausiVar = (ausi) ausjVar.toBuilder();
                ausiVar.copyOnWrite();
                ausj ausjVar2 = (ausj) ausiVar.instance;
                ausjVar2.b |= 1024;
                ausjVar2.k = i3;
                ausiVar.copyOnWrite();
                ausj ausjVar3 = (ausj) ausiVar.instance;
                ausjVar3.b |= 64;
                ausjVar3.g = i2;
                ausiVar.copyOnWrite();
                ausj ausjVar4 = (ausj) ausiVar.instance;
                ausjVar4.b |= 1;
                ausjVar4.c = i;
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                ausj ausjVar5 = (ausj) ausiVar.build();
                ausjVar5.getClass();
                aumqVar.C = ausjVar5;
                aumqVar.b |= 1073741824;
                return builder.build();
            }
        });
        aurxVar.L();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camq camqVar = new camq(fcxyVar, this.a, this.b, this.c, this.d);
        camqVar.e = obj;
        return camqVar;
    }
}
