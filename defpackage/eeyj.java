package defpackage;

import android.os.RemoteException;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyj extends eezo {
    final /* synthetic */ defr a;
    final /* synthetic */ String b;
    final /* synthetic */ eeyn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeyj(eeyn eeynVar, defr defrVar, defr defrVar2, String str) {
        super(defrVar);
        this.a = defrVar2;
        this.b = str;
        this.c = eeynVar;
    }

    @Override // defpackage.eezo
    protected final void a() {
        try {
            eeyn eeynVar = this.c;
            ((IAppUpdateService) eeynVar.b.n).completeUpdate(eeynVar.c, eeyn.b(), new eeyl(eeynVar, this.a));
        } catch (RemoteException e) {
            eeyn.a.c(e, "completeUpdate(%s)", this.b);
            this.a.c(new RuntimeException(e));
        }
    }
}
