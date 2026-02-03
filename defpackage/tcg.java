package defpackage;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.G1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tcg extends Service implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyho(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            GoogleOneRestoreService googleOneRestoreService = (GoogleOneRestoreService) this;
            ahkn ahknVar = ((ahij) bb()).b;
            ahkn ahknVar2 = ahknVar.b.a;
            Context context = (Context) ahknVar2.t.b();
            final dcer dcerVarC = dcer.c((Context) ahknVar2.t.b());
            dcerVarC.getClass();
            googleOneRestoreService.b = new G1Restore(context, new ecpb() { // from class: ecpc
                @Override // defpackage.ecpb
                public final void a(int i) {
                    dcer dcerVar = dcerVarC;
                    try {
                        dcerVar.b(i).c();
                    } catch (SecurityException e) {
                        dcerVar.b(i).c();
                        Log.e("GoogleSignatureVerifier", "flaky result", e);
                    }
                }
            }, (ecpa) ejwi.j(new tce()).d(new ejxr() { // from class: ecpd
                @Override // defpackage.ejxr
                public final Object get() {
                    return G1Restore.defaultConfig();
                }
            }));
            ahnh ahnhVar = ahknVar.a;
            googleOneRestoreService.c = (ains) ahnhVar.c.b();
            googleOneRestoreService.d = ahnhVar.Cp;
        }
        super.onCreate();
    }
}
