package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbr extends vo {
    public final fdae a;
    private final dnhb d;

    public dnbr(dnhb dnhbVar, fdae fdaeVar) {
        this.d = dnhbVar;
        this.a = fdaeVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return l() ? 1 : 0;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 6;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.select_media_permission_request_banner, viewGroup, false);
        viewInflate.getClass();
        return new dnbq(this, viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dnbq dnbqVar = (dnbq) wvVar;
        dnbqVar.getClass();
        final dnbr dnbrVar = dnbqVar.t;
        dnbqVar.s.setOnClickListener(new View.OnClickListener() { // from class: dnbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dnbq.u;
                this.a.a.invoke();
            }
        });
    }

    public final boolean l() {
        return this.d.d(dngy.h);
    }
}
