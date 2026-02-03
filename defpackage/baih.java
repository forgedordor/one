package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        baii baiiVarBz = ((PendingAttachmentData.a) cqtf.a(PendingAttachmentData.a.class)).bz();
        cqxl cqxlVar = (cqxl) baiiVarBz.a.b();
        cqxlVar.getClass();
        Context context = (Context) baiiVarBz.b.b();
        context.getClass();
        cqmp cqmpVar = (cqmp) baiiVarBz.c.b();
        cqmpVar.getClass();
        cmum cmumVar = (cmum) baiiVarBz.d.b();
        cmumVar.getClass();
        cqmz cqmzVar = (cqmz) baiiVarBz.e.b();
        cqmzVar.getClass();
        bahv bahvVar = (bahv) baiiVarBz.f.b();
        bahvVar.getClass();
        bxfu bxfuVar = (bxfu) baiiVarBz.g.b();
        bxfuVar.getClass();
        fcsu fcsuVar = baiiVarBz.h;
        cmtv cmtvVar = (cmtv) baiiVarBz.i.b();
        cmtvVar.getClass();
        baii baiiVar = (baii) baiiVarBz.y.b();
        baiiVar.getClass();
        cqsu cqsuVar = (cqsu) baiiVarBz.j.b();
        cqsuVar.getClass();
        cogw cogwVar = (cogw) baiiVarBz.k.b();
        cogwVar.getClass();
        crqx crqxVar = (crqx) baiiVarBz.l.b();
        crqxVar.getClass();
        cqok cqokVar = (cqok) baiiVarBz.m.b();
        cqokVar.getClass();
        Optional optional = (Optional) ((eyig) baiiVarBz.n).a;
        cqxp cqxpVar = (cqxp) baiiVarBz.o.b();
        cqxpVar.getClass();
        eosc eoscVar = (eosc) baiiVarBz.p.b();
        eoscVar.getClass();
        apsl apslVar = (apsl) baiiVarBz.q.b();
        apslVar.getClass();
        fcsu fcsuVar2 = baiiVarBz.r;
        parcel.getClass();
        aqbx aqbxVar = (aqbx) baiiVarBz.s.b();
        aqbxVar.getClass();
        return new PendingAttachmentData(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, fcsuVar, cmtvVar, baiiVar, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, parcel, aqbxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingAttachmentData[i];
    }
}
