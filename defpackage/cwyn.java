package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyn implements agzt, cqqh {
    private static final ekgb f = ekgb.u(elup.HAPPINESS_TRACKING_MODE_SURVEY, elup.SMART_REPLY_HAPPINESS_TRACKING_SURVEY, elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY, elup.ORGANIZE_HAPPINESS_TRACKING_SURVEY);
    public final fcsu a;
    public final fcsu b;
    public final cogw c;
    public final View d;
    public boolean e;
    private agzy g;
    private final eygg h;

    public cwyn(fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, eygg eyggVar, View view) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = cogwVar;
        this.d = view;
        this.h = eyggVar;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        if (!((Boolean) cqry.a.e()).booleanValue()) {
            return eijx.e(false);
        }
        final cqrt cqrtVar = (cqrt) this.h.b();
        fcsu fcsuVar = cqrtVar.a;
        final ekgb ekgbVar = f;
        return ((cqrq) fcsuVar.b()).c().i(new eooz() { // from class: cqrr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eijx.e(false);
                }
                final ekgb ekgbVar2 = ekgbVar;
                final cqrt cqrtVar2 = cqrtVar;
                return ((cqrx) cqrtVar2.b.b()).a().h(new ejvr() { // from class: cqrs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqrg cqrgVar = (cqrg) obj2;
                        if (!ekgbVar2.contains(cqrgVar.c()) && !((Boolean) cqry.s.e()).booleanValue()) {
                            return false;
                        }
                        cqrt cqrtVar3 = cqrtVar2;
                        cqrtVar3.e = cqrgVar;
                        cqrtVar3.c.b();
                        return true;
                    }
                }, cqrtVar2.d);
            }
        }, cqrtVar.d);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.g = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        this.g.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) throws IOException {
        cqrt cqrtVar = (cqrt) this.h.b();
        cqrj cqrjVar = (cqrj) cqrtVar.c.b();
        cqrg cqrgVar = cqrtVar.e;
        cqse cqseVar = cqrjVar.d;
        ecpy ecpyVarC = null;
        CronetEngine cronetEngine = (CronetEngine) cqseVar.a.a().orElse(null);
        if (((Boolean) ((cczi) cqrj.b.get()).e()).booleanValue() && cronetEngine == null) {
            String strD = cqrgVar instanceof cqrf ? ((cqrf) cqrgVar).d() : "";
            aill aillVar = (aill) cqseVar.b.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            emah emahVar = (emah) emau.a.createBuilder();
            emal emalVar = (emal) eman.a.createBuilder();
            emalVar.copyOnWrite();
            eman emanVar = (eman) emalVar.instance;
            strD.getClass();
            emanVar.b |= 1;
            emanVar.c = strD;
            emalVar.copyOnWrite();
            eman emanVar2 = (eman) emalVar.instance;
            emanVar2.d = 1;
            emanVar2.b |= 2;
            emahVar.copyOnWrite();
            emau emauVar = (emau) emahVar.instance;
            eman emanVar3 = (eman) emalVar.build();
            emanVar3.getClass();
            emauVar.d = emanVar3;
            emauVar.b |= 2;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            emau emauVar2 = (emau) emahVar.build();
            emauVar2.getClass();
            ellhVar.aO = emauVar2;
            ellhVar.e |= 262144;
            ellf ellfVar = ellf.BUGLE_HATS_NEXT_CLIENT_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ellhVar2.j = ellfVar.f11do;
            ellhVar2.b |= 1;
            aillVar.j(ellgVar);
        }
        if (cronetEngine != null && (cqrgVar instanceof cqrf)) {
            ecpyVarC = ecpy.c(context, cronetEngine);
        }
        if (cqrgVar != null && ecpyVarC != null) {
            if (cqrgVar.c() == elup.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING) {
                cqrjVar.a(context);
            }
            String strD2 = ((cqrf) cqrgVar).d();
            if (TextUtils.isEmpty(strD2)) {
                cqrj.a.r(String.format("SiteId was blank or missing from BugleHatsSurvey: %s, not showing survey", cqrgVar));
            } else {
                if (TextUtils.isEmpty(strD2)) {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
                ecpy.b(new ecpx(context, strD2, new cqri(cqrjVar, (Activity) context, this), (String) cqry.b.e(), null, ((Boolean) cqry.q.e()).booleanValue()));
            }
        }
        return this.e;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 14;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
