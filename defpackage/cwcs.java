package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcs extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ cwct e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwcs(cwct cwctVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = cwctVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        cwcs cwcsVar = new cwcs(this.e, (fcxy) obj5);
        cwcsVar.a = (ajlk) obj;
        cwcsVar.b = (ekgb) obj2;
        cwcsVar.c = (Recipient) obj3;
        cwcsVar.d = zBooleanValue;
        return cwcsVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dkri dkriVarB;
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        ?? r3 = this.c;
        boolean z = this.d;
        final cwct cwctVar = this.e;
        if (cwctVar.c.a()) {
            Uri uriA = r1.a();
            if (r3 == 0 && r1.c() == ajlj.GROUP && uriA != null && cqmz.v(cpbr.o(uriA))) {
                Uri uriO = cpbr.o(uriA);
                uriO.getClass();
                dkriVarB = new dkrk(new dkpf(uriO, false, cwctVar.a.a(((cpch) cwctVar.b.b()).g()), 0, cpbr.n(uriA), 8), null, 0, 2, 0.01f, new fdae() { // from class: cwcq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cwctVar.c(null);
                        return fctx.a;
                    }
                }, 6);
            } else {
                dkriVarB = cwctVar.b((ekgb) obj2, r3, z);
            }
        } else {
            dkriVarB = cwctVar.b((ekgb) obj2, r3, z);
        }
        if (dkriVarB == null) {
            return null;
        }
        return new cwcv(dkriVarB, new cwcu(false));
    }
}
