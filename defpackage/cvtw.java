package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvtw extends cvtx {
    public static final ejxr a = cdag.v("no_connection_bottom_bar_enable_ui");
    public final fcsu b;
    public final fcsu c;
    public final cvtt d;
    public final b e = new b();

    /* compiled from: PG */
    public final class a implements einb {
    }

    public cvtw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        cvtu cvtuVar = (cvtu) fcsuVar2.b();
        lvn lvnVar = ((cvtv) fcsuVar.b()).a;
        egyt egytVar = (egyt) cvtuVar.a.b();
        egytVar.getClass();
        eosc eoscVar = (eosc) cvtuVar.b.b();
        eoscVar.getClass();
        ((cqbm) cvtuVar.c.b()).getClass();
        ((egzh) cvtuVar.d.b()).getClass();
        ((axnl) cvtuVar.e.b()).getClass();
        lvnVar.getClass();
        this.d = new cvtt(egytVar, eoscVar);
        this.c = fcsuVar3;
    }

    /* compiled from: PG */
    final class b implements egzv<cvts> {
        public b() {
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            View viewFindViewById = ((cvtv) cvtw.this.b.b()).N().findViewById(R.id.bottom_bar_container);
            boolean zA = ((cvts) obj).a();
            if (((Boolean) ((cczi) cvtw.a.get()).e()).booleanValue() && zA) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
            einf.g(new a(), viewFindViewById);
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
        }
    }
}
