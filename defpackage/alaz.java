package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alaz implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final BugleConversationId c;
    public cquc d;
    public final cqtq e;
    private final fdjx f;
    private final cqtp g;

    public alaz(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, BugleConversationId bugleConversationId) {
        this.a = fdjxVar;
        this.f = fdjxVar2;
        this.g = cqtpVar;
        this.b = bbmoVar;
        this.c = bugleConversationId;
        this.e = cqtpVar.a(new alaw(this));
    }

    public static final bofl d(ConversationIdType conversationIdType) {
        final brdr brdrVarA = crjq.a(conversationIdType);
        bofm bofmVarA = bofr.a();
        bofmVarA.A("createRbmSuggestionsQuery");
        bofmVarA.c(new Function() { // from class: alas
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bofq bofqVar = (bofq) obj;
                Function function = new Function() { // from class: alar
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bran) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                brdr brdrVar = brdrVarA;
                brdrVar.f(function);
                bofqVar.c(brdrVar.b());
                return bofqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bofmVarA.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.e.a(new cqtk() { // from class: alat
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "RbmSuggestionObservableSupplierV2::register", "RbmSuggestionObservableSupplierV2::callback", "RbmSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new alav(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
