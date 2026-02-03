package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class veq extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public veq(ver verVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = verVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        veq veqVar = new veq(this.d, (fcxy) obj4);
        veqVar.a = (ekgb) obj;
        veqVar.b = (ajlk) obj2;
        veqVar.c = (xvc) obj3;
        return veqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        ?? r2 = this.b;
        Object obj2 = this.c;
        if (r2.z() || r2.c() != ajlj.ONE_ON_ONE || r1.isEmpty() || ((ResolvedRecipient) fcva.X(r1)).A() || obj2 == null) {
            return null;
        }
        final ver verVar = this.d;
        if (!verVar.c.e) {
            return null;
        }
        String string = verVar.a.getString(R.string.action_add_contact);
        string.getClass();
        final xvc xvcVar = (xvc) obj2;
        final ekgb ekgbVar = (ekgb) r1;
        return new dihq(string, null, false, true, false, false, null, false, null, new fdae() { // from class: vep
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objX = fcva.X(ekgbVar);
                objX.getClass();
                verVar.b.h(new agfu((ResolvedRecipient) objX, xvcVar));
                return fctx.a;
            }
        }, 1014);
    }
}
