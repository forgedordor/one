package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuyy extends cqdj {
    private final Resources a;
    private final int b;
    private final crny c;
    private final bbdl k;
    private final cgbn l;

    public cuyy(crny crnyVar, bbdl bbdlVar, cgbn cgbnVar, Resources resources, int i) {
        super("Bugle.Async.SimFullReceiver.handleSimFull.Duration");
        this.a = resources;
        this.k = bbdlVar;
        this.c = crnyVar;
        this.l = cgbnVar;
        this.b = i;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        int iA = this.b;
        if (iA == -1) {
            iA = this.c.j().a();
        }
        if (this.c.a() <= 1) {
            return null;
        }
        String strG = this.k.f(iA).g();
        if (strG != null) {
            return this.a.getString(R.string.sim_specific_settings, strG);
        }
        cqca.n("Bugle", "subscriptionName is empty");
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        this.l.z(this.b, (String) obj);
    }
}
