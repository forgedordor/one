package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvb extends cuoo {
    protected final int g;
    private final crqv h;

    public cuvb(crqv crqvVar, Context context, int i) {
        super(context);
        this.h = crqvVar;
        this.g = crqvVar.d(context.getString(R.string.rcs_default_sharing_method_key), i != 1 ? 0 : i);
    }

    @Override // defpackage.cuoo
    protected final void b(int i) {
        this.h.j(this.a.getString(R.string.rcs_default_sharing_method_key), i);
        d();
    }

    @Override // defpackage.cuoo
    protected final void c() {
        Context context = this.a;
        this.b = context.getString(R.string.rcs_default_sharing_method_title);
        this.c = context.getResources().getStringArray(R.array.rcs_default_sharing_method_options);
        this.d = this.g;
        super.c();
    }
}
