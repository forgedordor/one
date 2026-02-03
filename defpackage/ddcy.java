package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddcy implements ddcr {
    final /* synthetic */ InProductHelp a;
    final /* synthetic */ dddk b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ dcwa d;

    public ddcy(InProductHelp inProductHelp, dddk dddkVar, WeakReference weakReference, dcwa dcwaVar) {
        this.a = inProductHelp;
        this.b = dddkVar;
        this.c = weakReference;
        this.d = dcwaVar;
    }

    @Override // defpackage.ddcr
    public final void a(GoogleHelp googleHelp) {
        InProductHelp inProductHelp = this.a;
        inProductHelp.a = googleHelp;
        try {
            ((IGoogleHelpService) this.b.w()).processInProductHelpAndPip(inProductHelp, null, new ddda(this.c, this.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
        }
    }
}
