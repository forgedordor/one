package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqz {
    public static final brdp a(final MessageIdType messageIdType) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("messageTimestampByIdQuery");
        brdrVarD.f(new Function() { // from class: ahqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ahqw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.p(messageIdType);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brdrVarD.b();
    }

    public static final ahsa b(final ahsa ahsaVar, final baea baeaVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("setDistanceToRepliedToMessage");
        brdrVarD.f(new Function() { // from class: ahqx
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
        brdrVarD.h(new Function() { // from class: ahqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = ahra.b;
                brecVar.ap(new dqpk("messages.received_timestamp", 9, ahqz.a(bary.b(ahsaVar.c))));
                baea baeaVar2 = baeaVar;
                MessageIdType messageIdTypeR = baeaVar2.r();
                messageIdTypeR.getClass();
                brecVar.ap(new dqpk("messages.received_timestamp", 8, ahqz.a(messageIdTypeR)));
                brecVar.A(false);
                brecVar.m(baeaVar2.q());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iH = brdrVarD.b().h();
        ahrz ahrzVar = (ahrz) ahsaVar.toBuilder();
        ahrzVar.copyOnWrite();
        ((ahsa) ahrzVar.instance).f = iH;
        evsn evsnVarBuild = ahrzVar.build();
        evsnVarBuild.getClass();
        return (ahsa) evsnVarBuild;
    }
}
