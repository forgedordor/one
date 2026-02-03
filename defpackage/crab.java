package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crab {
    public static final eksp a = eksp.c("BugleNotifications");
    public static final cczi b = cdag.q(162850086, "enable_bugle_audio_player_for_notification");
    public final cqzv c;
    public final cqvd d;
    public final AudioManager e;
    public final cogw f;
    public final eosd g;
    public final AtomicLong h = new AtomicLong(0);
    private final Context i;
    private final crqv j;

    public crab(Context context, crqv crqvVar, cqzv cqzvVar, cqvd cqvdVar, AudioManager audioManager, cogw cogwVar, eosd eosdVar) {
        this.i = context;
        this.j = crqvVar;
        this.c = cqzvVar;
        this.d = cqvdVar;
        this.e = audioManager;
        this.f = cogwVar;
        this.g = eosdVar;
    }

    public final Uri a(String str) {
        if (str == null) {
            str = this.j.f(this.i.getString(R.string.notification_sound_pref_key), null);
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str);
        }
        if (str != null) {
            return null;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }
}
