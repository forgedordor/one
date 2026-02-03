package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efoy extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Message message = (Message) obj;
        cjia cjiaVar = (cjia) cjib.b.createBuilder();
        f(message, cjiaVar);
        ejvj ejvjVar = efqs.a;
        cjju cjjuVar = (cjju) ejvjVar.fH().fM(message.a());
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        cjjuVar.getClass();
        cjibVar.e = cjjuVar;
        cjibVar.c |= 2;
        c(message, cjiaVar);
        if (message.g().isPresent()) {
            g(message, cjiaVar);
        }
        if (message.f().isPresent() && message.f().isPresent()) {
            cjju cjjuVar2 = (cjju) ejvjVar.fH().fM(message.f().get());
            cjiaVar.copyOnWrite();
            cjib cjibVar2 = (cjib) cjiaVar.instance;
            cjjuVar2.getClass();
            cjibVar2.f = cjjuVar2;
            cjibVar2.c |= 4;
        }
        e(message, cjiaVar);
        if (message.e().isPresent() && message.e().isPresent()) {
            boolean zBooleanValue = ((Boolean) message.e().get()).booleanValue();
            cjiaVar.copyOnWrite();
            cjib cjibVar3 = (cjib) cjiaVar.instance;
            cjibVar3.c |= 32;
            cjibVar3.j = zBooleanValue;
        }
        if (message.d().isPresent()) {
            d(message, cjiaVar);
        }
        return (cjib) cjiaVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjib cjibVar = (cjib) obj;
        efjr efjrVarI = Message.i();
        if ((cjibVar.c & 1) != 0) {
            k(cjibVar, efjrVarI);
        }
        if ((cjibVar.c & 2) != 0) {
            ejvj ejvjVar = efqs.a;
            cjju cjjuVar = cjibVar.e;
            if (cjjuVar == null) {
                cjjuVar = cjju.a;
            }
            efjrVarI.i((RcsDestinationId) ejvjVar.fM(cjjuVar));
        }
        if ((cjibVar.c & 4) != 0) {
            ejvj ejvjVar2 = efqs.a;
            cjju cjjuVar2 = cjibVar.f;
            if (cjjuVar2 == null) {
                cjjuVar2 = cjju.a;
            }
            efjrVarI.h((RcsDestinationId) ejvjVar2.fM(cjjuVar2));
        }
        h(cjibVar, efjrVarI);
        if ((cjibVar.c & 8) != 0) {
            l(cjibVar, efjrVarI);
        }
        if ((cjibVar.c & 16) != 0) {
            j(cjibVar, efjrVarI);
        }
        if ((cjibVar.c & 32) != 0) {
            efjrVarI.g(cjibVar.j);
        }
        i(cjibVar, efjrVarI);
        return efjrVarI.a();
    }

    public abstract void c(Message message, cjia cjiaVar);

    public void d(Message message, cjia cjiaVar) {
        throw null;
    }

    public abstract void e(Message message, cjia cjiaVar);

    public abstract void f(Message message, cjia cjiaVar);

    public abstract void g(Message message, cjia cjiaVar);

    public abstract void h(cjib cjibVar, efjr efjrVar);

    public void i(cjib cjibVar, efjr efjrVar) {
        throw null;
    }

    public abstract void j(cjib cjibVar, efjr efjrVar);

    public abstract void k(cjib cjibVar, efjr efjrVar);

    public abstract void l(cjib cjibVar, efjr efjrVar);
}
