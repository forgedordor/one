package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.internal.IChannelStreamCallbacks;
import defpackage.dclh;
import defpackage.depz;
import defpackage.deqi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelStreamCallbacks extends IChannelStreamCallbacks.Stub {
    private final Object a = new Object();
    private deqi b;
    private depz c;

    @Override // com.google.android.gms.wearable.internal.IChannelStreamCallbacks
    public void onChannelUnexpectedlyClosed(int i, int i2) {
        deqi deqiVar;
        depz depzVar;
        synchronized (this.a) {
            deqiVar = this.b;
            depzVar = new depz();
            this.c = depzVar;
        }
        if (deqiVar != null) {
            deqiVar.a(depzVar);
        }
    }

    public void setListener(deqi deqiVar) {
        depz depzVar;
        synchronized (this.a) {
            dclh.m(deqiVar);
            this.b = deqiVar;
            depzVar = this.c;
        }
        if (depzVar != null) {
            deqiVar.a(depzVar);
        }
    }
}
