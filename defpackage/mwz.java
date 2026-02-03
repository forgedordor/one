package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwz {
    static final ekgp b;
    private final SparseArray d = new SparseArray();
    private final int e;
    public static final mwz a = new mwz(ekgb.r(mwy.a));
    private static final ekgb c = ekgb.t(2, 5, 6);

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(5, 6);
        ekgiVar.i(17, 6);
        ekgiVar.i(7, 6);
        ekgiVar.i(30, 10);
        ekgiVar.i(18, 6);
        ekgiVar.i(6, 8);
        ekgiVar.i(8, 8);
        ekgiVar.i(14, 8);
        b = ekgiVar.c();
    }

    public mwz(List list) {
        for (int i = 0; i < ((ekoe) list).c; i++) {
            mwy mwyVar = (mwy) list.get(i);
            this.d.put(mwyVar.b, mwyVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iMax = Math.max(iMax, ((mwy) this.d.valueAt(i2)).c);
        }
        this.e = iMax;
    }

    static mwz b(Context context, mac macVar, mxe mxeVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), macVar, mxeVar);
    }

    static mwz c(Context context, Intent intent, mac macVar, mxe mxeVar) {
        AudioManager audioManagerA = mdh.a(context);
        if (mxeVar == null) {
            mxe mxeVar2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    List audioDevicesForAttributes = audioManagerA.getAudioDevicesForAttributes(macVar.a().a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        mxeVar2 = new mxe((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            mxeVar = mxeVar2;
        }
        if (Build.VERSION.SDK_INT >= 33 && (mgb.ac(context) || mgb.W(context))) {
            List directProfilesForAttributes = audioManagerA.getDirectProfilesForAttributes(macVar.a().a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(eonc.h(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfileM = kvh$$ExternalSyntheticApiModelOutline1.m(directProfilesForAttributes.get(i));
                if (audioProfileM.getEncapsulationType() != 1) {
                    int format = audioProfileM.getFormat();
                    if (mgb.Y(format) || b.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            mee.f(set);
                            set.addAll(eonc.h(audioProfileM.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(eonc.h(audioProfileM.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (Map.Entry entry : map.entrySet()) {
                ekfwVar.h(new mwy(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new mwz(ekfwVar.g());
        }
        AudioDeviceInfo[] devices = mxeVar == null ? audioManagerA.getDevices(2) : new AudioDeviceInfo[]{mxeVar.a};
        ekhv ekhvVar = new ekhv();
        ekhvVar.h(8, 7);
        if (Build.VERSION.SDK_INT >= 31) {
            ekhvVar.h(26, 27);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ekhvVar.c(30);
        }
        ekhx ekhxVarG = ekhvVar.g();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (ekhxVarG.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return a;
            }
        }
        ekhv ekhvVar2 = new ekhv();
        ekhvVar2.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (mgb.ac(context) || mgb.W(context))) {
            int i3 = ekgb.d;
            ekfw ekfwVar2 = new ekfw();
            ekqg ekqgVarListIterator = b.keySet().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                Integer num = (Integer) ekqgVarListIterator.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= mgb.g(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), macVar.a().a)) {
                    ekfwVar2.h(num);
                }
            }
            ekfwVar2.h(2);
            ekhvVar2.j(ekfwVar2.g());
            return new mwz(f(eonc.j(ekhvVar2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || d()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            ekhvVar2.j(c);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new mwz(f(eonc.j(ekhvVar2.g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            ekhvVar2.j(eonc.h(intArrayExtra));
        }
        return new mwz(f(eonc.j(ekhvVar2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static boolean d() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static ekgb f(int[] iArr, int i) {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            ekfwVar.h(new mwy(i3, i));
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[PHI: r1
      0x0036: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:11:0x002a, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(defpackage.mau r12, defpackage.mac r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwz.a(mau, mac):android.util.Pair");
    }

    public final boolean e(int i) {
        return mgb.U(this.d, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.mwz
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mwz r9 = (defpackage.mwz) r9
            android.util.SparseArray r1 = r8.d
            android.util.SparseArray r3 = r9.d
            java.lang.String r4 = defpackage.mgb.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L1f
            boolean r1 = defpackage.kvh$$ExternalSyntheticApiModelOutline1.m(r1, r3)
            if (r1 == 0) goto L48
            goto L41
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L48
            r5 = r2
        L2a:
            if (r5 >= r4) goto L41
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L48
            int r5 = r5 + 1
            goto L2a
        L41:
            int r1 = r8.e
            int r9 = r9.e
            if (r1 != r9) goto L48
            return r0
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = mgb.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.d;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return this.e + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.e + ", audioProfiles=" + this.d.toString() + "]";
    }
}
