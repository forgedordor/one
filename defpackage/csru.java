package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csru {
    public static int a(String str) {
        return le.f(str) ? R.string.attachment_audio_clip : le.s(str) ? R.string.attachment_location : le.m(str) ? R.string.attachment_image : le.z(str) ? R.string.attachment_video : le.y(str) ? R.string.attachment_vcard : (apsc.a() && "application/x-end-of-emergency-proto".equals(str)) ? R.string.attachment_end_of_emergency : le.u(str) ? R.string.attachment_file : R.string.attachment_unsupported_file;
    }
}
