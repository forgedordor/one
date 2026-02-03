package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.messaging.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyv extends dtys implements dtxr {
    public dtws a;
    public eosc b;
    private dtxy c;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final dtye dtyeVar = this.c.b;
        ea eaVar = dtyeVar.b;
        Executor executor = dtyeVar.a;
        View viewInflate = layoutInflater.inflate(R.layout.mdd_debug_list_fragment, viewGroup, false);
        dtyeVar.g = new dtxb(eaVar.z(), executor);
        dtxb dtxbVar = dtyeVar.g;
        dtxt dtxtVar = dtyeVar.c;
        dtxbVar.e = new dtya(dtxtVar);
        dtyeVar.f = (TextView) viewInflate.findViewById(R.id.file_group_list_status_text);
        dtyeVar.e = (SwipeRefreshLayout) viewInflate.findViewById(R.id.pull_to_refresh);
        SwipeRefreshLayout swipeRefreshLayout = dtyeVar.e;
        swipeRefreshLayout.a = dtyeVar;
        swipeRefreshLayout.setEnabled(true);
        dtyeVar.d = (RecyclerView) viewInflate.findViewById(R.id.file_group_list);
        dtyeVar.d.aK();
        dtyeVar.d.ao(new LinearLayoutManager());
        dtyeVar.d.al(dtyeVar.g);
        dtyeVar.h = (EditText) viewInflate.findViewById(R.id.filter);
        dtyeVar.h.addTextChangedListener(new dtxw((dtxx) dtxtVar, new fcsu() { // from class: dtyb
            @Override // defpackage.fcsu
            public final Object b() {
                return Boolean.valueOf(dtyeVar.b.Z.c.a(lvb.d));
            }
        }));
        return viewInflate;
    }

    @Override // defpackage.dtxr
    public final dtxy a() {
        return this.c;
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        dtxx dtxxVar = new dtxx(this, this.a, this.b);
        dtye dtyeVar = new dtye(this, this.b, dtxxVar);
        dtxy dtxyVar = new dtxy(dtyeVar, dtxxVar);
        this.c = dtxyVar;
        final dtxx dtxxVar2 = (dtxx) dtxyVar.a;
        dtxxVar2.h = dtyeVar;
        ea eaVar = dtxxVar2.d;
        dtxxVar2.f = ejtj.b(eaVar);
        dtxxVar2.f.d(R.id.list_fragment_action_callback, dtxxVar2.b);
        dtxxVar2.g = (dtxq) new lxo(eaVar, new dtxp(dtxxVar2.e, dtxxVar2.c)).a(dtxq.class);
        dtxq dtxqVar = dtxxVar2.g;
        AtomicReference atomicReference = dtxqVar.c;
        int i = ekgb.d;
        lvy lvyVar = new lvy(ekoe.a);
        while (true) {
            if (atomicReference.compareAndSet(null, lvyVar)) {
                dtxqVar.a();
                break;
            } else if (atomicReference.get() != null) {
                break;
            }
        }
        lvy lvyVar2 = (lvy) atomicReference.get();
        lvyVar2.getClass();
        lvyVar2.f(eaVar, new lvz() { // from class: dtxu
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ekgb ekgbVarN = ekgb.n((ekgb) obj);
                dtxs dtxsVar = dtxxVar2.h;
                if (dtxsVar != null) {
                    final dtye dtyeVar2 = (dtye) dtxsVar;
                    dtyeVar2.g.c(ekgbVarN);
                    if (ekgbVarN.isEmpty()) {
                        dtyeVar2.a("No Tracked File Groups\n(You may need to force refresh tracked file groups)");
                    } else {
                        dtyeVar2.b.fg().runOnUiThread(new Runnable() { // from class: dtxz
                            @Override // java.lang.Runnable
                            public final void run() {
                                dtye dtyeVar3 = dtyeVar2;
                                dtyeVar3.d.setVisibility(0);
                                dtyeVar3.f.setVisibility(8);
                            }
                        });
                    }
                }
            }
        });
    }
}
