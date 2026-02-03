package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfd implements fdev {
    final /* synthetic */ ViewGroup a;

    public lfd(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new lff(this.a);
    }
}
