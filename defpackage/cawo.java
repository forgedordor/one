package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawo extends cayv {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final bxlc c;
    private final eosc d;

    public cawo(fcsu fcsuVar, eosc eoscVar, bxlc bxlcVar) {
        this.b = fcsuVar;
        this.d = eoscVar;
        this.c = bxlcVar;
    }

    public static void k(bakt baktVar, bxlc bxlcVar, List list, boolean z) {
        if (baktVar.e(list, z) > 0) {
            for (int i = 0; i < list.size(); i++) {
                bxlcVar.e((ConversationIdType) list.get(i), true);
            }
        }
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UpdateMarkUnreadHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cawq.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cawq cawqVar = (cawq) evuhVar;
        return eijx.g(new Callable() { // from class: cawl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((eksl) cawo.a.n().h("com/google/android/apps/messaging/shared/datamodel/workhandlers/UpdateMarkUnreadHandler", "processPendingWorkItemAsync", 64, "UpdateMarkUnreadHandler.java")).q("Executing work inside UpdateMarkUnreadHandler.");
                cawq cawqVar2 = cawqVar;
                List list = (List) Collection.EL.stream(cawqVar2.b).map(new Function() { // from class: cawm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return barn.b((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: cawn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                cawo cawoVar = this.a;
                cawo.k((bakt) cawoVar.b.b(), cawoVar.c, list, cawqVar2.c);
                return cbcw.i();
            }
        }, this.d);
    }
}
