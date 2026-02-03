package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwdc b;
    final /* synthetic */ Recipient c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdb(cwdc cwdcVar, Recipient recipient, long j, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwdcVar;
        this.c = recipient;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cwdc cwdcVar = this.b;
            cwdcVar.b.f(this.c);
            cwdcVar.c.f(cwen.b);
            long j = this.d;
            if (!kjb.f(j, 0L)) {
                cwdcVar.d.f(new kjb(j));
            }
            this.a = 1;
            if (fdkj.c(100L, this) == fcylVar) {
                return fcylVar;
            }
        }
        cwdc cwdcVar2 = this.b;
        cwdcVar2.c.f(cwen.c);
        ((ains) cwdcVar2.a.b()).e("Bugle.MiniConversationDetailsPage.Open.Count", this.e - 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwdb(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
