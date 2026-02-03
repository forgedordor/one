package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccqe extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ MessageReceipt c;
    final /* synthetic */ atys d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccqe(MessageReceipt messageReceipt, atys atysVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = messageReceipt;
        this.d = atysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccqe) c((ccql) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccql ccqlVar = (ccql) this.b;
            MessageReceipt messageReceipt = this.c;
            aufh aufhVar = ((atuy) this.d).a;
            evvp evvpVar = aufhVar.n;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvpVar.getClass();
            long epochMilli = evxd.d(evvpVar).toEpochMilli();
            aubq aubqVar = aufhVar.d;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            String str = aubqVar.d;
            aubp aubpVar = aubp.GROUP;
            aubq aubqVar2 = aufhVar.f;
            if (aubqVar2 == null) {
                aubqVar2 = aubq.a;
            }
            aubp aubpVarB = aubp.b(aubqVar2.c);
            if (aubpVarB == null) {
                aubpVarB = aubp.UNKNOWN_TYPE;
            }
            ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(0L, ((AutoValue_MessageReceipt) messageReceipt).b, epochMilli, 50035, str, aubpVar == aubpVarB);
            cbqz cbqzVar = cbqz.c;
            basd basdVarA = basd.a(aufhVar.j);
            elpg elpgVar = aufhVar.o;
            if (elpgVar == null) {
                elpgVar = elpg.b;
            }
            elpgVar.getClass();
            this.a = 1;
            if (ccqlVar.a(chatSessionMessageEvent, cbqzVar, basdVarA, elpgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccqe ccqeVar = new ccqe(this.c, this.d, fcxyVar);
        ccqeVar.b = obj;
        return ccqeVar;
    }
}
