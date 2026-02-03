package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfg implements fdev {
    final /* synthetic */ ViewGroup a;

    public lfg(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new lec(new lfd(this.a).a(), lfe.a);
    }
}
