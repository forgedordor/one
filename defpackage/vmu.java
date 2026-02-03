package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmu extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ vmv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmu(vmv vmvVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vmvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        vmu vmuVar = new vmu(this.c, (fcxy) obj3);
        vmuVar.a = (zqw) obj;
        vmuVar.b = zBooleanValue;
        return vmuVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final zqw zqwVar = (zqw) this.a;
        List list = zqwVar.a;
        boolean z = this.b;
        if (list.size() != 1 || !vmw.e(((ajlt) fcva.X(list)).g()) || z || !vmw.d((ajlt) fcva.X(list))) {
            return null;
        }
        final vmv vmvVar = this.c;
        String string = vmvVar.a.getString(R.string.action_share);
        string.getClass();
        return new dihq(string, null, false, true, false, false, null, false, null, new fdae() { // from class: vmt
            @Override // defpackage.fdae
            public final Object invoke() {
                vmvVar.d((ajlt) fcva.X(zqwVar.a));
                return fctx.a;
            }
        }, 1014);
    }
}
