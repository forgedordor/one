package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cptr {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] c;
    static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        d = iArr;
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[eplk.values().length];
        c = iArr2;
        try {
            iArr2[eplk.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            c[eplk.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            c[eplk.AUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            c[eplk.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            c[eplk.ATTACHMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            c[eplk.RICH_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            c[eplk.LOCATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            c[eplk.RCS_LOCATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr3 = new int[eplg.values().length];
        b = iArr3;
        try {
            iArr3[eplg.TOMBSTONE_GROUP_RENAMED_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr4 = new int[cptl.values().length];
        a = iArr4;
        try {
            iArr4[cptl.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            a[cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
