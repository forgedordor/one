package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cayl implements cazg {
    @Override // defpackage.cazg
    public /* synthetic */ caya a() {
        throw null;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.cazg
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ boolean h(evuh evuhVar) {
        return true;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cazd.a(this, bArr);
    }

    public abstract eiju j(cayy cayyVar, ekgb ekgbVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cazg
    public final eiju s(cayy cayyVar, ekgb ekgbVar) {
        evuo evuoVarD = d();
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            final cbdg cbdgVar = (cbdg) ekgbVar.get(i);
            try {
                ekfwVar.h(evuoVarD.h(cbdgVar.t()));
            } catch (evtj unused) {
                cqbd cqbdVarB = E.b();
                cqbdVarB.I("InvalidProtocolBufferException for WorkQueue item of type ");
                cqbdVarB.I(cayyVar.a().toString());
                cqbdVarB.r();
                String[] strArr = cbfi.a;
                cbew cbewVar = new cbew();
                cbewVar.f("MultiItemWorkHandler#processPendingWorkItemRaw");
                cbewVar.c(new Function() { // from class: cayk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cbfh cbfhVar = (cbfh) obj;
                        cbfhVar.c(cbdgVar.m());
                        return cbfhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                cbewVar.d();
            }
        }
        return j(cayyVar, ekfwVar.g());
    }

    @Override // defpackage.cazg
    public final /* synthetic */ void g() {
    }
}
