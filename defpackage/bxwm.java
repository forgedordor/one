package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwm implements bxwh {
    public final bxxd a;
    private final eosc b;
    private final eosc c;
    private final bxro d;

    public bxwm(bxro bxroVar, bxxd bxxdVar, eosc eoscVar, eosc eoscVar2) {
        this.d = bxroVar;
        this.a = bxxdVar;
        this.b = eoscVar;
        this.c = eoscVar2;
    }

    @Override // defpackage.bxwh
    public final eiju a(final String str) {
        return eijx.g(new Callable() { // from class: bxwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxut bxutVarF = this.a.a.f(str, bxwf.e());
                boolean z = false;
                if (bxutVarF != null && !bxutVarF.c()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.c);
    }

    @Override // defpackage.bxwh
    public final eiju b(String str, final ConversationIdType conversationIdType) {
        if (TextUtils.isEmpty(str)) {
            int i = ekgb.d;
            return eijx.e(ekoe.a);
        }
        final Function function = new Function() { // from class: bxwi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    int i2 = ekgb.d;
                    return ekoe.a;
                }
                ekhv ekhvVar = new ekhv();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ekhvVar.c(Long.valueOf(((bxwg) it.next()).a()));
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                bxwm bxwmVar = this.a;
                return bxwmVar.a.k(ekhvVar.g(), conversationIdType2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bxro bxroVar = this.d;
        str.getClass();
        ekrw ekrwVarE = bxro.a.e();
        ekrwVarE.X(eksq.a, "BugleSearch");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceSearchApiImpl", "searchParticipants", 80, "OnDeviceSearchApiImpl.kt")).q("AppSearch is disabled. Search participants via Icing.");
        eiju eijuVarB = bxroVar.b.b(str);
        eijuVarB.getClass();
        ejvr ejvrVar = new ejvr() { // from class: bxwj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (List) function.apply((List) obj);
            }
        };
        eosc eoscVar = this.b;
        return eijuVarB.h(ejvrVar, eoscVar).e(bxzy.class, new ejvr() { // from class: bxwk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (List) function.apply(((bxzy) obj).a);
            }
        }, eoscVar);
    }
}
