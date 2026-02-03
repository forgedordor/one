package defpackage;

import android.os.StrictMode;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxbj implements bxei {
    @Override // defpackage.bxei
    public final StrictMode.ThreadPolicy a() {
        return new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskReads().detectDiskWrites().penaltyLog().build();
    }
}
