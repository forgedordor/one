package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akcp implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final BugleConversationId c;
    public cquc d;
    public final cqtq e;
    private final fdjx f;
    private final cqtp g;

    public akcp(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, BugleConversationId bugleConversationId) {
        this.a = fdjxVar;
        this.f = fdjxVar2;
        this.g = cqtpVar;
        this.b = bbmoVar;
        this.c = bugleConversationId;
        this.e = cqtpVar.a(new akcm(this));
    }

    public static final bngt d(final ConversationIdType conversationIdType) {
        bngu bnguVarA = bngz.a();
        bnguVarA.A("createConversationClassificationsQuery");
        bnguVarA.c(new Function() { // from class: akck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bngy bngyVar = (bngy) obj;
                bngyVar.d(conversationIdType);
                return bngyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bnguVarA.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: akci
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "ConversationClassificationsObservableSupplier::register", "ConversationClassificationsObservableSupplier::callback", "ConversationClassificationsObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new akcl(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
