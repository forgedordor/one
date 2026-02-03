package defpackage;

import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.MediaItemInfo;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obz {
    public static final SparseIntArray a;
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    public final oby b;
    private final String h;
    private final String g = "androidx.media3:media3-transformer:1.6.1";
    private final long f = SystemClock.elapsedRealtime();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        d = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        e = sparseIntArray4;
        sparseIntArray.put(1000, 1);
        sparseIntArray.put(1001, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        sparseIntArray3.put(1, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
    }

    public obz(oby obyVar, String str) {
        this.b = obyVar;
        this.h = str;
    }

    public static MediaItemInfo b(ocs ocsVar) {
        MediaItemInfo.Builder builder = new MediaItemInfo.Builder();
        long j = ocsVar.a;
        if (j != -9223372036854775807L) {
            builder.setDurationMillis(j);
        }
        String str = ocsVar.g;
        if (str != null) {
            builder.addSampleMimeType(str);
            builder.addDataType(f(str));
        }
        String str2 = ocsVar.n;
        if (str2 != null) {
            builder.addSampleMimeType(str2);
            builder.addDataType(f(str2));
        }
        int i = ocsVar.d;
        if (i != -1) {
            builder.setAudioChannelCount(i);
        }
        int i2 = ocsVar.e;
        if (i2 != -2147483647) {
            builder.setAudioSampleRateHz(i2);
        }
        String str3 = ocsVar.f;
        if (str3 != null) {
            builder.addCodecName(str3);
        }
        String str4 = ocsVar.m;
        if (str4 != null) {
            builder.addCodecName(str4);
        }
        builder.setVideoSampleCount(ocsVar.l);
        int i3 = ocsVar.k;
        if (i3 == -1) {
            i3 = -1;
        }
        int i4 = ocsVar.j;
        builder.setVideoSize(new Size(i3, i4 != -1 ? i4 : -1));
        mag magVar = ocsVar.i;
        if (magVar != null) {
            builder.setVideoDataSpace(e(magVar));
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List c(ekgb ekgbVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            ocr ocrVar = (ocr) ekgbVar.get(i);
            MediaItemInfo.Builder builder = new MediaItemInfo.Builder();
            builder.setClipDurationMillis(mgb.B(ocrVar.a));
            String str = ocrVar.e;
            if (str != null) {
                builder.addCodecName(str);
            }
            String str2 = ocrVar.d;
            if (str2 != null) {
                builder.addCodecName(str2);
            }
            mau mauVar = ocrVar.c;
            if (mauVar != null) {
                String str3 = mauVar.n;
                if (str3 != null) {
                    builder.setContainerMimeType(str3);
                }
                String str4 = mauVar.o;
                if (str4 != null) {
                    builder.addSampleMimeType(str4);
                    builder.addDataType(f(str4));
                }
                float f = mauVar.z;
                if (f != -1.0f) {
                    builder.setVideoFrameRate(f);
                }
                int i2 = mauVar.v;
                if (i2 == -1) {
                    i2 = -1;
                }
                int i3 = mauVar.w;
                if (i3 == -1) {
                    i3 = -1;
                }
                builder.setVideoSize(new Size(i2, i3));
                mag magVar = mauVar.E;
                if (magVar != null) {
                    builder.setVideoDataSpace(e(magVar));
                }
            }
            mau mauVar2 = ocrVar.b;
            if (mauVar2 != null) {
                String str5 = mauVar2.o;
                if (str5 != null) {
                    builder.addSampleMimeType(str5);
                    builder.addDataType(f(str5));
                }
                int i4 = mauVar2.G;
                if (i4 != -1) {
                    builder.setAudioChannelCount(i4);
                }
                int i5 = mauVar2.H;
                if (i5 != -1) {
                    builder.setAudioSampleRateHz(i5);
                }
            }
            arrayList.add(builder.build());
        }
        return arrayList;
    }

    private static int e(mag magVar) {
        return DataSpace.pack(c.get(magVar.c, 0), e.get(magVar.e, 0), d.get(magVar.d, 0));
    }

    private static long f(String str) {
        long j = true != mbw.i(str) ? 0L : 4L;
        if (mbw.l(str)) {
            j |= 2;
        }
        return mbw.j(str) ? j | 1 : j;
    }

    public final EditingEndedEvent.Builder a(int i) {
        EditingEndedEvent.Builder exporterName = new EditingEndedEvent.Builder(i).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.f).setExporterName(this.g);
        String str = this.h;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void d(int i) throws Exception {
        EditingEndedEvent.Builder builderA = a(2);
        if (i != -1) {
            builderA.setFinalProgressPercent(i);
        }
        oby obyVar = this.b;
        obyVar.a(builderA.build());
        try {
            obyVar.close();
        } catch (Exception e2) {
            mff.d("EditingMetricsCollector", "error while closing the metrics reporter", e2);
        }
    }
}
