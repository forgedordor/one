package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfl extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ vfn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfl(vfn vfnVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = vfnVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        vfl vflVar = new vfl(this.f, (fcxy) obj6);
        vflVar.a = (ekgb) obj;
        vflVar.b = (ajlk) obj2;
        vflVar.c = (Recipient) obj3;
        vflVar.d = (cljh) obj4;
        vflVar.e = (aoff) obj5;
        return vflVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r10 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        boolean z = r1 != 0 && r1.g().q();
        vfn vfnVar = this.f;
        boolean z2 = !((aqtu) vfnVar.c.b()).a() ? ((cljh) obj2).b() : ((aoff) obj3).a();
        if (z) {
            r1.getClass();
            ekgb ekgbVarR = ekgb.r((ResolvedRecipient) r1);
            ekgbVarR.getClass();
            return vfnVar.c(ekgbVarR, false, z2);
        }
        if (r0.c() != ajlj.ONE_ON_ONE || r10.isEmpty()) {
            return null;
        }
        ekgb ekgbVar = (ekgb) r10;
        if (((ResolvedRecipient) ekgbVar.get(0)).g().q()) {
            return vfnVar.c(ekgbVar, true, z2);
        }
        return null;
    }
}
