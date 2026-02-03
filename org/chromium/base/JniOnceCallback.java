package org.chromium.base;

import internal.J.N;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JniOnceCallback<T> implements Callback<T> {
    long a;

    private JniOnceCallback(long j) {
        this.a = j;
    }

    @Override // org.chromium.base.Callback
    public final void a(Object obj) {
        long j = this.a;
        if (j != 0) {
            N.MOngYY7q(j, false, obj);
            this.a = 0L;
        }
    }
}
