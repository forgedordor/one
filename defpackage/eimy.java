package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimy {
    public int a = -1;
    private final aer b;
    private final einm c;
    private final eimu d;
    private CharSequence e;

    public eimy(Context context, einm einmVar, ejwi ejwiVar) {
        this.b = new aer(context, context.getTheme());
        this.c = einmVar;
        this.d = (eimu) ejwiVar.e(new eimv());
    }

    public final iv a() {
        iu iuVarA = this.d.a(this.b);
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            iuVarA.c(charSequence);
        }
        int i = this.a;
        if (i != -1) {
            iuVarA.setPositiveButton(i, new einh(this.c, new eimx()));
        }
        return iuVarA.create();
    }

    public final void b(CharSequence charSequence) {
        ejwl.m(this.e == null, "Cannot set message multiple times.");
        ejwl.b(!TextUtils.isEmpty(charSequence), "Cannot set an empty message.");
        this.e = charSequence;
    }
}
