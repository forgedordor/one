package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyff extends dyga {
    private ViewGroup A;

    public dyff(ViewGroup viewGroup, Context context, dyyb dyybVar) {
        super(viewGroup, context, dyybVar);
    }

    private static final void H(dyfe dyfeVar) {
        throw null;
    }

    @Override // defpackage.dyfr
    /* renamed from: C */
    protected final /* bridge */ /* synthetic */ void H(lvj lvjVar, dyfk dyfkVar) {
        dyfe dyfeVar = (dyfe) dyfkVar;
        ViewGroup viewGroup = this.A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            H(dyfeVar);
        }
        super.G(lvjVar, dyfeVar);
    }

    @Override // defpackage.dyga
    protected final void D(ViewGroup viewGroup) {
        this.A = viewGroup;
        dyfk dyfkVar = this.x;
        if (dyfkVar == null) {
            return;
        }
        H((dyfe) dyfkVar);
    }
}
