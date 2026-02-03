package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edpj extends ea implements eyhy, eyhr {
    private ContextWrapper a;
    public boolean as;
    private boolean b;
    private volatile eyhj c;
    private final Object d;

    public edpj() {
        this.d = new Object();
        this.as = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = b(X()) ? eygr.a(super.z()) : true;
        }
    }

    private static final boolean b(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return !b(X()) ? super.R() : eygu.b(this, super.R());
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        t();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        t();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.eyhy
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new eyhj(this);
                }
            }
        }
        return this.c;
    }

    protected final void t() {
        if (b(X()) && !this.as) {
            this.as = true;
            DevicePhotosFragment devicePhotosFragment = (DevicePhotosFragment) this;
            ahib ahibVar = (ahib) bb();
            ahhk ahhkVar = ahibVar.c;
            devicePhotosFragment.a = ((edhg) ahhkVar.bN.b()).a();
            eyik eyikVar = ahhkVar.bR;
            ahng ahngVar = ahibVar.a.b;
            eyik eyikVar2 = ahhkVar.cj;
            eyik eyikVar3 = ahhkVar.cU;
            devicePhotosFragment.b = new edpi(eyikVar, ahngVar.jc, ahngVar.iZ, eyikVar2, eyikVar3);
            devicePhotosFragment.c = (eduu) ahhkVar.cT.b();
            devicePhotosFragment.d = (dswb) ahngVar.iZ.b();
            devicePhotosFragment.e = (dsvx) ahngVar.ja.b();
            devicePhotosFragment.ag = (dsvh) ahngVar.jc.b();
            devicePhotosFragment.ah = ahhkVar.ae();
            devicePhotosFragment.ai = (edmz) eyikVar2.b();
            devicePhotosFragment.aj = (edgv) ahhkVar.bC.b();
            devicePhotosFragment.ak = (edgm) eyikVar3.b();
            devicePhotosFragment.al = ahngVar.nO;
        }
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    edpj(int i) {
        super(i);
        this.d = new Object();
        this.as = false;
    }
}
