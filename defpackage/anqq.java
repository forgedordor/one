package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anqq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        DefaultRecipient.a aVar = (DefaultRecipient.a) cqtf.a(DefaultRecipient.a.class);
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bundle.getParcelable("participant");
        bindData.getClass();
        ProfilesTable.BindData bindData2 = (ProfilesTable.BindData) bundle.getParcelable("profile");
        alre alreVarAm = aVar.am();
        evwl evwlVar = (evwl) bundle.getParcelable("identity");
        evwlVar.getClass();
        alqm alqmVarA = alreVarAm.a(evwlVar);
        anqr anqrVarAt = aVar.at();
        Context context = (Context) anqrVarAt.a.b();
        context.getClass();
        eosc eoscVar = (eosc) anqrVarAt.b.b();
        eoscVar.getClass();
        fcsu fcsuVar = anqrVarAt.c;
        fcsu fcsuVar2 = anqrVarAt.d;
        fcsu fcsuVar3 = anqrVarAt.e;
        fcsu fcsuVar4 = anqrVarAt.f;
        fcsu fcsuVar5 = anqrVarAt.g;
        fcsu fcsuVar6 = anqrVarAt.h;
        fcsu fcsuVar7 = anqrVarAt.i;
        fcsu fcsuVar8 = anqrVarAt.j;
        fcsu fcsuVar9 = anqrVarAt.k;
        fcsu fcsuVar10 = anqrVarAt.l;
        anvv anvvVar = (anvv) anqrVarAt.m.b();
        anvvVar.getClass();
        return new DefaultRecipient(context, eoscVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, fcsuVar8, fcsuVar9, fcsuVar10, anvvVar, anqrVarAt.n, anqrVarAt.o, anqrVarAt.p, bindData, bindData2, alqmVarA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DefaultRecipient[i];
    }
}
