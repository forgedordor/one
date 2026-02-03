package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ayml;
import defpackage.aymo;
import defpackage.ayna;
import defpackage.aynb;
import defpackage.ayno;
import defpackage.cldb;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqtf;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvt;
import defpackage.elgm;
import defpackage.eoqg;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ThrottledAction extends Action<Void> {
    private static final cqce a = cqce.g("Bugle", "ThrottledAction");
    private final aynb b;

    /* compiled from: PG */
    public interface a {
        aynb hz();
    }

    protected ThrottledAction(Parcel parcel, elgm elgmVar) {
        super(parcel, elgmVar);
        this.b = ((a) cqtf.a(a.class)).hz();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void A(ayml aymlVar) {
        ayml.b(this.u, aymlVar);
        H().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void E(long j) {
        int iF = f();
        ayna aynaVarH = H();
        aynaVarH.d(this, iF, j, j, true);
        ayno aynoVar = aynaVarH.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void F(ayml aymlVar) {
        ayml.b(this.u, aymlVar);
        H().b(this, f(), null);
    }

    public final ayna H() {
        ayna aynaVar;
        aynb aynbVar = this.b;
        Map map = aynbVar.a;
        Class<?> cls = getClass();
        synchronized (map) {
            if (!map.containsKey(cls)) {
                map.put(cls, (ayna) aynbVar.b.b());
            }
            aynaVar = (ayna) map.get(cls);
        }
        return aynaVar;
    }

    protected final void I(ThrottledAction throttledAction, String str) {
        aymo aymoVar = throttledAction.v;
        aymo aymoVar2 = this.v;
        boolean z = false;
        boolean z2 = aymoVar2.z(str, false);
        boolean z3 = aymoVar.z(str, false);
        if (z2 && z3) {
            z = true;
        }
        aymoVar2.p(str, z);
    }

    protected final void J(ThrottledAction throttledAction, String str) {
        aymo aymoVar = throttledAction.v;
        aymo aymoVar2 = this.v;
        aymoVar2.p(str, aymoVar2.z(str, false) || aymoVar.z(str, false));
    }

    public final void K() {
        H().d(this, f(), 0L, g(), false);
    }

    final boolean L() {
        aymo aymoVar = this.v;
        if (aymoVar != null) {
            return aymoVar.z("is_background", true);
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("actionParameters is null:");
        cqbdVarA.I(getClass().getName());
        cqbdVarA.r();
        return true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public eieu a() {
        return eiiy.k("ThrottledAction unknown action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new UnsupportedOperationException("#executeActionAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        if (!L()) {
            return H().a(this);
        }
        v();
        return eijx.e(null);
    }

    public abstract int f();

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        throw new UnsupportedOperationException("#doBackgroundWorkAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        return L() ? H().a(this).h(new ejvt(null), eoqg.a) : eijx.e(null);
    }

    public abstract long g();

    public abstract String h();

    public eiju k() {
        return eijx.f(new Runnable() { // from class: aymz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        }, eoqg.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture q(cldb cldbVar) {
        return H().b(this, f(), cldbVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture s() {
        return H().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void w(long j) {
        H().d(this, f(), j, j, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ThrottledAction(elgm elgmVar) {
        super(elgmVar);
        this.b = ((a) cqtf.a(a.class)).hz();
    }

    public void i() {
    }

    public void j(ThrottledAction throttledAction) {
    }
}
