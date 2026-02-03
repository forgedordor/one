package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxd {
    public final dhfs a;

    public dgxd(dhfs dhfsVar) {
        this.a = dhfsVar;
    }

    public static ImsCapabilities a(ImsCapabilities imsCapabilities) {
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(imsCapabilities);
        long jCurrentTimeMillis = System.currentTimeMillis() + dgwx.a;
        long j = imsCapabilities2.e;
        if (j <= 0) {
            imsCapabilities2.e = 1L;
        }
        imsCapabilities2.f = jCurrentTimeMillis - j;
        return imsCapabilities2;
    }

    public static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("#=0.92");
        arrayList.add("#=1");
        if (dfnr.d()) {
            arrayList.add("#=1.2");
        }
        if (dflj.a()) {
            arrayList.add("#=0.93");
        }
        if (dflx.a()) {
            arrayList.add("#=1.9");
        }
        return dgwx.a(arrayList);
    }

    public static void c(ebqq ebqqVar, dgwx dgwxVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (dgwxVar.y() && !z) {
            arrayList.add("+g.oma.sip-im");
        }
        if (dgwxVar.v()) {
            arrayList.add("+g.3gpp.iari-ref=\"" + dgwxVar.b() + "\"");
        }
        if (dgwxVar.w(z)) {
            arrayList.add("+g.3gpp.icsi-ref=\"" + dgwxVar.c(z) + "\"");
        }
        if (dgwxVar.E()) {
            arrayList.add("video");
            arrayList.add("+g.gsma.rcs.ipcall");
            if (dgwxVar.H()) {
                arrayList.add("+g.gsma.rcs.ipvideocallonly");
            }
        } else if (dgwxVar.F()) {
            arrayList.add("+g.gsma.rcs.ipcall");
        }
        if (dgwxVar.u()) {
            arrayList.add("+g.jibe.stickers");
        }
        if (dfou.d() && dgwxVar.J()) {
            arrayList.add(b());
        }
        try {
            ebqqVar.q(ebql.g("Accept-Contact", a.a(TextUtils.join(";", arrayList), "*;", ";explicit")));
        } catch (ebml e) {
            throw new IllegalArgumentException("Accept-Contact can't be set: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public static void d(ebnr ebnrVar, dgwx dgwxVar, boolean z) {
        if (ebnrVar == null) {
            return;
        }
        if (dgwxVar.y() && !z) {
            ebnrVar.j(new ebmj("+g.oma.sip-im", null));
        }
        if (dgwxVar.v()) {
            ebmj ebmjVar = new ebmj("+g.3gpp.iari-ref", dgwxVar.b());
            ebmjVar.b();
            ebnrVar.j(ebmjVar);
        }
        if (dgwxVar.w(z)) {
            ebmj ebmjVar2 = new ebmj("+g.3gpp.icsi-ref", dgwxVar.c(z));
            ebmjVar2.b();
            ebnrVar.j(ebmjVar2);
        }
        if (dgwxVar.u()) {
            ebnrVar.j(new ebmj("+g.jibe.stickers", null));
        }
        if (dgwxVar.E()) {
            ebnrVar.j(new ebmj("+g.gsma.rcs.ipcall", null));
            if (dgwxVar.H()) {
                ebnrVar.j(new ebmj("+g.gsma.rcs.ipvideocallonly", null));
            }
            ebnrVar.j(new ebmj("video", null));
        } else if (dgwxVar.F()) {
            ebnrVar.j(new ebmj("+g.gsma.rcs.ipcall", null));
        }
        if (dfou.d()) {
            ebnrVar.j(new ebmj(b(), null));
        }
    }
}
