package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kwk {
    protected kvq g;
    CharSequence h;
    public CharSequence i;
    public boolean j = false;

    protected String a() {
        throw null;
    }

    public void b(kux kuxVar) {
        throw null;
    }

    protected void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("android.support.v4.app.extra.COMPAT_TEMPLATE");
    }

    protected void d(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.i = bundle.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle.getCharSequence("android.title.big");
    }

    public final void i(kvq kvqVar) {
        if (this.g != kvqVar) {
            this.g = kvqVar;
            if (kvqVar != null) {
                kvqVar.u(this);
            }
        }
    }

    public void j(Bundle bundle) {
        if (this.j) {
            bundle.putCharSequence("android.summaryText", this.i);
        }
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a());
    }

    public void k() {
    }
}
