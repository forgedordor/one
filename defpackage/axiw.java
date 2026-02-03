package defpackage;

import android.service.chooser.ChooserTargetService;
import com.google.android.apps.messaging.shared.datamodel.BugleChooserTargetService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class axiw extends ChooserTargetService implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            BugleChooserTargetService bugleChooserTargetService = (BugleChooserTargetService) this;
            ahkn ahknVar = ((ahij) bb()).b;
            bugleChooserTargetService.a = ahknVar.da;
            bugleChooserTargetService.b = ahknVar.a.pB;
            ahng ahngVar = ahknVar.b;
            bugleChooserTargetService.c = ahngVar.dJ;
            bugleChooserTargetService.d = ahngVar.dK;
        }
        super.onCreate();
    }
}
