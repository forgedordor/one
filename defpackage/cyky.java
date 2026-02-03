package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.messaging.ui.debug.workqueue.pwqui.PwqDebugUiActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyky extends fcyz implements fdat {
    final /* synthetic */ cylf a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyky(cylf cylfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cylfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyky) c((cyfv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Activity activity = ((cyfv) this.b).a;
        eiid.o(activity, new Intent(activity, (Class<?>) PwqDebugUiActivity.class));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cyky cykyVar = new cyky(this.a, fcxyVar);
        cykyVar.b = obj;
        return cykyVar;
    }
}
