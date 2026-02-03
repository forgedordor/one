package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Parcelable;
import defpackage.dcfl;
import defpackage.dcfm;
import defpackage.defn;
import defpackage.deop;
import defpackage.deoq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ChannelClient extends dcfm {

    /* compiled from: PG */
    public interface Channel extends Parcelable {
        String a();
    }

    public ChannelClient(Context context, dcfl dcflVar) {
        super(context, deoq.a, deop.a, dcflVar);
    }

    public abstract defn a(Channel channel);
}
