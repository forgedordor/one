package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cuoo {
    protected final Context a;
    protected String b;
    protected CharSequence[] c;
    protected int d;
    protected int e = -1;
    protected iv f;

    protected cuoo(Context context) {
        this.a = context;
    }

    protected abstract void b(int i);

    protected void c() {
        if (this.f != null) {
            d();
        }
        eeji eejiVar = new eeji(this.a);
        eejiVar.t(this.c, this.d, new cuom(this));
        eejiVar.v(this.b);
        eejiVar.m(R.string.cancel, null);
        iv ivVarCreate = eejiVar.create();
        this.f = ivVarCreate;
        ivVarCreate.setOnShowListener(new cuon(this));
        this.f.show();
    }

    protected final void d() {
        iv ivVar = this.f;
        if (ivVar != null) {
            ivVar.dismiss();
            this.f = null;
        }
    }
}
