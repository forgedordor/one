package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class airl extends fcyz implements fdat {
    final /* synthetic */ airm a;
    final /* synthetic */ emop b;
    final /* synthetic */ Integer c;
    final /* synthetic */ Integer d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airl(airm airmVar, int i, emop emopVar, Integer num, Integer num2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = airmVar;
        this.e = i;
        this.b = emopVar;
        this.c = num;
        this.d = num2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final int i = this.e;
        final emop emopVar = this.b;
        final Integer num = this.c;
        airm airmVar = this.a;
        final Integer num2 = this.d;
        eieu eieuVarH = eiiy.h("AttachmentEventLogger.logAttachmentEvent");
        try {
            airmVar.k(new Supplier() { // from class: airk
                @Override // java.util.function.Supplier
                public final Object get() {
                    emom emomVar = (emom) emon.a.createBuilder();
                    emomVar.getClass();
                    emomVar.copyOnWrite();
                    emon emonVar = (emon) emomVar.instance;
                    emonVar.c = i - 1;
                    emonVar.b |= 1;
                    emomVar.copyOnWrite();
                    emon emonVar2 = (emon) emomVar.instance;
                    emonVar2.d = emopVar;
                    emonVar2.b |= 2;
                    Integer num3 = num;
                    if (num3 != null) {
                        int iIntValue = num3.intValue();
                        emomVar.copyOnWrite();
                        emon emonVar3 = (emon) emomVar.instance;
                        emonVar3.b |= 4;
                        emonVar3.e = iIntValue;
                    }
                    Integer num4 = num2;
                    if (num4 != null) {
                        int iIntValue2 = num4.intValue();
                        emomVar.copyOnWrite();
                        emon emonVar4 = (emon) emomVar.instance;
                        emonVar4.b |= 8;
                        emonVar4.f = iIntValue2;
                    }
                    evsn evsnVarBuild = emomVar.build();
                    evsnVarBuild.getClass();
                    return (emon) evsnVarBuild;
                }
            });
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new airl(this.a, this.e, this.b, this.c, this.d, fcxyVar);
    }
}
