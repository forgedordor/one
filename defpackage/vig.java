package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vig extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ vij c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vig(vij vijVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vijVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        vig vigVar = new vig(this.c, (fcxy) obj3);
        vigVar.a = (zqw) obj;
        vigVar.b = zBooleanValue;
        return vigVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final zqw zqwVar = (zqw) this.a;
        List list = zqwVar.a;
        boolean z = this.b;
        if (list.size() != 1 || z) {
            return null;
        }
        final vij vijVar = this.c;
        String string = vijVar.a.getString(R.string.message_context_menu_view_details);
        string.getClass();
        return new dihq(string, null, false, true, true, false, null, false, null, new fdae() { // from class: vif
            @Override // defpackage.fdae
            public final Object invoke() {
                vijVar.c((ajlt) fcva.X(zqwVar.a));
                return fctx.a;
            }
        }, 998);
    }
}
