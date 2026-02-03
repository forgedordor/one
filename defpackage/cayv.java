package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cayv implements cazg {
    @Override // defpackage.cazg
    public /* synthetic */ caya a() {
        return cazd.b();
    }

    @Override // defpackage.cazg
    public /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.cazg
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.cazg
    public /* synthetic */ boolean h(evuh evuhVar) {
        return true;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cazd.a(this, bArr);
    }

    protected abstract eiju j(cayy cayyVar, evuh evuhVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [evuh, java.lang.Object] */
    @Override // defpackage.cazg
    public final eiju s(cayy cayyVar, final ekgb ekgbVar) {
        ejwl.l(ekgbVar.size() == 1);
        try {
            return j(cayyVar, d().h(((cbdg) ekgbVar.get(0)).t()));
        } catch (evtj unused) {
            cqbd cqbdVarB = E.b();
            cqbdVarB.I("InvalidProtocolBufferException for WorkQueue item of type ");
            cqbdVarB.I(cayyVar.a().toString());
            cqbdVarB.r();
            String[] strArr = cbfi.a;
            cbew cbewVar = new cbew();
            cbewVar.f("SingleItemWorkHandler#processPendingWorkItemRaw");
            cbewVar.c(new Function() { // from class: cayu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cbfh cbfhVar = (cbfh) obj;
                    cbfhVar.c(((cbdg) ekgbVar.get(0)).m());
                    return cbfhVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cbewVar.d();
            return eijx.e(cbcw.k());
        }
    }

    @Override // defpackage.cazg
    public /* synthetic */ void g() {
    }
}
