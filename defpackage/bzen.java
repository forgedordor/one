package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzen extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzep b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzen(bzep bzepVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzepVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzen) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzep bzepVar = this.b;
            final int size = this.c.size();
            final aurx aurxVar = bzepVar.b;
            eiju eijuVarZ = aurxVar.z(new Function() { // from class: auon
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    final aumg aumgVar = (aumg) obj2;
                    dqsn dqsnVar = (dqsn) aurxVar.h.b();
                    final int i2 = size;
                    dqsnVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataParticipantsBackedUpCount", new Runnable() { // from class: auqa
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqce cqceVar = aurx.a;
                            aumg aumgVar2 = aumgVar;
                            ausj ausjVar = ((aumq) aumgVar2.instance).C;
                            if (ausjVar == null) {
                                ausjVar = ausj.a;
                            }
                            int i3 = i2;
                            ausi ausiVar = (ausi) ausjVar.toBuilder();
                            int i4 = ausjVar.n + i3;
                            ausiVar.copyOnWrite();
                            ausj ausjVar2 = (ausj) ausiVar.instance;
                            ausjVar2.b |= 8192;
                            ausjVar2.n = i4;
                            aumgVar2.copyOnWrite();
                            aumq aumqVar = (aumq) aumgVar2.instance;
                            ausj ausjVar3 = (ausj) ausiVar.build();
                            ausjVar3.getClass();
                            aumqVar.C = ausjVar3;
                            aumqVar.b |= 1073741824;
                        }
                    });
                    return aumgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            this.a = 1;
            if (fdxs.c(eijuVarZ, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzen(this.b, this.c, fcxyVar);
    }
}
