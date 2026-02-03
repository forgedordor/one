package defpackage;

import android.content.Context;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrt {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager");
    public static final bvc b = new bvc(bva.a, new bvd(new Size(1920, 1440), 4));
    public static final bxs c;
    public final dmra d;
    public final dmrm e;
    public final fduf f;
    public final fduf g;
    public final fduf h;
    public final dmrk i;
    public final dqiz j;
    public exls k;
    public boolean l;
    public final fdap m;
    public final fdvc n;
    private final Executor o;
    private final fdjx p;
    private final Context q;

    static {
        bxo bxoVar = bxo.c;
        int i = bxc.d;
        bwn bwnVar = new bwn(bxoVar, 4);
        lcg.j(bxoVar, "quality cannot be null");
        boolean zE = bxo.e(bxoVar);
        Objects.toString(bxoVar);
        lcg.b(zE, "Invalid quality: ".concat(String.valueOf(bxoVar)));
        c = new bxs(Collections.singletonList(bxoVar), bwnVar);
    }

    public dmrt(Optional optional, dmra dmraVar, Executor executor, fdjx fdjxVar, Context context, dmrm dmrmVar) {
        dmraVar.getClass();
        executor.getClass();
        fdjxVar.getClass();
        context.getClass();
        this.d = dmraVar;
        this.o = executor;
        this.p = fdjxVar;
        this.q = context;
        this.e = dmrmVar;
        fduf fdufVarA = fdvf.a(null);
        this.f = fdufVarA;
        fduf fdufVarA2 = fdvf.a(false);
        this.g = fdufVarA2;
        fduf fdufVarA3 = fdvf.a(new LinkedHashSet());
        this.h = fdufVarA3;
        String string = context.getString(R.string.no_effect_display_name);
        string.getClass();
        this.i = new dmrk("no_effect", string, new dmry(R.drawable.gs_block_vd_theme_24, null));
        this.j = (dqiz) fdct.b(optional);
        this.m = new elge(new dmrr(this, null));
        this.n = fdtg.b(fdud.a(fdufVarA, fdufVarA3, fdufVarA2, new dmrq(this, null)), fdjxVar, fdur.b, new dmrw(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        if (r10.e(r4, r0, r6) != r7) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dmrk r15, defpackage.fdap r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmrt.a(dmrk, fdap, fcxy):java.lang.Object");
    }

    public final void b(Effect effect, final String str, final fdap fdapVar, final dmrv dmrvVar) {
        exls exlsVar = this.k;
        if (exlsVar == null) {
            return;
        }
        exlsVar.d.d.b(effect, new Callbacks$StatusCallback() { // from class: dmrp
            @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
            public final void onCompletion(boolean z, String str2) {
                dmrt dmrtVar = this.a;
                dmrtVar.g.f(false);
                String str3 = str;
                dmrv dmrvVar2 = dmrvVar;
                if (z) {
                    ((ekrd) dmrt.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager", "setProcessorEffect$lambda$4", BasePaymentResult.ERROR_REQUEST_FAILED, "CameraEffectsManager.kt")).t("Set camera effect: %s", str3);
                    if (dmrvVar2 != null) {
                        dmrtVar.e.c.a(dmrvVar2, dzua.SUCCESS);
                        return;
                    }
                    return;
                }
                ((ekrd) dmrt.a.j().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager", "setProcessorEffect$lambda$4", 205, "CameraEffectsManager.kt")).D("Failed to set camera effect: %s, error: %s", str3, str2);
                if (dmrvVar2 != null) {
                    dmrtVar.e.c.a(dmrvVar2, dzua.ERROR);
                }
                if (fdbq.f(str2, "xeno::effect::EffectWasReconfiguredStatus()")) {
                    return;
                }
                fdapVar.invoke(new dmrl(str2));
            }
        });
    }
}
