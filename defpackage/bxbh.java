package defpackage;

import android.os.StrictMode;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxbh implements bxei {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker");

    @Override // defpackage.bxei
    public final StrictMode.ThreadPolicy a() {
        return new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskReads().detectDiskWrites().penaltyListener(eoqg.a, new bxbg()).build();
    }
}
