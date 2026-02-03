package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rbr extends rta implements Cloneable {
    private rbw A;
    private Object B;
    private List C;
    private rbr D;
    private rbr E;
    private Float F;
    private boolean G = true;
    private boolean H;
    private boolean I;
    public final rbv a;
    private final Context x;
    private final Class y;
    private final rbc z;

    static {
    }

    protected rbr(raw rawVar, rbv rbvVar, Class cls, Context context) {
        this.a = rbvVar;
        this.y = cls;
        this.x = context;
        rbc rbcVar = rbvVar.a.c;
        rbw rbwVar = (rbw) rbcVar.e.get(cls);
        if (rbwVar == null) {
            for (Map.Entry entry : rbcVar.e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    rbwVar = (rbw) entry.getValue();
                }
            }
        }
        this.A = rbwVar == null ? rbc.a : rbwVar;
        this.z = rawVar.c;
        Iterator it = rbvVar.d.iterator();
        while (it.hasNext()) {
            a((rti) it.next());
        }
        q(rbvVar.j());
    }

    private final rbr ak(rbr rbrVar) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        Context context = this.x;
        rbr rbrVar2 = (rbr) rbrVar.X(context.getTheme());
        ConcurrentMap concurrentMap = run.a;
        String packageName = context.getPackageName();
        res resVar = (res) run.a.get(packageName);
        if (resVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            ruq ruqVar = new ruq(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            resVar = (res) run.a.putIfAbsent(packageName, ruqVar);
            if (resVar == null) {
                resVar = ruqVar;
            }
        }
        return (rbr) rbrVar2.W(new rum(context.getResources().getConfiguration().uiMode & 48, resVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final rte al(Object obj, rua ruaVar, rti rtiVar, rtg rtgVar, rbw rbwVar, rbh rbhVar, int i, int i2, rta rtaVar, Executor executor) {
        rtg rtgVar2;
        rtg rtbVar;
        rbr rbrVar;
        rte rteVarAm;
        rbh rbhVar2;
        rta rtaVar2 = rtaVar;
        if (this.E != null) {
            rtbVar = new rtb(obj, rtgVar);
            rtgVar2 = rtbVar;
        } else {
            rtgVar2 = null;
            rtbVar = rtgVar;
        }
        rbr rbrVar2 = this.D;
        if (rbrVar2 == null) {
            rbrVar = this;
            rteVarAm = am(obj, ruaVar, rtiVar, rtaVar2, rtbVar, rbwVar, rbhVar, i, i2, executor);
        } else {
            if (this.I) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            rbw rbwVar2 = true == rbrVar2.G ? rbwVar : rbrVar2.A;
            if (super.ad(8)) {
                rbhVar2 = rbrVar2.d;
            } else {
                int i3 = rbq.b[rbhVar.ordinal()];
                if (i3 == 1) {
                    rbhVar2 = rbh.NORMAL;
                } else if (i3 == 2) {
                    rbhVar2 = rbh.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.d))));
                    }
                    rbhVar2 = rbh.IMMEDIATE;
                }
            }
            rbh rbhVar3 = rbhVar2;
            rbr rbrVar3 = this.D;
            int i4 = rbrVar3.k;
            int i5 = rbrVar3.j;
            if (rvk.p(i, i2) && !this.D.ae()) {
                i4 = rtaVar2.k;
                i5 = rtaVar2.j;
            }
            int i6 = i5;
            rtm rtmVar = new rtm(obj, rtbVar);
            rte rteVarAm2 = am(obj, ruaVar, rtiVar, rtaVar2, rtmVar, rbwVar, rbhVar, i, i2, executor);
            this.I = true;
            rbr rbrVar4 = this.D;
            rbrVar = this;
            rte rteVarAl = rbrVar4.al(obj, ruaVar, rtiVar, rtmVar, rbwVar2, rbhVar3, i4, i6, rbrVar4, executor);
            rtm rtmVar2 = rtmVar;
            rbrVar.I = false;
            rtmVar2.a = rteVarAm2;
            rtmVar2.b = rteVarAl;
            rtaVar2 = rtaVar;
            rteVarAm = rtmVar2;
        }
        rte rteVar = rteVarAm;
        if (rtgVar2 == null) {
            return rteVar;
        }
        rbr rbrVar5 = rbrVar.E;
        int i7 = rbrVar5.k;
        int i8 = rbrVar5.j;
        if (rvk.p(i, i2) && !rbrVar.E.ae()) {
            i7 = rtaVar2.k;
            i8 = rtaVar2.j;
        }
        int i9 = i8;
        rbr rbrVar6 = rbrVar.E;
        rtb rtbVar2 = rtgVar2;
        rte rteVarAl2 = rbrVar6.al(obj, ruaVar, rtiVar, rtbVar2, rbrVar6.A, rbrVar6.d, i7, i9, rbrVar6, executor);
        rtbVar2.a = rteVar;
        rtbVar2.b = rteVarAl2;
        return rtbVar2;
    }

    private final rte am(Object obj, rua ruaVar, rti rtiVar, rta rtaVar, rtg rtgVar, rbw rbwVar, rbh rbhVar, int i, int i2, Executor executor) {
        Object obj2 = this.B;
        List list = this.C;
        rul rulVar = rbwVar.a;
        Context context = this.x;
        Class cls = this.y;
        rbc rbcVar = this.z;
        return new rtl(context, rbcVar, obj, obj2, cls, rtaVar, i, i2, rbhVar, ruaVar, rtiVar, list, rtgVar, rbcVar.f, rulVar, executor);
    }

    public rbr a(rti rtiVar) {
        if (this.u) {
            return clone().a(rtiVar);
        }
        if (rtiVar != null) {
            if (this.C == null) {
                this.C = new ArrayList();
            }
            this.C.add(rtiVar);
        }
        ah();
        return this;
    }

    @Override // defpackage.rta
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rbr q(rta rtaVar) {
        rvi.f(rtaVar);
        return (rbr) super.q(rtaVar);
    }

    @Override // defpackage.rta
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rbr clone() {
        rbr rbrVar = (rbr) super.clone();
        rbrVar.A = rbrVar.A.clone();
        List list = rbrVar.C;
        if (list != null) {
            rbrVar.C = new ArrayList(list);
        }
        rbr rbrVar2 = rbrVar.D;
        if (rbrVar2 != null) {
            rbrVar.D = rbrVar2.clone();
        }
        rbr rbrVar3 = rbrVar.E;
        if (rbrVar3 != null) {
            rbrVar.E = rbrVar3.clone();
        }
        return rbrVar;
    }

    public rbr d(rbr rbrVar) {
        if (this.u) {
            return clone().d(rbrVar);
        }
        this.E = rbrVar;
        ah();
        return this;
    }

    public rbr e(Object obj) {
        return d(clone().d(null).o(null).k(obj));
    }

    @Override // defpackage.rta
    public final boolean equals(Object obj) {
        if (obj instanceof rbr) {
            rbr rbrVar = (rbr) obj;
            if (super.equals(rbrVar) && Objects.equals(this.y, rbrVar.y) && this.A.equals(rbrVar.A) && Objects.equals(this.B, rbrVar.B) && Objects.equals(this.C, rbrVar.C) && Objects.equals(this.D, rbrVar.D) && Objects.equals(this.E, rbrVar.E)) {
                Float f = rbrVar.F;
                if (Objects.equals(null, null) && this.G == rbrVar.G && this.H == rbrVar.H) {
                    return true;
                }
            }
        }
        return false;
    }

    public rbr f(rti rtiVar) {
        if (this.u) {
            return clone().f(rtiVar);
        }
        this.C = null;
        return a(rtiVar);
    }

    public rbr g(Bitmap bitmap) {
        return n(bitmap).q(rtj.d(rha.c));
    }

    public rbr h(Drawable drawable) {
        return n(drawable).q(rtj.d(rha.c));
    }

    @Override // defpackage.rta
    public final int hashCode() {
        return rvk.e(this.H ? 1 : 0, rvk.e(this.G ? 1 : 0, rvk.f(null, rvk.f(this.E, rvk.f(this.D, rvk.f(this.C, rvk.f(this.B, rvk.f(this.A, rvk.f(this.y, super.hashCode())))))))));
    }

    public rbr i(Uri uri) {
        rbr rbrVarN = n(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? rbrVarN : ak(rbrVarN);
    }

    public rbr j(Integer num) {
        return ak(n(num));
    }

    public rbr k(Object obj) {
        return n(obj);
    }

    public rbr l(String str) {
        return n(str);
    }

    public rbr m(byte[] bArr) {
        rbr rbrVarN = n(bArr);
        if (!super.ad(4)) {
            rbrVarN = rbrVarN.q(rtj.d(rha.c));
        }
        if (super.ad(256)) {
            return rbrVarN;
        }
        if (rtj.a == null) {
            rtj.a = (rtj) ((rtj) new rtj().ai()).x();
        }
        return rbrVarN.q(rtj.a);
    }

    public final rbr n(Object obj) {
        if (this.u) {
            return clone().n(obj);
        }
        this.B = obj;
        this.H = true;
        ah();
        return this;
    }

    public rbr o(rbr rbrVar) {
        if (this.u) {
            return clone().o(rbrVar);
        }
        this.D = rbrVar;
        ah();
        return this;
    }

    public rbr p(rbw rbwVar) {
        if (this.u) {
            return clone().p(rbwVar);
        }
        rvi.f(rbwVar);
        this.A = rbwVar;
        this.G = false;
        ah();
        return this;
    }

    public final rtd s() {
        return t(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final rtd t(int i, int i2) {
        rth rthVar = new rth(i, i2);
        u(rthVar, rthVar, this, rva.b);
        return rthVar;
    }

    public final void u(rua ruaVar, rti rtiVar, rta rtaVar, Executor executor) {
        rvi.f(ruaVar);
        if (!this.H) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        rte rteVarAl = al(new Object(), ruaVar, rtiVar, null, this.A, rtaVar.d, rtaVar.k, rtaVar.j, rtaVar, executor);
        rte rteVarEW = ruaVar.eW();
        if (!rteVarAl.m(rteVarEW) || (!rtaVar.i && rteVarEW.l())) {
            rbv rbvVar = this.a;
            rbvVar.l(ruaVar);
            ruaVar.h(rteVarAl);
            rbvVar.t(ruaVar, rteVarAl);
            return;
        }
        rvi.f(rteVarEW);
        if (rteVarEW.n()) {
            return;
        }
        rteVarEW.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.rvk.j()
            defpackage.rvi.f(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.ad(r0)
            if (r0 != 0) goto L4c
            boolean r0 = r3.n
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = defpackage.rbq.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            rta r0 = r3.clone()
            rta r0 = r0.M()
            goto L4d
        L31:
            rta r0 = r3.clone()
            rta r0 = r0.N()
            goto L4d
        L3a:
            rta r0 = r3.clone()
            rta r0 = r0.M()
            goto L4d
        L43:
            rta r0 = r3.clone()
            rta r0 = r0.L()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            rbc r1 = r3.z
            java.lang.Class r2 = r3.y
            rtv r1 = r1.c
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            rto r1 = new rto
            r1.<init>(r4)
            goto L6e
        L61:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
            rtt r1 = new rtt
            r1.<init>(r4)
        L6e:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.rva.a
            r3.u(r1, r4, r0, r2)
            return
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = defpackage.a.b(r2, r0, r1)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbr.v(android.widget.ImageView):void");
    }

    public final void w(rua ruaVar) {
        u(ruaVar, null, this, rva.a);
    }
}
