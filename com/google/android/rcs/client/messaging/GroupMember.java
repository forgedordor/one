package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dhiz;
import defpackage.efca;
import defpackage.efef;
import defpackage.efeg;
import defpackage.effi;
import defpackage.efmj;
import defpackage.efmp;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new efef();

    public static efeg e() {
        efca efcaVar = new efca();
        efcaVar.b("");
        efcaVar.c(false);
        return efcaVar;
    }

    public abstract effi a();

    public abstract Optional b();

    public abstract String c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dhizVar.c(a())), String.format("displayName=%s", dhiz.USER_ID.c(c())), String.format("referrer=%s", dhizVar.c(b())), String.format("isOwnUser=%s", Boolean.valueOf(d())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efmp.p(parcel, 1, a(), new efmj() { // from class: efee
            @Override // defpackage.efmj
            public final void a(Parcel parcel2, Object obj, int i2) {
                efmr.a(parcel2, (effi) obj);
            }
        }, i);
        efmp.r(parcel, 2, c());
        if (b().isPresent()) {
            efmp.p(parcel, 3, (effi) b().get(), new efmj() { // from class: efee
                @Override // defpackage.efmj
                public final void a(Parcel parcel2, Object obj, int i2) {
                    efmr.a(parcel2, (effi) obj);
                }
            }, i);
        }
        efmp.o(parcel, 4, d() ? 1 : 0);
        efmp.l(parcel);
    }
}
