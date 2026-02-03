package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aneh implements anpj {
    public final BugleConversationId a;
    private final bbmo b;
    private final fdjx c;
    private final brdp d;
    private final bbmn e;

    public aneh(bbmo bbmoVar, fdjx fdjxVar, BugleConversationId bugleConversationId) {
        this.b = bbmoVar;
        this.c = fdjxVar;
        this.a = bugleConversationId;
        brdr brdrVarD = MessagesTable.d();
        bran branVar = MessagesTable.c;
        brdrVarD.c(branVar.a);
        brdrVarD.h(new Function() { // from class: aned
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.m(this.a.a.a);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpxe bpxeVarB = bpxj.b();
        bpxeVarB.e(new Function() { // from class: anee
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpxi bpxiVar = (bpxi) obj;
                int iIntValue = bpxj.d().intValue();
                if (iIntValue < 61000) {
                    dqru.x("deferred", iIntValue);
                }
                bpxiVar.ap(new dqty("link_preview.deferred", 1, 1));
                return bpxiVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.E(dqts.i(bpxeVarB.b(), bpxj.c.b, branVar.a).g());
        brdrVarD.d(new brdo(branVar.a, false));
        brdrVarD.y(1);
        brdrVarD.A("DeferredLinkPreviewObservableSupplier.deferredLinkPreviewQuery");
        brdp brdpVarB = brdrVarD.b();
        this.d = brdpVarB;
        this.e = bbmoVar.a(brdpVarB, "DeferredLinkPreviewObservableSupplier");
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.f(new cqtk() { // from class: anef
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "DeferredLinkPreviewObservableSupplier::register", "DeferredLinkPreviewObservableSupplier::callback", "DeferredLinkPreviewObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new aneg(this, null));
    }

    @Override // defpackage.anpj
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ekgb c() {
        ekgb ekgbVarZ = this.d.z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new anec(new CoreBugleMessageId(((MessagesTable.BindData) it.next()).E(), -1L)));
        }
        return ekfv.a(arrayList);
    }
}
