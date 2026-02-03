package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axpd;
import defpackage.axpe;
import defpackage.cmqa;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class HandleLowStorageAction extends Action<Boolean> implements Parcelable {
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new axpd();
    private final cmqa a;

    /* compiled from: PG */
    public interface a {
        axpe hL();
    }

    public HandleLowStorageAction(cmqa cmqaVar, Parcel parcel) {
        super(parcel, elgm.HANDLE_LOW_STORAGE_ACTION);
        this.a = cmqaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("HandleLowStorageAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r6 = this;
            aymo r0 = r6.v
            java.lang.String r1 = "deletion_target"
            java.lang.String r1 = r0.l(r1)
            int r2 = r1.hashCode()
            r3 = -1883682684(0xffffffff8fb94884, float:-1.827034E-29)
            r4 = -1
            r5 = 1
            if (r2 == r3) goto L23
            r3 = -661444761(0xffffffffd8932767, float:-1.29437953E15)
            if (r2 == r3) goto L19
            goto L2d
        L19:
            java.lang.String r2 = "MEDIA_MESSAGES"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2d
            r1 = 0
            goto L2e
        L23:
            java.lang.String r2 = "OLD_MESSAGES"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2d
            r1 = r5
            goto L2e
        L2d:
            r1 = r4
        L2e:
            if (r1 == 0) goto L3a
            if (r1 != r5) goto L34
            r1 = 2
            goto L3b
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L3a:
            r1 = r5
        L3b:
            cmqa r2 = r6.a
            int r1 = r1 + r4
            java.lang.String r3 = "cutoff_duration_millis"
            long r3 = r0.d(r3)
            r2.c(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.HandleLowStorage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public HandleLowStorageAction(cmqa cmqaVar, int i, long j) {
        super(elgm.HANDLE_LOW_STORAGE_ACTION);
        this.a = cmqaVar;
        this.v.v("deletion_target", i != 1 ? "OLD_MESSAGES" : "MEDIA_MESSAGES");
        this.v.s("cutoff_duration_millis", j);
    }
}
