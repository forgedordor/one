package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class se extends sd {
    final /* synthetic */ AppCompatTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.b = appCompatTextView;
    }

    @Override // defpackage.sd
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.sd
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
