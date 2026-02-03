package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.apsl;
import defpackage.aqbx;
import defpackage.bacm;
import defpackage.bahv;
import defpackage.bahx;
import defpackage.bahy;
import defpackage.baih;
import defpackage.baii;
import defpackage.bxfu;
import defpackage.cmtv;
import defpackage.cmum;
import defpackage.cogw;
import defpackage.cqce;
import defpackage.cqdj;
import defpackage.cqmp;
import defpackage.cqmz;
import defpackage.cqok;
import defpackage.cqsu;
import defpackage.cqxl;
import defpackage.cqxp;
import defpackage.crqx;
import defpackage.ejwl;
import defpackage.elha;
import defpackage.eosc;
import defpackage.eyig;
import defpackage.fcsu;
import defpackage.le;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class PendingAttachmentData extends MessagePartData {
    public int k;
    public cqdj l;
    public final cqxl m;
    public final Context n;
    public final cqmp o;
    public final cmum p;
    public final cqmz q;
    public final bahv r;
    private final baii s;
    public static final cqce i = cqce.g("Bugle", "PendingAttachmentData");
    public static final int j = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<PendingAttachmentData> CREATOR = new baih();

    /* compiled from: PG */
    public interface a {
        baii bz();
    }

    public PendingAttachmentData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, PendingAttachmentData pendingAttachmentData, aqbx aqbxVar) {
        super(bxfuVar, fcsuVar, cmtvVar, pendingAttachmentData.r, cqsuVar, cogwVar, crqxVar, pendingAttachmentData.n, pendingAttachmentData.q, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, pendingAttachmentData, aqbxVar);
        this.s = baiiVar;
        this.k = pendingAttachmentData.k;
        this.m = pendingAttachmentData.m;
        this.n = pendingAttachmentData.n;
        this.o = pendingAttachmentData.o;
        this.p = pendingAttachmentData.p;
        this.q = pendingAttachmentData.q;
        this.r = pendingAttachmentData.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final /* synthetic */ MessagePartCoreData D() {
        baii baiiVar = this.s;
        bxfu bxfuVar = (bxfu) baiiVar.g.b();
        bxfuVar.getClass();
        cmtv cmtvVar = (cmtv) baiiVar.i.b();
        cmtvVar.getClass();
        baii baiiVar2 = (baii) baiiVar.x.b();
        baiiVar2.getClass();
        cqsu cqsuVar = (cqsu) baiiVar.j.b();
        cqsuVar.getClass();
        cogw cogwVar = (cogw) baiiVar.k.b();
        cogwVar.getClass();
        crqx crqxVar = (crqx) baiiVar.l.b();
        crqxVar.getClass();
        cqok cqokVar = (cqok) baiiVar.m.b();
        cqokVar.getClass();
        Object obj = ((eyig) baiiVar.n).a;
        cqxp cqxpVar = (cqxp) baiiVar.o.b();
        cqxpVar.getClass();
        eosc eoscVar = (eosc) baiiVar.p.b();
        eoscVar.getClass();
        apsl apslVar = (apsl) baiiVar.q.b();
        apslVar.getClass();
        aqbx aqbxVar = (aqbx) baiiVar.s.b();
        aqbxVar.getClass();
        return new PendingAttachmentData(bxfuVar, baiiVar.h, cmtvVar, baiiVar2, cqsuVar, cogwVar, crqxVar, cqokVar, (Optional) obj, cqxpVar, eoscVar, apslVar, baiiVar.r, this, aqbxVar);
    }

    public final void bL() {
        cqdj cqdjVar = this.l;
        if (cqdjVar != null) {
            this.l = null;
            cqdjVar.cancel(false);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri v() {
        Uri uriV = super.v();
        if (uriV != null) {
            return uriV;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.MessagePartData
    protected final Uri y() {
        bL();
        return super.y();
    }

    public PendingAttachmentData(cqxl cqxlVar, Context context, cqmp cqmpVar, cmum cmumVar, cqmz cqmzVar, bahv bahvVar, bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, Parcel parcel, aqbx aqbxVar) {
        super(bxfuVar, fcsuVar, cmtvVar, bahvVar, cqsuVar, cogwVar, crqxVar, context, cqmzVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, parcel, aqbxVar);
        this.s = baiiVar;
        this.k = parcel.readInt();
        this.m = cqxlVar;
        this.n = context;
        this.o = cqmpVar;
        this.p = cmumVar;
        this.q = cqmzVar;
        this.r = bahvVar;
    }

    public PendingAttachmentData(cqxl cqxlVar, Context context, cqmp cqmpVar, cmum cmumVar, cqmz cqmzVar, bahv bahvVar, bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, MessagePartData messagePartData, aqbx aqbxVar) {
        super(bxfuVar, fcsuVar, cmtvVar, bahvVar, cqsuVar, cogwVar, crqxVar, context, cqmzVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, messagePartData, aqbxVar);
        this.s = baiiVar;
        this.k = 0;
        this.m = cqxlVar;
        this.n = context;
        this.o = cqmpVar;
        this.p = cmumVar;
        this.q = cqmzVar;
        this.r = bahvVar;
    }

    public PendingAttachmentData(cqxl cqxlVar, Context context, cqmp cqmpVar, cmum cmumVar, cqmz cqmzVar, bahv bahvVar, bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, String str, Uri uri, elha elhaVar, LocationInformation locationInformation, aqbx aqbxVar) {
        this(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, fcsuVar, cmtvVar, baiiVar, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, str, "application/vnd.gsma.rcspushlocation+xml", uri, null, 800, 400, null, null, -1L, elhaVar, -1L, locationInformation, null, null, aqbxVar);
        ejwl.a(le.p("application/vnd.gsma.rcspushlocation+xml"));
    }

    public PendingAttachmentData(cqxl cqxlVar, Context context, cqmp cqmpVar, cmum cmumVar, cqmz cqmzVar, bahv bahvVar, bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, String str, Uri uri, Uri uri2, int i2, int i3, long j2, elha elhaVar, String str2, String str3, long j3, String str4, aqbx aqbxVar) {
        this(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, fcsuVar, cmtvVar, baiiVar, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, null, str, uri, uri2, i2, i3, str2, str3, j2, elhaVar, j3, null, str4, null, aqbxVar);
        ejwl.a(le.p(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PendingAttachmentData(cqxl cqxlVar, Context context, cqmp cqmpVar, cmum cmumVar, cqmz cqmzVar, bahv bahvVar, bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, baii baiiVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, String str, String str2, Uri uri, Uri uri2, int i2, int i3, String str3, String str4, long j2, elha elhaVar, long j3, LocationInformation locationInformation, String str5, String str6, aqbx aqbxVar) {
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.b = str;
        bacmVar.c = str2;
        bacmVar.d = uri;
        bacmVar.e = uri2;
        bahxVarD.p(i2);
        bahxVarD.i(i3);
        bahxVarD.g(-1L);
        bacmVar.f = str3;
        bacmVar.g = str4;
        bahxVarD.o(j2);
        bahxVarD.n(elhaVar);
        bahxVarD.j(j3);
        bacmVar.h = locationInformation;
        bacmVar.i = str5;
        bacmVar.j = str6;
        super(bxfuVar, fcsuVar, cmtvVar, bahvVar, cqsuVar, cogwVar, crqxVar, context, cqmzVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, bahxVarD.q(), aqbxVar);
        this.s = baiiVar;
        this.k = 0;
        this.m = cqxlVar;
        this.n = context;
        this.o = cqmpVar;
        this.p = cmumVar;
        this.q = cqmzVar;
        this.r = bahvVar;
    }
}
