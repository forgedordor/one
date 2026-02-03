package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayy implements ServiceConnection {
    final /* synthetic */ aaza a;

    public aayy(aaza aazaVar) {
        this.a = aazaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final DiagnosticsFragment diagnosticsFragment;
        eg egVarG;
        aaza.a.q("Diagnostics service connected");
        aaza aazaVar = this.a;
        aaze aazeVar = (aaze) aazaVar.d.b();
        aayz aayzVar = aazaVar.h;
        if (aayzVar != null && (egVarG = (diagnosticsFragment = (DiagnosticsFragment) aayzVar).G()) != null) {
            egVarG.runOnUiThread(new Runnable() { // from class: abcc
                @Override // java.lang.Runnable
                public final void run() {
                    DiagnosticsFragment diagnosticsFragment2 = diagnosticsFragment;
                    diagnosticsFragment2.c.setEnabled(false);
                    diagnosticsFragment2.b.setEnabled(false);
                }
            });
        }
        aazaVar.e.c();
        List<abai> listA = aazaVar.a();
        final aayx aayxVar = new aayx(aazaVar);
        for (final abai abaiVar : listA) {
            abaiVar.getClass();
            auwa.a(new Runnable() { // from class: aazc
                @Override // java.lang.Runnable
                public final void run() {
                    abai abaiVar2 = abaiVar;
                    if (abaiVar2.d) {
                        abaiVar2.b(2);
                        abaj abajVarA = abaiVar2.a();
                        abaiVar2.c(abajVarA.c, abajVarA.b);
                    } else {
                        abak abakVarA = abaiVar2.a.a();
                        abakVarA.I("skipping");
                        abakVarA.I(abaiVar2.b);
                        abakVarA.r();
                    }
                }
            }, aazeVar.a);
        }
        auwa.a(new Runnable() { // from class: aazd
            @Override // java.lang.Runnable
            public final void run() {
                final DiagnosticsFragment diagnosticsFragment2;
                eg egVarG2;
                aaza aazaVar2 = aayxVar.a;
                aayz aayzVar2 = aazaVar2.h;
                if (aayzVar2 != null && (egVarG2 = (diagnosticsFragment2 = (DiagnosticsFragment) aayzVar2).G()) != null) {
                    egVarG2.runOnUiThread(new Runnable() { // from class: abcb
                        @Override // java.lang.Runnable
                        public final void run() {
                            DiagnosticsFragment diagnosticsFragment3 = diagnosticsFragment2;
                            diagnosticsFragment3.c.setEnabled(true);
                            diagnosticsFragment3.b.setEnabled(true);
                            diagnosticsFragment3.b.setVisibility(0);
                        }
                    });
                }
                if (aazaVar2.g) {
                    aazaVar2.b.unbindService(aazaVar2.f);
                    aazaVar2.g = false;
                }
            }
        }, aazeVar.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        aaza.a.q("Diagnostics service disconnected");
    }
}
