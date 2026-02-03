package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrt extends cqdj {
    final /* synthetic */ int a;
    final /* synthetic */ cqbf b;
    final /* synthetic */ cxsa c;
    final /* synthetic */ int k;
    final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxrt(cxsa cxsaVar, int i, int i2, int i3, cqbf cqbfVar) {
        super("Bugle.Async.DebugUtils.MessageFailure.Duration");
        this.k = i;
        this.l = i2;
        this.a = i3;
        this.b = cqbfVar;
        this.c = cxsaVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        cxsa cxsaVar = this.c;
        ((cgct) cxsaVar.N.b()).b((cgbn) cxsaVar.e.b(), this.k, this.l, this.a, new ArrayList(), this.b).e(true);
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((dakl) this.c.Y.b()).j("Notification refreshed.");
    }
}
