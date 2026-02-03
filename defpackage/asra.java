package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asra {
    private final asqx a;

    public asra(asqx asqxVar) {
        this.a = asqxVar;
    }

    public final audu a(String str, String str2) {
        ejwl.b(!str.isEmpty(), "RCS conversation id is empty");
        ejwl.b(!str2.isEmpty(), "RCS group Uri is empty");
        aubq aubqVarA = this.a.a(str2, true);
        audt audtVar = (audt) audu.a.createBuilder();
        audtVar.copyOnWrite();
        audu auduVar = (audu) audtVar.instance;
        str.getClass();
        auduVar.b = 1 | auduVar.b;
        auduVar.c = str;
        audtVar.copyOnWrite();
        audu auduVar2 = (audu) audtVar.instance;
        aubqVarA.getClass();
        auduVar2.d = aubqVarA;
        auduVar2.b |= 2;
        return (audu) audtVar.build();
    }

    public final audu b(ConversationIdType conversationIdType) {
        return (audu) botm.i(conversationIdType, new Function() { // from class: asqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bojh bojhVar = (bojh) obj;
                return this.a.a(ejwk.b(bojhVar.ae()), ejwk.b(bojhVar.ad()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: asqz
            @Override // java.util.function.Supplier
            public final Object get() {
                throw new IllegalArgumentException("Conversation not found");
            }
        });
    }
}
