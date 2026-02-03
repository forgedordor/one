package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daev extends dadh {
    public final dabl h;
    List i;
    private final lvc j;
    private final fcsu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daev(Context context, dacu dacuVar, fcsu fcsuVar, dabl dablVar, fcsu fcsuVar2, lvj lvjVar, dafl daflVar, boolean z) {
        super(context, dacuVar, daflVar, fcsuVar, z);
        lvc lvcVarP = lvjVar.P();
        this.i = new ArrayList();
        this.j = lvcVarP;
        this.h = dablVar;
        this.k = fcsuVar2;
    }

    @Override // defpackage.dadh
    protected final wv F(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != ((asgw) this.k.b()).a() ? R.layout.zero_state_search_location_result_item_v2 : R.layout.zero_state_search_location_result_item_coolranch, viewGroup, false);
        final daeu daeuVar = new daeu(this.a, viewInflate, this.j);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: daes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                daev daevVar = this.a;
                daevVar.d.u(new dabq(5, daeuVar.ft() - daevVar.g));
                ((dabm) daevVar.e.b()).e(5);
                daevVar.h.f(6, 6);
            }
        });
        return daeuVar;
    }

    @Override // defpackage.dadh
    protected final void G(wv wvVar, int i) {
        daeu daeuVar = (daeu) wvVar;
        daeuVar.C();
        dacs dacsVar = (dacs) this.i.get(i);
        daeuVar.C();
        dacsVar.n();
        daeuVar.t = dacsVar;
        daeuVar.s.b(dacsVar);
    }

    public final void M(List list) {
        eieu eieuVarK = eiiy.k("LocationsAdapter#updateResults");
        try {
            int i = ((ekoe) list).c;
            H(i);
            int i2 = this.g;
            if (!list.isEmpty() || !this.i.isEmpty()) {
                if (list.isEmpty()) {
                    int size = this.i.size();
                    this.i = list;
                    x(i2, size);
                } else if (this.i.isEmpty()) {
                    this.i = list;
                    w(i2, i);
                } else if (this.i.size() != i || J()) {
                    this.i = list;
                    p();
                } else {
                    this.i = list;
                    u(i2, i);
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dadh, defpackage.vo
    public final void k(wv wvVar) {
        super.k(wvVar);
        if (wvVar instanceof daeu) {
            ((daeu) wvVar).C();
        }
    }

    @Override // defpackage.dadh
    protected final int l() {
        return this.i.size();
    }
}
