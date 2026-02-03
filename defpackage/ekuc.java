package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekuc extends ekta {
    private final String a;

    protected ekuc(String str) {
        this.a = str;
    }

    @Override // defpackage.ekta
    public String d() {
        return this.a;
    }

    @Override // defpackage.ekta
    public void g(RuntimeException runtimeException, eksx eksxVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
