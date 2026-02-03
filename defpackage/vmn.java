package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmn extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vmo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmn(vmo vmoVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vmoVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vmn vmnVar = new vmn(this.c, (fcxy) obj3);
        vmnVar.a = (ajlk) obj;
        vmnVar.b = (Recipient) obj2;
        return vmnVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final vmo vmoVar = this.c;
        Context context = vmoVar.a;
        final ?? r3 = this.a;
        final ?? r4 = this.b;
        String string = context.getString(R.string.send_message);
        string.getClass();
        return new dihq(string, djrr.bv, false, false, false, false, null, false, null, new fdae() { // from class: vml
            @Override // defpackage.fdae
            public final Object invoke() {
                ajlk ajlkVar = r3;
                vmo vmoVar2 = vmoVar;
                auvw.k(vmoVar2.b, null, null, new vmm(r4, ajlkVar, vmoVar2, null), 3);
                return fctx.a;
            }
        }, 996);
    }
}
