package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcj implements fhbn {
    final /* synthetic */ fdis a;

    public fhcj(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, Throwable th) {
        this.a.w(fctl.a(th));
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, fhdv fhdvVar) {
        if (!fhdvVar.c()) {
            this.a.w(fctl.a(new fhcc(fhdvVar)));
            return;
        }
        Object obj = fhdvVar.b;
        if (obj != null) {
            this.a.w(obj);
            return;
        }
        Object objCast = fhch.class.cast(fhbkVar.a().e.get(fhch.class));
        objCast.getClass();
        Method method = ((fhch) objCast).a;
        this.a.w(fctl.a(new fctb("Response from " + method.getDeclaringClass().getName() + "." + method.getName() + " was null but response body type was declared as non-null")));
    }
}
