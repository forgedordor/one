package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anjk implements anpj {
    public final MessageId a;
    public final int b;
    private final fdjx c;
    private final bqlv d;
    private final ancj e;

    public anjk(fdjx fdjxVar, final dqsn dqsnVar, anch anchVar, MessageId messageId, int i) {
        fdjxVar.getClass();
        dqsnVar.getClass();
        anchVar.getClass();
        this.c = fdjxVar;
        this.a = messageId;
        this.b = i;
        String[] strArr = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.A("RepliesChangeObserver");
        bqlwVar.c((bqlj[]) new Function() { // from class: anjc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqli bqliVar = (bqli) obj;
                return new bqlj[]{bqliVar.a, bqliVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bqmc.c));
        bqlwVar.e(new Function() { // from class: anjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqmb bqmbVar = (bqmb) obj;
                bqmbVar.b(anjk.d(this.a.a));
                return bqmbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqlv bqlvVarB = bqlwVar.b();
        this.d = bqlvVarB;
        this.e = anchVar.a("RepliesChangeObserver", bqlvVarB, new anci() { // from class: anje
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new anjx(dqsnVar, new fdap() { // from class: anjb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        consumer.z(ekfv.a(list));
                        return fctx.a;
                    }
                });
            }
        });
    }

    public static final MessageIdType d(MessageId messageId) {
        MessageIdType messageIdTypeC;
        amgc amgcVar = messageId instanceof amgc ? (amgc) messageId : null;
        if (amgcVar == null || (messageIdTypeC = amgcVar.c()) == null) {
            throw new IllegalStateException("Unsupported message id type.");
        }
        return messageIdTypeC;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return this.e.b(new anjj(anpiVar));
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new anji(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
