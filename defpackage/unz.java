package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unz extends vo {
    private final unw a;

    public unz(unw unwVar) {
        this.a = unwVar;
    }

    @Override // defpackage.vo
    public final int a() {
        throw null;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reaction_instance, viewGroup, false);
        unw unwVar = this.a;
        ((cssf) unwVar.a.b()).getClass();
        ((ehrb) unwVar.b.b()).getClass();
        viewInflate.getClass();
        return new unv(viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        throw null;
    }
}
