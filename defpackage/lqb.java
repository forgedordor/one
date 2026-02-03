package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqb implements lqc {
    public lqu a;

    public lqb(lqu lquVar) {
        this.a = lquVar;
    }

    @Override // defpackage.lqc
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.lqc
    public final boolean b(CharSequence charSequence, int i, int i2, lqq lqqVar) {
        if ((lqqVar.c & 4) <= 0) {
            if (this.a == null) {
                this.a = new lqu(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(new lqr(lqqVar), i, i2, 33);
        }
        return true;
    }
}
