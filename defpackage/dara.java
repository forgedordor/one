package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dara extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ darb e;
    final /* synthetic */ daqn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dara(darb darbVar, daqn daqnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = darbVar;
        this.f = daqnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dara) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        fcyl fcylVar = fcyl.a;
        int i = this.d;
        try {
            if (i == 0) {
                fctl.b(obj);
                darb darbVar = this.e;
                obj2 = (deoe) darbVar.b.b();
                daqn daqnVar = this.f;
                String str = daqnVar.c;
                daqo daqoVar = (daqo) darbVar.c.b();
                ctay ctayVar = daqnVar.d;
                if (ctayVar == null) {
                    ctayVar = ctay.a;
                }
                ctayVar.getClass();
                this.a = obj2;
                this.b = str;
                this.c = "/bugle/rpc/proto/v1/list_conversations/";
                this.d = 1;
                obj = daqoVar.b(ctayVar, this);
                if (obj != fcylVar) {
                    obj3 = str;
                    obj4 = "/bugle/rpc/proto/v1/list_conversations/";
                }
                return fcylVar;
            }
            if (i != 1) {
                fctl.b(obj);
                eksl ekslVar = (eksl) darb.a.h();
                ekslVar.X(cqnc.S, "LoadPagedConversationTimeoutFallbackHandler");
                ekslVar.q("Sent paged conversation data to message client");
                return cbcw.i();
            }
            obj4 = this.c;
            obj3 = this.b;
            obj2 = this.a;
            fctl.b(obj);
            ListenableFuture listenableFutureA = drgi.a(((deoe) obj2).a((String) obj3, (String) obj4, ((ctav) obj).toByteArray()));
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (fdxs.c(listenableFutureA, this) == fcylVar) {
                return fcylVar;
            }
            eksl ekslVar2 = (eksl) darb.a.h();
            ekslVar2.X(cqnc.S, "LoadPagedConversationTimeoutFallbackHandler");
            ekslVar2.q("Sent paged conversation data to message client");
            return cbcw.i();
        } catch (Exception unused) {
            eksl ekslVar3 = (eksl) darb.a.j();
            ekslVar3.X(cqnc.S, "LoadPagedConversationTimeoutFallbackHandler");
            ekslVar3.q("Failed to send paged conversation data to data client");
            ((ains) ((dapz) this.e.d.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.TimeoutFallback.Error");
            return cbcw.k();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dara(this.e, this.f, fcxyVar);
    }
}
