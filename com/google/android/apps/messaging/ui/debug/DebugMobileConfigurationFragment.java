package com.google.android.apps.messaging.ui.debug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ahib;
import defpackage.ahnh;
import defpackage.cmlb;
import defpackage.cmmb;
import defpackage.cmmh;
import defpackage.cxbn;
import defpackage.cxsz;
import defpackage.ea;
import defpackage.ecem;
import defpackage.eebt;
import defpackage.ehlc;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehns;
import defpackage.ehnv;
import defpackage.ehnw;
import defpackage.ehnz;
import defpackage.ehog;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifl;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiik;
import defpackage.eiiy;
import defpackage.eyhj;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.eyig;
import defpackage.fcsu;
import defpackage.fdci;
import defpackage.fdjx;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.rf;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMobileConfigurationFragment extends cxsz implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cxbn a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public DebugMobileConfigurationFragment() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cxbn.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.debug_mobile_configuration_fragment, viewGroup, false);
            viewInflate.getClass();
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxbn H() {
        cxbn cxbnVar = this.a;
        if (cxbnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxbnVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.cxsz, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bn(view, bundle);
            final cxbn cxbnVarH = H();
            view.getClass();
            DebugMobileConfigurationFragment debugMobileConfigurationFragment = cxbnVarH.a;
            View viewFindViewById = debugMobileConfigurationFragment.N().findViewById(R.id.force_sync_button);
            viewFindViewById.getClass();
            ((Button) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: cxbj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ((diff) ((Optional) ((cebe) cxbnVarH.b.b()).c.b()).get()).b();
                }
            });
            eebt.d(cxbnVarH.b(), new ScrollingMovementMethod());
            fcsu fcsuVar = cxbnVarH.c;
            cmmb cmmbVarA = ((cmlb) fcsuVar.b()).a();
            cxbnVarH.e = ((cmlb) fcsuVar.b()).q();
            if (cxbnVarH.e.isEmpty()) {
                cxbnVarH.b().setText("No SIMs found");
            } else {
                final fdci fdciVar = new fdci();
                fdciVar.a = new LinkedHashMap();
                for (cmmh cmmhVar : cxbnVarH.e) {
                    String str = cmmhVar.c;
                    str.getClass();
                    if (str.length() != 0) {
                        RadioGroup radioGroupA = cxbnVarH.a();
                        cmmhVar.getClass();
                        String str2 = cmmhVar.c;
                        str2.getClass();
                        String str3 = cmmhVar.r;
                        String strSubstring = str2.substring(str2.length() - 3);
                        strSubstring.getClass();
                        String strQ = str3 + " " + strSubstring + " sim:";
                        String strConcat = true != str2.equals(cmmbVarA.c) ? "" : "Call ";
                        if (str2.equals(cmmbVarA.d)) {
                            strConcat = strConcat.concat("Sms ");
                        }
                        if (str2.equals(cmmbVarA.e)) {
                            strConcat = strConcat.concat("Data ");
                        }
                        if (strConcat.length() > 0) {
                            strQ = a.q(strConcat, strQ, "Default ");
                        }
                        int i = cmmhVar.d;
                        rf rfVar = new rf(radioGroupA.getContext());
                        rfVar.setText(strQ);
                        rfVar.setId(i);
                        rfVar.setHeight(48);
                        radioGroupA.addView(rfVar);
                        Map map = (Map) fdciVar.a;
                        Integer numValueOf = Integer.valueOf(cmmhVar.d);
                        String str4 = cmmhVar.c;
                        str4.getClass();
                        map.put(numValueOf, str4);
                        String str5 = cmmhVar.c;
                        str5.getClass();
                        cxbnVarH.c(str5);
                    }
                }
                cxbnVarH.a().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: cxbk
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                        radioGroup.getClass();
                        fdci fdciVar2 = fdciVar;
                        Map map2 = (Map) fdciVar2.a;
                        Integer numValueOf2 = Integer.valueOf(i2);
                        Object obj = map2.get(numValueOf2);
                        obj.getClass();
                        cxbn cxbnVar = cxbnVarH;
                        cxbnVar.c((String) obj);
                        TextView textViewB = cxbnVar.b();
                        Object obj2 = ((Map) fdciVar2.a).get(numValueOf2);
                        obj2.getClass();
                        textViewB.setText((CharSequence) ConcurrentMap.EL.getOrDefault(cxbnVar.f, obj2, "Press the Refresh button to get flag values from storage"));
                    }
                });
                View viewFindViewById2 = debugMobileConfigurationFragment.N().findViewById(R.id.refresh_amber_flags_button);
                viewFindViewById2.getClass();
                ((Button) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: cxbl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        fdci fdciVar2 = fdciVar;
                        Map map2 = (Map) fdciVar2.a;
                        cxbn cxbnVar = cxbnVarH;
                        if (map2.containsKey(Integer.valueOf(cxbnVar.a().getCheckedRadioButtonId()))) {
                            TextView textViewB = cxbnVar.b();
                            ConcurrentHashMap concurrentHashMap = cxbnVar.f;
                            Object obj = ((Map) fdciVar2.a).get(Integer.valueOf(cxbnVar.a().getCheckedRadioButtonId()));
                            obj.getClass();
                            textViewB.setText((CharSequence) ConcurrentMap.EL.getOrDefault(concurrentHashMap, obj, "Press the Refresh button to get flag values from storage"));
                        }
                    }
                });
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxsz
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.cxsz, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/debug/DebugMobileConfigurationFragment", 85, DebugMobileConfigurationFragment.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/debug/DebugMobileConfigurationFragment", 90, DebugMobileConfigurationFragment.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof DebugMobileConfigurationFragment)) {
                                throw new IllegalStateException(a.M(eaVar, cxbn.class));
                            }
                            DebugMobileConfigurationFragment debugMobileConfigurationFragment = (DebugMobileConfigurationFragment) eaVar;
                            ahnh ahnhVar = ((ahib) objBb).a.a;
                            this.a = new cxbn(debugMobileConfigurationFragment, ahnhVar.amo, ahnhVar.rd, ahnhVar.rq, (fdjx) ahnhVar.oQ.b());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxsz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
