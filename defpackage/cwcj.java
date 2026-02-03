package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcj extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cwcn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwcj(cwcn cwcnVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = cwcnVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cwcj cwcjVar = new cwcj(this.d, (fcxy) obj4);
        cwcjVar.a = (ekgb) obj;
        cwcjVar.b = (ResolvedRecipient) obj2;
        cwcjVar.c = (cwen) obj3;
        return cwcjVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        final ?? r4 = obj2 == null ? (ResolvedRecipient) fcva.P(r1) : obj2;
        if (r4 == 0) {
            return null;
        }
        if ((obj2 == null && ((ekgb) r1).size() > 1) || obj3 == cwen.e || r4.A() || r4.z() || r4.D()) {
            return null;
        }
        final cwcn cwcnVar = this.d;
        String string = cwcnVar.a.getString(R.string.action_add_contact);
        string.getClass();
        return new dihq(string, djrr.cX, false, false, false, false, null, false, null, new fdae() { // from class: cwci
            @Override // defpackage.fdae
            public final Object invoke() {
                cwcnVar.b.h(new agfu(r4));
                return fctx.a;
            }
        }, 1020);
    }
}
