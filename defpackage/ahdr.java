package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.welcome.v1.SignedInWelcomeActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahdr extends fcyz implements fdat {
    final /* synthetic */ ahds a;
    final /* synthetic */ ea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdr(ahds ahdsVar, ea eaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahdsVar;
        this.b = eaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahdr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ahds ahdsVar = this.a;
        davn davnVar = (davn) ahdsVar.e.b();
        ctcj ctcjVar = ctcj.WELCOME_FLOW_SETTINGS;
        davnVar.a(ctcjVar);
        ea eaVar = this.b;
        Intent intent = new Intent(eaVar.A(), (Class<?>) SignedInWelcomeActivity.class);
        efyp.c(intent, ahdsVar.b);
        intent.putExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", ctcjVar.g);
        eilp.a(eaVar, intent);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahdr(this.a, this.b, fcxyVar);
    }
}
