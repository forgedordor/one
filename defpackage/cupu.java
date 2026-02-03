package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupu extends cuoo {
    private final cmum g;
    private final cuty h;
    private final cuur i;
    private cuuq j;

    /* compiled from: PG */
    final class a implements einb {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    public cupu(cmum cmumVar, Context context, cuur cuurVar, cuty cutyVar, int i) {
        super(context);
        this.i = cuurVar;
        this.h = cutyVar;
        this.e = i;
        this.g = cmumVar;
    }

    @Override // defpackage.cuoo
    protected final void b(int i) {
        this.f.getClass();
        einf.f(new a(i == 1), this.h.ao);
        d();
    }

    @Override // defpackage.cuoo
    protected final void c() {
        if (this.j == null) {
            this.j = this.i.a(this.e);
        }
        cuud cuudVarA = this.j.a();
        boolean zBooleanValue = ((Boolean) ((cuudVarA.b & 64) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.i)) : Optional.empty()).orElse(Boolean.valueOf(this.g.a(this.e).l()))).booleanValue();
        Context context = this.a;
        CharSequence[] charSequenceArr = {context.getString(R.string.disable_group_mms), context.getString(R.string.enable_group_mms)};
        this.b = context.getString(R.string.group_mms_pref_title);
        this.c = charSequenceArr;
        this.d = zBooleanValue ? 1 : 0;
        this.e = this.e;
        super.c();
    }
}
