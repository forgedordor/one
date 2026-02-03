package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxd {
    public final Context a;
    public final Handler b;
    public final mxa c;
    public final BroadcastReceiver d;
    public final mxb e;
    public mwz f;
    public mxe g;
    public mac h;
    public boolean i;
    private final myi j;

    public mxd(Context context, myi myiVar, mac macVar, mxe mxeVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = myiVar;
        this.h = macVar;
        this.g = mxeVar;
        Handler handlerF = mgb.F();
        this.b = handlerF;
        this.c = new mxa(this);
        this.d = new mxc(this);
        Uri uriFor = mwz.d() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.e = uriFor != null ? new mxb(this, handlerF, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(mwz mwzVar) {
        mtj mtjVar;
        if (!this.i || mwzVar.equals(this.f)) {
            return;
        }
        this.f = mwzVar;
        myx myxVar = this.j.a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = myxVar.Q;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(a.d(looper == null ? "null" : looper.getThread().getName(), looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), "Current looper (", ") is not the playback looper (", ")"));
        }
        mwz mwzVar2 = myxVar.q;
        if (mwzVar2 == null || mwzVar.equals(mwzVar2)) {
            return;
        }
        myxVar.q = mwzVar;
        mza mzaVar = myxVar.W;
        if (mzaVar != null) {
            mzb mzbVar = mzaVar.a;
            synchronized (mzbVar.a) {
                mtjVar = mzbVar.i;
            }
            if (mtjVar != null) {
                synchronized (((nid) mtjVar).b) {
                    boolean z = ((nid) mtjVar).d.U;
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        mxe mxeVar = this.g;
        if (Objects.equals(audioDeviceInfo, mxeVar == null ? null : mxeVar.a)) {
            return;
        }
        mxe mxeVar2 = audioDeviceInfo != null ? new mxe(audioDeviceInfo) : null;
        this.g = mxeVar2;
        a(mwz.b(this.a, this.h, mxeVar2));
    }
}
