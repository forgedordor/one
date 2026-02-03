package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class crzq extends dqpg {
    public MessageIdType a;
    public String b;
    public ConversationIdType c;
    public String d;
    public long e;

    public crzq() {
        super(csav.a().M());
        this.a = bary.a;
        this.c = barn.a;
    }

    public final crzm a(Supplier supplier) {
        crzm crzmVar = (crzm) supplier.get();
        crzmVar.aD(aB());
        crzmVar.a = this.a;
        crzmVar.b = this.b;
        crzmVar.c = this.c;
        crzmVar.d = this.d;
        crzmVar.e = this.e;
        crzmVar.cM = aC();
        return crzmVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(2);
        this.c = conversationIdType;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void f(String str) {
        aE(1);
        this.b = str;
    }
}
