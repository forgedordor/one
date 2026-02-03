package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stt {
    public static final cczi a = cdag.j(cdag.b, "vmt_throughput_limit", 128000);
    public static final cczi b = cdag.j(cdag.b, "vmt_warmup_period", 2);
    public static final cczv c = cdag.t(cdag.b, "vmt_locale_config", stq.a, new dzze() { // from class: str
        @Override // defpackage.dzze
        public final Object a(byte[] bArr) {
            return (stq) evsn.parseFrom(stq.a, bArr);
        }
    });
    public static final cczi d = cdag.j(cdag.b, "vmt_language_detector_look_back_window", 5);
    public static final ejxr e = cdag.x("enable_vmt_client_side_language_gating");
    public static final cczv f = cdag.t(cdag.b, "vmt_supported_languages", ewto.a, new dzze() { // from class: sts
        @Override // defpackage.dzze
        public final Object a(byte[] bArr) {
            return (ewto) evsn.parseFrom(ewto.a, bArr);
        }
    });
    public static final ejxr g = cdag.x("enable_vmt_aiai");
    private static final cczi k = cdag.m(cdag.b, "force_vmt_aiai", false);
    public static final cczi h = cdag.j(cdag.b, "vmt_agsa_minimum_version_code", 301195513);
    public static final cczi i = cdag.j(cdag.b, "vmt_ssbg_minimum_version_code", 210375916);
    public static final ejxr j = cdag.x("enable_vmt_for_old_messages");

    public static final boolean a(Context context) {
        if (laa.b()) {
            ekrg ekrgVar = ebum.a;
            if (SpeechRecognizer.isOnDeviceRecognitionAvailable(context)) {
                try {
                    long longVersionCode = context.getPackageManager().getPackageInfo("com.google.android.as", 0).getLongVersionCode();
                    ((ekrd) ((ekrd) ebum.a.e()).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "isOnDeviceModelManagerAvailable", 255, "TranscriptionUtils.java")).s("AiAi version: %d", longVersionCode);
                    if (longVersionCode >= 8579823 && ((Boolean) ((cczi) g.get()).e()).booleanValue()) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    ((ekrd) ((ekrd) ((ekrd) ebum.a.i()).g(e2)).h("com/google/android/libraries/speech/transcription/TranscriptionUtils", "isOnDeviceModelManagerAvailable", (char) 258, "TranscriptionUtils.java")).q("Error fetching AiAi version code");
                }
            }
        }
        return ((Boolean) k.e()).booleanValue();
    }
}
