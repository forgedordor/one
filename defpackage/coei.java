package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coei extends cayv {
    private final eosc a;

    public coei(eosc eoscVar) {
        this.a = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(5);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DeleteConversationPartsWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cnlw.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cnlw cnlwVar = (cnlw) evuhVar;
        return eijx.g(new Callable() { // from class: coeh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                evtg<cnlv> evtgVar = cnlwVar.b;
                final ekfw ekfwVar = new ekfw();
                for (cnlv cnlvVar : evtgVar) {
                    File file = new File(cnlvVar.c);
                    if (file.exists() && codx.d(file)) {
                        ekfwVar.h(cnlvVar.b);
                    }
                }
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("deletePartsCache");
                bsjhVar.o();
                bsjhVar.s();
                bsjhVar.D(new Function() { // from class: codu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        cqce cqceVar = codx.a;
                        bsjlVar.k(ekfwVar.g());
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjhVar.b().e();
                return cbcw.i();
            }
        }, this.a);
    }
}
