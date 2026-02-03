package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzl extends Handler {
    final /* synthetic */ mzp a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzl(mzp mzpVar, Looper looper) {
        super(looper);
        this.a = mzpVar;
    }

    final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new mzm(nee.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws nbb {
        Exception excC;
        mzm mzmVar = (mzm) message.obj;
        try {
            int i = message.what;
            String str = null;
            if (i == 1) {
                naz nazVar = this.a.i;
                nau nauVar = (nau) mzmVar.d;
                excC = naq.c(((mhx) nazVar.a).a(), a.q(mgb.J(nauVar.a), nauVar.b, "&signedRequest="), null, Collections.EMPTY_MAP);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                mzp mzpVar = this.a;
                naz nazVar2 = mzpVar.i;
                UUID uuid = mzpVar.c;
                nat natVar = (nat) mzmVar.d;
                String str2 = natVar.b;
                if (true != TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    mhs mhsVar = new mhs();
                    mhsVar.a = Uri.EMPTY;
                    mhsVar.a();
                    throw new nbb(new IllegalStateException("No license URL"));
                }
                HashMap map = new HashMap();
                UUID uuid2 = maf.e;
                map.put(ffho.a, uuid2.equals(uuid) ? "text/xml" : maf.c.equals(uuid) ? "application/json" : "application/octet-stream");
                if (uuid2.equals(uuid)) {
                    map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                }
                Map map2 = nazVar2.b;
                synchronized (map2) {
                    map.putAll(map2);
                }
                excC = naq.c(((mhx) nazVar2.a).a(), str, natVar.a, map);
            }
        } catch (nbb e) {
            mzm mzmVar2 = (mzm) message.obj;
            if (mzmVar2.b) {
                int i2 = mzmVar2.e + 1;
                mzmVar2.e = i2;
                if (i2 <= nix.a(3)) {
                    int i3 = nee.a;
                    long j = mzmVar2.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long j2 = mzmVar2.c;
                    long jB = nix.b(new niy(e.getCause() instanceof IOException ? (IOException) e.getCause() : new mzo(e.getCause()), mzmVar2.e));
                    if (jB != -9223372036854775807L) {
                        synchronized (this) {
                            if (!this.b) {
                                sendMessageDelayed(Message.obtain(message), jB);
                                return;
                            }
                        }
                    }
                }
            }
            excC = e;
        } catch (Exception e2) {
            mff.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            excC = e2;
        }
        long j3 = mzmVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.d.obtainMessage(message.what, Pair.create(mzmVar.d, excC)).sendToTarget();
            }
        }
    }
}
