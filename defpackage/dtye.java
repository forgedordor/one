package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtye implements ple, dtxs {
    public final Executor a;
    public final ea b;
    public final dtxt c;
    public RecyclerView d;
    public SwipeRefreshLayout e;
    public TextView f;
    public dtxb g;
    public EditText h;

    public dtye(ea eaVar, Executor executor, dtxt dtxtVar) {
        this.c = dtxtVar;
        this.b = eaVar;
        this.a = executor;
    }

    @Override // defpackage.dtxs
    public final void a(final String str) {
        this.b.fg().runOnUiThread(new Runnable() { // from class: dtyd
            @Override // java.lang.Runnable
            public final void run() {
                dtye dtyeVar = this.a;
                dtyeVar.d.setVisibility(8);
                dtyeVar.f.setVisibility(0);
                dtyeVar.f.setText(str);
            }
        });
    }
}
