package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccqi extends fcyz implements fdap {
    int a;
    final /* synthetic */ ccqk b;
    final /* synthetic */ ChatSessionMessageEvent c;
    final /* synthetic */ cbqz d;
    final /* synthetic */ basd e;
    final /* synthetic */ elpg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccqi(ccqk ccqkVar, ChatSessionMessageEvent chatSessionMessageEvent, cbqz cbqzVar, basd basdVar, elpg elpgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ccqkVar;
        this.c = chatSessionMessageEvent;
        this.d = cbqzVar;
        this.e = basdVar;
        this.f = elpgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccqk ccqkVar = this.b;
            eiju eijuVarA = ccqkVar.a.a(this.c, this.d, this.e, this.f);
            this.a = 1;
            if (fdxs.c(eijuVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccqi(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
