package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzci extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzcj b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzci(bzcj bzcjVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzcjVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzcj bzcjVar = this.b;
            final int size = this.c.size();
            final aurx aurxVar = bzcjVar.a;
            eiju eijuVarZ = aurxVar.z(new Function() { // from class: auqw
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
                    dqsnVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataConversationsBackedUpCount", new Runnable() { // from class: auov
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
                            int i4 = ausjVar.j + i3;
                            ausiVar.copyOnWrite();
                            ausj ausjVar2 = (ausj) ausiVar.instance;
                            ausjVar2.b |= 512;
                            ausjVar2.j = i4;
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
        return new bzci(this.b, this.c, fcxyVar);
    }
}
