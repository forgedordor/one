package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bohq extends dqpg {
    public ConversationIdType a;
    public long b;
    public auej c;
    public bbaj d;

    public bohq() {
        super(boiv.c());
        this.a = barn.a;
        this.c = auej.UNKNOWN_STATE;
        this.d = bbam.b();
    }

    public final bohm a() {
        return b(new Supplier() { // from class: boho
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bohn();
            }
        });
    }

    public final bohm b(Supplier supplier) {
        bohm bohmVar = (bohm) supplier.get();
        bohmVar.aD(aB());
        bohmVar.a = this.a;
        bohmVar.b = this.b;
        bohmVar.c = this.c;
        bohmVar.d = this.d;
        bohmVar.cM = aC();
        return bohmVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void d(bbaj bbajVar) {
        aE(3);
        this.d = bbajVar;
    }

    public final void e(long j) {
        aE(1);
        this.b = j;
    }

    public final void f(auej auejVar) {
        aE(2);
        this.c = auejVar;
    }
}
