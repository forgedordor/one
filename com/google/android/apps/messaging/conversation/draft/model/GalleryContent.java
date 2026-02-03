package com.google.android.apps.messaging.conversation.draft.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.amsu;
import defpackage.amvx;
import defpackage.amvy;
import defpackage.amyb;
import defpackage.athh;
import defpackage.bvdr;
import defpackage.cczi;
import defpackage.crtr;
import defpackage.dltc;
import defpackage.eksp;
import defpackage.uhu;
import defpackage.uif;
import defpackage.uig;
import defpackage.uii;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class GalleryContent implements Parcelable, uig, amvy {
    public static final eksp o = eksp.c("BugleGallery");
    public final AtomicReference p = new AtomicReference();

    public static uii o() {
        uhu uhuVar = new uhu();
        uhuVar.i(-1L);
        uhuVar.j(bvdr.STANDARD);
        uhuVar.h = null;
        uhuVar.d = null;
        uhuVar.c = null;
        uhuVar.e = null;
        uhuVar.b = false;
        uhuVar.g = (byte) (uhuVar.g | 4);
        amvx amvxVar = ((Boolean) ((cczi) crtr.V.get()).e()).booleanValue() ? amvx.DISPLAY_BUT_UNPROCESSESED : amvx.DISPLAY;
        if (amvxVar == null) {
            throw new NullPointerException("Null displayState");
        }
        uhuVar.f = amvxVar;
        return uhuVar;
    }

    @Override // defpackage.amsv
    public abstract Uri c();

    @Override // defpackage.amvy
    public abstract Uri d();

    @Override // defpackage.amsv
    public final amyb fm() {
        return (amyb) this.p.get();
    }

    @Override // defpackage.amsv
    public final /* synthetic */ athh fn() {
        return null;
    }

    @Override // defpackage.dltd
    public final /* synthetic */ dltc fo() {
        return uif.a(this);
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    public abstract uii g();

    @Override // defpackage.amvy
    public abstract amvx h();

    public abstract bvdr i();

    @Override // defpackage.amvy
    public abstract Optional k();

    @Override // defpackage.amwm
    public abstract String l();

    @Override // defpackage.dlti
    public final /* synthetic */ Object fp() {
        return this;
    }
}
