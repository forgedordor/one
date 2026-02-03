package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ide {
    public final View a;
    public final idp b;
    public final AutofillManager c;
    public AutofillId d;

    public ide(View view, idp idpVar) {
        this.a = view;
        this.b = idpVar;
        AutofillManager autofillManagerM139m = akc$$ExternalSyntheticApiModelOutline0.m139m(view.getContext().getSystemService(akc$$ExternalSyntheticApiModelOutline0.m143m()));
        if (autofillManagerM139m == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManagerM139m;
        view.setImportantForAutofill(1);
        Object obj = jqg.a(view).a;
        if (obj != null) {
            this.d = iy$$ExternalSyntheticApiModelOutline1.m511m(obj);
        } else {
            itw.b("Required value was null.");
            throw new fcta();
        }
    }
}
