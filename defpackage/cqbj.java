package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbj {
    public static String a(Context context, long j) {
        long jRound = Math.round(j / 1000.0f);
        return String.format(lad.a(context.getResources().getConfiguration()).f(0), "%d:%02d", Long.valueOf(jRound / 60), Long.valueOf(jRound % 60));
    }
}
