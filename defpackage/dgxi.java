package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgxi extends dgvq {
    public final CopyOnWriteArrayList g;
    public dgxm h;

    public dgxi(dfys dfysVar, dgwg dgwgVar, dgxm dgxmVar, dhjt dhjtVar) {
        super(dfysVar, dgwgVar, dhjtVar);
        this.g = new CopyOnWriteArrayList();
        this.h = dgxmVar;
    }

    public final void p(dgxg dgxgVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList.contains(dgxgVar)) {
            dhja.c("Listener is already registered!", new Object[0]);
        } else {
            copyOnWriteArrayList.add(dgxgVar);
        }
    }

    protected final boolean r() {
        InstantMessageConfiguration instantMessageConfigurationD = this.a.d();
        ebkr ebkrVar = dhjv.a;
        return instantMessageConfigurationD.a();
    }

    public abstract void s(String str, long j, String str2);

    public abstract void t(String str);

    public void q(ebqr ebqrVar) {
    }
}
