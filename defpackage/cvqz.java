package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqz extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvra c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvqz(cvra cvraVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cvraVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvqz cvqzVar = new cvqz(this.c, (fcxy) obj3);
        cvqzVar.a = (ekgb) obj;
        cvqzVar.b = (ajlk) obj2;
        return cvqzVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r5 = this.a;
        ?? r0 = this.b;
        aoer aoerVarH = r0.h();
        return new cvrc(aoerVarH != null && aoerVarH.y() && r0.c() == ajlj.ONE_ON_ONE && !r5.isEmpty() && ((ResolvedRecipient) ((ekgb) r5).get(0)).g().C(), !r5.isEmpty() ? (ResolvedRecipient) ((ekgb) r5).get(0) : null);
    }
}
