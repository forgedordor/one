package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.accessibility.AccessibilityManager;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmdo implements dmgo {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController");
    private static final dmbu m = dmbu.c;
    public final fdjx b;
    public final fdjx c;
    public final dnhq d;
    public final dmcd e;
    public final dqbu f;
    public final fduf g;
    public final dpzv h;
    public final fdpl i;
    public dojw j;
    public boolean k;
    public final xfy l;
    private final Context n;
    private final fctc o;
    private fdlr p;

    public dmdo(Context context, final fcsu fcsuVar, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar2, dnhq dnhqVar, dmcd dmcdVar, Optional optional, dqbu dqbuVar) {
        context.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        dnhqVar.getClass();
        this.n = context;
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.d = dnhqVar;
        this.e = dmcdVar;
        this.f = dqbuVar;
        this.l = (xfy) fdct.b(optional);
        fduf fdufVarA = fdvf.a(dmcf.a);
        this.g = fdufVarA;
        Object objB = fcsuVar2.b();
        objB.getClass();
        dpzv dpzvVar = (dpzv) objB;
        this.h = dpzvVar;
        this.i = new fdua(fdufVarA, dpzvVar.d, new dmdn(this, null));
        this.o = fctd.a(new fdae() { // from class: dmce
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objB2 = fcsuVar.b();
                objB2.getClass();
                return (dmlz) objB2;
            }
        });
    }

    private final void m() {
        if (this.j != null) {
            fdil.d(this.c, null, null, new dmco(this, null), 3);
        }
        this.k = false;
    }

    private final void n() {
        dojw dojwVar = this.j;
        if (dojwVar == null) {
            this.k = true;
            return;
        }
        if (!(dojwVar instanceof dojr)) {
            ((ekrd) a.j().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "sendMedia", 182, "PopupCameraController.kt")).q("Captured media is not the expected type");
            l(0);
            return;
        }
        this.d.f((dojr) dojwVar);
        xfy xfyVar = this.l;
        if (xfyVar != null) {
            xfyVar.a();
        }
        this.j = null;
        g();
    }

    public final dmlz a() {
        return (dmlz) this.o.a();
    }

    public final Object b(lvj lvjVar, jfw jfwVar, fcxy fcxyVar) {
        Object objC = a().c(lvjVar, jfwVar, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public final Object c(fcxy fcxyVar) {
        g();
        Object objD = a().d(fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    @Override // defpackage.dmgo
    public final Object d(fcxy fcxyVar) {
        m();
        h();
        xfy xfyVar = this.l;
        if (xfyVar != null) {
            ((ains) xfyVar.a.b()).c("Bugle.SelfieGif.Recording.Restarted.Count");
        }
        this.g.f(dmcj.a);
        Object objD = a().d(fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    @Override // defpackage.dmgo
    public final Object e(fcxy fcxyVar) {
        this.h.c();
        if (this.p == null) {
            this.p = fdil.d(this.b, null, null, new dmct(this, null), 3);
        }
        int iIntValue = ((Number) this.e.b.invoke()).intValue();
        ((ekrd) a.h().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "startRecording", 135, "PopupCameraController.kt")).r("Starting popup camera recording with size %d", iIntValue);
        Object objQ = a().q(m, new dnzg(iIntValue), fcxyVar);
        return objQ == fcyl.a ? objQ : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dmgo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dmcu
            if (r0 == 0) goto L13
            r0 = r5
            dmcu r0 = (defpackage.dmcu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmcu r0 = new dmcu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduf r5 = r4.g
            java.lang.Object r5 = r5.c()
            dmck r5 = (defpackage.dmck) r5
            boolean r2 = r5 instanceof defpackage.dmcg
            if (r2 == 0) goto L42
            r4.n()
            goto L75
        L42:
            boolean r5 = r5 instanceof defpackage.dmci
            if (r5 == 0) goto L59
            dmlz r5 = r4.a()
            dmbu r2 = defpackage.dmdo.m
            r0.c = r3
            java.lang.Object r5 = r5.h(r2, r0)
            if (r5 == r1) goto L58
        L54:
            r4.n()
            goto L75
        L58:
            return r1
        L59:
            ekrg r5 = defpackage.dmdo.a
            ekrw r5 = r5.j()
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.String r1 = "PopupCameraController.kt"
            java.lang.String r2 = "com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController"
            java.lang.String r3 = "submit"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Attempted to send popup camera gif in invalid state."
            r5.q(r0)
            k(r4)
        L75:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmdo.f(fcxy):java.lang.Object");
    }

    public final void g() {
        h();
        m();
        this.g.f(dmcf.a);
    }

    public final void h() {
        dpzv dpzvVar = this.h;
        dpzvVar.c();
        dpzvVar.a();
    }

    public final void i(lvj lvjVar) {
        a().p(lvjVar);
    }

    public final void j(long j, int i) {
        Context context = this.n;
        if (((AudioManager) context.getSystemService(AudioManager.class)).getRingerMode() != 0 || ((AccessibilityManager) context.getSystemService(AccessibilityManager.class)).isEnabled()) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.createOneShot(j, i));
        }
    }

    public final void l(int i) {
        m();
        h();
        xfy xfyVar = this.l;
        if (xfyVar != null && i != 0) {
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellgVar.getClass();
            elgr.g(ellf.SELFIE_GIF_EVENT, ellgVar);
            eoam eoamVar = (eoam) eoaq.a.createBuilder();
            eoamVar.getClass();
            eoan eoanVar = (eoan) eoap.a.createBuilder();
            eoanVar.getClass();
            int i2 = i - 1;
            int i3 = i2 != 0 ? i2 != 1 ? 4 : 3 : 2;
            eoanVar.copyOnWrite();
            eoap eoapVar = (eoap) eoanVar.instance;
            eoapVar.c = i3 - 1;
            eoapVar.b |= 1;
            evsn evsnVarBuild = eoanVar.build();
            evsnVarBuild.getClass();
            eoamVar.copyOnWrite();
            eoaq eoaqVar = (eoaq) eoamVar.instance;
            eoaqVar.c = (eoap) evsnVarBuild;
            eoaqVar.b = 1;
            evsn evsnVarBuild2 = eoamVar.build();
            evsnVarBuild2.getClass();
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.cd = (eoaq) evsnVarBuild2;
            ellhVar.h |= 16384;
            evsf builder = elgr.a(ellgVar).toBuilder();
            builder.getClass();
            ((aimb) xfyVar.b.b()).a().j((ellg) builder, aioj.LOG_SPEC_SELFIE_GIF_EVENTS);
        }
        fdil.d(this.b, null, null, new dmcr(this, null), 3);
    }
}
