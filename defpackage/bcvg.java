package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcvg {
    public static bcvf n() {
        bbmq bbmqVar = new bbmq();
        bbmqVar.f = barn.a;
        bbmqVar.c(false);
        int i = ekgb.d;
        bbmqVar.b(ekoe.a);
        return bbmqVar;
    }

    private static boolean o(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public abstract ConversationIdType a();

    public abstract ekgb b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    public abstract Boolean g();

    public abstract Integer h();

    public abstract Function i();

    public abstract boolean j();

    public abstract void k();

    public final bcuw l() {
        return m().b();
    }

    public final bcuy m() {
        bcuy bcuyVarC = bbth.c();
        String[] strArr = bcve.a;
        bcvd bcvdVar = new bcvd();
        int iIntValue = bcve.d().intValue();
        if (iIntValue < 29020) {
            dqru.x("delete_timestamp", iIntValue);
        }
        bcvdVar.ap(new dqty("conversations.delete_timestamp", 1, 0L));
        if (o(d())) {
            bcvdVar.ap(new dqpm("conversations.archive_status", 3, bcvd.as((Iterable) DesugarArrays.stream(new bvdk[]{bvdk.ARCHIVED, bvdk.KEEP_ARCHIVED}).map(new Function() { // from class: bcvc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((bvdk) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bcvb
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (o(e())) {
            bvdk bvdkVar = bvdk.UNARCHIVED;
            bcvdVar.ap(new dqty("conversations.archive_status", 1, Integer.valueOf(bvdkVar == null ? 0 : bvdkVar.h)));
        }
        if (o(g())) {
            bcvdVar.ap(new dqpm("conversations.archive_status", 3, bcvd.as((Iterable) ekpo.a(bvdk.g).map(new Function() { // from class: bcva
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((bvdk) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bcvb
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (o(null)) {
            int iIntValue2 = bcve.d().intValue();
            if (iIntValue2 < 8500) {
                dqru.x("source_type", iIntValue2);
            }
            bcvdVar.ap(new dqty("conversations.source_type", 1, 1));
        }
        if (o(f())) {
            int iIntValue3 = bcve.d().intValue();
            if (iIntValue3 < 8500) {
                dqru.x("source_type", iIntValue3);
            }
            bcvdVar.ap(new dqty("conversations.source_type", 2, 1));
        }
        if (o(c())) {
            int[] iArr = {0, 1};
            int iIntValue4 = bcve.d().intValue();
            if (iIntValue4 < 10006) {
                dqru.x("join_state", iIntValue4);
            }
            bcvdVar.ap(new dqpm("conversations.join_state", 3, bcvd.at(iArr), true));
        }
        ConversationIdType conversationIdTypeA = a();
        if (!conversationIdTypeA.b()) {
            bcvdVar.d(conversationIdTypeA);
        }
        ekgb ekgbVarB = b();
        if (!ekgbVarB.isEmpty()) {
            ekfw ekfwVar = new ekfw();
            Iterator<E> it = ekgbVarB.iterator();
            while (it.hasNext()) {
                ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
            }
            bcvdVar.ap(new dqpm("conversations._id", 3, bcvd.as(ekfwVar.g()), true));
        }
        if (o(Boolean.valueOf(j()))) {
            bcvdVar.c();
        }
        Function functionI = i();
        if (functionI != null) {
            bcvdVar = (bcvd) functionI.apply(bcvdVar);
        }
        bcuy bcuyVarC2 = bbth.c();
        bcuyVarC2.d(bcvdVar);
        Integer numH = h();
        if (numH != null) {
            bcuyVarC2.y(numH.intValue());
        }
        if (((Boolean) ((cczi) bvfd.p.get()).e()).booleanValue()) {
            bcur bcurVar = bcve.b;
            bcuyVarC2.c(new bcuv(bcurVar.b, false), new bcuv(bcurVar.a, true));
        } else {
            bcuyVarC2.c(new bcuv(bcve.b.b, false));
        }
        bcuyVarC.d(bcvdVar);
        Integer numH2 = h();
        if (numH2 != null) {
            bcuyVarC.y(numH2.intValue());
        }
        bcuyVarC.c(new bcuv(bcve.b.b, false));
        return bcuyVarC;
    }
}
