package com.google.android.libraries.internal.growth.growthkit.internal.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.drzl;
import defpackage.dskf;
import defpackage.dski;
import defpackage.dskm;
import defpackage.dsqa;
import defpackage.dxgg;
import defpackage.dxgk;
import defpackage.dxha;
import defpackage.dxne;
import defpackage.dxnm;
import defpackage.dxno;
import defpackage.dxnr;
import defpackage.dxvi;
import defpackage.ejud;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwt;
import defpackage.eksp;
import defpackage.eooq;
import defpackage.eork;
import defpackage.eosc;
import defpackage.ethk;
import defpackage.etly;
import defpackage.etna;
import defpackage.etni;
import defpackage.etnj;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdjz;
import defpackage.fdxs;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TestingToolsBroadcastReceiver extends BroadcastReceiver {
    public static final eksp a = eksp.c("GnpSdk");
    public dxgg b;
    public dski c;
    public dxgg d;
    public dskf e;
    public dskm f;
    public drzl g;
    public eosc h;
    public eygg i;
    public dxgk j;
    public eosc k;
    public Context l;
    public ListenableFuture m;
    public Map n;
    public Map o;
    public dxgg p;
    public ejwi q;
    public fcsu r;

    public static void b(BroadcastReceiver.PendingResult pendingResult, int i) {
        pendingResult.setResultCode(i);
        pendingResult.finish();
    }

    private final ListenableFuture c(ethk ethkVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eooq.f(this.m, new ejvr() { // from class: dscf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((SharedPreferences) obj).edit().putString("SYNC_LANGUAGE", dsbe.a(this.a.l)).apply();
                return null;
            }
        }, this.h));
        Map map = this.n;
        etnj etnjVar = ethkVar.f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        etni etniVarB = etni.b(etnjVar.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        fcsu fcsuVar = (fcsu) map.get(etniVarB);
        if (fcsuVar != null) {
            dsqa dsqaVar = (dsqa) fcsuVar.b();
            etnj etnjVar2 = ethkVar.f;
            if (etnjVar2 == null) {
                etnjVar2 = etnj.a;
            }
            arrayList.addAll(dsqaVar.a(etnjVar2.c == 2 ? (etly) etnjVar2.d : etly.a));
            dsqa dsqaVar2 = (dsqa) fcsuVar.b();
            etnj etnjVar3 = ethkVar.f;
            if (etnjVar3 == null) {
                etnjVar3 = etnj.a;
            }
            etly etlyVar = (etnjVar3.c == 6 ? (etna) etnjVar3.d : etna.a).d;
            if (etlyVar == null) {
                etlyVar = etly.a;
            }
            arrayList.addAll(dsqaVar2.a(etlyVar));
        }
        return eork.e(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dxnr a(dxvi dxviVar, dxha dxhaVar) {
        ejwi ejwiVar;
        try {
            Object obj = ((ejwt) this.q).a;
            dxhaVar.getClass();
            ejwiVar = (ejwi) fdxs.b(((dxno) obj).b, fcyi.a, fdjz.a, new dxnm((dxno) obj, dxviVar, dxhaVar, null)).get();
        } catch (InterruptedException | RuntimeException | ExecutionException unused) {
            ejwiVar = ejud.a;
        }
        dxne dxneVar = new dxne();
        dxneVar.b(0);
        dxneVar.a = "";
        return (dxnr) ejwiVar.e(dxneVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r26, android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
