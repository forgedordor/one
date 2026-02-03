package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afko implements cdvn {
    public final fcyh a;
    private final fdjx b;

    public afko(fdjx fdjxVar, fcyh fcyhVar, dqsy dqsyVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        dqsyVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.a = fcyhVar;
    }

    @Override // defpackage.cdvn
    public final eiju a(MessageIdType messageIdType, List list) {
        messageIdType.getClass();
        list.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new afkn(this, messageIdType, list, null));
    }

    @Override // defpackage.cdvn
    public final void b(final MessageIdType messageIdType) {
        ecem.b();
        String[] strArr = bqcn.a;
        bqcc bqccVar = new bqcc();
        bqccVar.f("deleteNudges#messageclassifications");
        bqccVar.c(new Function() { // from class: afkj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqcm bqcmVar = (bqcm) obj;
                bqcmVar.c(ezah.NUDGE_CLASSIFICATION);
                bqcmVar.d(messageIdType);
                return bqcmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqccVar.d();
    }

    @Override // defpackage.cdvn
    public final void c() {
        d(true, true);
    }

    @Override // defpackage.cdvn
    public final void d(boolean z, boolean z2) {
        ecem.b();
        if (z) {
            String[] strArr = bqcn.a;
            bqcc bqccVar = new bqcc();
            bqccVar.f("deleteNudges#messageclassifications");
            bqccVar.c(new Function() { // from class: afkk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqcm bqcmVar = (bqcm) obj;
                    bqcmVar.c(ezah.NUDGE_CLASSIFICATION);
                    return bqcmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqccVar.d();
        }
        if (z2) {
            String[] strArr2 = bngz.a;
            bngp bngpVar = new bngp();
            bngpVar.f("deleteNudges#conversationclassififications");
            bngpVar.c(new Function() { // from class: afkl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bngy bngyVar = (bngy) obj;
                    bngyVar.c(aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                    return bngyVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bngpVar.d();
        }
    }

    @Override // defpackage.cdvn
    public final boolean e(MessageIdType messageIdType, List list) {
        messageIdType.getClass();
        if (dhic.a(list)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezgd ezgdVar = (ezgd) it.next();
            String[] strArr = bqcn.a;
            bqbj bqbjVar = new bqbj();
            bqbjVar.d(messageIdType);
            ezah ezahVarB = ezah.b(ezgdVar.d);
            if (ezahVarB == null) {
                ezahVarB = ezah.UNRECOGNIZED;
            }
            bqbjVar.c(ezahVarB);
            bqbjVar.b(ezgdVar);
            arrayList.add(bqbjVar.a());
        }
        bqbg[] bqbgVarArr = (bqbg[]) arrayList.toArray(new bqbg[0]);
        long[] jArrB = dqru.B(bqcn.b(), 0, true, new BiConsumer() { // from class: bqbe
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                bqbg bqbgVar = (bqbg) obj;
                Long l = (Long) obj2;
                String[] strArr2 = bqcn.a;
                if (l.longValue() >= 0) {
                    bqbgVar.a = l.longValue();
                    bqbgVar.fN(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, (bqbg[]) Arrays.copyOf(bqbgVarArr, bqbgVarArr.length));
        if (jArrB == null) {
            return false;
        }
        for (long j : jArrB) {
            if (j <= 0) {
                return false;
            }
        }
        return true;
    }
}
