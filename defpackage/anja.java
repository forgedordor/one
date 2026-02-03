package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anja implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final MessageId c;
    public cquc d;
    public final cqtq e;
    public final bqlv f;
    public final brdp g;
    private final fdjx h;

    public anja(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, MessageId messageId) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        cqtpVar.getClass();
        bbmoVar.getClass();
        this.h = fdjxVar;
        this.a = fdjxVar2;
        this.b = bbmoVar;
        this.c = messageId;
        this.e = cqtpVar.a(new anix(this));
        String[] strArr = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.A("MessageReplyCountObserver#repliesQuery");
        bqlwVar.d(new Function() { // from class: anis
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqli) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqlwVar.e(new Function() { // from class: anit
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MessageIdType messageIdTypeC;
                bqmb bqmbVar = (bqmb) obj;
                MessageId messageId2 = this.a.c;
                amgc amgcVar = messageId2 instanceof amgc ? (amgc) messageId2 : null;
                if (amgcVar == null || (messageIdTypeC = amgcVar.c()) == null) {
                    throw new IllegalStateException("Unsupported message id type.");
                }
                bqmbVar.b(messageIdTypeC);
                return bqmbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqlv bqlvVarB = bqlwVar.b();
        this.f = bqlvVarB;
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageReplyCountObserver#replyIdsQuery");
        brdrVarD.y(100);
        brdrVarD.f(new Function() { // from class: aniu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: aniv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.A(false);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.H(dqts.i(bqlvVarB, bqmc.c.a, MessagesTable.c.a).g());
        this.g = brdrVarD.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: anir
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "MessageReplyCountObservableSupplier::register", "MessageReplyCountObservableSupplier::callback", "MessageReplyCountObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.h, fcyi.a, fdjz.a, new aniw(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
