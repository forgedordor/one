package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.axmp;
import defpackage.axmq;
import defpackage.ayqd;
import defpackage.bopq;
import defpackage.botm;
import defpackage.bran;
import defpackage.bxlc;
import defpackage.cqaz;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ClearCloudSyncMessagesAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    public static final String a;
    public final ayqd b;
    public final bxlc c;
    private final dqsn d;

    /* compiled from: PG */
    public interface a {
        axmq hC();
    }

    static {
        bopq bopqVar = botm.c.a;
        String string = bopqVar.toString();
        String string2 = bopqVar.toString();
        bran branVar = MessagesTable.c;
        a = "SELECT " + string + " FROM conversations LEFT OUTER JOIN messages ON (" + string2 + " = " + branVar.b.toString() + ") WHERE " + branVar.a.toString() + " IS NULL AND " + botm.c.L.toString() + " = 1";
        CREATOR = new axmp();
    }

    public ClearCloudSyncMessagesAction(ayqd ayqdVar, bxlc bxlcVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.CLEAR_CLOUD_SYNC_MESSAGES_ACTION);
        this.b = ayqdVar;
        this.c = bxlcVar;
        this.d = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ClearCloudSyncMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ClearCloudSyncMessages.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        final long jD = this.v.d("cutoff_timestamp");
        cqaz.k(jD > 0);
        this.d.d("ClearCloudSyncMessagesAction#doBackgroundWork", new Runnable() { // from class: axmm
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MessagesTable.a;
                brdk brdkVar = new brdk();
                brdkVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#messages");
                final long j = jD;
                brdkVar.c(new Function() { // from class: axmn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        String str = ClearCloudSyncMessagesAction.a;
                        brecVar.T(j);
                        brecVar.e();
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdkVar.d();
                String[] strArr2 = botm.a;
                bost bostVar = new bost();
                bostVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#conversations");
                bostVar.a(new Function() { // from class: axmo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.t(new dqxm(ClearCloudSyncMessagesAction.a));
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bostVar.d();
                ClearCloudSyncMessagesAction clearCloudSyncMessagesAction = this.a;
                clearCloudSyncMessagesAction.c.c();
                clearCloudSyncMessagesAction.b.e(true, barn.a);
            }
        });
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
