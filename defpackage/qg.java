package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qg extends tu {
    final /* synthetic */ ActivityChooserView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(ActivityChooserView activityChooserView, View view) {
        super(view);
        this.a = activityChooserView;
    }

    @Override // defpackage.tu
    public final ot a() {
        return this.a.a();
    }

    @Override // defpackage.tu
    protected final boolean b() {
        this.a.e();
        return true;
    }

    @Override // defpackage.tu
    protected final boolean c() {
        this.a.d();
        return true;
    }
}
